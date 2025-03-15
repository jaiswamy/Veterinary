<%--
		<div class="col-md-3">
	<div class="form-group">
		<label class="control-label">Collage Name</label> <input type="text"
		
			value="${userdet1?.username}" id="firstName" class="form-control"
			readonly>
	</div>
</div>
--%><!--/span-->



<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Sanction Teaching</label> <input type="text"
			value="${userdet1?.teaching1}" id="lastName" class="form-control"
			readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Sanction Non-Teaching</label> <input type="text"
			value="${userdet1?.nonteaching1}" id="lastName" class="form-control"
			readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Filled Teaching</label> <input type="text"
			value="${userdet1?.teaching2}" id="lastName" class="form-control"
			readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Filled Non-Teaching</label> <input type="text"
			value="${userdet1?.nonteaching2}" id="lastName" class="form-control"
			readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Vacant Teaching</label> <input type="text"
			value="${userdet1?.teaching3}" id="lastName" class="form-control"
			readonly>
	</div>
</div>
<div class="col-md-3">
	<div class="form-group ">
		<label class="control-label">Vacant Non-Teaching</label> <input type="text"
			value="${userdet1?.nonteaching3}" id="lastName" class="form-control"
			readonly>
	</div>
</div>


<!--/span-->

	<div class="col-md-3">
		<div class="form-group">
			<label class="control-label"> Information</label> <input
				type="text" value="${userdet1?.address?.city}" id="lastName"
				class="form-control" readonly>
		</div>
	</div>
<div id="Returntype5" hidden="true">
				<g:render template="userDetailsss"/>
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
	