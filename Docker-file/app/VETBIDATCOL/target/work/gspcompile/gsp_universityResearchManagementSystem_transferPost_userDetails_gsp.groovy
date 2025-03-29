import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_transferPost_userDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transferPost/_userDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'deptId', 'error'))
printHtmlPart(1)
invokeTag('message','g',10,['code':("postFilled.department.label"),'default':("Department Name")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(
          controller: 'transferPost', 
          action: 'getusrDtls',
  update:'Returntype5',
          params: "\'value=\' + this.value"))
printHtmlPart(3)
expressionOut.print(filledPostInstance?.deptId?.id)
printHtmlPart(4)
expressionOut.print(filledPostInstance?.deptId?.deptName)
printHtmlPart(5)
for( usrdt in (usrdtl?.deptIds) ) {
printHtmlPart(6)
expressionOut.print(usrdt?.id)
printHtmlPart(7)
expressionOut.print(usrdt?.deptName)
printHtmlPart(8)
}
printHtmlPart(9)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1651748618000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
