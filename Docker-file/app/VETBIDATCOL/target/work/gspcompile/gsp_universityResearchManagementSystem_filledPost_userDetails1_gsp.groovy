import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPost_userDetails1_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/_userDetails1.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(userdet11?.teaching1)
printHtmlPart(1)
expressionOut.print(userdet11?.nonteaching1)
printHtmlPart(2)
expressionOut.print(userdet11?.teaching2)
printHtmlPart(3)
expressionOut.print(userdet11?.nonteaching2)
printHtmlPart(4)
expressionOut.print(userdet11?.teaching3)
printHtmlPart(3)
expressionOut.print(userdet11?.nonteaching3)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1650630736000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
