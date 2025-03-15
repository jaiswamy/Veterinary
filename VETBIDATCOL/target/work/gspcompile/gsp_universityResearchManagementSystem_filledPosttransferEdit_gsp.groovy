import com.hiideals.cadre.FilledPost
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPosttransferEdit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/transferEdit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',58,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',70,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',89,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',114,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',127,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',131,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',133,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',145,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',149,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',163,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',167,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',183,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',188,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',193,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',199,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',205,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',217,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(25)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',222,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(31)
createClosureForHtmlPart(32, 3)
invokeTag('link','g',236,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',251,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',252,['roles':("ROLE_ADMIN")],2)
printHtmlPart(35)
if(true && (flash.message)) {
printHtmlPart(36)
expressionOut.print(flash.message)
printHtmlPart(37)
}
printHtmlPart(1)
createTagBody(2, {->
printHtmlPart(1)
invokeTag('hiddenField','g',363,['name':("version"),'value':(filledPostInstance?.version)],-1)
printHtmlPart(38)
invokeTag('render','g',364,['template':("form")],-1)
printHtmlPart(39)
invokeTag('actionSubmit','g',368,['class':("btn yellow"),'action':("transferUpdate"),'value':(message(code: 'default.button.update.label', default: 'Transfer'))],-1)
printHtmlPart(40)
})
invokeTag('form','g',369,['url':([resource:filledPostInstance, action:'transferUpdate']),'method':("PUT"),'class':("horizontal-form")],2)
printHtmlPart(41)
invokeTag('render','g',380,['template':("/header/footer")],-1)
printHtmlPart(42)
})
invokeTag('captureBody','sitemesh',603,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(43)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653546400000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
