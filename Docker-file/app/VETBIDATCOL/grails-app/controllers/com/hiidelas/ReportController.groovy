package com.hiidelas

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured

import com.springapp.Address
import com.springapp.Admin
import com.springapp.Images
import com.springapp.SecRole
import com.springapp.SecUser
import com.springapp.SecUserSecRole



@Secured(["ROLE_SUPERADMIN","ROLE_ADMIN","ROLE_USER"])

class ReportController {

    def index() { 
		
	}
	def cereport() {}
	def sereport() {}
	def psreport() {}
	
}
