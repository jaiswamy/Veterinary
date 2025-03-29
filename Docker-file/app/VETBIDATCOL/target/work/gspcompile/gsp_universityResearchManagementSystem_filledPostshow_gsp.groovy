import com.hiideals.cadre.FilledPost
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPostshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Animate Research"),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',66,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(fieldValue(bean: filledPostInstance?.collagId, field: "username"))
printHtmlPart(6)
expressionOut.print(filledPostInstance?.cadreType)
printHtmlPart(7)
expressionOut.print(filledPostInstance?.employeeName)
printHtmlPart(8)
expressionOut.print(filledPostInstance?.empPayScale)
printHtmlPart(9)
expressionOut.print(filledPostInstance?.employeeNumber)
printHtmlPart(10)
expressionOut.print(filledPostInstance?.staffType)
printHtmlPart(11)
expressionOut.print(filledPostInstance?.socialcategory)
printHtmlPart(12)
expressionOut.print(filledPostInstance?.j371)
printHtmlPart(13)
expressionOut.print(filledPostInstance?.pwd)
printHtmlPart(14)
if(true && (filledPostInstance.staffType == "Teaching")) {
printHtmlPart(15)
invokeTag('formatDate','g',217,['date':(filledPostInstance.doeAssistantProfessorKVAFSU),'format':("dd-MM-yyyy")],-1)
printHtmlPart(16)
invokeTag('formatDate','g',227,['date':(filledPostInstance.doeProfessorCAS),'format':("dd-MM-yyyy")],-1)
printHtmlPart(17)
expressionOut.print(filledPostInstance?.professor)
printHtmlPart(18)
invokeTag('formatDate','g',237,['date':(filledPostInstance.doePresentCadre),'format':("dd-MM-yyyy")],-1)
printHtmlPart(17)
expressionOut.print(filledPostInstance?.present)
printHtmlPart(14)
}
printHtmlPart(19)
if(true && (filledPostInstance.staffType == "Non Teaching")) {
printHtmlPart(20)
invokeTag('formatDate','g',256,['date':(filledPostInstance.nonDOEintoCrafts),'format':("dd-MM-yyyy")],-1)
printHtmlPart(21)
invokeTag('formatDate','g',264,['date':(filledPostInstance.nonDOEintoPresentPayscale),'format':("dd-MM-yyyy")],-1)
printHtmlPart(17)
expressionOut.print(filledPostInstance?.nonProfessor)
printHtmlPart(22)
invokeTag('formatDate','g',283,['date':(filledPostInstance.nonDOEintoOnetimeupgradation),'format':("dd-MM-yyyy")],-1)
printHtmlPart(23)
expressionOut.print(filledPostInstance?.nonPresent)
printHtmlPart(24)
invokeTag('formatDate','g',294,['date':(filledPostInstance.nonDOEforPromotion),'format':("dd-MM-yyyy")],-1)
printHtmlPart(25)
}
printHtmlPart(26)
invokeTag('formatDate','g',303,['date':(filledPostInstance.dateofRetirement),'format':("dd-MM-yyyy")],-1)
printHtmlPart(27)
expressionOut.print(filledPostInstance?.remarks)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',395,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463720000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
