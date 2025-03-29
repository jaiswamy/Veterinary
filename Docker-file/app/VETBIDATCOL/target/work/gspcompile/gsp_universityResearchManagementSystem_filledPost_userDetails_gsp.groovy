import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPost_userDetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/_userDetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(usrdtl?.username)
printHtmlPart(1)
expressionOut.print(usrdtl?.address?.city)
printHtmlPart(2)
expressionOut.print(usrdtl?.teaching1)
printHtmlPart(3)
expressionOut.print(usrdtl?.nonteaching1)
printHtmlPart(4)
expressionOut.print(usrdtl?.teaching2)
printHtmlPart(5)
expressionOut.print(usrdtl?.nonteaching2)
printHtmlPart(6)
expressionOut.print(usrdtl?.teaching3)
printHtmlPart(7)
expressionOut.print(usrdtl?.nonteaching3)
printHtmlPart(8)
if(true && (params?.action != "edit")) {
printHtmlPart(9)
expressionOut.print(hasErrors(bean:filledPostInstance, field:'deptId','error'))
printHtmlPart(10)
invokeTag('message','g',74,['code':("postFilled.department.label"),'default':("Department Name*")],-1)
printHtmlPart(11)
expressionOut.print(remoteFunction(
          controller: 'filledPost', 
          action: 'getusrDtls',
           update:'Returntype5',
          params: "\'value=\' + this.value"))
printHtmlPart(12)
expressionOut.print(filledPostInstance?.deptId?.id)
printHtmlPart(13)
expressionOut.print(filledPostInstance?.deptId?.deptName)
printHtmlPart(14)
for( usrdt in (usrdtl?.deptIds) ) {
printHtmlPart(15)
expressionOut.print(usrdt?.id)
printHtmlPart(16)
expressionOut.print(usrdt?.deptName)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('render','g',99,['template':("userDetailsss")],-1)
printHtmlPart(19)
}
else {
printHtmlPart(9)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'deptId', 'error'))
printHtmlPart(10)
invokeTag('message','g',109,['code':("postFilled.department.label"),'default':("Department  Name*")],-1)
printHtmlPart(20)
expressionOut.print(remoteFunction(
          controller: 'filledPost', 
          action: 'getusrDtls',
           update:'Returntype5',
          params: "\'value=\' + this.value"))
printHtmlPart(21)
expressionOut.print(filledPostInstance?.deptId?.id)
printHtmlPart(22)
expressionOut.print(filledPostInstance?.deptId?.deptName)
printHtmlPart(23)
invokeTag('render','g',130,['template':("userDetailsss")],-1)
printHtmlPart(19)
}
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653721383366L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
