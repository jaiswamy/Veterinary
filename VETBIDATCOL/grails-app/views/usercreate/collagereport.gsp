
<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | Collage Create</title>
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
		margin-left: 0px !important;	}

}
</style>
<style>
table, th, td {
  border: 1px solid black;
  text-align: center !important;
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
														Sciences University, Bidar</h3> <small>Details of
														Teaching and Non-Teaching Sanctioned, Filled and Vacant
														Posts</small>
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
													<b>List of College Reports</b>
												</h4>
												<div class="portlet-body">
													<div>


														



														<table border="1" class="table table-bordered">
															<thead>
																<tr>
																	<th>Sl.No</th>
																	<th>College Name</th>
																	<th>Address</th>
																	<th>Phone&nbsp;No</th>
																	<th colspan="2">Sanction Posts</th>
																	<th colspan="2">Filled Posts</th>
																	<th colspan="2">Vacant Posts</th>
																</tr>
																<tr>
																	<th></th>
																	<th></th>
																	<th></th>
																	<th></th>
																	<th>Teaching</th>
																	<th>Non-teaching</th>
																	<th>Teaching</th>
																	<th>Non-teaching</th>
																	<th>Teaching</th>
																	<th>Non-teaching</th>
																</tr>
															</thead>
															<tbody>
																<g:each in="${usersInstanceList?.reverse()}" status="i"
																	var="usersInstance">
																	<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

																		<td>
																			${i+1}
																		</td>
																		<td>
																			${fieldValue(bean: usersInstance, field: "username")}
																		</td>



																		<td style="vertical-align:middle">
																			${usersInstance?.address?.hsno}, ${usersInstance?.address?.street}
																			${usersInstance?.address?.city} - ${usersInstance?.address?.pinCode},${usersInstance?.address?.state},
																			${usersInstance?.address?.country}
																		</td>
																		<td style="vertical-align:middle">
																			${fieldValue(bean: usersInstance, field: "phoneNo")} &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "teaching1")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "nonteaching1")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "teaching2")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "nonteaching2")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "teaching3")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: usersInstance, field: "nonteaching3")}
																		</td>
																		



																	</tr>

																</g:each>

																<%--<tr style="color: #337ab7">
																	<td colspan="2" align="center"><strong>Grand
																			Total</strong></td>
																	<td><strong>
																			${Totalsum}
																	</strong></td>
																	<td><strong> ${Paidsum}</strong></td>
																	<td><strong>
																			${duesum}
																	</strong></td>



																	<td></td>
																</tr>


															--%>
															</tbody>
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
										--%>
										<br> <br> <br> <br>
										
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12 text-center" id="printPageButton">
							
							<button class="btn blue" id="printPageButton"
								onClick="window.print();" >
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