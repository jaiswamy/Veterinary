import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPostindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',63,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',140,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',159,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',183,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',196,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',200,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',202,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',214,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',218,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',232,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',236,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',253,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',258,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',263,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',269,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',275,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(29)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',287,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(26)
createClosureForHtmlPart(31, 3)
invokeTag('link','g',292,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(32)
createClosureForHtmlPart(33, 3)
invokeTag('link','g',306,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(34)
createClosureForHtmlPart(35, 3)
invokeTag('link','g',321,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',322,['roles':("ROLE_ADMIN")],2)
printHtmlPart(36)
if(true && (flash.message)) {
printHtmlPart(37)
expressionOut.print(flash.message)
printHtmlPart(38)
}
printHtmlPart(39)
createClosureForHtmlPart(40, 2)
invokeTag('link','g',425,['controller':("filledPost"),'action':("create"),'class':("btn sbold green btn-sm")],2)
printHtmlPart(41)
loop:{
int i = 0
for( filledPostInstance in (filledPostInstanceResults) ) {
printHtmlPart(42)
expressionOut.print(i+1)
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance?.collagId, field: "username"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "cadreType"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "staffType"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "positionType"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance?.deptId, field: "deptName"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeName"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeNumber"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "empPayScale"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "socialcategory"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "j371"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "pwd"))
printHtmlPart(45)
invokeTag('formatDate','g',518,['date':(filledPostInstance.doeAssistantProfessorKVAFSU),'format':("dd-MM-yyyy")],-1)
printHtmlPart(46)
invokeTag('formatDate','g',521,['date':(filledPostInstance.doeProfessorCAS),'format':("dd-MM-yyyy")],-1)
printHtmlPart(47)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "professor"))
printHtmlPart(48)
invokeTag('formatDate','g',529,['date':(filledPostInstance.doePresentCadre),'format':("dd-MM-yyyy")],-1)
printHtmlPart(49)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "present"))
printHtmlPart(50)
invokeTag('formatDate','g',537,['date':(filledPostInstance.dateofRetirement),'format':("dd-MM-yyyy")],-1)
printHtmlPart(51)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "remarks"))
printHtmlPart(52)
expressionOut.print(i)
printHtmlPart(53)
createTagBody(3, {->
printHtmlPart(54)
createClosureForHtmlPart(55, 4)
invokeTag('link','g',555,['action':("edit"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(54)
createClosureForHtmlPart(56, 4)
invokeTag('link','g',560,['action':("show"),'target':("_blank"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(57)
createClosureForHtmlPart(58, 4)
invokeTag('link','g',567,['action':("transferEdit"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(59)
})
invokeTag('ifAnyGranted','sec',567,['roles':("ROLE_ADMIN")],3)
printHtmlPart(60)
expressionOut.print(i)
printHtmlPart(61)
if(true && (filledPostInstance?.docs)) {
printHtmlPart(62)
loop:{
int y = 0
for( dc in (filledPostInstance?.docs) ) {
printHtmlPart(63)
expressionOut.print(createLink(controller:'filledPost', action:'downloadFile', id:dc?.id))
printHtmlPart(64)
expressionOut.print(dc?.docName)
printHtmlPart(65)
y++
}
}
printHtmlPart(66)
}
printHtmlPart(67)
i++
}
}
printHtmlPart(68)
createClosureForHtmlPart(69, 2)
invokeTag('link','g',609,['action':("filereport"),'class':("btn btn blue btn-primary"),'target':("_blank")],2)
printHtmlPart(70)
invokeTag('render','g',634,['template':("/header/footer")],-1)
printHtmlPart(71)
})
invokeTag('captureBody','sitemesh',701,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(72)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463652000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
