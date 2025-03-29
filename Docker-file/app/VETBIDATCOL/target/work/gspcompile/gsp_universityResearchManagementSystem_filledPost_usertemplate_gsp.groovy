import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPost_usertemplate_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/_usertemplate.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(usedetails?.collagId?.username.last())
printHtmlPart(1)
expressionOut.print(usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.teaching3.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.nonteaching2.last() + usedetails?.collagId?.nonteaching3.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.teaching2.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.nonteaching2.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.teaching3.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.nonteaching3.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.teaching3.last() + usedetails?.collagId?.nonteaching2.last() + usedetails?.collagId?.nonteaching3.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.nonteaching2.last())
printHtmlPart(2)
expressionOut.print(usedetails?.collagId?.teaching3.last() + usedetails?.collagId?.nonteaching3.last())
printHtmlPart(3)
loop:{
int i = 0
for( emp in (usedetails) ) {
printHtmlPart(4)
expressionOut.print(i+1)
printHtmlPart(5)
expressionOut.print(emp?.employeeName)
printHtmlPart(6)
expressionOut.print(emp?.employeeNumber)
printHtmlPart(6)
expressionOut.print(emp?.cadreType)
printHtmlPart(6)
expressionOut.print(emp?.staffType)
printHtmlPart(6)
expressionOut.print(emp?.positionType)
printHtmlPart(6)
expressionOut.print(emp?.j371)
printHtmlPart(7)
i++
}
}
printHtmlPart(8)
if(true && (params?.department != null)) {
printHtmlPart(9)
expressionOut.print(usedetails?.deptId?.deptName.last())
printHtmlPart(10)
loop:{
int i = 0
for( usr in (projectList?.deptIds?.last()) ) {
printHtmlPart(11)
expressionOut.print(usr.teaching + usr.nonTeaching)
printHtmlPart(6)
expressionOut.print(usr.teaching)
printHtmlPart(6)
expressionOut.print(usr.nonTeaching)
printHtmlPart(12)
i++
}
}
printHtmlPart(13)
}
printHtmlPart(14)
for( depts in (projectList?.deptIds.last()) ) {
printHtmlPart(15)
expressionOut.print(depts?.teaching)
printHtmlPart(6)
expressionOut.print(depts?.nonTeaching)
printHtmlPart(6)
expressionOut.print(depts?.stateTeaching)
printHtmlPart(6)
expressionOut.print(depts?.stateTeachFilled)
printHtmlPart(6)
expressionOut.print(depts?.stateTeachVacant)
printHtmlPart(6)
expressionOut.print(depts?.stateNonTeaching)
printHtmlPart(6)
expressionOut.print(depts?.stateNonTeachFilled)
printHtmlPart(6)
expressionOut.print(depts?.stateNonTeachVacant)
printHtmlPart(6)
expressionOut.print(depts?.kkTeaching)
printHtmlPart(6)
expressionOut.print(depts?.kkTeachFilled)
printHtmlPart(6)
expressionOut.print(depts?.kkTeachVacant)
printHtmlPart(6)
expressionOut.print(depts?.kkNonTeaching)
printHtmlPart(6)
expressionOut.print(depts?.kkNonTeachFilled)
printHtmlPart(6)
expressionOut.print(depts?.kkNonTeachVacant)
printHtmlPart(16)
}
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1653382402000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
