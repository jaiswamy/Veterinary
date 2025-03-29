import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_department_userDetailsss_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/department/_userDetailsss.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(userdet111?.deptName)
printHtmlPart(1)
expressionOut.print(userdet111?.teaching)
printHtmlPart(2)
expressionOut.print(userdet111?.nonTeaching)
printHtmlPart(3)
expressionOut.print(userdet111?.stateTeaching)
printHtmlPart(4)
expressionOut.print(userdet111?.stateTeachFilled)
printHtmlPart(5)
expressionOut.print(userdet111?.stateTeachVacant)
printHtmlPart(6)
expressionOut.print(userdet111?.stateNonTeaching)
printHtmlPart(7)
expressionOut.print(userdet111?.stateNonTeachFilled)
printHtmlPart(5)
expressionOut.print(userdet111?.stateNonTeachVacant)
printHtmlPart(8)
expressionOut.print(userdet111?.kkTeaching)
printHtmlPart(9)
expressionOut.print(userdet111?.kkTeachFilled)
printHtmlPart(10)
expressionOut.print(userdet111?.kkTeachVacant)
printHtmlPart(11)
expressionOut.print(userdet111?.kkNonTeaching)
printHtmlPart(12)
expressionOut.print(userdet111?.kkNonTeachFilled)
printHtmlPart(10)
expressionOut.print(userdet111?.kkNonTeachVacant)
printHtmlPart(13)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1650365300000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
