
<%@ page import="com.hiideals.cadre.Department"%>

<!DOCTYPE html>

<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | DEPARTMENT</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta content="Animate Research" name="description" />
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
<link
	href="assets1/global/plugins/bootstrap-modal/css/bootstrap-modal-bs3patch.css"
	rel="stylesheet" type="text/css" />

<link href="assets1/layouts/layout/css/themes/darkblue.min.css"
	rel="stylesheet" type="text/css" id="style_color" />
<link href="assets1/layouts/layout/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout/img/favicon.png" />



<link href="assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />


<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout5/img/kvcbidra.png" />
</head>
<style type="text/css">
@media print {
	#printPageButton {
		display: none;
	}
	#printlogoButton {
		display: inline;
	}
	body {
		margin: 0 !important;
		color: #fff !important;
		background-color: #fff !important;
	}
	.table td, .table th {
		background-color: #fff0 !important;
		border: 1px solid #0f0f0f !important;
	}
}

@media ( min-width : 992px) {
	.page-content {
		margin-left: 0px !important;
	}
}
</style>
<!-- END HEAD -->

<body>
	<!-- BEGIN HEADER -->



	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="invoice-title">


					<h3 class="pull-center" style="text-align: center;">
						<img src="assets1/global/img/kvafsu-logo.png" alt="logo"
							style="text-align: center; width: 80px; height: 80px;" />Karnataka
						Veterinary, Animal and Fisheries Sciences University, Bidar
					</h3>
					<h4 class="pull-center" style="text-align: center;">Details of
						Teaching and Non-Teaching Sanctioned, Filled and Vacant Posts.</h4>



				</div>
				<hr>
				<%--<div class="row">
					<div class="col-xs-6">
						<div>
							<b>Animal No : </b> dasds
						</div>
						<div>
							<b>Tag Number : </b> sdsd
						</div>
						<div>
							<b>Owner Name : </b> sdsds
						</div>
						<div>
							<b>Owner Details : </b> sdsd
						</div>
						<div>
							<b>Animal Information : </b> sdsd
						</div>
						<div>
							<b>Village : </b> sdsd


						</div>
						<div>
							<b>Date of Calving : </b> sdsd
						</div>
						<div>
							<b>Date of Drug Administration : </b> sdsd
						</div>

					</div>
					<div class="col-xs-6 text-right">



						<br> <br>
					</div>
				</div>

			--%>
			</div>
		</div>

		<div class="row">
			<div class="col-md-8">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">
							<strong style="text-align: center;">Department
								Information</strong>
						</h3>
					</div>
					<div class="panel-body">
						<div class="table-responsive">
							<table class="table table-condensed">

								<tbody>
									<tr>
										<td class="left strong"><b>College Name</b></td>
										<td class="left">
											${departmentInstance?.clgId}
										</td>
									</tr>
									<tr>
										<td class="left"><b>Department Name</b></td>
										<td>
											${departmentInstance?.deptName}
										</td>
									</tr>
									<tr>
										<td class="left"><b>Teaching</b></td>
										<td class="left">
											${departmentInstance?.teaching}
										</td>
									</tr>
									<tr>
										<td class="left"><b>Non-Teaching</b></td>
										<td class="left">
											${departmentInstance?.nonTeaching}
										</td>
									</tr>
									<tr>
										<td class="left"><b>State Teaching</b></td>
										<td class="left">
											${departmentInstance?.stateTeaching}
										</td>
									</tr>
									<tr>
										<td class="left"><b>State Non-Teaching</b></td>
										<td class="left">
											${departmentInstance?.stateNonTeaching}
										</td>
									</tr>
									<tr>
										<td class="left"><b>KK Teaching</b></td>
										<td class="left">
											${departmentInstance?.kkTeaching}
										</td>
									</tr>
									<tr>
										<td class="left"><b>KK Non-Teaching</b></td>
										<td class="left">
											${departmentInstance?.kkNonTeaching}
										</td>
									</tr>
								</tbody>
							</table>





							<div class="modal-footer">
								<input type="button" id="printbutton" value="&nbsp;PRINT"
									onclick="return printing();" class="btn yellow" />


								<%--<g:link class="btn yellow" action="edit"
									resource="${departmentInstance}">
									<g:message code="default.button.edit.label" default="Edit" />
								</g:link>
								
							--%></div>


							<script>
								var dt = new Date();
								document.getElementById("datetime").innerHTML = dt
										.toLocaleString();
							</script>
							<script type="text/javaScript">
								function printing() {
									document.getElementById("printbutton").style.display = "none";
									window.print();
									window.close();
								}
							</script>


						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

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
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="assets1/pages/scripts/form-samples.min.js"
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
	<script
		src="assets1/global/plugins/bootstrap-datepicker/js/jquery.ui.datepicker1.js"></script>
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
