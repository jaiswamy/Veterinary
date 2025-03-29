import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_usercreatecollagereport_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/usercreate/collagereport.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',15,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("description")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':("/"),'content':(""),'name':("author")],-1)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',79,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
loop:{
int i = 0
for( usersInstance in (usersInstanceList?.reverse()) ) {
printHtmlPart(6)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(7)
expressionOut.print(i+1)
printHtmlPart(8)
expressionOut.print(fieldValue(bean: usersInstance, field: "username"))
printHtmlPart(9)
expressionOut.print(usersInstance?.address?.hsno)
printHtmlPart(10)
expressionOut.print(usersInstance?.address?.street)
printHtmlPart(11)
expressionOut.print(usersInstance?.address?.city)
printHtmlPart(12)
expressionOut.print(usersInstance?.address?.pinCode)
printHtmlPart(13)
expressionOut.print(usersInstance?.address?.state)
printHtmlPart(14)
expressionOut.print(usersInstance?.address?.country)
printHtmlPart(15)
expressionOut.print(fieldValue(bean: usersInstance, field: "phoneNo"))
printHtmlPart(16)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching1"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching1"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching2"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching2"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: usersInstance, field: "teaching3"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: usersInstance, field: "nonteaching3"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',288,['class':("page-header-fixed page-sidebar-closed-hide-logo page-content-white")],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653542418000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
