package com.hiideals.cadre

import grails.plugin.springsecurity.annotation.Secured
import grails.transaction.Transactional;

import java.awt.TexturePaintContext.Int

import com.hiideals.endometric.Usercreation
@Secured(["ROLE_SUPERADMIN","ROLE_ADMIN","ROLE_USER"])
class TransferPostController {
	def userService
	def transferCreate(){
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		def user =Department.findAllByClgId(users)

		model:[user:user,users:users]
	}
	
	def transferCreatess(){
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())

		def user =Department.findAllByClgId(users)

		model:[user:user,users:users]
	}
	def searchByDept(){
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		def user =Department.findAllByClgId(users)

		model:[user:user,users:users]
	}
	
	def transferList(Integer max){
		
			params.max = Math.min(max ?: 10000, 100000)
			
			
			def d = FilledPost.createCriteria()
			def resultss = d.list {
				println("deptsearch :")
				//eq("staffType", "Non Teaching")
				eq("retired", "False")
				eq("transferpost", "True")
		
			}
			 model:[filledPostInstanceResultss: resultss]
			
	
	}
	
	
	def searchByDepte(){

		def clg=params?.collagId
		def dept=params.deptId
		def staffty=params.staffType
		def checkj371=params.j371
		Department cls=Department.findById(params.deptId)
		Usercreation usls=Usercreation.findById(params?.collagId)

		//println("params?.collagId "+cls.username)
		println("params?.collagId "+params.deptId)
		println("params?.collagId "+params?.collagId)

		def c = FilledPost.createCriteria()
		def results = c.list {

		

				eq("colgName", usls?.username)
				eq("retired", "False")
				eq("staffType", staffty)
				deptId{
					eq("deptName", cls?.deptName)
					
					//println("2IF")
				}
		



		}
		//	println("hhhhhhhhhhhhhhhh" +results)
		def projectList=[]
		projectList=results
		render(template:'usertemplate',model:[usedetails:results,projectList:projectList])

		//def dp = FilledPost.findAllByCollagId(dept)
		//println("dpartement "+dp)


	}
	
	def transferDetails(){
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		def user =Department.findAllByClgId(users)
		def empnames= FilledPost.findAllByAdminId(userService.getCurrentAdmin())
		
		def c = FilledPost.createCriteria()
		def results = c.list {
			
			eq("retired", "False")
			eq("transferpost", "False")

		}
		
		model:[user:user,users:users,empnames:results]
	}
	
	
	
	def searchByTrnsfer(){
		def users =Usercreation.findAllByAdminId(userService.getCurrentAdmin())
		def user =Department.findAllByClgId(users)

		
				def clg=params?.collagId
				def dept=params.deptId
				def staffty=params.staffType
				def checkj371=params.j371
				def empnId=params.employeenames
				Department cls=Department.findById(params.deptId)
				Usercreation usls=Usercreation.findById(params?.collagId)
		
				//println("params?.collagId "+cls.username)
				println("params?.collagId "+params.deptId)
				println("params?.collagId "+params?.collagId)
		
				def c = FilledPost.createCriteria()
				def results = c.list {
		
				
		
						eq("colgName", usls?.username)
						eq("employeeNumber", empnId)
						eq("transferpost", "False")
						eq("retired", "False")
						eq("staffType", staffty)
						deptId{
							eq("deptName", cls?.deptName)
							
							//println("2IF")
						}
				
		
		
		
				}
					println("hhhhhhhhhhhhhhhh" +results)
				def projectList=[]
				projectList=results
				render(template:'transferdetails',model:[usedetails:results,projectList:projectList,user:user,users:users])
		
				//def dp = FilledPost.findAllByCollagId(dept)
				//println("dpartement "+dp)
		
		
			}
	
	@Transactional
	def transferupdate() {

		println("Params"+params)
		//	params?.deptId
		//	println("filledPostInstance : "+filledPostInstance)

		FilledPost fill = FilledPost.findById(params?.version)
		println("Fill Post Id : "+fill?.deptId)

		Department dept = Department.findById(fill?.deptId.id)
		Usercreation user = Usercreation.findById(fill?.collagId.id)

		println("dept  Id : "+dept)
		println("user  Id : "+user)

		if(fill?.j371 == "No" && fill?.staffType == "Teaching"){

			def stv1 = dept.stateTeachVacant
			def stf1 = dept.stateTeachFilled


			int tachingvantdept = stv1 + 1
			int teachstfilled = stf1 - 1

			dept.stateTeachVacant = tachingvantdept
			dept.stateTeachFilled = teachstfilled

			int clgTeach=user.teaching2 - 1
			int clgVacantTeach=user.teaching3 + 1


			user.teaching2=clgTeach
			user.teaching3=clgVacantTeach
			//user.save()
		}
		if(fill?.j371 == "No" && fill?.staffType == "Non Teaching"){


			def sntv1 = dept.stateNonTeachVacant
			def sntf1 = dept.stateNonTeachFilled

			int nontevacantdept = sntv1  + 1
			int nonteachstfilled= sntf1 - 1

			dept.stateNonTeachVacant = nontevacantdept
			dept.stateNonTeachFilled = nonteachstfilled


			int clgnonTeach = user.nonteaching2 - 1
			int clgnonVacantTeach = user.nonteaching3 + 1


			user.nonteaching2 = clgnonTeach
			user.nonteaching3 = clgnonVacantTeach

		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Teaching"){


			def kktv1 = dept.kkTeachVacant
			def kktf1 = dept.kkTeachFilled


			int tachingvantdept = kktv1 + 1
			int teachstfilled = kktf1 - 1


			dept.kkTeachVacant = tachingvantdept
			dept.kkTeachFilled = teachstfilled

			int clgTeach=user.teaching2 - 1
			int clgVacantTeach=user.teaching3 + 1


			user.teaching2=clgTeach
			user.teaching3=clgVacantTeach

		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Non Teaching"){

			def kkntv1 = dept.kkNonTeachVacant
			def kkntf1 = dept.kkNonTeachFilled

			int nontevacantdept = kkntv1  + 1
			int nonteachstfilled= kkntf1 - 1


			dept.kkNonTeachFilled = nonteachstfilled
			dept.kkNonTeachVacant = nontevacantdept
			int clgnonTeach = user.nonteaching2 - 1
			int clgnonVacantTeach = user.nonteaching3 + 1


			user.nonteaching2=clgnonTeach
			user.nonteaching3=clgnonVacantTeach
		}
		user.save()
		dept.save()

		fill.setRetired("True")
		

		fill.save()

		flash.message = "Retired Successfuly";
		redirect action : "searchByDept"

	}

	@Transactional
	def transferEmployee() {
		println("Params"+params)
		//	params?.deptId
		//	println("filledPostInstance : "+filledPostInstance)

		FilledPost fill = FilledPost.findById(params?.version)
		println("Fill Post Id : "+fill?.deptId)

		Department dept = Department.findById(fill?.deptId.id)
		Usercreation user = Usercreation.findById(fill?.collagId.id)

		println("dept  Id : "+dept)
		println("user  Id : "+user)

		if(fill?.j371 == "No" && fill?.staffType == "Teaching"){

			def stv1 = dept.stateTeachVacant
			def stf1 = dept.stateTeachFilled


			int tachingvantdept = stv1 + 1
			int teachstfilled = stf1 - 1

			dept.stateTeachVacant = tachingvantdept
			dept.stateTeachFilled = teachstfilled

			int clgTeach=user.teaching2 - 1
			int clgVacantTeach=user.teaching3 + 1


			user.teaching2=clgTeach
			user.teaching3=clgVacantTeach
			//user.save()
		}
		if(fill?.j371 == "No" && fill?.staffType == "Non Teaching"){


			def sntv1 = dept.stateNonTeachVacant
			def sntf1 = dept.stateNonTeachFilled

			int nontevacantdept = sntv1  + 1
			int nonteachstfilled= sntf1 - 1

			dept.stateNonTeachVacant = nontevacantdept
			dept.stateNonTeachFilled = nonteachstfilled


			int clgnonTeach = user.nonteaching2 - 1
			int clgnonVacantTeach = user.nonteaching3 + 1


			user.nonteaching2 = clgnonTeach
			user.nonteaching3 = clgnonVacantTeach

		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Teaching"){


			def kktv1 = dept.kkTeachVacant
			def kktf1 = dept.kkTeachFilled


			int tachingvantdept = kktv1 + 1
			int teachstfilled = kktf1 - 1


			dept.kkTeachVacant = tachingvantdept
			dept.kkTeachFilled = teachstfilled

			int clgTeach=user.teaching2 - 1
			int clgVacantTeach=user.teaching3 + 1


			user.teaching2=clgTeach
			user.teaching3=clgVacantTeach

		}
		if(fill?.j371 == "Yes" && fill?.staffType == "Non Teaching"){

			def kkntv1 = dept.kkNonTeachVacant
			def kkntf1 = dept.kkNonTeachFilled

			int nontevacantdept = kkntv1  + 1
			int nonteachstfilled= kkntf1 - 1


			dept.kkNonTeachFilled = nonteachstfilled
			dept.kkNonTeachVacant = nontevacantdept
			int clgnonTeach = user.nonteaching2 - 1
			int clgnonVacantTeach = user.nonteaching3 + 1


			user.nonteaching2=clgnonTeach
			user.nonteaching3=clgnonVacantTeach
		}
		user.save()
		dept.save()

		fill.setTransferpost("True")
		//fill.retired = "True"

		fill.save()


		redirect action : "transferDetails"

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
	
	def getusrTransfer(){
		
		
				def cls=Usercreation.findById(params.value)
				def anidtl1=Usercreation.createCriteria().get{
					eq('id',Usercreation.findById(params.value).id)
					eq('adminId',userService.getCurrentAdmin())
				}
				if(!anidtl1) {
					flash.msg="asdada"
				}
				render(template:'trsnferclg',model:[usrdtl:anidtl1])
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
}
