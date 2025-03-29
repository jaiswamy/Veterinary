import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_transferPost_transferdetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/transferPost/_transferdetails.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
loop:{
int i = 0
for( emp in (usedetails) ) {
printHtmlPart(1)
expressionOut.print(i+1)
printHtmlPart(2)
expressionOut.print(emp?.employeeName)
printHtmlPart(3)
expressionOut.print(emp?.employeeNumber)
printHtmlPart(3)
expressionOut.print(emp?.cadreType)
printHtmlPart(3)
expressionOut.print(emp?.staffType)
printHtmlPart(3)
expressionOut.print(emp?.positionType)
printHtmlPart(3)
expressionOut.print(emp?.j371)
printHtmlPart(4)
createTagBody(2, {->
printHtmlPart(5)
invokeTag('hiddenField','g',51,['name':("version"),'value':(emp?.id)],-1)
printHtmlPart(6)
invokeTag('actionSubmit','g',52,['class':("btn yellow"),'action':("transferEmployee"),'value':(message(code: 'default.button.transferupdate.label', default: 'Transfer'))],-1)
printHtmlPart(6)
})
invokeTag('form','g',53,['method':("PUT"),'class':("horizontal-form")],2)
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1652263144000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
