
<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printlogoButton {
		display: inline;
	}
}

@media ( min-width : 992px) {
	.page-content {
		margin-left: 0px !important;
	}
}
</style>


<div class="row">
	<div class="col-md-12">
		<!-- BEGIN SAMPLE FORM PORTLET-->
		<div class="portlet light bordered">

			<div class="portlet-body form">
				<div class="crtfcte">
					<div class="text-center">
						<div class="">
							<ul class="list-unstyled">
								<li><img src="assets1/global/img/kvafsu-logo.png"
									alt="logo"
									style="text-align: center; width: 80px; height: 80px;" /></li>
								<li>
									<h3>Karnataka Veterinary, Animal and Fisheries Sciences
										University, Bidar</h3> <small>Details of Teaching and
										Non-Teaching Sanctioned, Filled and Vacant Posts</small>
								</li>
							</ul>
						</div>
					</div>

					<hr>

					<div class="row">
						<div class="certificate">
							<div style="position: absolute; left: 50px; top: 280px;">
								<br>
							</div>
							<div class="col-md-12">
								<h4 style="text-align: center;">
									<h3>
										College Details / <b> ${usedetails?.collagId?.username.last()}
										</b>
									</h3>
								</h4>
								<div class="portlet-body">
									<div>
										<table border="1" class="table table-bordered"
											style="text-align: center;">
											<thead>
												<tr>
													<th colspan="2" style="text-align: center;">Sanction</th>
													<th colspan="2" style="text-align: center;">Filled</th>
													<th colspan="2" style="text-align: center;">Vacant</th>
													<th colspan="3" style="text-align: center;">Total</th>
												</tr>
												<tr>
													<th style="text-align: center;">Teaching</th>
													<th style="text-align: center;">Non-teaching</th>
													<th style="text-align: center;">Teaching</th>
													<th style="text-align: center;">Non-teaching</th>
													<th style="text-align: center;">Teaching</th>
													<th style="text-align: center;">Non-teaching</th>
													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Filled</th>
													<th style="text-align: center;">Vacant</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>
														${usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.teaching3.last()}
													</td>
													<td>
														${usedetails?.collagId?.nonteaching2.last() + usedetails?.collagId?.nonteaching3.last()}
													</td>
													<td>
														${usedetails?.collagId?.teaching2.last()}
													</td>
													<td>
														${usedetails?.collagId?.nonteaching2.last()}
													</td>
													<td>
														${usedetails?.collagId?.teaching3.last()}
													</td>
													<td>
														${usedetails?.collagId?.nonteaching3.last()}
													</td>
													<td>
														${usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.teaching3.last() + usedetails?.collagId?.nonteaching2.last() + usedetails?.collagId?.nonteaching3.last()}
													</td>
													<td>
														${usedetails?.collagId?.teaching2.last() + usedetails?.collagId?.nonteaching2.last()}
													</td>
													<td>
														${usedetails?.collagId?.teaching3.last() + usedetails?.collagId?.nonteaching3.last()}
													</td>

												
											</tbody>
										</table>

									</div>
								</div>
							</div>
							
						<div class="col-md-12">
								<h4 style="text-align: center;">
									<h3>
									<b> Employee Details </b>
									</h3>
								</h4>
								<div class="portlet-body">
									<div>
										<table border="1" class="table table-bordered"
											style="text-align: center;">
											<thead>
												<tr>
													<th style="text-align: center;">Sl.No</th>
													<th style="text-align: center;">Employee Name</th>
													<th style="text-align: center;">Employee Number</th>
													<th style="text-align: center;">Cadre</th>
													<th style="text-align: center;">Staff Type</th>
													<th style="text-align: center;">Employee Position</th>
													<th style="text-align: center;">371J</th>
												</tr>

											</thead>
											<tbody>
												<g:each in="${usedetails}" var="emp" status="i">
													<tr>

														<td>${i+1}</td>
														<td>
															${emp?.employeeName}
														</td>
														<td>
															${emp?.employeeNumber }
														</td>
														<td>
															${emp?.cadreType}
														</td>
														<td>
															${emp?.staffType }
														</td>
														<td>
															${emp?.positionType}
														</td>
														<td>
															${emp?.j371}
														</td>
													</tr>
												</g:each>
												
											</tbody>
										</table>

									</div>
								</div>
							</div>



						</div>	
							
<g:if test="${params?.department != null }">

							<div class="col-md-12">
								<h4 style="text-align: center;">
									<h3>
										Department <b> ${usedetails?.deptId?.deptName.last()}
										</b>
									</h3>
								</h4>
								<div class="portlet-body">
									<div>
										<table border="1" class="table table-bordered"
											style="text-align: center;">
											<thead>
												<tr>
													<th colspan="3" style="text-align: center;"><b>Distribution of Posts</b></th>
												</tr>
												<tr>

													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Teaching</th>
													<th style="text-align: center;">Non-Teaching</th>
												</tr>
											</thead>
											<tbody>
												<g:each in="${projectList?.deptIds?.last()}" status="i"
													var="usr">
													<tr>
														<td>
															${usr.teaching + usr.nonTeaching}
														</td>
														<td>
															${usr.teaching}
														</td>
														<td>
															${usr.nonTeaching}
														</td>

													</tr>
												</g:each>
												
											</tbody>
										</table>

									</div>
								</div>
							</div>


</g:if>
							<div class="col-md-12">
								<h4 style="text-align: center;">
									<h3>
										Department Post / <b> Vacant Details </b>
									</h3>
								</h4>
								<div class="portlet-body">
									<div>
										<table border="1" class="table table-bordered"
											style="text-align: center;">
											<thead>
												<tr>
													<th style="text-align: center;">Teaching</th>
													<th style="text-align: center;">Non-Teaching</th>
													<th colspan="3" style="text-align: center;">State
														Teaching</th>
													<th colspan="3" style="text-align: center;">State Non
														-Teaching</th>
													<th colspan="3" style="text-align: center;">KK
														Teaching</th>
													<th colspan="3" style="text-align: center;">KK Non
														-Teaching</th>
												</tr>
												<tr>
													<td></td>
													<td></td>
													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Filled</th>
													<th style="text-align: center;">Vacant</th>
													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Filled</th>
													<th style="text-align: center;">Vacant</th>
													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Filled</th>
													<th style="text-align: center;">Vacant</th>
													<th style="text-align: center;">Sanction</th>
													<th style="text-align: center;">Filled</th>
													<th style="text-align: center;">Vacant</th>
												</tr>
											</thead>
											<tbody>
											<g:each in="${projectList?.deptIds.last()}" var="depts">
												<tr>
													
														<td>
															${depts?.teaching}
														</td>
														<td>
															${depts?.nonTeaching}
														</td>
														<td>
															${depts?.stateTeaching}
														</td>
														<td>
															${depts?.stateTeachFilled}
														</td>
														<td>
															${depts?.stateTeachVacant}
														</td>
														<td>
															${depts?.stateNonTeaching}
														</td>
														<td>
															${depts?.stateNonTeachFilled}
														</td>
														<td>
															${depts?.stateNonTeachVacant}
														</td>
														<td>
															${depts?.kkTeaching}
														</td>
														<td>
															${depts?.kkTeachFilled}
														</td>
														<td>
															${depts?.kkTeachVacant}
														</td>
														<td>
															${depts?.kkNonTeaching}
														</td>
														<td>
															${depts?.kkNonTeachFilled}
														</td>
														<td>
															${depts?.kkNonTeachVacant}
														</td>
												

												</tr>
													</g:each>
											</tbody>
										</table>

									</div>
								</div>
							</div>




							

						<br> <br> <br> <br>

					</div>
				</div>
			</div>
		</div>

		<div class="col-md-12 text-center" id="printPageButton">
			<button class="btn blue" id="printPageButton"
				onClick="window.print();">
				<i class="fa fa-print"></i> Print
			</button>
		</div>


	</div>
</div>
