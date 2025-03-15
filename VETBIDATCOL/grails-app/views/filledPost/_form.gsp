


<div class="form-body">
	<h3 class="form-section">Details of College</h3>
	<g:if test="${params?.action != "edit"}">
	<div class="row">
	
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'collagId', 'error')} ">
				<label for="collageName"> <g:message
						code="postFilled.collageName.label" default="College Name*" />

				</label> <select id="collagId" name="collagId" class="form-control"
					onchange="${remoteFunction(
			          controller: 'filledPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value")}" required>

					<option value="${filledPostInstance?.collagId?.id}"
						selected="selected">-- Select College -->
						${filledPostInstance?.collagId?.username}

					</option>
					<g:each in="${users}" var="usrdtl">
						<option value="${usrdtl?.id}">
							${usrdtl?.username}

						</option>
					</g:each>
				</select>

			</div>
		</div>

	</div>
	
	<div class="row">
		<div id="Returntype2" hidden="true">
			<g:render template="userDetails" />
		</div>
	</div>
</g:if>
<g:else>
<div class="row">
	
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'collagId', 'error')} ">
				<label for="collageName"> <g:message
						code="postFilled.collageName.label" default="College Name*" />

				</label> <select name="collagId" class="form-control" readonly
					onchange="${remoteFunction(
			          controller: 'filledPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value")}" required>

					<option value="${filledPostInstance?.collagId?.id}"
						selected="selected">
						${filledPostInstance?.collagId?.username}

					</option>
					
				</select>

			</div>
		</div>

	</div>
	
	<div class="row">
		<div id="Returntype2" hidden="true">
			<g:render template="userDetails" />
		</div>
	</div>
</g:else>
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'cadreType', 'error')} ">
				<label for="cadre">Choose Cadre*</label> <select id="countySel"
					name="cadreType" class="form-control" required>
					<option value="" selected="selected">Select Cadre</option>
					<option value="A">A</option>
					<option value="B">B</option>
					<option value="C">C</option>
					<option value="D">D</option>
				</select>
			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'staffType', 'error')} ">
				<label for="staffType">Choose Staffs*</label> <select id="statesell"
					name="staffType" class="form-control" required>
					<option value="" >Select Staff Type</option>
					<option value="Teaching">Teaching</option>
					<option value="Non Teaching">Non-Teaching</option>
				</select>
			</div>
		</div>
		<div class="col-md-3 tech11" style="display: none;">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'positionType', 'error')} ">
				<label for="positionType">Post and Name*</label> <select id="citySel"
					name="positionType" class="form-control">
					<option value="">-- Select Position
						Type --</option>
					<option value="" selected="selected" disabled>---------
						Cadre A ---------</option>
						
						<option value="Dean">Dean</option>
					<option value="Professor 1">Professor 1</option>
					<option value="Associate  Professor 1">Associate Professor
						1</option>
					<option value="Associate  Professor 2">Associate Professor
						2</option>
					<option value="Associate  Professor 3">Associate Professor
						3</option>
					<option value="Associate  Professor 4">Associate Professor
						4</option>

					<option value=""  disabled>-------
						Cadre B -----</option>
					<option value="Assistant  Professor 1">Assistant Professor
						1</option>
					<option value="Assistant  Professor 2">Assistant Professor
						2</option>
					<option value="Assistant  Professor 3">Assistant Professor
						3</option>
					<option value="Assistant  Professor 4">Assistant Professor
						4</option>
					<option value="Assistant  Professor 5">Assistant Professor
						5</option>
					<option value="Assistant  Professor 6">Assistant Professor
						6</option>
						<option value="Instructor">Instructor
						7</option>
				</select>
			</div>
		</div>


		<div class="col-md-3 nont11" style="display: none;">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'positionType', 'error')} ">
				<label for="positionType">Post and Name*</label> <select id="type" 
					name="positionType" class="form-control">
					<option value="" selected="selected" >-- Select Position
						Type --</option>
					<option value=""  disabled>---------
						Cadre A ---------</option>
					<option value="Professor 1">Professor 1</option>
					<option value="Medical Officer">Medical Officer</option>
					<option value="Asst Comptroller">Asst Comptroller</option>
					<option value="Asst Admin Officer">Asst Admin Officer</option>
					<option value="Asst Registrar">Asst Registrar</option>
					<option value="Asst Librarian">Asst Librarian</option>
					<option value="others">Others</option>

					<option value="" disabled>-------
						Cadre B -----</option>
					<option value="Farm Supervisor(Asc)">Farm Supervisor(Asc)</option>
					<option value="Personal Secretary">Personal Secretary</option>
					<option value="Library Assistant">Library Assistant</option>
					<option value="AE(Civil)">AE(Civil)</option>
					<option value="Computer Programmer">Computer Programmer</option>
					<option value="others">Others</option>

					<option value="" disabled>-------
						Cadre C -----</option>
					<option value="Stenographer">Stenographer</option>
					<option value="Jr Engineer(Civil)">Jr Engineer(Civil)</option>
					<option value="Jr Engineer(Elec) ">Jr Engineer(Elec)</option>
					<option value="Artist-Cum-Photographer">Artist-Cum-Photographer</option>
					<option value="AV Technician ">AV Technician</option>
					<option value="OT Technician">OT Technician</option>
					<option value="Assistant">Assistant</option>
					<option value="Lab Asst">Lab Asst</option>
					<option value="Field Asst">Field Asst</option>
					<option value="Lab Technician">Lab Technician</option>
					<option value="Receptionist">Receptionist</option>
					<option value="Pharmacist/Compounder">Pharmacist/Compounder</option>
					<option value="Caretaker">Caretaker</option>
					<option value="Curator-Cum-Museum Techn">Curator-Cum-Museum
						Techn</option>
					<option value="Imaging Technician">Imaging Technician</option>
					<option value="Registration Asst">Registration Asst</option>
					<option value="I/C Medical Stores">I/C Medical Stores</option>
					<option value="Driver-Cum-Operator">Driver-Cum-Operator</option>
					<option value="Data and Console Operator">Data and Console
						Operator</option>
					<option value="Driver HV">Driver HV</option>
					<option value="Tractor driver">Tractor driver</option>
					<option value="OT Asst">OT Asst</option>
					<option value="others">Others</option>

					<option value="" disabled>---------
						Cadre D ---------</option>
					<option value="Skill Asst/Butcher">Skill Asst/Butcher</option>
					<option value="Elec Wireman">Elec Wireman</option>
					<option value="Plumber">Plumber</option>
					<option value="Driver LV">Driver LV</option>
					<option value="Art room Attendant">Art room Attendant</option>
					<option value="Animal Attendant">Animal Attendant</option>
					<option value="Cook">Cook</option>
					<option value="Ast Cook cum caretaker">Ast Cook cum
						caretaker</option>
					<option value="Record keeper cum Data oper">Record keeper
						cum Data oper</option>
					<option value="Pump Attender">Pump Attender</option>
					<option value="Messenger">Messenger</option>
					<option value="Watchman">Watchman</option>
					<option value="Sweeper cum Attendant">Sweeper cum
						Attendant</option>
					<option value="others">Others</option>
				</select>
			</div>
		</div>
		
		
		<div class="col-md-3" id="row_dim11">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nameofpost', 'error')} ">
				<label for="nameofpost"> <g:message
						code="filledPost.nameofpost.label"
						default="Enter Name Of Post" />
				</label>
				<input type="text" name="nameofpost" class="form-control" >
			</div>
		</div>
		

	</div>
	
	


	<h3 class="form-section">Details of an Employee</h3>
	<div class="row">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'employeeName', 'error')} ">
				<label for="employeeName"> <g:message
						code="filledPost.employeeName.label"
						default=" Employee Name*" />

				</label>
				<g:textField name="employeeName" class="form-control"  required=""
					value="${filledPostInstance?.employeeName}" />

			</div>
		</div>
		<g:if test="${params?.action != "edit"}">
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'employeeNumber', 'error')} ">
				<label for="employeeNumber"> <g:message
						code="filledPost.employeeNumber.label" default="Employee Number*" />

				</label>
				
			
				<g:textField name="employeeNumber" class="form-control"  required=""
					value="${filledPostInstance?.employeeNumber}" />

			</div>
		</div>
		</g:if>
		<g:else>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'employeeNumber', 'error')} ">
				
					<label for="employeeNumber"> </label>
					<g:message code="filledPost.employeeNumber.label" default="Employee Number*" />
				<input name="employeeNumber" class="form-control" readonly   required=""
						value="${filledPostInstance?.employeeNumber}" />

			</div>
		</div>
		</g:else>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'empPayScale', 'error')} ">
				<label for="empPayScale"> <g:message
						code="filledPost.empPayScale.label" default="Employee PayScale" />

				</label>
				
				<select name="empPayScale" class="form-control"  value="${filledPostInstance?.empPayScale}" >
					<option value="" selected="selected">Select Employee Pay Scale</option>
					<option value="15600-39100">15600-39100</option>
					<option value="17000-28950">17000-28950</option>
					<option value="18600-32600">18600-32600</option>
					<option value="19950-37900">19950-37900</option>
					<option value="21400-42000">21400-42000</option>
					<option value="23500-47650">23500-47650</option>
					<option value="25800-51400">25800-51400</option>
					<option value="27650-52650">27650-52650</option>
					<option value="30350-58250">30350-58250</option>
					<option value="36000-67550">36000-67550</option>
					<option value="37900-70850">37900-70850</option>
					<option value="40900-78200">40900-78200</option>
					<option value="43100-83100">43100-83100</option>
					<option value="52650-97100">52650-97100</option>
					<option value="67550-104600">67550-104600</option>
					<option value="144200-218200(UGC)">144200-218200(UGC)</option>
					<option value="131400-217100(UGC)">131400-217100(UGC)</option>
					<option value="79800-211500(UGC)">79800-211500(UGC)</option>
					<option value="68900-205500(UGC)">68900-205500(UGC)</option>
					<option value="57700-182400(UGC)">57700-182400(UGC)</option>
					<option value="6150-102100(OPG)">6150-102100(OPG)</option>
					<option value="57700-182400(OPG)">57700-182400(OPG)</option>
				</select>
				
				
				

			</div>
		</div>
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'socialcategory', 'error')} ">
				<label for="socialcategory"> Social Category*</label> <select  required
					id="socialcategory" name="socialcategory" class="form-control">
					<option value=""   selected="selected">Select Social
						category</option>
					<option value="GM">GM</option>
					<option value="SC">SC</option>
					<option value="ST">ST</option>
					<option value="Cat-1">Cat-1</option>
					<option value="2A">2A</option>
					<option value="2B">2B</option>
					<option value="3A">3A</option>
					<option value="3B">3B</option>
				</select>

			</div>
		</div>
	</div>
	<div class="row">
			<g:if test="${params?.action != "edit"}">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'j371', 'error')} ">
					<label for="j371"> 371J*</label> <select id="j371" name="j371" required
						class="form-control">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
					</select>

				</div>

			</div>
		</g:if>
		<g:else>
			<div class="col-md-3">

				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'j371', 'error')} ">
					<label for="j371"> select 371J* </label>
					<g:message default="371J" />


					<input name="j371" class="form-control" readonly required
						value="${filledPostInstance?.j371}" />

				</div>
			</div>

		</g:else>
		
		
		<div class="col-md-3">
			<div
				class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'pwd', 'error')} ">
				<label for="pwd">Select PWD*</label> <select id="pwd" name="pwd" required
					class="form-control">
					<option value="Yes">YES</option>
					<option value="No">No</option>
				</select>

			</div>
		</div>




		<div class="teaching boxss">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'doeAssistantProfessorKVAFSU1', 'error')} ">
					<label for="doeAssistantProfessorKVAFSU"> <g:message
							code="filledPost.doeAssistantProfessorKVAFSU.label"
							default="DOE into Assistant Prof" />

					</label> <input type="text" name="doeAssistantProfessorKVAFSU1"  
						class="form-control date-picker"
						value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doeAssistantProfessorKVAFSU)}" >
				</div>
			</div>
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'doeProfessorCAS1', 'error')} ">
					<label for="doeProfessorCAS"> <g:message
							code="filledPost.doeProfessorCAS.label"
							default="DOE into Associate Prof" />

					</label> <input type="text" name="doeProfessorCAS1"  
						class="form-control date-picker"
						value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doeProfessorCAS)}"
						>
				</div>
			</div>



			
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'professor', 'error')} ">
						<label for="professor"> Mode Of Entry </label> <select id="professor"  
							name="professor" class="form-control">
							<option value="CAS">CAS</option>
							<option value="Direct">Direct</option>
						</select>
					</div>

				</div>
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'doePresentCadre1', 'error')} ">
						<label for="doePresentCadre"> <g:message
								code="filledPost.doePresentCadre.label"
								default="DOE into Prof Cadre" />

						</label> <input type="text" name="doePresentCadre1"  
							class="form-control date-picker"
							value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.doePresentCadre)}"
							>


					</div>
				</div>
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'present', 'error')} ">
						<label for="present">Mode Of Entry </label> <select id="present"  
							name="present" class="form-control">
							<option value="CAS">CAS</option>
							<option value="Direct">Direct</option>
						</select>
					</div>
				</div>
				
				
				
		</div>

		<div class="nonteaching boxss">
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonDOEintoCrafts1', 'error')} ">
					<label for="nonDOEintoCrafts1"> <g:message
							code="filledPost.nonDOEintoCrafts1.label"
							default="DOE into Present Cadre*" />

					</label> <input type="text" name="nonDOEintoCrafts1"  
						class="form-control date-picker"
						value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoCrafts)}">
				</div>
			</div>
			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonDOEintoPresentPayscale1', 'error')} ">
					<label for="nonDOEintoPresentPayscale1"> <g:message
							code="filledPost.nonDOEintoPresentPayscale1.label"
							default="DOE into Present Payscale*" />

					</label> <input type="text" name="nonDOEintoPresentPayscale1"  
						class="form-control date-picker"
						value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoPresentPayscale)}"
						>
				</div>
			</div>


				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonProfessor', 'error')} ">
						<label for="nonProfessor">Mode Of Entry* </label> <select id="nonProfessor"  required
							name="nonProfessor" class="form-control">
							<option value="Promotion">Promotion</option>
							<option value="Direct">Direct</option>
						</select>
					</div>

				</div>
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonDOEintoOnetimeupgradation1', 'error')} ">
						<label for="nonDOEintoOnetimeupgradation1"> <g:message
								code="filledPost.nonDOEintoOnetimeupgradation1.label"
								default="DOE into One time upgradation" />

						</label> <input type="text" name="nonDOEintoOnetimeupgradation1"
							class="form-control date-picker"
							value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEintoOnetimeupgradation)}"
							>


					</div>
				</div>
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonPresent', 'error')} ">
						<label for="nonPresent">Mode Of Entry* </label> <select id="nonPresent"  required
							name="nonPresent" class="form-control">
							<option value="Promotion">Promotion</option>
							<option value="Direct">Direct</option>
						</select>
					</div>
				</div>
				<div class="col-md-3">
					<div
						class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'nonDOEforPromotion1', 'error')} ">
						<label for="nonDOEforPromotion1"> <g:message
								code="filledPost.nonDOEforPromotion1.label"
								default="DOE For  Next Promotion*" />

						</label> <input type="text" name="nonDOEforPromotion1"  
							class="form-control date-picker"
							value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.nonDOEforPromotion)}"
							>


					</div>
				</div>
				
			
		</div>


			<div class="col-md-3">
    <div
        class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'dateofRetirement1', 'error')} ">
        <label for="dateofRetirement"> 
            <g:message code="filledPost.dateofRetirement.label" default="Date of Retirement" />
        </label> 
        <input type="text" name="dateofRetirement1"  
            class="form-control date-picker"
            value="${formatDate(format:'dd/MM/yyyy',date:filledPostInstance?.dateofRetirement)}">
    </div>
</div>
			

			<div class="col-md-3">
				<div
					class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'remarks', 'error')} ">
					<label for="remarks"> <g:message
							code="filledPost.remarks.label" default="Remarks" />

					</label>
					<textarea name="remarks" class="form-control" rows="3"
						value="${filledPostInstance?.remarks}"></textarea>

				</div>
			</div>
			</div>
		</div>
		<div class="form-body">
		<div class="row">
		<div class="col-md-3">
					<div class="form-group">
						<div class="input_fields_wrap">
							<label>Choose Documents </label><br>
							 
							 <input type="file" id="document_1"
							  
								 name="document_1" value="" placeholder="Input Value"accept=".pdf,.doc,.docs,.xlsx,.xls"
								class="form-control" /> <input type="hidden" value="1" id="ty"
								name="ty" class="ty"> 
								
						</div>
					</div>
				</div>
				<div class="col-md-4" >
				
					<label>For Adding More Documents Click Here</label><br>
					
					<g:hiddenField name="reportId"
											value="${inwardformInstance?.id}" />
											
					<g:actionSubmit  class="btn yellow"
						id="add_field_button" value="Add More"></g:actionSubmit>
				</div>
		</div>

</div>



	<style>
.boxss {
	display: none;
}
</style>