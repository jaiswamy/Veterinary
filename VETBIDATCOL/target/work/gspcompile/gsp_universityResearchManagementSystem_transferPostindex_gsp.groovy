import com.hiideals.endometric.Usercreation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_transferPostindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transferPost/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(2)
createTagBody(2, {->
createClosureForHtmlPart(3, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',18,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"),'name':("description")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',81,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
invokeTag('render','g',93,['template':("/header/logo")],-1)
printHtmlPart(7)
invokeTag('render','g',112,['template':("/header/topBar")],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',137,['controller':("superadmin"),'action':("indexx"),'class':("nav-link nav-toggle")],2)
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
createClosureForHtmlPart(12, 3)
invokeTag('link','g',150,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',154,['controller':("superadmin"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(15)
})
invokeTag('ifAnyGranted','sec',156,['roles':("ROLE_SUPERADMIN")],2)
printHtmlPart(16)
createTagBody(2, {->
printHtmlPart(17)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',168,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(13)
createClosureForHtmlPart(14, 3)
invokeTag('link','g',172,['controller':("usercreate"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',186,['controller':("department"),'action':("create"),'class':("nav-link ")],3)
printHtmlPart(13)
createClosureForHtmlPart(21, 3)
invokeTag('link','g',190,['controller':("department"),'action':("index"),'class':("nav-link ")],3)
printHtmlPart(22)
createClosureForHtmlPart(23, 3)
invokeTag('link','g',206,['controller':("filledPost"),'action':("create"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(13)
createClosureForHtmlPart(24, 3)
invokeTag('link','g',211,['controller':("filledPost"),'action':("index"),'class':("nav-link"),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(13)
createClosureForHtmlPart(25, 3)
invokeTag('link','g',216,['controller':("filledPost"),'action':("indexnonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(27, 3)
invokeTag('link','g',222,['controller':("filledPost"),'action':("transferteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(26)
createClosureForHtmlPart(28, 3)
invokeTag('link','g',228,['controller':("filledPost"),'action':("transfernonteaching"),'class':("nav-link "),'style':("padding: 30px 0px 30px 25px !important;")],3)
printHtmlPart(29)
createClosureForHtmlPart(30, 3)
invokeTag('link','g',240,['controller':("filledPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(26)
createClosureForHtmlPart(31, 3)
invokeTag('link','g',245,['controller':("filledPost"),'action':("searchByCollage"),'class':("nav-link ")],3)
printHtmlPart(32)
createClosureForHtmlPart(33, 3)
invokeTag('link','g',259,['controller':("transferPost"),'action':("transferList"),'class':("nav-link ")],3)
printHtmlPart(34)
createClosureForHtmlPart(35, 3)
invokeTag('link','g',274,['controller':("transferPost"),'action':("searchByDept"),'class':("nav-link ")],3)
printHtmlPart(15)
})
invokeTag('ifAnyGranted','sec',275,['roles':("ROLE_ADMIN")],2)
printHtmlPart(36)
if(true && (flash.message)) {
printHtmlPart(37)
expressionOut.print(flash.message)
printHtmlPart(38)
}
printHtmlPart(39)
createTagBody(2, {->
printHtmlPart(40)
invokeTag('message','g',373,['code':("postFilled.department.label"),'default':("College Name")],-1)
printHtmlPart(41)
for( usrdtl in (user) ) {
printHtmlPart(42)
expressionOut.print(usrdtl?.username)
printHtmlPart(43)
expressionOut.print(usrdtl?.username)
printHtmlPart(44)
}
printHtmlPart(45)
invokeTag('message','g',387,['code':("postFilled.department.label"),'default':("Department")],-1)
printHtmlPart(46)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'staffType', 'error'))
printHtmlPart(47)
invokeTag('submitButton','g',445,['name':("Search"),'class':("btn yellow"),'style':("margin-top: 25px")],-1)
printHtmlPart(48)
})
invokeTag('formRemote','g',452,['name':("ss1"),'update':("update2"),'url':([action:'searchByDepte'])],2)
printHtmlPart(49)
invokeTag('render','g',461,['template':("/header/footer"),'id':("printPageButton")],-1)
printHtmlPart(50)
})
invokeTag('captureBody','sitemesh',554,['class':("page-header-fixed page-sidebar-closed-hide-logo")],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653463908000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
