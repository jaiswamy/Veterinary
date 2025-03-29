



<div class="fieldcontain ${hasErrors(bean: positionInstance, field: 'positionName', 'error')} ">
	<label for="positionName">
		<g:message code="position.positionName.label" default="Position Name" />
		
	</label>
	<g:textField name="positionName" value="${positionInstance?.positionName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: positionInstance, field: 'departmentName', 'error')} ">
	<label for="departmentName">
		<g:message code="position.departmentName.label" default="Department Name" />
		
	</label>
	<g:textField name="departmentName" value="${positionInstance?.departmentName}"/>

</div>

