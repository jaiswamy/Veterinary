<!DOCTYPE html>
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | DASHBOARD</title>
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
<!-- END THEME LAYOUT STYLES -->
<link rel="shortcut icon" href="assets1/layouts/layout5/img/kvcbidra.png" />
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
					<div class="page-content-col">
						<!-- BEGIN PAGE BASE CONTENT -->
						<div class="row">
							<div class="col-md-12">
								<!-- BEGIN SAMPLE FORM PORTLET-->

								<!-- END SAMPLE FORM PORTLET-->
								<!-- BEGIN SAMPLE FORM PORTLET-->

								<!-- END SAMPLE FORM PORTLET-->
								<!-- BEGIN SAMPLE FORM PORTLET-->

								<!-- END SAMPLE FORM PORTLET-->
								<!-- BEGIN SAMPLE FORM PORTLET-->

								<!-- END SAMPLE FORM PORTLET-->
								<div class="portlet box blue ">
									<div class="portlet-title">
										<div class="caption">
											<i class="fa fa-gift"></i> Create College
										</div>

									</div>
									<div class="portlet-body form">
										<!-- BEGIN FORM-->


										<g:if test="${flash.message}">
											<div class="alert alert-success" id="mydiv">
												<div class="text-center" style="color: #000;" role="status">
													<span class="badge badge-pill badge-success">Success</span>
													<b>
														${flash.message}
													</b>

												</div>
											</div>
										</g:if>
										<sec:ifAnyGranted roles='ROLE_SUPERADMIN'>
											<g:formRemote name="kk" url="[action:'createadmin']"
												update="update1" class="horizontal-form">
											&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
											
											<button class="btn btn-primary" style="margin-top: 20px">
													<i class="fa fa-plus"></i> &nbsp;&nbsp;Create Admin
												</button>
											</g:formRemote>

											<div class="m-content">
												<div id="update1"></div>
											</div>
											<hr>

											<div class="row">
												<div class="col-md-12">
													<!-- BEGIN EXAMPLE TABLE PORTLET-->
													<div class="portlet light ">
														<div class="portlet-title">
															<div class="caption font-red">
																<i class="icon-settings font-red"></i> <span
																	class="caption-subject bold uppercase">Create
																	List</span>
															</div>
															<div class="tools"></div>
														</div>
														<div class="portlet-body">
															<table
																class="table table-striped table-checkable table-bordered table-hover"
																id="sample_1">
																<thead>
																	<tr>
																		<th>S.No</th>
																		<th>Username</th>
																		<th>Password</th>
																		<th>Phone&nbsp;No</th>
																		<th>Address</th>
																		<th>Image</th>
																		<th>Action</th>
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

																			<td>
																				${fieldValue(bean: usersInstance, field: "password")}
																			</td>

																			<td>
																				${fieldValue(bean: usersInstance, field: "phoneNo")}
																			</td>

																			<td>
																				${usersInstance?.address?.hsno}, ${usersInstance?.address?.street}
																				${usersInstance?.address?.city} - ${usersInstance?.address?.pinCode},
																				${usersInstance?.address?.state}, ${usersInstance?.address?.country}
																			</td>


																			<td><img
																				src="${createLink(controller:'superadmin', action:'viewimg', id:usersInstance?.id)}"
																				alt="Image" class="img-responsive"
																				style="width: 50px; height: 50px;"></td>



																			<td><g:formRemote name="kk"
																					url="[action:'adminEdit']" update="update1">
																					<g:hiddenField name="userListid"
																						value="${usersInstance?.id}" />
																					<br>
																					<div>
																						<g:submitButton name="Edit"
																							class="btn btn-primary" />
																					</div>
																				</g:formRemote></td>
																		</tr>
																	</g:each>

																</tbody>
															</table>
														</div>
													</div>
												</div>
											</div>
										</sec:ifAnyGranted>

										<!-- END FORM-->
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- END PAGE BASE CONTENT -->
				</div>
			</div>
		</div>
		<!-- END SIDEBAR CONTENT LAYOUT -->
	</div>
	<!-- BEGIN FOOTER -->

	
	<g:render template="/header/footer"></g:render>
	<a href="#index" class="go2top"> <i class="icon-arrow-up"></i>
	</a>
	<!-- END FOOTER -->
	</div>
	</div>
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