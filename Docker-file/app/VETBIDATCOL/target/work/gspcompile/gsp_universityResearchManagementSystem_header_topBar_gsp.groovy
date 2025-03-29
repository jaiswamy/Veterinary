import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_header_topBar_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/header/_topBar.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('getProfilePic','images',5,[:],-1)
printHtmlPart(1)
invokeTag('username','sec',6,[:],-1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(createLink(controller: 'logout'))
printHtmlPart(4)
})
invokeTag('ifLoggedIn','sec',21,[:],1)
printHtmlPart(5)
createTagBody(1, {->
printHtmlPart(6)
createClosureForHtmlPart(7, 2)
invokeTag('link','g',25,['controller':("login"),'action':("auth")],2)
printHtmlPart(8)
})
invokeTag('ifNotLoggedIn','sec',26,[:],1)
printHtmlPart(9)
invokeTag('username','sec',40,[:],-1)
printHtmlPart(10)
createClosureForHtmlPart(11, 1)
invokeTag('ifAnyGranted','sec',42,['roles':("ROLE_USER")],1)
printHtmlPart(12)
createClosureForHtmlPart(11, 1)
invokeTag('ifAnyGranted','sec',48,['roles':("ROLE_SUPERADMIN")],1)
printHtmlPart(12)
createClosureForHtmlPart(11, 1)
invokeTag('ifAnyGranted','sec',54,['roles':("ROLE_ADMIN")],1)
printHtmlPart(13)
createTagBody(1, {->
printHtmlPart(14)
invokeTag('submitButton','g',59,['name':("Log Out"),'class':("btn btn-warning"),'style':("margin: -6px 2px 7px -2px;")],-1)
printHtmlPart(15)
})
invokeTag('form','g',60,['controller':("logout")],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653460926000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
