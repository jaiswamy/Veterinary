<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>InwordOutword</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="Preview page of Metronic Admin Theme #2 for form layouts"
	name="description" />
<meta content="" name="author" />
<!-- BEGIN GLOBAL MANDATORY STYLES -->
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/bootstrap-switch/css/bootstrap-switch.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/bootstrap-modal/css/bootstrap-modal-bs3patch.css"
	rel="stylesheet" type="text/css" />	
<!-- END GLOBAL MANDATORY STYLES -->
<!-- BEGIN PAGE LEVEL PLUGINS -->
<link href="assets1/global/plugins/datatables/datatables.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css"
	rel="stylesheet" type="text/css" />
<!-- END PAGE LEVEL PLUGINS -->
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="assets1/global/css/components-rounded.min.css"
	rel="stylesheet" id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout2/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout2/css/themes/blue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout2/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout5/img/kvcbidra.png" />
</head>
</head>
<!-- END HEAD -->

<body
	class="page-header-fixed page-sidebar-closed-hide-logo page-container-bg-solid">
	<!-- BEGIN HEADER -->
	<div class="page-header navbar navbar-fixed-top">
		<!-- BEGIN HEADER INNER -->
		<div class="page-header-inner ">
			<!-- BEGIN LOGO -->
			<g:render template="/header/logo"></g:render>
			<!-- END LOGO -->
			<!-- BEGIN RESPONSIVE MENU TOGGLER -->
			<a href="javascript:;" class="menu-toggler responsive-toggler"
				data-toggle="collapse" data-target=".navbar-collapse"> </a>
			<!-- END RESPONSIVE MENU TOGGLER -->
			<!-- BEGIN PAGE ACTIONS -->
			<!-- DOC: Remove "hide" class to enable the page header actions -->
			<div class="page-actions"></div>
			<!-- END PAGE ACTIONS -->
			<!-- BEGIN PAGE TOP -->
			<div class="page-top">
				<!-- BEGIN HEADER SEARCH BOX -->

				<!-- END HEADER SEARCH BOX -->
				<!-- BEGIN TOP NAVIGATION MENU -->
				<g:render template="/header/topBar"></g:render>
				<!-- END TOP NAVIGATION MENU -->
			</div>
			<!-- END PAGE TOP -->
		</div>
		<!-- END HEADER INNER -->
	</div>
	<!-- END HEADER -->
	<!-- BEGIN HEADER & CONTENT DIVIDER -->
	<div class="clearfix"></div>
	<!-- END HEADER & CONTENT DIVIDER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<!-- END SIDEBAR -->
			<div class="page-sidebar navbar-collapse collapse">
				<!-- BEGIN SIDEBAR MENU -->
				<g:render template="/header/leftSide"
					model="[activ:[adminssion:'start active open']]"></g:render>
				<!-- END SIDEBAR MENU -->
			</div>
			<!-- END SIDEBAR -->
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN CONTENT -->
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">
				<!-- BEGIN PAGE HEADER-->
				<!-- BEGIN THEME PANEL -->

				<!-- END THEME PANEL -->

				<div class="page-bar">
					<ul class="page-breadcrumb">
						<li><i class="icon-home"></i> <a href="index.html">Home</a> <i
							class="fa fa-angle-right"></i></li>
						<li><span>Prophylaxis Study  Table </span></li>
					</ul>

				</div>
				<!-- END PAGE HEADER-->


				<div class="row">

					<div class="col-md-12">
						<!-- BEGIN EXAMPLE TABLE PORTLET-->
						<div class="portlet light ">
							<div class="portlet-title">
								<div class="caption font-red">
									<i class="icon-settings font-red"></i> <span
										class="caption-subject bold uppercase">Prophylaxis Study List Table</span>
								</div>
								<div class="tools"></div>
							</div>
							<div class="portlet-body table-both-scroll">
								<table
									class="table table-striped table-checkable table-bordered table-hover"
									id="sample_1">
									<thead>
										<tr>
											<th>Date</th>
											<th>Animal No</th>
											<th>Timepoint</th>
											<th>Day</th>
											<th>Rectal Temp. (F)</th>
											<th>Physical Examination</th>
											<th>Cervical Diameter (cm)</th>
											<th>Right Horn diameter (cm)</th>
											<th>Left Horn Diameter (cm)</th>
											<th>BHBA</th>
											<th>White side test</th>
											<th>Bacteriology</th>
											<th>TLC</th>
											<th>LE</th>
											<th>PMN count</th>
											<th>Haptoglobin</th>
											<th>SOD &nbsp;(µmol MTT/mg protein)</th>
											<th>CAT (µmol H2O2 decomposed/min/mg protein)</th>
											<th>TBARS (nmol/ml)</th>
											<th>GSH (nmol/ml)</th>
											<th>Treatment administration (As a Single Dose)</th>
											<th>Cattle Image</th>
											<th>Option</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>13-7-2021</td>
											<td>1CEM</td>
											<td>0hrs</td>
											<td>day0</td>
											<td>100.2F</td>
											<td>normal</td>
											<td>4.79</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>56</td>
											<td>300</td>
											<td>positive</td>
											<td>18</td>
											<td>null</td>
											<td>0.39</td>
											<td>124.23</td>
											<td>10.7</td>
											<td>196</td>
											<td>G7</td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"> <i
													class="fa fa-edit"></i> Edit
											</a> <a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails1" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
										</tr>
										
										<tr>
											<td>13-7-2021</td>
											<td>1CEM</td>
											<td>0hrs</td>
											<td>day0</td>
											<td>100.2F</td>
											<td>normal</td>
											<td>4.79</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>56</td>
											<td>300</td>
											<td>positive</td>
											<td>18</td>
											<td>null</td>
											<td>0.39</td>
											<td>124.23</td>
											<td>10.7</td>
											<td>196</td>
											<td>G7</td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"> <i
													class="fa fa-edit"></i> Edit
											</a> <a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails1" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
										</tr>
										
										
										<tr>
											<td>13-7-2021</td>
											<td>1CEM</td>
											<td>0hrs</td>
											<td>day0</td>
											<td>100.2F</td>
											<td>normal</td>
											<td>4.79</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>NA</td>
											<td>56</td>
											<td>300</td>
											<td>positive</td>
											<td>18</td>
											<td>null</td>
											<td>0.39</td>
											<td>124.23</td>
											<td>10.7</td>
											<td>196</td>
											<td>G7</td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
											<td><a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"> <i
													class="fa fa-edit"></i> Edit
											</a> <a href="javascript:;"
												class="btn btn-outline btn-circle btn-sm purple"
												data-target="#feeDetails1" data-toggle="modal"> <i
													class="fa fa-share"></i> View
											</a></td>
										</tr>
										

									</tbody>
								</table>
							</div>
						</div>
					</div>
					
					<div id="feeDetails" class="modal fade" tabindex="-1">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true"></button>
							<h4 class="modal-title">Cattle Image</h4>
						</div>
						<div class="modal-body">
							<img src="assets1/pages/img/650.png"
								style="width: 460px; height: 250px;"><br>
							<br> <img src="assets1/pages/img/650.png"
								style="width: 460px; height: 250px;">
						</div>
						<div class="modal-footer">
							<button type="button" data-dismiss="modal"
								class="btn btn-outline dark">Close</button>
						</div>
					</div>



					<div id="feeDetails1" class="modal fade" tabindex="-1">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-hidden="true"></button>
							<h4 class="modal-title">Show Details</h4>
						</div>
						<div class="modal-body">
							<table id="sum_table" border="1"
								class="table table-striped table-bordered table-hover">
								<tr>
									<td><a>Fee Details</a></td>
									<td><a>Amount</a></td>
									<td><a>Paid Amount</a></td>
									<td><a>Due</a></td>
								</tr>
								<tr>
									<td><a>Fee Details</a></td>
									<td><a>Amount</a></td>
									<td><a>Paid Amount</a></td>
									<td><a>Due</a></td>
								</tr>
							</table>
						</div>
						<div class="modal-footer">
							<button type="button" data-dismiss="modal"
								class="btn btn-outline dark">Close</button>
						</div>
					</div>
					
				</div>



			</div>
		</div>
	</div>

	<!-- END CONTENT BODY -->

	<!-- END CONTENT -->
	<!-- BEGIN QUICK SIDEBAR -->


	<!-- END QUICK SIDEBAR -->

	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="page-footer">
		<g:render template="/header/footer"></g:render>
	</div>
	<!-- END FOOTER -->
	<!-- BEGIN QUICK NAV -->

	<div class="quick-nav-overlay"></div>
	<!-- END QUICK NAV -->
	<!--[if lt IE 9]>
<script src="assets1/global/plugins/respond.min.js"></script>
<script src="assets1/global/plugins/excanvas.min.js"></script> 
<script src="assets1/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->
	<!-- BEGIN CORE PLUGINS -->
	<script src="assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/js.cookie.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/jquery-slimscroll/jquery.slimscroll.min.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/jquery.blockui.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/bootstrap-switch/js/bootstrap-switch.min.js"
		type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="assets1/global/scripts/datatable.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/datatables/datatables.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="assets1/pages/scripts/table-datatables-rowreorder.min.js"
		type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS -->
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="assets1/layouts/layout2/scripts/layout.min.js"
		type="text/javascript"></script>
	<script src="assets1/layouts/layout2/scripts/demo.min.js"
		type="text/javascript"></script>
	<script src="assets1/layouts/global/scripts/quick-sidebar.min.js"
		type="text/javascript"></script>
	<script src="assets1/layouts/global/scripts/quick-nav.min.js"
		type="text/javascript"></script>
	<!-- END THEME LAYOUT SCRIPTS -->

	<script>
		$(document).ready(function() {
			$('#clickmewow').click(function() {
				$('#radio1003').attr('checked', 'checked');
			});
		})
	</script>
</body>

</html>