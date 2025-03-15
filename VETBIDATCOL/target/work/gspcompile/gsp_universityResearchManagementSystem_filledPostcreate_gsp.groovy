import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPostcreate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/create.gsp" }
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
invokeTag('captureHead','sitemesh',57,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',74,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',93,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',118,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',131,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',135,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',137,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',149,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',153,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',167,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',171,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',187,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',192,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',197,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',203,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',209,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(29)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',221,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(26)
createClosureForHtmlPart(31, 3)
invokeTag('link','g',226,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(32)
createClosureForHtmlPart(33, 3)
invokeTag('link','g',240,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(34)
createClosureForHtmlPart(35, 3)
invokeTag('link','g',255,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',256,['roles':("ROLE_ADMIN")],2)
printHtmlPart(36)
createClosureForHtmlPart(37, 2)
invokeTag('link','g',351,['controller':("filledPost"),'action':("index"),'class':("btn sbold green btn-sm")],2)
printHtmlPart(38)
if(true && (flash.message)) {
printHtmlPart(39)
expressionOut.print(flash.message)
printHtmlPart(40)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(41)
invokeTag('render','g',373,['template':("form")],-1)
printHtmlPart(42)
invokeTag('submitButton','g',378,['name':("create"),'class':("btn yellow"),'value':(message(code: 'default.button.create.label', default: 'Create'))],-1)
printHtmlPart(43)
})
invokeTag('form','g',379,['id':("myForm"),'url':([resource:filledPostInstance, action:'save']),'enctype':("multipart/form-data"),'class':("horizontal-form")],2)
printHtmlPart(44)
invokeTag('render','g',391,['template':("/header/footer")],-1)
printHtmlPart(45)
})
invokeTag('captureBody','sitemesh',656,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(46)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653560608000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
