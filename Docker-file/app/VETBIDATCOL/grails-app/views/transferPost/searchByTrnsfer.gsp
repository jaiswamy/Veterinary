<!DOCTYPE html>



<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | RETIRED</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta
	content="Preview page of Metronic Admin Theme #5 for bootstrap inputs, input groups, custom checkboxes and radio controls and more"
	name="description" />
<meta content="" name="author" />
<!-- BEGIN LAYOUT FIRST STYLES -->
<link href="//fonts.googleapis.com/css?family=Oswald:400,300,700"
	rel="stylesheet" type="text/css" />
<!-- END LAYOUT FIRST STYLES -->
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
<!-- END GLOBAL MANDATORY STYLES -->
<link href="assets1/global/plugins/datatables/datatables.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="assets1/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.css"
	rel="stylesheet" type="text/css" />
<!-- BEGIN THEME GLOBAL STYLES -->
<link href="assets1/global/css/components-rounded.min.css"
	rel="stylesheet" id="style_components" type="text/css" />
<link href="assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />
<!-- END THEME GLOBAL STYLES -->
<!-- BEGIN THEME LAYOUT STYLES -->
<link href="assets1/layouts/layout5/css/layout.min.css" rel="stylesheet"
	type="text/css" />
<link href="assets1/layouts/layout5/css/custom.min.css" rel="stylesheet"
	type="text/css" />
<link
	href="assets1/global/plugins/bootstrap-datepicker/css/bootstrap-datepicker6.min.css"
	type="text/css" rel="stylesheet">
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout5/img/kvcbidra.pngs" />



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

<body class="page-header-fixed page-sidebar-closed-hide-logo">
	<!-- BEGIN CONTAINER -->
	<div class="wrapper">
		<!-- BEGIN HEADER -->
		<header class="page-header">
			<nav class="navbar mega-menu" role="navigation">
				<div class="container-fluid">
					<div class="clearfix navbar-fixed-top">
						<!-- Brand and toggle get grouped for better mobile display -->
						<g:render template="/header/logo"></g:render>
						<!-- END LOGO -->
						<!-- BEGIN SEARCH 
                            <form class="search" action="extra_search.html" method="GET">
                                <input type="name" class="form-control" name="query" placeholder="Search...">
                                <a href="javascript:;" class="btn submit md-skip">
                                    <i class="fa fa-search"></i>
                                </a>
                            </form>
                             END SEARCH -->
						<!-- BEGIN TOPBAR ACTIONS -->
						<div class="topbar-actions">
							<!-- BEGIN GROUP NOTIFICATION -->

							<!-- END GROUP NOTIFICATION -->
							<!-- BEGIN GROUP INFORMATION -->

							<!-- END GROUP INFORMATION -->
							<!-- BEGIN USER PROFILE -->
							<g:render template="/header/topBar"></g:render>
							<!-- END USER PROFILE -->
							<!-- BEGIN QUICK SIDEBAR TOGGLER -->

							<!-- END QUICK SIDEBAR TOGGLER -->
						</div>
						<!-- END TOPBAR ACTIONS -->
					</div>
					<!-- BEGIN HEADER MENU -->
					<div
						class="nav-collapse collapse navbar-collapse navbar-responsive-collapse">


						<g:render template="/header/leftSide"
							model="[activ:[adminssion:'start active open']]"></g:render>

					</div>
					<!-- END HEADER MENU -->
				</div>
				<!--/container-->
			</nav>
		</header>
		<!-- END HEADER -->
		<div class="container-fluid">
			<div class="page-content">
				<!-- BEGIN BREADCRUMBS -->

				<!-- END BREADCRUMBS -->
				<!-- BEGIN SIDEBAR CONTENT LAYOUT -->
				<div class="page-content-container">
					<div class="page-content-row">
						<!-- BEGIN PAGE SIDEBAR -->
						<!-- <div class="page-sidebar">
                                 <nav class="navbar" role="navigation">
                                    <ul class="nav navbar-nav margin-bottom-35">
                                        <li class="active">
                                            <a href="index.html">
                                                <i class="icon-home"></i> Home </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-note "></i> Reports </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-user"></i> User Activity </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-basket "></i> Marketplace </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-bell"></i> Templates </a>
                                        </li>
                                    </ul>
                                    <h3>Quick Actions</h3>
                                    <ul class="nav navbar-nav">
                                        <li>
                                            <a href="#">
                                                <i class="icon-envelope "></i> Inbox
                                                <label class="label label-danger">New</label>
                                            </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-paper-clip "></i> Task </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-star"></i> Projects </a>
                                        </li>
                                        <li>
                                            <a href="#">
                                                <i class="icon-pin"></i> Events
                                                <span class="badge badge-success">2</span>
                                            </a>
                                        </li>
                                    </ul>
                                </nav>-->
					</div>
					<!-- END PAGE SIDEBAR -->
					<div class="page-content-col" id="printPageButton">
						<!-- BEGIN PAGE BASE CONTENT -->
						<div class="row">
							<div class="col-md-12">
								<div class="page-head" id="printPageButton">
									<div class="page-title">
										<h3 style="font-size: 25px; color: #2803f3">
											<b> Transfer Post's</b>
										</h3>
										<hr style="color: #2803f3; border-top: 2px solid #c49f47;">
									</div>
								</div>
								<g:formRemote name="ss1" update="update2"
									url="[action:'searchByDeptess']">
									<div class="form-body">
										<h3 class="form-section">Details of College</h3>
										<div class="row">
											<div class="col-md-3">
												<div
													class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'collagId', 'error')} ">
													<label for="collageName"> <g:message
															code="postFilled.collageName.label"
															default="College Name" />

													</label> <select id="collagId" name="collagId" class="form-control"
														onchange="${remoteFunction(
			          controller: 'transferPost', 
			          action: 'getusrDtl',
					  update:'Returntype2',
			          params: "\'value=\' + this.value")}">

														<option value="${filledPostInstance?.collagId?.id}"
															selected="selected">-- Select Collage -->
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

											<div id="Returntype2" hidden="true">
												<g:render template="userDetails" />
											</div>


											<div class="col-md-3">
												<div
													class="fieldcontain ${hasErrors(bean: filledPostInstance, field: 'staffType', 'error')} ">
													<label for="staffType"> Staff Type:</label> <select
														id="staffType" name="staffType" class="form-control" required>
														<option value="" selected="selected">Select Staff
															Type</option>
														<option value="Teaching">Teaching</option>
														<option value="Non Teaching">Non Teaching</option>
													</select>
												</div>
											</div>

											<div class="col-md-3">
												<g:submitButton name="Search" class="btn yellow"
													style="margin-top: 25px" />
											</div>

										</div>
									</div>
									<div class="form-actions right"></div>
							</div>

</g:formRemote>

						</div>
					</div>
					
					<div id="update2"></div>
				</div>


			</div>

		</div>


	</div>



	<g:render template="/header/footer" id="printPageButton"></g:render>
	<a href="#index" class="go2top"> <i class="icon-arrow-up"></i>
	</a>
	<!-- END FOOTER -->

	<!-- END CONTAINER -->
	<!-- BEGIN QUICK SIDEBAR -->

	<!-- END QUICK SIDEBAR -->
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
	<script src="assets1/global/scripts/datatable.js"
		type="text/javascript"></script>
	<script src="assets1/global/plugins/datatables/datatables.min.js"
		type="text/javascript"></script>
	<script
		src="assets1/global/plugins/datatables/plugins/bootstrap/datatables.bootstrap.js"
		type="text/javascript"></script>
	<!-- BEGIN THEME GLOBAL SCRIPTS -->
	<script src="assets1/global/scripts/app.min.js" type="text/javascript"></script>
	<!-- END THEME GLOBAL SCRIPTS -->
	<script src="assets1/pages/scripts/table-datatables-rowreorder.min.js"
		type="text/javascript"></script>
	<!-- BEGIN THEME LAYOUT SCRIPTS -->
	<script src="assets1/layouts/layout5/scripts/layout.min.js"
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
	<script>
		$(document).ready(function() {
			$('#clickmewow').click(function() {
				$('#radio1003').attr('checked', 'checked');
			});
		})
	</script>
	<script>
		$(document).ready(function() {
			var input = $('#collagId').val();
			if (input) {
				$("#Returntype3").show();
				return false;
			}
		});
		$('select[name=collagId]').change(function(e) {
			if ($('select[name=collagId]').val()) {
				$('#Returntype3').show();
			} else {
				$('#Returntype3').hide();
			}
		});
	</script>
	<script>
		$(document).ready(function() {
			var input = $('#collagId').val();
			if (input) {
				$("#Returntype2").show();
				return false;
			}
		});
		$('select[name=collagId]').change(function(e) {
			if ($('select[name=collagId]').val()) {
				$('#Returntype2').show();
			} else {
				$('#Returntype2').hide();
			}
		});
	</script>
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
</body>

</html>