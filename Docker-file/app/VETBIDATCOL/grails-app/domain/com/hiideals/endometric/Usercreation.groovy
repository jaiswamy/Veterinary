package com.hiideals.endometric

import java.util.Date;

import com.hiideals.cadre.Department;
import com.springapp.Address
import com.springapp.Admin
import com.springapp.Images
import com.springapp.SecUser

class Usercreation {

	String username
	String password
	String phoneNo
	Admin adminId
	Images profilePic
	SecUser userId
	Address address
	Date dateCreated
	Date lastUpdated
	int teaching1
	int nonteaching1
	int teaching2
	int nonteaching2
	int teaching3
	int nonteaching3

static hasMany=[deptIds:Department]
	static constraints = {
		deptIds nullable:true
		password nullable:true
		username nullable:true
		profilePic	nullable:true
		phoneNo nullable:true
		userId nullable:true
		dateCreated nullable:true
		lastUpdated nullable:true
		address nullable:true
		teaching1 nullable:true
		nonteaching1 nullable:true
		teaching2 nullable:true
		nonteaching2 nullable:true
		teaching3 nullable:true
		nonteaching3 nullable:true
	}
}

