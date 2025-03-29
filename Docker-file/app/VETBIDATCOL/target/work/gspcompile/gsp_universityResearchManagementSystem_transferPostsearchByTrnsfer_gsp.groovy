import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_transferPostsearchByTrnsfer_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transferPost/searchByTrnsfer.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',80,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',92,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',111,['template':("/header/topBar")],-1)
printHtmlPart(7)
invokeTag('render','g',125,['template':("/header/leftSide"),'model':([activ:[adminssion:'start active open']])],-1)
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'collagId', 'error'))
printHtmlPart(10)
invokeTag('message','g',215,['code':("postFilled.collageName.label"),'default':("College Name")],-1)
printHtmlPart(11)
expressionOut.print(remoteFunction(
			          controller: 'transferPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value"))
printHtmlPart(12)
expressionOut.print(filledPostInstance?.collagId?.id)
printHtmlPart(13)
expressionOut.print(filledPostInstance?.collagId?.username)
printHtmlPart(14)
for( usrdtl in (users) ) {
printHtmlPart(15)
expressionOut.print(usrdtl?.id)
printHtmlPart(16)
expressionOut.print(usrdtl?.username)
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('render','g',241,['template':("userDetails")],-1)
printHtmlPart(19)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'staffType', 'error'))
printHtmlPart(20)
invokeTag('submitButton','g',260,['name':("Search"),'class':("btn yellow"),'style':("margin-top: 25px")],-1)
printHtmlPart(21)
})
invokeTag('formRemote','g',268,['name':("ss1"),'update':("update2"),'url':([action:'searchByDeptess'])],2)
printHtmlPart(22)
invokeTag('render','g',286,['template':("/header/footer"),'id':("printPageButton")],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',404,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653482980000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
