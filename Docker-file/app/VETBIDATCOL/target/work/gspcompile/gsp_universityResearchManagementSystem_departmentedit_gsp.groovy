import com.hiideals.cadre.Department
import com.hiideals.cadre.FilledPost
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_departmentedit_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/department/edit.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"),'name':("description")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',59,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('render','g',71,['template':("/header/logo")],-1)
printHtmlPart(6)
invokeTag('render','g',90,['template':("/header/topBar")],-1)
printHtmlPart(7)
createClosureForHtmlPart(8, 2)
invokeTag('link','g',115,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
createClosureForHtmlPart(11, 3)
invokeTag('link','g',128,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',132,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',134,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',146,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(13, 3)
invokeTag('link','g',150,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(18)
createClosureForHtmlPart(19, 3)
invokeTag('link','g',164,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(12)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',168,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(21)
createClosureForHtmlPart(22, 3)
invokeTag('link','g',184,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',189,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(12)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',194,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(26, 3)
invokeTag('link','g',200,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(25)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',206,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(28)
createClosureForHtmlPart(29, 3)
invokeTag('link','g',218,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(25)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',223,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(31)
createClosureForHtmlPart(32, 3)
invokeTag('link','g',237,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',252,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(14)
})
invokeTag('ifAnyGranted','sec',253,['roles':("ROLE_ADMIN")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',348,['controller':("department"),'action':("index"),'class':("btn sbold green btn-sm")],2)
printHtmlPart(37)
if(true && (flash.message)) {
printHtmlPart(38)
expressionOut.print(flash.message)
printHtmlPart(39)
}
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
invokeTag('hiddenField','g',370,['name':("version"),'value':(departmentInstance?.version)],-1)
printHtmlPart(42)
invokeTag('render','g',371,['template':("form")],-1)
printHtmlPart(43)
invokeTag('actionSubmit','g',381,['action':("updateDepartment"),'name':("create"),'class':("btn yellow"),'value':(message(code: 'default.button.Update.label', default: 'Update'))],-1)
printHtmlPart(44)
})
invokeTag('form','g',382,['url':([resource:departmentInstance, action:'updateDepartment']),'method':("PUT"),'class':("horizontal-form")],2)
printHtmlPart(45)
invokeTag('render','g',393,['template':("/header/footer")],-1)
printHtmlPart(46)
})
invokeTag('captureBody','sitemesh',476,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(47)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463832000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
