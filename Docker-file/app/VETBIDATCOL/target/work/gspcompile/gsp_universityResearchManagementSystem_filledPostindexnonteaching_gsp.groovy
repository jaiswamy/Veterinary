import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPostindexnonteaching_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/indexnonteaching.gsp" }
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
invokeTag('captureHead','sitemesh',60,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',72,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',91,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',116,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',129,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',133,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',135,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',147,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',151,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',165,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',169,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',185,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',190,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',195,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',201,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',207,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',219,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(25)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',224,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(31)
createClosureForHtmlPart(32, 3)
invokeTag('link','g',238,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',253,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',254,['roles':("ROLE_ADMIN")],2)
printHtmlPart(35)
if(true && (flash.message)) {
printHtmlPart(36)
expressionOut.print(flash.message)
printHtmlPart(37)
}
printHtmlPart(38)
createClosureForHtmlPart(39, 2)
invokeTag('link','g',357,['controller':("filledPost"),'action':("create"),'class':("btn sbold green btn-sm")],2)
printHtmlPart(40)
loop:{
int i = 0
for( filledPostInstance in (filledPostInstanceResultss) ) {
printHtmlPart(41)
expressionOut.print(i+1)
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance?.collagId, field: "username"))
printHtmlPart(43)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "cadreType"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "staffType"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "positionType"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance?.deptId, field: "deptName"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeName"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "employeeNumber"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "empPayScale"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "socialcategory"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "j371"))
printHtmlPart(42)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "pwd"))
printHtmlPart(44)
invokeTag('formatDate','g',453,['date':(filledPostInstance.nonDOEintoCrafts),'format':("dd-MM-yyyy")],-1)
printHtmlPart(45)
invokeTag('formatDate','g',456,['date':(filledPostInstance.nonDOEintoPresentPayscale),'format':("dd-MM-yyyy")],-1)
printHtmlPart(46)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "nonProfessor"))
printHtmlPart(47)
invokeTag('formatDate','g',464,['date':(filledPostInstance.nonDOEintoOnetimeupgradation),'format':("dd-MM-yyyy")],-1)
printHtmlPart(48)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "nonPresent"))
printHtmlPart(49)
invokeTag('formatDate','g',473,['date':(filledPostInstance.nonDOEforPromotion),'format':("dd-MM-yyyy")],-1)
printHtmlPart(50)
invokeTag('formatDate','g',475,['date':(filledPostInstance.dateofRetirement),'format':("dd-MM-yyyy")],-1)
printHtmlPart(51)
expressionOut.print(fieldValue(bean: filledPostInstance, field: "remarks"))
printHtmlPart(52)
expressionOut.print(i)
printHtmlPart(53)
createTagBody(3, {->
printHtmlPart(54)
createClosureForHtmlPart(55, 4)
invokeTag('link','g',494,['action':("edit"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(54)
createClosureForHtmlPart(56, 4)
invokeTag('link','g',499,['action':("show"),'target':("_blank"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(57)
createClosureForHtmlPart(58, 4)
invokeTag('link','g',505,['action':("transferEdit"),'resource':(filledPostInstance),'class':("btn btn-outline btn-circle btn-sm purple")],4)
printHtmlPart(59)
})
invokeTag('ifAnyGranted','sec',505,['roles':("ROLE_ADMIN")],3)
printHtmlPart(60)
expressionOut.print(i)
printHtmlPart(61)
if(true && (filledPostInstance?.outwarddoc)) {
printHtmlPart(62)
loop:{
int y = 0
for( dc in (filledPostInstance?.outwarddoc) ) {
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
invokeTag('link','g',542,['action':("filereportnontech"),'class':("btn btn blue btn-primary"),'target':("_blank")],2)
printHtmlPart(70)
invokeTag('render','g',566,['template':("/header/footer")],-1)
printHtmlPart(71)
})
invokeTag('captureBody','sitemesh',633,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(72)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653484414000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
