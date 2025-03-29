
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | FILLED POST</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link
	href="assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/uniform/css/uniform.default.css"
	rel="stylesheet" type="text/css" />
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link
	href="assets1/global/plugins/bootstrap-fileinput/bootstrap-fileinput.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/pages/css/profile-2.min.css" rel="stylesheet"
	type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout/css/custom.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout5/img/kvcbidra.png" />
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


</head>
<!-- END HEAD -->

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
	<!-- BEGIN HEADER -->
	
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<div class="page-container">

		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">


				<br>
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
													style="text-align: center; width: 80px; height: 80px;" />
												</li>
												<li>
													<h3>Karnataka Veterinary, Animal and Fisheries
														Sciences University, Bidar</h3>
													<small>Details of Teaching and Non-Teaching
														Sanctioned, Filled and Vacant Posts.</small>
												</li>
											</ul>
										</div>
									</div>

									<hr>

									<div class="row" style="width:10% !importent;">
										<div class="certificate">
											<div style="position: absolute; left: 50px; top: 280px;">
												<br>
											</div>
											<div class="col-md-12">
												<h4 style="text-align: center;">
													<b>List of Filledpost Non-Teaching Transfer Reports</b>
												</h4>
												<div class="portlet-body" >
													<div >
														<table border="1" class="table table-bordered" >
															<thead style="font-size: 18px !important;">
																<tr >
																	<th  style="font-size: 11px !important;"><b>Sl.no</b></th>
																	<th  style="font-size: 11px !important;"><b>College Name</b></th>
																	<th  style="font-size: 11px !important;"><b>Cadre</b></th>
																	<th  style="font-size: 11px !important;"><b>Staff Type</b></th>
																	<th  style="font-size: 11px !important;"><b>Position Type</b></th>
																	<th  style="font-size: 11px !important;"><b>Department Name</b></th>
																	<th  style="font-size: 11px !important;"><b>Name Of The Employee</b></th>
																	<th  style="font-size: 11px !important;"><b>Employee Number</b></th>
																	<th  style="font-size: 11px !important;"><b>Employee Pay Scale</b></th>
																	<th  style="font-size: 11px !important;"><b>Social category</b></th>
																	<th  style="font-size: 11px !important;"><b>371J</b></th>
																	<th  style="font-size: 11px !important;"><b>PWD</b></th>
																	<th  style="font-size: 11px !important;"><b>DOE into Crafts</b></th>
																	<th  style="font-size: 11px !important;"><b>DOE into Present Payscale</b></th>
																	<th  style="font-size: 11px !important;"><b>Professor</b></th>
																	<th  style="font-size: 11px !important;"><b>DOE into One time upgradation</b></th>
																	<th  style="font-size: 11px !important;"><b>Present</b></th>
																	<th  style="font-size: 11px !important;"><b>Date of Retirement</b></th>
																	<th  style="font-size: 11px !important;"><b>Remarks</b></th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${filledPostInstanceResultss}"
																	status="i" var="filledPostInstance">
																	<tr>
																		<td style="font-size: 11px !important;">
																			${i+1}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance?.collagId, field: "username")}
																		</td>

																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "cadreType")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "staffType")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "positionType")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance?.deptId, field: "deptName")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "employeeName")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "employeeNumber")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "empPayScale")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "socialcategory")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "j371")}
																		</td>
																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "pwd")}
																		</td>

                                                                               <td style="font-size: 11px !important;"><g:formatDate
																				date="${filledPostInstance.nonDOEintoCrafts}"
																				format="dd-MM-yyyy" /></td>
																				
																				<td style="font-size: 11px !important;"><g:formatDate
																				date="${filledPostInstance.nonDOEintoPresentPayscale}"
																				format="dd-MM-yyyy" /></td>
																				
																				<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "nonProfessor")}
																		</td>
																				
																				<td style="font-size: 11px !important;"><g:formatDate
																				date="${filledPostInstance.nonDOEintoOnetimeupgradation}"
																				format="dd-MM-yyyy" /></td>
							
							<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "nonPresent")}
																		</td>

																		<td style="font-size: 11px !important;"><g:formatDate
																				date="${filledPostInstance.dateofRetirement}"
																				format="dd-MM-yyyy" /></td>

																		<td style="font-size: 11px !important;">
																			${fieldValue(bean: filledPostInstance, field: "remarks")}
																		</td>

																		
																	</tr>
																</g:each>

																<%--<tr style="color: #337ab7">
																	<td colspan="2" align="center"><strong>Grand
																			Total</strong></td>
																	<td style="font-size: 11px !important;"><strong>
																			${Totalsum}
																	</strong></td>
																	<td style="font-size: 11px !important;"><strong> ${Paidsum}</strong></td>
																	<td style="font-size: 11px !important;"><strong>
																			${duesum}
																	</strong></td>



																	<td style="font-size: 11px !important;"></td>
																</tr>


															--%></tbody>
														</table>

													</div>
												</div>
											</div>
										</div>
										<%--<div class="row">
											<div class="col-md-12">
												<p class="pull-right">
													<b>Thanks And Regards,<br>
													</b>
												</p>
											</div>
										</div>
										--%><br> <br> <br> <br>
										
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
			</div>
		</div>


	
		<!-- END FOOTER -->
		<!--[if lt IE 9]>
<script src="assets1/global/plugins/respond.min.js"></script>
<script src="assets1/global/plugins/excanvas.min.js"></script> 
<![endif]-->
		<!-- BEGIN CORE PLUGINS -->
		<script src="assets1/global/plugins/jquery.min.js"
			type="text/javascript"></script>
		<script src="assets1/global/plugins/bootstrap/js/bootstrap.min.js"
			type="text/javascript"></script>
		<script src="assets1/global/plugins/js.cookie.min.js"
			type="text/javascript"></script>
		<script
			src="assets1/global/plugins/bootstrap-hover-dropdown/bootstrap-hover-dropdown.min.js"
			type="text/javascript"></script>
		<script
			src="assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
			type="text/javascript"></script>
		<script src="assets1/global/plugins/jquery.blockui.min.js"
			type="text/javascript"></script>
		<script src="assets1/global/plugins/uniform/jquery.uniform.min.js"
			type="text/javascript"></script>
		<script
			src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
			type="text/javascript"></script>
		<!-- END CORE PLUGINS -->
		<!-- BEGIN PAGE LEVEL PLUGINS -->


		<!-- END PAGE LEVEL PLUGINS -->
		<!-- BEGIN THEME GLOBAL SCRIPTS -->
		<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
		<!-- END PAGE LEVEL SCRIPTS -->
		<!-- BEGIN THEME LAYOUT SCRIPTS -->
		<script src="assets1/layouts/layout/scripts/layout.min.js"
			type="text/javascript"></script>
		<!-- END THEME LAYOUT SCRIPTS -->
</body>

</html>