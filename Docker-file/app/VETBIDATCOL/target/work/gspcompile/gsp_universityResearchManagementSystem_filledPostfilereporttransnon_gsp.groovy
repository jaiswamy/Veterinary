import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPostfilereporttransnon_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/filereporttransnon.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',73,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
loop:{
int i = 0
for( filledPostInstance in (filledPostInstanceResultss) ) {
printHtmlPart(6)
expressionOut.print(i+1)
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance?.collagId, field: "username"))
printHtmlPart(8)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "cadreType"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "staffType"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "positionType"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance?.deptId, field: "deptName"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeName"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeNumber"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "empPayScale"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "socialcategory"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "j371"))
printHtmlPart(7)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "pwd"))
printHtmlPart(9)
invokeTag('formatDate','g',196,['date':(filledPostInstance.nonDOEintoCrafts),'format':("dd-MM-yyyy")],-1)
printHtmlPart(10)
invokeTag('formatDate','g',200,['date':(filledPostInstance.nonDOEintoPresentPayscale),'format':("dd-MM-yyyy")],-1)
printHtmlPart(11)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "nonProfessor"))
printHtmlPart(12)
invokeTag('formatDate','g',208,['date':(filledPostInstance.nonDOEintoOnetimeupgradation),'format':("dd-MM-yyyy")],-1)
printHtmlPart(13)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "nonPresent"))
printHtmlPart(14)
invokeTag('formatDate','g',216,['date':(filledPostInstance.dateofRetirement),'format':("dd-MM-yyyy")],-1)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "remarks"))
printHtmlPart(16)
i++
}
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',296,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463646000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
