package com.hiideals.document

class Documents {

    String docsPath
	String docName

    static constraints = {
		docsPath nullable:true
		docName nullable:true
    }
}
