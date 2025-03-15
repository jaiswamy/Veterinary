import com.hiideals.cadre.Department
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_department_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/department/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'clgId', 'error'))
printHtmlPart(1)
invokeTag('message','g',15,['code':("department.clgId.label"),'default':("College Name")],-1)
printHtmlPart(2)
expressionOut.print(remoteFunction(controller: 'department', action: 'getusrDtl1',
    update:'Returntype3', params: '\'value=\' + this.value'))
printHtmlPart(3)
for( usrdtl in (user) ) {
printHtmlPart(4)
expressionOut.print(usrdtl?.id)
printHtmlPart(5)
expressionOut.print(usrdtl?.username)
printHtmlPart(6)
}
printHtmlPart(7)
if(true && (hasErrors(bean: departmentInstance, field: 'clgId', 'error'))) {
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('render','g',32,['template':("userDetails")],-1)
printHtmlPart(10)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'deptName', 'error'))
printHtmlPart(11)
if(true && (params?.action != "edit")) {
printHtmlPart(12)
invokeTag('message','g',42,['code':("department.deptName.label"),'default':(" Department Name* ")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
invokeTag('message','g',48,['code':("department.deptName.label"),'default':(" Old Department Name ")],-1)
printHtmlPart(15)
expressionOut.print(departmentInstance?.deptName)
printHtmlPart(16)
}
printHtmlPart(17)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'teaching', 'error'))
printHtmlPart(18)
invokeTag('message','g',120,['code':("department.teaching.label"),'default':("Teaching*")],-1)
printHtmlPart(19)
invokeTag('field','g',124,['name':("teaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.teaching),'required':("")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'nonTeaching', 'error'))
printHtmlPart(21)
invokeTag('message','g',132,['code':("department.nonTeaching.label"),'default':("Non-Teaching*")],-1)
printHtmlPart(19)
invokeTag('field','g',136,['name':("nonTeaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.nonTeaching),'required':("")],-1)
printHtmlPart(22)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'stateTeaching', 'error'))
printHtmlPart(23)
invokeTag('message','g',148,['code':("department.stateTeaching.label"),'default':("State Teaching*")],-1)
printHtmlPart(24)
invokeTag('field','g',152,['name':("stateTeaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.stateTeaching),'required':("")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'stateNonTeaching', 'error'))
printHtmlPart(25)
invokeTag('message','g',161,['code':("department.stateNonTeaching.label"),'default':("State Non-Teaching*")],-1)
printHtmlPart(26)
invokeTag('field','g',164,['name':("stateNonTeaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.stateNonTeaching),'required':("")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'kkTeaching', 'error'))
printHtmlPart(27)
invokeTag('message','g',172,['code':("department.kkTeaching.label"),'default':("KK Teaching*")],-1)
printHtmlPart(19)
invokeTag('field','g',176,['name':("kkTeaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.kkTeaching),'required':("")],-1)
printHtmlPart(20)
expressionOut.print(hasErrors(bean: departmentInstance, field: 'kkNonTeaching', 'error'))
printHtmlPart(28)
invokeTag('message','g',184,['code':("department.kkNonTeaching.label"),'default':("KK Non-Teaching*")],-1)
printHtmlPart(24)
invokeTag('field','g',188,['name':("kkNonTeaching"),'type':("number"),'class':("form-control"),'value':(departmentInstance.kkNonTeaching),'required':("")],-1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1741866442674L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
