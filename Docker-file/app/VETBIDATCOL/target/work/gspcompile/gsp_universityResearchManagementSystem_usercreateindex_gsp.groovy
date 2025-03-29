import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_usercreateindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usercreate/index.gsp" }
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
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',66,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',85,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',110,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',123,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',127,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',129,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',141,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',145,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',159,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',163,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',179,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',184,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',189,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',195,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',201,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',213,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(25)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',218,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(31)
createClosureForHtmlPart(32, 3)
invokeTag('link','g',232,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',247,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',248,['roles':("ROLE_ADMIN")],2)
printHtmlPart(35)
if(true && (flash.message)) {
printHtmlPart(36)
expressionOut.print(flash.message)
printHtmlPart(37)
}
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
createClosureForHtmlPart(40, 3)
invokeTag('formRemote','g',362,['name':("kk"),'url':([action:'createUser']),'update':("update1"),'class':("horizontal-form")],3)
printHtmlPart(41)
loop:{
int i = 0
for( usersInstance in (usersInstanceList?.reverse()) ) {
printHtmlPart(42)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(43)
expressionOut.print(i+1)
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "username"))
printHtmlPart(45)
expressionOut.print(usersInstance?.address?.hsno)
printHtmlPart(46)
expressionOut.print(usersInstance?.address?.street)
printHtmlPart(47)
expressionOut.print(usersInstance?.address?.city)
printHtmlPart(48)
expressionOut.print(usersInstance?.address?.pinCode)
printHtmlPart(49)
expressionOut.print(usersInstance?.address?.state)
printHtmlPart(50)
expressionOut.print(usersInstance?.address?.country)
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching1"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching1"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching2"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching2"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching3"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching3"))
printHtmlPart(44)
expressionOut.print(fieldValue(bean: usersInstance, field: "phoneNo"))
printHtmlPart(51)
expressionOut.print(createLink(controller:'usercreate', action:'viewimg', id:usersInstance?.id))
printHtmlPart(52)
createTagBody(4, {->
printHtmlPart(53)
invokeTag('hiddenField','g',455,['name':("userListid"),'value':(usersInstance?.id)],-1)
printHtmlPart(54)
invokeTag('submitButton','g',458,['name':("Edit"),'class':("btn btn-primary")],-1)
printHtmlPart(55)
})
invokeTag('formRemote','g',459,['name':("kk"),'url':([action:'userEdit']),'update':("update1")],4)
printHtmlPart(56)
i++
}
}
printHtmlPart(57)
createClosureForHtmlPart(58, 3)
invokeTag('link','g',470,['action':("collagereport"),'class':("btn btn blue btn-primary"),'target':("_blank")],3)
printHtmlPart(59)
})
invokeTag('ifAnyGranted','sec',472,['roles':("ROLE_ADMIN")],2)
printHtmlPart(60)
invokeTag('render','g',488,['template':("/header/footer")],-1)
printHtmlPart(61)
})
invokeTag('captureBody','sitemesh',553,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(62)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463950000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
