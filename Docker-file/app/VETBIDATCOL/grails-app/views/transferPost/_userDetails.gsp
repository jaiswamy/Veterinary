




<div class="col-md-3">
<div
	class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'deptId', 'error')} ">
	<label for="deptId"> <g:message
			code="postFilled.department.label" default="Department Name" />

	</label> <select id="deptId" name="deptId" required
		class="form-control"
		onchange="${remoteFunction(
          controller: 'transferPost', 
          action: 'getusrDtls',
  update:'Returntype5',
          params: "\'value=\' + this.value")}">

		<option value="${filledPostInstance?.deptId?.id}" selected="selected">--
			Select Department -->
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



