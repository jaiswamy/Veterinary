<%@ page import="com.hiideals.cadre.Department"%>






<div class="form-body">
	<div class="row">
	
		<div class="col-md-3">

			<div class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'clgId', 'error')} required">
				<label for="collageName"> <g:message
						code="department.clgId.label" default="College Name" />

				</label> <select id="clgId" name="clgId" class="form-control" required 
    onchange="${remoteFunction(controller: 'department', action: 'getusrDtl1',
    update:'Returntype3', params: '\'value=\' + this.value')}">
    <option value="" selected="selected">-- Select College --</option>
    <g:each in="${user}" var="usrdtl">
        <option value="${usrdtl?.id}">${usrdtl?.username}</option>
    </g:each>
</select>

<g:if test="${hasErrors(bean: departmentInstance, field: 'clgId', 'error')}">
            <div class="error-message">Please select a college</div>
        </g:if>
			</div>
		</div>
		<div id="Returntype3" hidden="true">
			<g:render template="userDetails" />
		</div>


		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'deptName', 'error')} ">
				
			<g:if test="${params?.action != "edit"}">
				<label for="deptName"> <g:message
						code="department.deptName.label" default=" Department Name* " />  
						</label> 
						</g:if>
						<g:else>
						
						<label for="deptName"> <g:message
						code="department.deptName.label" default=" Old Department Name " />  
					- <b>${departmentInstance?.deptName}</b></label> 
						</g:else>
						
				<select id="deptName" name="deptName" class="form-control" required>
					<option value="" selected="selected">Select Department</option>
					<option value="Officer">Officer</option>
					<option value="Veterinary Anatomy">Veterinary Anatomy</option>
					<option value="Veterinary Physiology & Biochemistry">Veterinary
						Physiology & Biochemistry</option>
					<option value="Livestock Production Management">Livestock
						Production Management</option>
					<option value="Veterinary Microbiology">Veterinary
						Microbiology</option>
					<option value="veterinary Pathology">veterinary Pathology</option>
					<option value="Animal Genetics & Breeding">Animal Genetics
						& Breeding</option>
					<option value="Animal Nutrition">Animal Nutrition</option>
					<option value="Veterinary Pharmacology & Toxicology">Veterinary
						Pharmacology & Toxicology</option>
					<option value="Veterinary Public Health & Epidemiology">Veterinary
						Public Health & Epidemiology</option>
					<option value="Veterinary Parasitology">Veterinary
						Parasitology</option>
					<option value="Livestock Product Technology">Livestock
						Product Technology</option>
					<option value="Veterinary & Animal Husbandry Ext">Veterinary
						& Animal Husbandry Ext</option>
					<option value="Veterinary Surgery & Radiology">Veterinary
						Surgery & Radiology</option>
					<option value="Veterinary medicine">Veterinary medicine</option>
					<option value="Veterinary Gynaecology & Obstetrecs">Veterinary
						Gynaecology & Obstetrecs</option>
					<option value="Veterinary Clinical Complex">Veterinary
						Clinical Complex</option>
					<option value="Livestock Farm Complex">Livestock Farm
						Complex</option>
					<option value="Physical Education">Physical Education</option>
					<option value="Fisheries Science">Fisheries Science</option>
					
<option value="Agronomy">Agronomy</option>
<option value="AIRCRP on Poultry">AIRCRP on Poultry</option>
<option value="Dairy Technology">Dairy Technology</option>
<option value="Dairy Chemistry">Dairy Chemistry</option>
<option value="Dairy Engineering">Dairy Engineering</option>
<option value="Dairy Microbiology">Dairy Microbiology</option>
<option value="Dairy Economics and Business Management">Dairy Economics and Business Management</option>
<option value="Statistics and Computer Science">Statistics and Computer Science</option>
<option value="Dairy Extension">Dairy Extension</option>
<option value="Aquaculture">Aquaculture</option>
<option value="Aquatic Animal Health Management">Aquatic Animal Health Management(Fisheries Microbiology)</option>
<option value="Aquatic Environment Management">Aquatic Environment Management</option>
<option value="Fisheries Resources and Management">Fisheries Resources and Management</option>
<option value="Fisheries Economics Statistics and Extension">Fisheries Economics Statistics and Extension</option>
<option value="Fish Processing Technology">Fish Processing Technology</option>
<option value="Fisheries Engineering and Technology">Fisheries Engineering and Technology</option>
<option value="Fisheries Biochemistry">Fisheries Biochemistry</option>
<option value="Basic Science(English)">Basic Science(English)</option>
<option value="Basic Science(Physics)">Basic Science(Physics)</option>
<option value="Basic Science(Chemistry)">Basic Science(Chemistry)</option>
<option value="Basic Science(Zoology)">Basic Science(Zoology)</option>
					<option value="Other">Other</option>
				</select>



			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'teaching', 'error')} required">
				<label for="teaching"> <g:message
						code="department.teaching.label" default="Teaching*" /> <span
					class="required-indicator"></span>
				</label>
				<g:field name="teaching" type="number" class="form-control"
					value="${departmentInstance.teaching}" required=""/>

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'nonTeaching', 'error')} required">
				<label for="nonTeaching"> <g:message
						code="department.nonTeaching.label" default="Non-Teaching*" /> <span
					class="required-indicator"></span>
				</label>
				<g:field name="nonTeaching" type="number" class="form-control"
					value="${departmentInstance.nonTeaching}" required="" />

			</div>
		</div>
	</div>


	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'stateTeaching', 'error')} required">
				<label for="stateTeaching"> <g:message
						code="department.stateTeaching.label" default="State Teaching*" />
					<span class="required-indicator"></span>
				</label>
				<g:field name="stateTeaching" type="number" class="form-control"
					value="${departmentInstance.stateTeaching}" required="" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'stateNonTeaching', 'error')} required">
				<label for="stateNonTeaching"> <g:message
						code="department.stateNonTeaching.label"
						default="State Non-Teaching*" /> <span class="required-indicator"></span>
				</label>
				<g:field name="stateNonTeaching" type="number" class="form-control"
					value="${departmentInstance.stateNonTeaching}" required="" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'kkTeaching', 'error')} required">
				<label for="kkTeaching"> <g:message
						code="department.kkTeaching.label" default="KK Teaching*" /> <span
					class="required-indicator"></span>
				</label>
				<g:field name="kkTeaching" type="number" class="form-control"
					value="${departmentInstance.kkTeaching}" required="" />

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: departmentInstance, field: 'kkNonTeaching', 'error')} required">
				<label for="kkNonTeaching"> <g:message
						code="department.kkNonTeaching.label" default="KK Non-Teaching*" />
					<span class="required-indicator"></span>
				</label>
				<g:field name="kkNonTeaching" type="number" class="form-control"
					value="${departmentInstance.kkNonTeaching}" required="" />

			</div>
		</div>
	</div>
</div>
<script>
$(document).ready(function() {
    $('form').submit(function(e) {
        let isValid = true;

        // College validation
        if ($('#clgId').val() === '') {
            $('#clgId').addClass('is-invalid');
            $('#clgId').after('<div class="text-danger error-message">Please select a valid college.</div>');
            isValid = false;
        }

        // Department validation
        if ($('#deptName').val() === '') {
            $('#deptName').addClass('is-invalid');
            $('#deptName').after('<div class="text-danger error-message">Please select a department.</div>');
            isValid = false;
        }

        if (!isValid) {
            e.preventDefault();
        }
    });

    // Clear validation messages when selecting an option
    $('#clgId, #deptName').change(function() {
        $(this).removeClass('is-invalid');
        $(this).siblings('.error-message').remove();
    });
});
</script>

