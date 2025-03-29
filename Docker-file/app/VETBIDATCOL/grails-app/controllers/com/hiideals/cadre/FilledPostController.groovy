package com.hiideals.cadre



import static org.springframework.http.HttpStatus.*

import com.hiideals.document.Documents
import com.hiideals.endometric.Usercreation;

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional

import java.text.DateFormat
import java.text.SimpleDateFormat
import javax.servlet.ServletContext
@Secured(["ROLE_SUPERADMIN","ROLE_ADMIN","ROLE_USER"])
@Transactional(readOnly = true)
class FilledPostController {

	def userService

	static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	private static DateFormat df = new SimpleDateFormat("dd/MM/yyyy");//yyyy-MM-dd");
	def index(Integer max) {
		params.max = Math.min(max ?: 10000, 100000)
		def currentAdmin = userService.getCurrentAdmin()
		def results = FilledPost.createCriteria().list {
			eq("adminId", currentAdmin)
			eq("staffType", "Teaching")
			eq("retired", "False")
		}
		model:[filledPostInstanceResults: results]
	}

	def indexnonteaching(Integer max) {
		params.max = Math.min(max ?: 10000, 100000)
		def currentAdminId = userService.getCurrentAdmin()
		
		def resultss = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Non Teaching")
			eq("retired", "False")
		}
		model:[filledPostInstanceResultss: resultss]
	}
	
	def transferteaching(Integer max) {
		params.max = Math.min(max ?: 10000, 100000)
		def currentAdminId = userService.getCurrentAdmin()
		
		def results = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Teaching")
			eq("retired", "True")
		}
		model:[filledPostInstanceResults: results]
	}
	
	def transfernonteaching(Integer max) {
		params.max = Math.min(max ?: 10000, 100000)
		def currentAdminId = userService.getCurrentAdmin()
		
		def resultss = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Non Teaching")
			eq("retired", "True")
		}
		model:[filledPostInstanceResultss: resultss]
	}

	def show(FilledPost filledPostInstance) {

		def user =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		respond filledPostInstance,model:[user:user]
	}



	def create() {
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		def user =Department.findAllByClgId(users)



		respond new FilledPost(params),model:[user:user,users:users]
	}

	def searchByDept(){
		def user =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		model:[user:user]
	}
	def searchByCollage(){
		def user =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		model:[user:user]
	}
	def searchByDepte() {
		def currentAdminId = userService.getCurrentAdmin()
		def clg = params?.collagId1
		def dept = params.department
		def staffty = params.staffType
		def checkj371 = params.j371
	
		def results = FilledPost.createCriteria().list {
			// Always filter by current admin's ID
			eq("adminId", currentAdminId)
	
			if(clg && !dept && !staffty) {
				eq("colgName", clg)
				eq("retired", "False")
			}
			else if(dept && clg && !staffty) {
				eq("colgName", clg)
				eq("retired", "False")
				deptId {
					eq("deptName", dept)
				}
			}
			else if(dept && clg && staffty) {
				eq("colgName", clg)
				eq("retired", "False")
				eq("staffType", staffty)
				deptId {
					eq("deptName", dept)
				}
			}
			else if(clg && staffty) {
				eq("staffType", staffty)
			}
			else if(clg && staffty && checkj371 && dept) {
				eq("j371", checkj371)
			}
		}
	
		render(template:'usertemplate', model:[
			usedetails: results,
			projectList: results
		])
	}


	def searchByCollages() {
		def currentAdminId = userService.getCurrentAdmin()
		def clg = params?.collagId1
	
		// Get college details for current admin
		def clgname = Usercreation.createCriteria().list {
			eq("username", clg)
			eq("adminId", currentAdminId)  // Ensure college belongs to current admin
		}
	
		// Get filtered posts for current admin
		def results = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)    // Filter by admin ID
			eq("colgName", clg)
			eq("retired", "false")
		}
	
		render(template: 'clgtemplate', model: [
			usedetails: results,
			projectList: results,
			clgname: clgname,
			clgList: clgname
		])
	}


	@Transactional
	def save(FilledPost filledPostInstance) {
		filledPostInstance.setRetired("False")
		filledPostInstance.setTransferpost("False")
	
		if (params.positionType == "others") {
			filledPostInstance.positionType = "others" + "(" + params.nameofpost + ")"
		}
	
		if (params?.staffType == "Teaching") {
			 if (params?.doeAssistantProfessorKVAFSU1 && !params.doeAssistantProfessorKVAFSU1.trim().isEmpty()) {
        filledPostInstance.doeAssistantProfessorKVAFSU = df.parse(params.doeAssistantProfessorKVAFSU1)
    }
			if (params?.doeProfessorCAS1 && !params.doeProfessorCAS1.trim().isEmpty()) {
    filledPostInstance.doeProfessorCAS = df.parse(params.doeProfessorCAS1)
}

if (params?.doePresentCadre1 && !params.doePresentCadre1.trim().isEmpty()) {
    filledPostInstance.doePresentCadre = df.parse(params.doePresentCadre1)
}

if (params?.dateofRetirement1 && !params.dateofRetirement1.trim().isEmpty()) {
    filledPostInstance.dateofRetirement = df.parse(params.dateofRetirement1)
}
		}
		if (params?.staffType == "Non Teaching") {
			filledPostInstance.nonDOEintoCrafts = df.parse(params.nonDOEintoCrafts1)
			filledPostInstance.nonDOEintoPresentPayscale = df.parse(params.nonDOEintoPresentPayscale1)
			filledPostInstance.nonDOEintoOnetimeupgradation = df.parse(params.nonDOEintoOnetimeupgradation1)
			filledPostInstance.nonDOEforPromotion = df.parse(params.nonDOEforPromotion1)
			filledPostInstance.dateofRetirement = df.parse(params.dateofRetirement1)
		}
	
		// Handling file uploads
		def lists = (params.ty).split(",")
		def stpath = grailsApplication.config.documentFolder
		userService.createfolder(stpath)
	
		lists.each { item ->
			def file = request.getFile('document_' + item)
			if (file.getOriginalFilename() && !file.getOriginalFilename().isEmpty()) {
				String filePath = stpath + file.getOriginalFilename()
				try {
					file.transferTo(new File(filePath))
				} catch (Exception e) {
					log.error("File upload failed: ${e.message}")
				}
				Documents docs = new Documents(docsPath: filePath, docName: file.getOriginalFilename()).save(flush: true, failOnError: true)
				filledPostInstance.addToDocs(docs)
			}
		}
	
		// Fetch user and department details
		Usercreation usres = Usercreation.findById(params?.collagId)
		Department check = Department.findById(params?.deptId)
	
		def deptExist = FilledPost.findByEmployeeNumberAndColgName(params?.employeeNumber, usres.username)
		if (!deptExist) {
			if (filledPostInstance == null) {
				notFound()
				return
			}
	
			if (filledPostInstance.hasErrors()) {
				respond filledPostInstance.errors, view: 'create'
				return
			}
	
			filledPostInstance.setAdminId(userService.getCurrentAdmin())
			filledPostInstance.colgName = usres.username
	
			if (params?.staffType == "Non Teaching" && params?.j371 == "No" && check.stateNonTeaching != check.stateNonTeachFilled) {
				if (check.stateNonTeaching != check.stateNonTeachFilled && params?.j371 == "No" && check.stateNonTeaching != 0) {
					check.stateNonTeachVacant -= 1
					check.stateNonTeachFilled += 1
					usres.nonteaching2 += 1
					usres.nonteaching3 -= 1
					usres.save()
					check.save()
					filledPostInstance.save flush: true
					filledPostInstance.addToDeptIds(check)
					flash.message = "Filled Post Created Successfully"
					redirect action: "indexnonteaching"
					return
				}
			} else if (params?.staffType == "Teaching" && params?.j371 == "No" && check.stateTeaching != check.stateTeachFilled) {
				if (check.stateTeaching != check.stateTeachFilled && params?.j371 == "No" && check.stateTeaching != 0) {
					check.stateTeachVacant -= 1
					check.stateTeachFilled += 1
					usres.teaching2 += 1
					usres.teaching3 -= 1
					usres.save()
					check.save()
					filledPostInstance.save flush: true
					filledPostInstance.addToDeptIds(check)
					flash.message = "Filled Post Created Successfully"
					redirect action: "index"
					return
				}
			} else if (params?.staffType == "Non Teaching" && params?.j371 == "Yes" && check.kkNonTeaching != check.kkNonTeachFilled) {
				if (check.kkNonTeaching != check.kkNonTeachFilled && params?.j371 == "Yes" && check.kkNonTeaching != 0) {
					check.kkNonTeachVacant -= 1
					check.kkNonTeachFilled += 1
					usres.nonteaching2 += 1
					usres.nonteaching3 -= 1
					usres.save()
					check.save()
					filledPostInstance.save flush: true
					filledPostInstance.addToDeptIds(check)
					flash.message = "Filled Post Created Successfully"
					redirect action: "indexnonteaching"
					return
				}
			} else if (params?.staffType == "Teaching" && params?.j371 == "Yes" && check.kkTeaching != check.kkTeachFilled) {
				if (check.kkTeaching != check.kkTeachFilled && params?.j371 == "Yes" && check.kkTeaching != 0) {
					check.kkTeachVacant -= 1
					check.kkTeachFilled += 1
					usres.teaching2 += 1
					usres.teaching3 -= 1
					usres.save()
					check.save()
					filledPostInstance.save flush: true
					filledPostInstance.addToDeptIds(check)
					flash.message = "Filled Post Created Successfully"
					redirect action: "index"
					return
				}
			} else {
				flash.message = "Posts are Full. Contact Management."
				redirect action: "index"
				return
			}
		} else {
			flash.message = "Employee Number already exists for this college"
			redirect action: "index"
		}
	}
	

	def edit(FilledPost filledPostInstance) {
		if (filledPostInstance.adminId != userService.getCurrentAdmin()) {
			flash.message = "Unauthorized access"
			redirect action: "index"
			return
		}
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		def user =Department.findAllByClgId(users)

		respond filledPostInstance,model:[user:user,users:users]
	}


	@Transactional
	def update(FilledPost filledPostInstance){
		if (filledPostInstance.adminId != userService.getCurrentAdmin()) {
			flash.message = "Unauthorized update"
			redirect action: "index"
			return
		}
		if (filledPostInstance == null) {
			notFound()
			return
		}

		if (filledPostInstance.hasErrors()) {
			respond filledPostInstance.errors, view:'edit'
			return
		}
		if(params.positionType == "others"){
			filledPostInstance.positionType = "others" + "(" + params.nameofpost + ")"
		}
		filledPostInstance.save flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.updated.message', args: [
					message(code: 'FilledPost.label', default: 'FilledPost'),
					filledPostInstance.id
				])
				redirect action:"index"
			}
			'*'{ respond filledPostInstance, [status: OK] }
		}
	}
	def fillold
	def transferEdit(FilledPost filledPostInstance) {
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		def user =Department.findAllByClgId(users)

		fillold = filledPostInstance


		respond filledPostInstance,model:[user:user,users:users]
	}


	@Transactional
	def transferUpdate(FilledPost filledPostInstance){
		
		filledPostInstance.setTransferpost("True")
		println("filledPostInstance"+fillold)
		FilledPost fill2 = FilledPost.findById(fillold.id)
		Usercreation oldusres1 = Usercreation.findById(fillold?.collagId.id)
		Department  oldcheck1 = Department.findById(fillold?.deptId.id)
		println("old dept  Id : "+oldcheck1)
		println("old college  Id : "+oldusres1)

		FilledPost fill = FilledPost.findById(filledPostInstance.id)

		Usercreation usres = Usercreation.findById(params?.collagId)
		//Usercreation usres1 = Usercreation.findById(params?.collagId)
		//Department  check1 = Department.findById(params?.deptId)
		Department  check = Department.findById(params?.deptId)

		println(" new dept  Id : "+check)
		println("new college  Id : "+usres)



			if(fillold?.j371 == "No" && fillold?.staffType == "Teaching"){

				println("### 1")
				def stv1 = oldcheck1.stateTeachVacant
				def stf1 = oldcheck1.stateTeachFilled


				int tachingvantdept = stv1 + 1
				int teachstfilled = stf1 - 1

				oldcheck1.stateTeachVacant = tachingvantdept
				oldcheck1.stateTeachFilled = teachstfilled

				int clgTeach=oldusres1.teaching2 - 1
				int clgVacantTeach=oldusres1.teaching3 + 1


				oldusres1.teaching2=clgTeach
				oldusres1.teaching3=clgVacantTeach
				oldcheck1.save()
				oldusres1.save()
	


			}
			if(fillold?.j371 == "No" && fillold?.staffType == "Non Teaching"){

				println("### 2")

				def sntv1 = oldcheck1.stateNonTeachVacant
				def sntf1 = oldcheck1.stateNonTeachFilled

				int nontevacantdept = sntv1  + 1
				int nonteachstfilled= sntf1 - 1

				oldcheck1.stateNonTeachVacant = nontevacantdept
				oldcheck1.stateNonTeachFilled = nonteachstfilled


				int clgnonTeach = oldusres1.nonteaching2 - 1
				int clgnonVacantTeach = oldusres1.nonteaching3 + 1


				oldusres1.nonteaching2 = clgnonTeach
				oldusres1.nonteaching3 = clgnonVacantTeach
				oldcheck1.save()
				oldusres1.save()
	

			}
			if(fillold?.j371 == "Yes" && fillold?.staffType == "Teaching"){

				println("### 3")
				
				def kktv1 = oldcheck1.kkTeachVacant
				def kktf1 = oldcheck1.kkTeachFilled


				int tachingvantdept = kktv1 + 1
				int teachstfilled = kktf1 - 1


				oldcheck1.kkTeachVacant = tachingvantdept
				oldcheck1.kkTeachFilled = teachstfilled

				int clgTeach=oldusres1.teaching2 - 1
				int clgVacantTeach=oldusres1.teaching3 + 1


				oldusres1.teaching2=clgTeach
				oldusres1.teaching3=clgVacantTeach
				oldcheck1.save()
				oldusres1.save()
	


			}
			if(fillold?.j371 == "Yes" && fillold?.staffType == "Non Teaching"){
				println("### 4")
				
				def kkntv1 = oldcheck1.kkNonTeachVacant
				def kkntf1 = oldcheck1.kkNonTeachFilled

				int nontevacantdept = kkntv1  + 1
				int nonteachstfilled= kkntf1 - 1


				oldcheck1.kkNonTeachFilled = nonteachstfilled
				oldcheck1.kkNonTeachVacant = nontevacantdept
				int clgnonTeach = oldusres1.nonteaching2 - 1
				int clgnonVacantTeach = oldusres1.nonteaching3 + 1


				oldusres1.nonteaching2=clgnonTeach
				oldusres1.nonteaching3=clgnonVacantTeach
				oldcheck1.save()
				oldusres1.save()
			}

		if(fill?.j371 == "No" && fill?.staffType == "Teaching"){

			println("### 00000011111111111")
			def stv1 = check.stateTeachVacant
			def stf1 = check.stateTeachFilled


			int tachingvantdept = stv1 - 1
			int teachstfilled = stf1 + 1

			check.stateTeachVacant = tachingvantdept
			check.stateTeachFilled = teachstfilled

			int clgTeach=usres.teaching2 + 1
			int clgVacantTeach=usres.teaching3 - 1


			usres.teaching2=clgTeach
			usres.teaching3=clgVacantTeach


		}
		if(fill?.j371 == "No" && fill?.staffType == "Non Teaching"){


			def sntv1 = check.stateNonTeachVacant
			def sntf1 = check.stateNonTeachFilled

			int nontevacantdept = sntv1  - 1
			int nonteachstfilled= sntf1 + 1

			check.stateNonTeachVacant = nontevacantdept
			check.stateNonTeachFilled = nonteachstfilled


			int clgnonTeach = usres.nonteaching2 + 1
			int clgnonVacantTeach = usres.nonteaching3 - 1


			usres.nonteaching2 = clgnonTeach
			usres.nonteaching3 = clgnonVacantTeach

		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Teaching"){


			def kktv1 = check.kkTeachVacant
			def kktf1 = check.kkTeachFilled


			int tachingvantdept = kktv1 - 1
			int teachstfilled = kktf1 + 1


			check.kkTeachVacant = tachingvantdept
			check.kkTeachFilled = teachstfilled

			int clgTeach=usres.teaching2 + 1
			int clgVacantTeach=usres.teaching3 - 1


			usres.teaching2=clgTeach
			usres.teaching3=clgVacantTeach


		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Non Teaching"){

			def kkntv1 = check.kkNonTeachVacant
			def kkntf1 = check.kkNonTeachFilled

			int nontevacantdept = kkntv1  - 1
			int nonteachstfilled= kkntf1 + 1


			check.kkNonTeachFilled = nonteachstfilled
			check.kkNonTeachVacant = nontevacantdept
			int clgnonTeach = usres.nonteaching2 + 1
			int clgnonVacantTeach = usres.nonteaching3 - 1


			usres.nonteaching2=clgnonTeach
			usres.nonteaching3=clgnonVacantTeach

		}

		/*		if(params?.staffType == "Teaching"){
		 filledPostInstance.doeAssistantProfessorKVAFSU = df.parse(params.doeAssistantProfessorKVAFSU1)
		 filledPostInstance.doeProfessorCAS= df.parse(params.doeProfessorCAS1)
		 filledPostInstance.doePresentCadre= df.parse(params.doePresentCadre1)
		 filledPostInstance.dateofRetirement= df.parse(params.dateofRetirement1)
		 }
		 if(params?.staffType == "Non Teaching"){
		 filledPostInstance.nonDOEintoCrafts= df.parse(params.nonDOEintoCrafts1)
		 filledPostInstance.nonDOEintoPresentPayscale= df.parse(params.nonDOEintoPresentPayscale1)
		 filledPostInstance.nonDOEintoOnetimeupgradation= df.parse(params.nonDOEintoOnetimeupgradation1)
		 filledPostInstance.dateofRetirement= df.parse(params.dateofRetirement1)
		 }
		 Usercreation usres1 = Usercreation.findById(params?.collagId)
		 Department  check1 = Department.findById(params?.deptId)
		 println("teaching1s"+usres1.teaching1)
		 println("nonteaching1"+usres1.nonteaching1)
		 println("teaching2"+usres1.teaching2)
		 println("nonteaching2"+usres1.nonteaching2)
		 println("teaching3"+usres1.teaching3)
		 println("nonteaching3"+usres1.nonteaching3)
		 def clgSanctionTeaching=usres1.teaching1
		 def clgSanctionNonTeaching=usres1.nonteaching1
		 def clgSanctionFilledTeaching=usres1.teaching2
		 def clgSanctionFilledNonTeaching=usres1.nonteaching2
		 def clgSanctionVacantTeaching=usres1.teaching3
		 def clgSanctionVacantNonTeaching=usres1.nonteaching3
		 def deptTeachingSantion=check1.teaching
		 def deptNonTeachingsanction=check1.nonTeaching
		 def stateSanctionTeaching=check1.stateTeaching
		 def stateFilledTeaching=check1.stateTeachFilled
		 def stateVacantTeaching=check1.stateTeachVacant
		 def stateSanctionNonTeaching=check1.stateNonTeaching
		 def stateSantionNonTeachingFilled=check1.stateNonTeachFilled
		 def stateSanctionNonTeachinVacant=check1.stateNonTeachVacant
		 def kkSanctionTeaching=check1.kkTeaching
		 def kkSanctionTeachingFilled=check1.kkTeachFilled
		 def kkSanctionTeachingVacant=check1.kkTeachVacant
		 def kkSanctionNonTeaching=check1.kkNonTeaching
		 def kkSanctionNonTeachingFilled=check1.kkNonTeachFilled
		 def kkSanctionNonTeachingVacant=check1.kkNonTeachVacant
		 int stateT1=stateVacantTeaching - 1
		 int stateFT1=stateFilledTeaching + 1
		 int stateNonT1=stateSanctionNonTeachinVacant - 1
		 int stateFNOnT1=stateSantionNonTeachingFilled + 1
		 int kkT1=kkSanctionTeachingVacant - 1
		 int kkFT1=kkSanctionTeachingFilled + 1
		 int kkNonT1=kkSanctionNonTeachingVacant - 1
		 int kkFNOnT1=kkSanctionNonTeachingFilled + 1
		 //if(usres.username ! = fill?.collegeId?.username)
		 if(params?.staffType == "Non Teaching"  && params?.j371=="No" && check1.stateNonTeaching != check1.stateNonTeachFilled ){
		 if ( stateSanctionNonTeaching !=stateSantionNonTeachingFilled && params?.j371=="No" && stateSanctionNonTeaching != 0 && params?.staffType == "Non Teaching") {
		 check1.stateNonTeachVacant=stateNonT1
		 check1.stateNonTeachFilled=stateFNOnT1
		 int clgNonTeach=clgSanctionFilledNonTeaching + 1
		 int clgVacantNonTeach=clgSanctionVacantNonTeaching - 1
		 usres1.nonteaching2=clgNonTeach
		 usres1.nonteaching3=clgVacantNonTeach
		 println("clgSanctionFilledNonTeaching :"+clgSanctionFilledNonTeaching)
		 println("clgSanctionVacantNonTeaching :"+clgSanctionVacantNonTeaching)
		 usres1.save()
		 check1.save()
		 fill.save flush:true
		 fill.addToDeptIds(check1)
		 println("State Non Teaching")
		 flash.message = "Transfer Successfuly";
		 redirect action :"index"
		 }
		 }else if(params?.staffType == "Teaching" && params?.j371=="No" && check1.stateTeaching != check1.stateTeachFilled ) {
		 if( stateSanctionTeaching != 0 && stateSanctionTeaching !=stateFilledTeaching && params?.j371=="No" && params?.staffType == "Teaching"){
		 check1.stateTeachVacant=stateT1
		 check1.stateTeachFilled=stateFT1
		 int clgTeach=clgSanctionFilledTeaching + 1
		 int clgVacantTeach=clgSanctionVacantTeaching - 1
		 usres1.teaching2=clgTeach
		 usres1.teaching3=clgVacantTeach
		 usres1.save()
		 check1.save()
		 fill.save flush:true
		 fill.addToDeptIds(check1)
		 println("State  Teaching")
		 flash.message = "Transfer Successfuly";
		 redirect action :"index"
		 }
		 }else if(params?.staffType == "Non Teaching" &&params?.j371=="Yes"   && check1.kkNonTeaching != check1.kkNonTeachFilled ){
		 if (kkSanctionNonTeaching !=kkSanctionNonTeachingFilled && params?.j371=="Yes" && kkSanctionNonTeaching != 0 && params?.staffType == "Non Teaching") {
		 check1.kkNonTeachVacant=kkNonT1
		 check1.kkNonTeachFilled=kkFNOnT1
		 int clgNonTeach=clgSanctionFilledNonTeaching + 1
		 int clgVacantNonTeach=clgSanctionVacantNonTeaching - 1
		 usres1.nonteaching2=clgNonTeach
		 usres1.nonteaching3=clgVacantNonTeach
		 usres1.save()
		 check1.save()
		 println("params"+params)
		 fill.save flush:true
		 fill.addToDeptIds(check1)
		 println("KK Non Teaching")
		 flash.message = "Transfer Successfuly";
		 redirect action :"index"
		 }
		 }else if(params?.staffType == "Teaching" &&params?.j371=="Yes" && check1.kkTeaching != check1.kkTeachFilled ) {
		 if(kkSanctionTeaching !=kkSanctionTeachingFilled && params?.j371=="Yes" && kkSanctionTeaching != 0 && params?.staffType == "Teaching"){
		 check1.kkTeachVacant=kkT1
		 check1.kkTeachFilled=kkFT1
		 int clgTeach=clgSanctionFilledTeaching + 1
		 int clgVacantTeach=clgSanctionVacantTeaching - 1
		 usres1.teaching2=clgTeach
		 usres1.teaching3=clgVacantTeach
		 usres1.save()
		 check1.save()
		 fill.save flush:true
		 fill.addToDeptIds(check1)
		 println("KK Teaching")
		 flash.message = "Transfer Successfuly";
		 redirect action :"index"
		 }
		 }else {
		 flash.message = "Posts are Full Contact to Management ";
		 redirect action :"index"
		 }
		 */		
		Usercreation usres1 = Usercreation.findById(params?.collagId)
		Department  check1 = Department.findById(params?.deptId)
		if(params?.staffType == "Teaching"){
			 if (params?.doeAssistantProfessorKVAFSU1 && !params.doeAssistantProfessorKVAFSU1.trim().isEmpty()) {
        filledPostInstance.doeAssistantProfessorKVAFSU = df.parse(params.doeAssistantProfessorKVAFSU1)
    }
			if (params?.doeProfessorCAS1 && !params.doeProfessorCAS1.trim().isEmpty()) {
    filledPostInstance.doeProfessorCAS = df.parse(params.doeProfessorCAS1)
}

if (params?.doePresentCadre1 && !params.doePresentCadre1.trim().isEmpty()) {
    filledPostInstance.doePresentCadre = df.parse(params.doePresentCadre1)
}

if (params?.dateofRetirement1 && !params.dateofRetirement1.trim().isEmpty()) {
    filledPostInstance.dateofRetirement = df.parse(params.dateofRetirement1)
}
		}
			if(params?.staffType == "Non Teaching"){
			filledPostInstance.nonDOEintoCrafts= df.parse(params.nonDOEintoCrafts1)
			filledPostInstance.nonDOEintoPresentPayscale= df.parse(params.nonDOEintoPresentPayscale1)
			filledPostInstance.nonDOEintoOnetimeupgradation= df.parse(params.nonDOEintoOnetimeupgradation1)
			filledPostInstance.nonDOEforPromotion= df.parse(params.nonDOEforPromotion1)
			filledPostInstance.dateofRetirement= df.parse(params.dateofRetirement1)
			}
		println("old Collage"+usres1)
		println("old Department"+check1)
		fill.colgName=usres.username
		fill.collagId=usres1
		fill.deptId=check1
		fill.fromCollage=oldusres1.username
		fill.save flush:true
		fill.addToDeptIds(check)
		usres.save()

		println("KK Teaching")
		flash.message = "Transfer Successfuly";
		redirect action :"index"

	}

	def downloadFile(){
		println("params"+params.id)
				def filefile=Documents.findById(params.id)
		
		
				String filePath = filefile.docsPath//grailsApplication.config.generalFiles//+file.getOriginalFilename()//params.file;
				File dwnldFile = new File(filePath);
				FileInputStream inStream = new FileInputStream(dwnldFile);
				// if you want to use a relative path to context root:
				String relativePath = getServletContext().getRealPath("");
		
				// obtains ServletContext
				ServletContext context = getServletContext();
		
				// gets MIME type of the file
				String mimeType = context.getMimeType(filePath);
				if (mimeType == null) {
					// set to binary type if MIME mapping not found
					mimeType = "application/octet-stream";
				}
				System.out.println("MIME type: " + mimeType);
		
				// modifies response
				response.setContentType(mimeType);
				response.setContentLength((int) dwnldFile.length());
		
				// forces download
				String headerKey = "Content-Disposition";
				String headerValue = String.format("attachment; filename=\"%s\"", dwnldFile.getName());
				response.setHeader(headerKey, headerValue);
		
				// obtains response's output stream
				OutputStream outStream = response.getOutputStream();
		
				byte[] buffer = new byte[4096];
				int bytesRead = -1;
		
				while ((bytesRead = inStream.read(buffer)) != -1) {
					outStream.write(buffer, 0, bytesRead);
				}
		
				println("File Downloaded Successfully for filingId : ")
				inStream.close();
				outStream.close();
		
			}
		

	@Transactional
	def delete(FilledPost filledPostInstance) {
		if (filledPostInstance.adminId != userService.getCurrentAdmin()) {
			flash.message = "Unauthorized deletion"
			redirect action: "index"
			return
		}

		if (filledPostInstance == null) {
			notFound()
			return
		}

		filledPostInstance.delete flush:true

		request.withFormat {
			form multipartForm {
				flash.message = message(code: 'default.deleted.message', args: [
					message(code: 'FilledPost.label', default: 'FilledPost'),
					filledPostInstance.id
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
					message(code: 'filledPost.label', default: 'FilledPost'),
					params.id
				])
				redirect action: "index", method: "GET"
			}
			'*'{ render status: NOT_FOUND }
		}
	}
	def getusrDtl(){



		def cls=Usercreation.findById(params.value)

		def anidtl1=Usercreation.createCriteria().get{
			eq('id',Usercreation.findById(params.value).id)
			eq('adminId',userService.getCurrentAdmin())
		}
		if(!anidtl1) {
			flash.msg="asdada"
		}

		render(template:'userDetails',model:[usrdtl:anidtl1])
	}

	def getusrDtls(){



		def cls=Department.findById(params.value)

		def anidtl=Department.createCriteria().get{
			eq('id',Department.findById(params.value).id)
			eq('adminId',userService.getCurrentAdmin())
		}
		if(!anidtl) {
			flash.msg="asdada"
		}

		render(template:'userDetailsss',model:[userdet11:anidtl])
	}



	def filereport() {
		def currentAdminId = userService.getCurrentAdmin()
		def results = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Teaching")
			eq("retired", "False")
		}
		model:[filledPostInstanceResults: results]
	}
	
	def filereportnontech() {
		def currentAdminId = userService.getCurrentAdmin()
		def resultss = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Non Teaching")
			eq("retired", "False")
		}
		model:[filledPostInstanceResultss: resultss]
	}
	
	def filereporttrans() {
		def currentAdminId = userService.getCurrentAdmin()
		def results = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Teaching")
			eq("retired", "True")
		}
		model:[filledPostInstanceResults: results]
	}
	
	def filereporttransnon() {
		def currentAdminId = userService.getCurrentAdmin()
		def resultss = FilledPost.createCriteria().list {
			eq("adminId", currentAdminId)
			eq("staffType", "Non Teaching")
			eq("retired", "True")
		}
		model:[filledPostInstanceResultss: resultss]
	}
}
