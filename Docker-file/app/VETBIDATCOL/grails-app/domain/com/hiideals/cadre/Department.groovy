package com.hiideals.cadre

import com.hiideals.endometric.Usercreation
import com.springapp.Admin

class Department {
	Admin adminId
	String clgId
	String deptName
	int teaching
	int nonTeaching
	int stateTeaching
	int stateTeachFilled
	int stateTeachVacant
	int stateNonTeaching
	int stateNonTeachFilled
	int stateNonTeachVacant
	int kkTeaching
	int kkTeachFilled
	int kkTeachVacant
	int kkNonTeaching
	int kkNonTeachFilled
	int kkNonTeachVacant
	
	
	

    static constraints = {
		 adminId nullable:true
	     clgId nullable:true
         deptName nullable:true
	     teaching nullable:true
		 nonTeaching nullable:true
		 stateTeaching nullable:true
		 stateTeachFilled nullable:true
		 stateTeachVacant nullable:true
		 stateNonTeaching nullable:true
		 stateNonTeachFilled nullable:true
		 stateNonTeachVacant nullable:true
		 kkTeaching nullable:true
		 kkTeachFilled nullable:true
		 kkTeachVacant nullable:true
		 kkNonTeaching nullable:true
		 kkNonTeachFilled nullable:true
		 kkNonTeachVacant nullable:true
		
    }
}
