package com.hiidelas

import grails.plugin.springsecurity.annotation.Secured



import com.hiideals.endometric.Usercreation
import com.springapp.Address
import com.springapp.Images
import com.springapp.SecRole
import com.springapp.SecUser
import com.springapp.SecUserSecRole



@Secured(["ROLE_SUPERADMIN","ROLE_ADMIN","ROLE_USER"])

class UsercreateController {

		def userService

	def index() {
		//def cadredet = CadrePosition.findAllByAdminId(userService.getCurrentAdmin())
		def usersInstanceList = Usercreation.findAllByAdminId(userService.getCurrentAdmin());
		model:[usersInstanceList: usersInstanceList]
	}




	def createUser(){
		render(template:'userFORM')
	}


	def saveUser(){
		def userexist=SecUser.findByUsername(params?.username)
		if(userexist){
			flash.message="This College Name Already Exist Please use different College"
			redirect(action:'index')
		}else{

			def userInstance= new SecUser()
			def userRole = SecRole.findByAuthority('ROLE_USER')
			userInstance.properties=params
			def stPath = grailsApplication.config.userPhotos
			userService.createImagePath(stPath)
			def admin=new Usercreation(params)

			def file = request.getFile('file_1')
			if(file.getOriginalFilename()){
				String s = stPath + file.getOriginalFilename()
				try{
					file.transferTo(new File(s))
				}catch(Exception e){}
				Images image = new Images(name:file.getOriginalFilename(),imgpath:s).save(flush:true)
				userInstance.setProfilePic(image)
				admin.setProfilePic(image)
			}
        ///   admin.teaching3=
			admin.properties=params
			admin.password=params.username
			println("admin.teaching1 : "+admin.teaching1)
			admin.teaching3=admin.teaching1
			admin.nonteaching3=admin.nonteaching1
			//admin.nonteaching3=Integer.toString(t2)

			Address address=new Address(params)
			admin.setAddress(address.save(flush:true))
			admin.setAdminId(userService.getCurrentAdmin())
			userInstance.password=params.username
			userInstance.setAdminId(userService.getCurrentAdmin())
			userInstance.save(flush:true,failOnError:true)
			admin.setUserId(userInstance)
			
			admin.save(flush:true,failOnError:true)
			userInstance.setUserId(admin)
			if(!userInstance.authorities.contains(userRole)){
				new SecUserSecRole(userInstance, userRole).save(flush:true,failOnError:true)
			}
			flash.message="College Created Successfully."
			redirect(action:'index')
		}
	}
	def userEdit(){
		def usersInstance=Usercreation.findById(params?.userListid)
		//def cadredet = CadrePosition.findAllByAdminId(userService.getCurrentAdmin())
		
				
		render(template:'userFORM',model:[usersInstance:usersInstance])
	}

	def viewimg(){

		Usercreation documentInstance = Usercreation.get(params.int('id'));
		if ( documentInstance == null) {
			flash.message = "image not found."
			redirect (action:'index')
		} else {
			def file = new File(documentInstance.userId.profilePic.imgpath)
			def fileInputStream = new FileInputStream(file)
			def outputStream = response.getOutputStream()
			byte[] buffer = new byte[4096];
			int len;
			while ((len = fileInputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, len);
			}
			outputStream.flush()
			outputStream.close()
			fileInputStream.close()
		}
	}


	def updateUser(){
		
		Usercreation admin=Usercreation.findById(params?.userListid)
		def userInstance=SecUser.findById(admin.userId?.id)
		
		admin.properties=params
		admin.teaching3 = admin.teaching1 - admin.teaching2
		admin.nonteaching3=admin.nonteaching1 - admin.nonteaching2
		
		def teacCount 
		def nonteacCount
		int teaching =0;
		int nonteaching =0;
		for (var in admin.deptIds){
			 teaching+=var.teaching
			 nonteaching+=var.nonTeaching
			 
		}
		println("###############teaching"+teaching)
		println("###############teaching"+nonteaching)
		admin.teaching1 =admin.teaching1 - teaching
		admin.nonteaching1 =admin.nonteaching1 - nonteaching
		
		
		
		
		
		
		
		
		def address=Address.findById(admin.address?.id)
		address.properties=params
		address.save(flush:true)
		userInstance.username=params.username
			userInstance.password=params.username
			userInstance.setUserId(admin.save(flush:true))
			userInstance.save(flush:true,failOnError:true)
		flash.message="College Updated Successfully."
		redirect(action:'index')
	}

	def createce(){
		
	}
	def collagereport(){
		def usersInstanceList = Usercreation.findAllByAdminId(userService.getCurrentAdmin());
		model:[usersInstanceList: usersInstanceList]
		
	}
	
	
}


