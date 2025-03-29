class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?(.$format)?"
		{ constraints 
			{
			 // apply constraints here
			}
		 }

		"/"(controller:"mainPage")
		"500"(view:'/error')


		"/Super@dm!n"(controller:'superadmin', action:'index')
		"500"(view:'/error')

		"/Dashboard"(controller:'superadmin', action:'indexx')
		"500"(view:'/error')

		"/register"(controller:'register', action:'index')
		"500"(view:'/error')
		
		"/Usercreates"(controller:'usercreate', action:'index')
		"500"(view:'/error')
		
		"/Usercreatesindex"(controller:'usercreate', action:'index')
		"500"(view:'/error')
		
		
		"/Specificuserlist"(controller:'inwardform', action:'userlist')
		"500"(view:'/error')
		
		"/cadreindex"(controller:'cadre', action:'index')
		"500"(view:'/error')
		
		"/cadreshow"(controller:'cadre', action:'show')
		"500"(view:'/error')
		 
		"/cadrecreate"(controller:'cadre', action:'create')
		"500"(view:'/error')
		
		"/cadreedit"(controller:'cadre', action:'edit')
		"500"(view:'/error')
		
		
		
		"/filledPostindex"(controller:'filledPost', action:'index')
		"500"(view:'/error')
		
		"/filledPostindexnonteaching"(controller:'filledPost', action:'indexnonteaching')
		"500"(view:'/error')
		
		"/filledPostsshow"(controller:'filledPost', action:'show')
		"500"(view:'/error')
		 
		"/filledPostcreate"(controller:'filledPost', action:'create')
		"500"(view:'/error')
		
		"/filledPostedit"(controller:'filledPost', action:'edit')
		"500"(view:'/error')
		
		"/filledPost"(controller:'filledPost', action:'searchByDept')
		"500"(view:'/error')
		
		"/teachingTransfer"(controller:'filledPost', action:'transferteaching')
		"500"(view:'/error')
		
		"/nonTeachingTransfer"(controller:'filledPost', action:'transfernonteaching')
		"500"(view:'/error')
		
		
		
		"/departmentindex"(controller:'department', action:'index')
		"500"(view:'/error')
		
		"/departmentshow"(controller:'department', action:'show')
		"500"(view:'/error')
		 
		"/departmentcreate"(controller:'department', action:'create')
		"500"(view:'/error')

		"/departmentedit"(controller:'department', action:'edit')
		"500"(view:'/error')
		
		
		"/Collagereports"(controller:'usercreate', action:'collagereport')
		"500"(view:'/error')
		
		"/Departmentreports"(controller:'department', action:'departmentreport')
		"500"(view:'/error')
		
		
		"/Filereports"(controller:'filledPost', action:'filereport')
		"500"(view:'/error')
		
		"/Filereportsnontec"(controller:'filledPost', action:'filereportnontech')
		"500"(view:'/error')
		
		"/Filereportstrans"(controller:'filledPost', action:'filereporttrans')
		"500"(view:'/error')
		
		"/Filereportstransnon"(controller:'filledPost', action:'filereporttransnon')
		"500"(view:'/error')
		
		
		"/Retired"(controller:'transferPost', action:'searchByDept')
		"500"(view:'/error')
		
		"/TransferEmp"(controller:'transferPost', action:'transferDetails')
		"500"(view:'/error')
		
		"/TransferList"(controller:'transferPost', action:'transferList')
		"500"(view:'/error')
		"/TransferListUpdate"(controller:'filledPost', action:'transferEdit')
		"500"(view:'/error')
		
		
		
		"/SearchByclg"(controller:'filledPost', action:'searchByCollage')
		"500"(view:'/error')
		
		
		
		
		
		
		
		
	}
}
