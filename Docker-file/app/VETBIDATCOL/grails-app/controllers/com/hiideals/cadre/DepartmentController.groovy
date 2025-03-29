package com.hiideals.cadre



import static org.springframework.http.HttpStatus.*



import com.hiideals.endometric.Usercreation
import com.springapp.SecUser;

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

@Secured(["ROLE_SUPERADMIN","ROLE_ADMIN","ROLE_USER"])
@Transactional(readOnly = true)
class DepartmentController {
	def userService
	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	def index(Integer max) {
    params.max = Math.min(max ?: 10000, 100000)
    def currentAdminId = userService.getCurrentAdmin()
    def departmentList = Department.findAllByAdminId(currentAdminId, params)
    respond departmentList, model: [departmentInstanceCount: Department.countByAdminId(currentAdminId)]
}

	def show(Department departmentInstance) {
		respond departmentInstance
	}
	
	def list() {
		def currentAdminId = userService.getCurrentAdmin()
		def departmentInstanceList = Department.findAllByAdminId(currentAdminId)
		[departmentInstanceList: departmentInstanceList]
	}

	def create() {
		def user =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		def depttptListexist=[]
		def depttptListnonexist=[]
		def deptList=Department.findAll()

		for (var in deptList) {
			def deList=Usercreation.findByUsername(var.clgId)
			if(deList){
				depttptListexist.add(var)
			}else{
				depttptListnonexist.add(var)
			}
		}

		respond new Department(params),model:[user:user]
	}

	@Transactional
	def save(Department departmentInstance) {

		Usercreation deptsave = Usercreation.findById(params?.clgId)

		def deptExist =Department.findByDeptNameAndClgId(params?.deptName,deptsave.username)
		//def clgs =Usercreation.findAllByUsername()
		/*def deptTeachingCount = Department.findByTeaching
		 def deptNonTeachingCount = Department.findByNonTeaching
		 println("deptTeachingCount"+deptTeachingCount)
		 println("deptNonTeachingCount"+deptNonTeachingCount)*/

		if(!deptExist)	{
			if (departmentInstance == null) {
				notFound()
				return
			}

			if (departmentInstance.hasErrors()) {
				respond departmentInstance.errors, view:'create'
				return
			}

			def teaching = deptsave.teaching1
			def nonteaching = deptsave.nonteaching1

			int teachingDep = Integer.parseInt(params?.teaching)
			int nonTeachingDep =Integer.parseInt( params?.nonTeaching)
		//	int stateTeachingDep = Integer.parseInt(params?.teaching)
		//	int stateNonTeachingDep =Integer.parseInt( params?.teaching)



			departmentInstance.stateTeachVacant=Integer.parseInt(params?.stateTeaching)
			departmentInstance.stateNonTeachVacant=Integer.parseInt(params?.stateNonTeaching)
			departmentInstance.kkTeachVacant=Integer.parseInt(params?.kkTeaching)
	        departmentInstance.kkNonTeachVacant=Integer.parseInt(params?.kkNonTeaching)


			departmentInstance.setClgId(deptsave.username)
			departmentInstance.setAdminId(userService.getCurrentAdmin())
			//Calculation Clear the Tachings & non Teachings

			int deptTeachingTotal = Integer.parseInt(params?.stateTeaching)+ Integer.parseInt(params?.kkTeaching)
			int deptNonTeachingTotal = Integer.parseInt(params?.stateNonTeaching) + Integer.parseInt(params?.kkNonTeaching)

			if( deptsave.teaching1 >= Integer.parseInt(params?.teaching)  && deptsave.nonteaching1 >= Integer.parseInt(params?.nonTeaching)){
				if(teachingDep == deptTeachingTotal && nonTeachingDep == deptNonTeachingTotal){
					int t1 = deptsave.teaching1 - Integer.parseInt(params?.teaching)
					int nt1 = deptsave.nonteaching1 - Integer.parseInt(params?.nonTeaching)


					departmentInstance.save flush:true
					deptsave.teaching1 = t1
					deptsave.nonteaching1 = nt1
					deptsave.addToDeptIds(departmentInstance)
					flash.message = "Department Sanction Successfully"
					redirect action:"index"

				}else {

					flash.message = "reached maximum limits"
					redirect action:"index"

				}



			}else {
				flash.message = "Already Department name Exist"
				redirect action:"index"
			}
		}
	}
	def collegeOldId
	int oldteach
	int oldnontech
	def edit(Department departmentInstance) {
		// Verify ownership before allowing edit
		if (departmentInstance.adminId != userService.getCurrentAdmin()) {
			flash.message = "Unauthorized access"
			redirect action: "index"
			return
		}
		
		def user =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		
		collegeOldId = departmentInstance
		oldteach = departmentInstance.teaching
		oldnontech = departmentInstance.nonTeaching
		
		println("oldteach"+oldteach)
		println("oldnontech"+oldnontech)
		def depttptListexist=[]
		def depttptListnonexist=[]
		def deptList=Department.findAll()

		for (var in deptList) {
			def deList=Usercreation.findByUsername(var.clgId)
			if(deList){
				depttptListexist.add(var)
			}else{
				depttptListnonexist.add(var)
			}
		}
		respond departmentInstance,model:[user:user]
	}

	@Transactional
	def updateDepartment(Department departmentInstance) {
		// Verify ownership before update
		if (departmentInstance.adminId != userService.getCurrentAdmin()) {
			flash.message = "Unauthorized update attempt"
			redirect action: "index"
			return
		} 
		if (!params?.clgId) {
			flash.message = "Please select a valid college before updating."
			redirect(action: "edit", id: params.id) // Redirect back to the form
			return
		}
		
		def collegeOldId = Department.findById(params?.clgId) // Ensure clgId exists before using it
		
		if (!collegeOldId) {
			flash.message = "Selected college not found. Please try again."
			redirect(action: "edit", id: params.id)
			return
		}
		Department olddeptid= Department.findById(collegeOldId.id)
		def deptsave = Usercreation.findById(params?.clgId)

		
		// Handle cases where deptsave is null
		if (!deptsave) {
			flash.message = "No department data found for the selected college."
			redirect(action: "edit", id: params.id)
			return
		}
		
		def teaching = deptsave.teaching1 + oldteach
		def nonteaching = deptsave.nonteaching1 + oldnontech
		
		println("teaching"+teaching)
		println("nonteaching"+nonteaching)

		int teachingDep = Integer.parseInt(params?.teaching)
		int nonTeachingDep =Integer.parseInt( params?.nonTeaching)



	

		departmentInstance.setClgId(deptsave.username)
		departmentInstance.setAdminId(userService.getCurrentAdmin())
		//Calculation Clear the Tachings & non Teachings

		int deptTeachingTotal = Integer.parseInt(params?.stateTeaching)+ Integer.parseInt(params?.kkTeaching)
		
		int deptNonTeachingTotal = Integer.parseInt(params?.stateNonTeaching) + Integer.parseInt(params?.kkNonTeaching)
		println("deptTeachingTotal"+deptTeachingTotal)
		println("deptNonTeachingTotal"+deptNonTeachingTotal)

		println("teachingDep"+teachingDep)
		println("nonTeachingDep"+nonTeachingDep)

		println("deptsavedeptsave"+deptsave)
		println("deptsavedeptsave"+deptsave)
		
		println("teaching"+teaching)
		println("Integer.parseInt(params?.teaching)"+Integer.parseInt(params?.teaching))
		println("nonteaching"+nonteaching)
		println("Integer.parseInt(params?.nonTeaching)"+Integer.parseInt(params?.nonTeaching))
		
		if(teaching >= Integer.parseInt(params?.teaching) && nonteaching >= Integer.parseInt( params?.nonTeaching)){  
	     if(teachingDep == deptTeachingTotal && nonTeachingDep == deptNonTeachingTotal){
			println("false 02")
			departmentInstance.teaching=Integer.parseInt(params?.teaching)
			departmentInstance.nonTeaching=Integer.parseInt(params?.nonTeaching)
			departmentInstance.stateTeachVacant=Integer.parseInt(params?.stateTeaching)
			departmentInstance.stateNonTeachVacant=Integer.parseInt(params?.stateNonTeaching)
			departmentInstance.kkTeachVacant=Integer.parseInt(params?.kkTeaching)
			departmentInstance.kkNonTeachVacant=Integer.parseInt(params?.kkNonTeaching)
	
			int tt1 = teaching - teachingDep
			int ntt1 = nonteaching - nonTeachingDep


			deptsave.teaching1 = tt1
			deptsave.nonteaching1 = ntt1
			deptsave.addToDeptIds(departmentInstance)

			departmentInstance.save()
			
			flash.message = "Department Sanction Updated"
			redirect action:"index"
		}
		else{
			println("true 02")
			flash.message = "reached maximum limits"
					redirect action:"index"
		}
		}
		else{
			println("true 0")
			flash.message = "please this department sanction values is miss match,make this department all sanction values Zero and Update After Re Sanction to Department"
			redirect action:"index"
		}
		
		
		
	
	}

	@Transactional
	def delete(Department departmentInstance) {

		if (departmentInstance == null) {
			notFound()
			return
		}

		departmentInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'Department.label', default: 'Department'),
					departmentInstance.id
				])
				redirect action:"index", method:"GET"
			}
			'*'{ render status: NO_CONTENT }
		}
	}

	protected void notFound() {
		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.not.found.message', args: [
					message(code: 'department.label', default: 'Department'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}

	def getusrDtl1(){

		println("clssss")

		def cls=Usercreation.findById(params.value)
		println("clssss"+cls)
		def anidtl=Usercreation.createCriteria().get{
			eq('id',Usercreation.findById(params.value).id)
			eq('adminId',userService.getCurrentAdmin())
		}
		if(!anidtl)
		{
			flash.msg="asdada"
		}

		render(template:'userDetails',model:[userdet1:anidtl])
	}
	def departmentreport() {
		def currentAdminId = userService.getCurrentAdmin()
		respond Department.findAllByAdminId(currentAdminId), model: [departmentInstanceCount: Department.countByAdminId(currentAdminId)]
	}
}