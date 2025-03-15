<div class="col-md-3">
	<div class="form-group">
		<label class="control-label">College Name</label> <input type="text"
			value="${usrdtl?.username}" id="firstName" class="form-control"
			readonly>
	</div>
</div>
<!--/span-->
<div class="col-md-3">
	<div class="form-group">
		<label class="control-label"> Information</label> <input type="text"
			value="${usrdtl?.address?.city}" id="lastName" class="form-control"
			readonly>
	</div>
</div>

<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Sanction Teaching</label> <input
			type="text" value="${usrdtl?.teaching1}" id="lastName"
			class="form-control" readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Sanction Non Teaching</label> <input
			type="text" value="${usrdtl?.nonteaching1}" id="lastName"
			class="form-control" readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Filled Teaching</label> <input
			type="text" value="${usrdtl?.teaching2}" id="lastName"
			class="form-control" readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Filled Non Teaching</label> <input
			type="text" value="${usrdtl?.nonteaching2}" id="lastName"
			class="form-control" readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Vacant Teaching</label> <input
			type="text" value="${usrdtl?.teaching3}" id="lastName"
			class="form-control" readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Vacant Non Teaching</label> <input
			type="text" value="${usrdtl?.nonteaching3}" id="lastName"
			class="form-control" readonly>
	</div>
</div>


<!--/span-->




<div class="form-body">
<h3 class="form-section">Details of Department</h3>
<g:if test="${params?.action != "edit"}">
<div class="row">
<div class="col-md-3">
<div
	class="fieldcontain ${hasErrors(bean:filledPostInstance, field:'deptId','error')} ">
	<label for="deptId"> <g:message
			code="postFilled.department.label" default="Department Name"  />

	</label> <select id="deptId" name="deptId"
		class="form-control"
		onchange="${remoteFunction(
          controller: 'filledPost', 
          action: 'getusrDtls',
           update:'Returntype5',
          params: "\'value=\' + this.value")}" required>

		<option value="${filledPostInstance?.deptId?.id}" selected="selected">--Select Department -->
		${filledPostInstance?.deptId?.deptName}
		</option>
		<g:each in="${usrdtl?.deptIds}" var="usrdt">
			<option value="${usrdt?.id}">
				${usrdt?.deptName}
			</option>
		</g:each>
	</select>

</div>
</div>
</div>
<div class="row">
<div id="Returntype5" hidden="true">
	<g:render template="userDetailsss" />
</div>
</div>
</g:if>
<g:else>
<div class="row">
<div class="col-md-3">
<div
	class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'deptId', 'error')} ">
	<label for="deptId"> <g:message
			code="postFilled.department.label" default="Department  Name" />

	</label> <select name="deptId" readonly
		class="form-control"
		onchange="${remoteFunction(
          controller: 'filledPost', 
          action: 'getusrDtls',
           update:'Returntype5',
          params: "\'value=\' + this.value")}" required >

		<option value="${filledPostInstance?.deptId?.id}" selected="selected">
			${filledPostInstance?.deptId?.deptName}
		</option>
		
	</select>

</div>
</div>
</div>
<div class="row">
<div id="Returntype5" hidden="true">
<g:render template="userDetailsss"/>
</div>
</div>
</g:else>
</div>

<script>
		$(document).ready(function() {
			var input = $('#deptId').val();
			if (input) {
				$("#Returntype5").show();
				return false;
			}
		});
		$('select[name=deptId]').change(function(e) {
			if ($('select[name=deptId]').val()) {
				$('#Returntype5').show();
			} else {
				$('#Returntype5').hide();
			}
		});
	</script>



