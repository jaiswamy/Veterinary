package com.hiideals.cadre

import com.hiideals.document.Documents
import com.hiideals.endometric.Usercreation
import com.springapp.Admin

class FilledPost {
	Admin adminId
	Usercreation collagId
	Department deptId
	String staffType
	String cadreType
	String positionType
	String employeeName
	String employeeNumber
	String empPayScale
	String socialcategory
	String j371
	String pwd
	Date doeAssistantProfessorKVAFSU
	Date doeProfessorCAS
	String professor
    Date doePresentCadre
	String present
	Date dateofRetirement
	String remarks
	String colgName
	String retired	
	String transferpost
	Date nonDOEintoCrafts
	Date nonDOEintoPresentPayscale
	String nonProfessor
	Date nonDOEintoOnetimeupgradation
	Date nonDOEforPromotion
	String nonPresent
	String fromCollage
	String nameofpost
	
	static hasMany=[deptIds:Department,docs:Documents,outwarddoc:Documents]
	
	
	 static constraints = {
		 colgName nullable:true
		 collagId nulable:true
		 deptIds nullable:true
		 deptId nullable:true
		 adminId nullable:true
		 collagId nullable:true
		 staffType nullable:true
		 cadreType nullable:true
		 positionType nullable:true
		 employeeName nullable:true
		 employeeNumber nullable:true
		 empPayScale nullable:true
		 socialcategory nullable:true
		 j371 nullable:true
		 pwd nullable:true
		 doeAssistantProfessorKVAFSU nullable:true
		 doeProfessorCAS nullable:true
		 professor nullable:true
		 doePresentCadre nullable:true
		 present nullable:true
		 dateofRetirement nullable:true
		 remarks nullable:true
		 retired nullable:true
		 transferpost nullable:true
		 nonDOEintoCrafts nullable:true
		 nonDOEintoPresentPayscale nullable:true
		 nonProfessor nullable:true
		 nonDOEintoOnetimeupgradation nullable:true
		 nonDOEforPromotion nullable:true
		 nonPresent nullable:true
		 fromCollage nullable:true
		 docs nullable:true
		outwarddoc nullable:true
		nameofpost nullable:true
		 
		 
	 }
		
    }

