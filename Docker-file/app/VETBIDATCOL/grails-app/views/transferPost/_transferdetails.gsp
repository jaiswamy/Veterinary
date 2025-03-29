
							<div class="col-md-12">
								<h4 style="text-align: center;">
									<h3>
										Department / <b> Employee Details </b>
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
													<th style="text-align: center;">Transfer</th>
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
														<td>
														<g:form method="PUT" class="horizontal-form">
														
                                                  <g:hiddenField name="version" value="${emp?.id}" />
												<g:actionSubmit  class="btn yellow" action="transferEmployee" value="${message(code: 'default.button.transferupdate.label', default: 'Transfer')}" />
												</g:form>
														
												</td>
													</tr>
													
												</g:each>
												
											</tbody>
										</table>

									</div>
								</div>
							</div>




						<br> <br> <br> <br>

	

		<div class="col-md-12 text-center" id="printPageButton">
			<button class="btn blue" id="printPageButton"
				onClick="window.print();">
				<i class="fa fa-print"></i> Print
			</button>
		</div>


	