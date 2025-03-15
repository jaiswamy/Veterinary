import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_universityResearchManagementSystem_filledPost_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/filledPost/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
if(true && (params?.action != "edit")) {
printHtmlPart(1)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'collagId', 'error'))
printHtmlPart(2)
invokeTag('message','g',13,['code':("postFilled.collageName.label"),'default':("College Name*")],-1)
printHtmlPart(3)
expressionOut.print(remoteFunction(
			          controller: 'filledPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value"))
printHtmlPart(4)
expressionOut.print(filledPostInstance?.collagId?.id)
printHtmlPart(5)
expressionOut.print(filledPostInstance?.collagId?.username)
printHtmlPart(6)
for( usrdtl in (users) ) {
printHtmlPart(7)
expressionOut.print(usrdtl?.id)
printHtmlPart(8)
expressionOut.print(usrdtl?.username)
printHtmlPart(9)
}
printHtmlPart(10)
invokeTag('render','g',42,['template':("userDetails")],-1)
printHtmlPart(11)
}
else {
printHtmlPart(12)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'collagId', 'error'))
printHtmlPart(2)
invokeTag('message','g',53,['code':("postFilled.collageName.label"),'default':("College Name*")],-1)
printHtmlPart(13)
expressionOut.print(remoteFunction(
			          controller: 'filledPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value"))
printHtmlPart(4)
expressionOut.print(filledPostInstance?.collagId?.id)
printHtmlPart(14)
expressionOut.print(filledPostInstance?.collagId?.username)
printHtmlPart(15)
invokeTag('render','g',77,['template':("userDetails")],-1)
printHtmlPart(11)
}
printHtmlPart(16)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'cadreType', 'error'))
printHtmlPart(17)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'staffType', 'error'))
printHtmlPart(18)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'positionType', 'error'))
printHtmlPart(19)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'positionType', 'error'))
printHtmlPart(20)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nameofpost', 'error'))
printHtmlPart(21)
invokeTag('message','g',231,['code':("filledPost.nameofpost.label"),'default':("Enter Name Of Post")],-1)
printHtmlPart(22)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'employeeName', 'error'))
printHtmlPart(23)
invokeTag('message','g',250,['code':("filledPost.employeeName.label"),'default':(" Employee Name*")],-1)
printHtmlPart(24)
invokeTag('textField','g',254,['name':("employeeName"),'class':("form-control"),'required':(""),'value':(filledPostInstance?.employeeName)],-1)
printHtmlPart(25)
if(true && (params?.action != "edit")) {
printHtmlPart(26)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'employeeNumber', 'error'))
printHtmlPart(27)
invokeTag('message','g',263,['code':("filledPost.employeeNumber.label"),'default':("Employee Number*")],-1)
printHtmlPart(28)
invokeTag('textField','g',269,['name':("employeeNumber"),'class':("form-control"),'required':(""),'value':(filledPostInstance?.employeeNumber)],-1)
printHtmlPart(25)
}
else {
printHtmlPart(26)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'employeeNumber', 'error'))
printHtmlPart(29)
invokeTag('message','g',280,['code':("filledPost.employeeNumber.label"),'default':("Employee Number*")],-1)
printHtmlPart(30)
expressionOut.print(filledPostInstance?.employeeNumber)
printHtmlPart(31)
}
printHtmlPart(26)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'empPayScale', 'error'))
printHtmlPart(32)
invokeTag('message','g',291,['code':("filledPost.empPayScale.label"),'default':("Employee PayScale")],-1)
printHtmlPart(33)
expressionOut.print(filledPostInstance?.empPayScale)
printHtmlPart(34)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'socialcategory', 'error'))
printHtmlPart(35)
if(true && (params?.action != "edit")) {
printHtmlPart(36)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'j371', 'error'))
printHtmlPart(37)
}
else {
printHtmlPart(38)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'j371', 'error'))
printHtmlPart(39)
invokeTag('message','g',367,['default':("371J")],-1)
printHtmlPart(40)
expressionOut.print(filledPostInstance?.j371)
printHtmlPart(41)
}
printHtmlPart(42)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'pwd', 'error'))
printHtmlPart(43)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'doeAssistantProfessorKVAFSU1', 'error'))
printHtmlPart(44)
invokeTag('message','g',400,['code':("filledPost.doeAssistantProfessorKVAFSU.label"),'default':("DOE into Assistant Prof")],-1)
printHtmlPart(45)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doeAssistantProfessorKVAFSU))
printHtmlPart(46)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'doeProfessorCAS1', 'error'))
printHtmlPart(47)
invokeTag('message','g',412,['code':("filledPost.doeProfessorCAS.label"),'default':("DOE into Associate Prof")],-1)
printHtmlPart(48)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doeProfessorCAS))
printHtmlPart(49)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'professor', 'error'))
printHtmlPart(50)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'doePresentCadre1', 'error'))
printHtmlPart(51)
invokeTag('message','g',440,['code':("filledPost.doePresentCadre.label"),'default':("DOE into Prof Cadre")],-1)
printHtmlPart(52)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doePresentCadre))
printHtmlPart(53)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'present', 'error'))
printHtmlPart(54)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonDOEintoCrafts1', 'error'))
printHtmlPart(55)
invokeTag('message','g',471,['code':("filledPost.nonDOEintoCrafts1.label"),'default':("DOE into Present Cadre*")],-1)
printHtmlPart(56)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoCrafts))
printHtmlPart(57)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonDOEintoPresentPayscale1', 'error'))
printHtmlPart(58)
invokeTag('message','g',483,['code':("filledPost.nonDOEintoPresentPayscale1.label"),'default':("DOE into Present Payscale*")],-1)
printHtmlPart(59)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoPresentPayscale))
printHtmlPart(60)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonProfessor', 'error'))
printHtmlPart(61)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonDOEintoOnetimeupgradation1', 'error'))
printHtmlPart(62)
invokeTag('message','g',509,['code':("filledPost.nonDOEintoOnetimeupgradation1.label"),'default':("DOE into One time upgradation")],-1)
printHtmlPart(63)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoOnetimeupgradation))
printHtmlPart(53)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonPresent', 'error'))
printHtmlPart(64)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'nonDOEforPromotion1', 'error'))
printHtmlPart(65)
invokeTag('message','g',534,['code':("filledPost.nonDOEforPromotion1.label"),'default':("DOE For  Next Promotion*")],-1)
printHtmlPart(66)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEforPromotion))
printHtmlPart(67)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'dateofRetirement1', 'error'))
printHtmlPart(68)
invokeTag('message','g',553,['code':("filledPost.dateofRetirement.label"),'default':("Date of Retirement")],-1)
printHtmlPart(69)
expressionOut.print(formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.dateofRetirement))
printHtmlPart(70)
expressionOut.print(hasErrors(bean: filledPostInstance, field: 'remarks', 'error'))
printHtmlPart(71)
invokeTag('message','g',566,['code':("filledPost.remarks.label"),'default':("Remarks")],-1)
printHtmlPart(72)
expressionOut.print(filledPostInstance?.remarks)
printHtmlPart(73)
invokeTag('hiddenField','g',597,['name':("reportId"),'value':(inwardformInstance?.id)],-1)
printHtmlPart(74)
invokeTag('actionSubmit','g',600,['class':("btn yellow"),'id':("add_field_button"),'value':("Add More")],-1)
printHtmlPart(75)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1741866941951L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
