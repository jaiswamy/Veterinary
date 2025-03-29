<!DOCTYPE html>
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->

<head>
<meta charset="utf-8" />
<title>URMS | FILLED POST</title>
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
	rel="stylesheet" type="text/css"/>
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


						<ul class="nav navbar-nav">
							<li
								class="dropdown dropdown-fw dropdown-fw-disabled"><a
								href="javascript:;" class="text-uppercase"> <img
									src="assets1/layouts/layout5/img/Dashboardw.png">
									Dashboard
							</a>
								<ul class="dropdown-menu dropdown-menu-fw">
									<li><g:link controller="superadmin" action="indexx"
											class="nav-link nav-toggle">
											<i class="icon-graph"></i>
					                                     Dashboard
			                                      </g:link></li>
								</ul></li>


							<sec:ifAnyGranted roles="ROLE_SUPERADMIN">
								<li class="dropdown dropdown-fw dropdown-fw-disabled"><a
									href="javascript:;" class="text-uppercase"> <i
										class="icon-layers"></i> Create Admin
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">
										<li><g:link controller="superadmin" action="index"
												class="nav-link ">
												<i class="icon-settings"></i> Create Admin
									</g:link></li>
										<li><g:link controller="superadmin" action="index"
												class="nav-link ">
												<i class="fa fa-list"></i> View list
									</g:link></li>
									</ul></li>
							</sec:ifAnyGranted>


							<sec:ifAnyGranted roles="ROLE_ADMIN">
								<li class="dropdown dropdown-fw dropdown-fw-disabled"><a
									href="javascript:;" class="text-uppercase"><img
										src="assets1/layouts/layout5/img/collegew.png"> College
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">
										<li><g:link controller="usercreate" action="index"
												class="nav-link ">
												<i class="fa fa-plus"></i> Create College
									</g:link></li>
										<li><g:link controller="usercreate" action="index"
												class="nav-link ">
												<i class="fa fa-list"></i> View list
									</g:link></li>
									</ul></li>



								<li class="dropdown dropdown-fw dropdown-fw-disabled"><a
									href="javascript:;" class="text-uppercase"><img
										src="assets1/layouts/layout5/img/Department.png">
										Department </a>
									<ul class="dropdown-menu dropdown-menu-fw">

										<li><g:link controller="department" action="create"
												class="nav-link ">
												<i class="fa fa-plus"></i> Create Department
									</g:link></li>
										<li><g:link controller="department" action="index"
												class="nav-link ">
												<i class="fa fa-list"></i> View Department
									</g:link></li>
									</ul></li>



								<li class="dropdown dropdown-fw dropdown-fw-disabled active open selected"><a
									href="javascript:;" class="text-uppercase"> <img
										src="assets1/layouts/layout5/img/filledpostb.png">
										Filled Post
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">

										<li><g:link controller="filledPost" action="create"
												class="nav-link"
												style="padding: 30px 0px 30px 25px !important;">
												<i class="fa fa-plus"></i> Create Posts
									</g:link></li>
										<li><g:link controller="filledPost" action="index"
												class="nav-link"
												style="padding: 30px 0px 30px 25px !important;">
												<i class="fa fa-list"></i> View Teaching List
									</g:link></li>
										<li><g:link controller="filledPost"
												action="indexnonteaching" class="nav-link "
												style="padding: 30px 0px 30px 25px !important;">
												<i class="fa fa-list"></i> View Non-Teaching List
									</g:link></li>

										<li><g:link controller="filledPost"
												action="transferteaching" class="nav-link "
												style="padding: 30px 0px 30px 25px !important;">
												<i class="fa fa-list"></i> View Retired Teaching List
									</g:link></li>

										<li><g:link controller="filledPost"
												action="transfernonteaching" class="nav-link "
												style="padding: 30px 0px 30px 25px !important;">
												<i class="fa fa-list"></i> View Retired Non-Teaching List
									</g:link></li>
									</ul></li>
									
									
								<li class="dropdown dropdown-fw dropdown-fw-disabled"><a
									href="javascript:;" class="text-uppercase"> <img
										src="assets1/layouts/layout5/img/Reportsw.png"> Reports
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">
										<li><g:link controller="filledPost" action="searchByDept"
												class="nav-link ">
												<i class="fa fa-file-text-o"></i> Department Reports
									</g:link></li>

										<li><g:link controller="filledPost"
												action="searchByCollage" class="nav-link ">
												<i class="fa fa-file-text-o"></i> Collage Reports
									</g:link></li>
									</ul></li>


								<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
									href="javascript:;" class="text-uppercase"> <img
										src="assets1/layouts/layout5/img/Transferw.png">
										Transfer
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">
										<%--<li><g:link controller="transferPost" action="transferDetails"
						class="nav-link ">
						<i class="fa fa-file-text-o"></i> Transfer Post
									</g:link></li>
									
									--%>
										<li><g:link controller="transferPost"
												action="transferList" class="nav-link ">
												<i class="fa fa-file-text-o"></i> Transfer List
									</g:link></li>
									</ul></li>




								<li class="dropdown dropdown-fw dropdown-fw-disabled  "><a
									href="javascript:;" class="text-uppercase"><img
										src="assets1/layouts/layout5/img/Retiredw.png"> Retired
								</a>
									<ul class="dropdown-menu dropdown-menu-fw">
										<li><g:link controller="transferPost"
												action="searchByDept" class="nav-link ">
												<i class="fa fa-file-text-o"></i> Retired Post
									</g:link></li>
									</ul></li>
							</sec:ifAnyGranted>
						</ul>

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
								<g:if test="${flash.message}">
									<div class="alert alert-success" id="mydiv">
										<div class="text-center" style="color: #000;" role="status">
											<span class="badge badge-pill badge-success">Success</span>
											${flash.message}
										</div>
									</div>
								</g:if>
								<div class="portlet box blue ">
									<div class="portlet-title">
										<div class="caption">
											<i class="fa fa-list"></i>Retired Teaching List
										</div>
										
									</div>
									

									<div class="portlet-body form">
										<!-- BEGIN FORM-->
										<div class="row">
											<div class="col-md-12">
												<!-- BEGIN EXAMPLE TABLE PORTLET-->
												<div class="portlet light ">
													<div class="portlet-title">

														<div class="tools"></div>
													</div>
													<div class="portlet-body table-both-scroll">
														<table
															class="table table-striped table-checkable table-bordered table-hover"
															id="sample_1">
															<thead>

																<tr>
																	<th>Sl.no</th>
																	<th>College Name </th>
																	<th>Cadre</th>
																	<th>Staff Type</th>
																	<th>Position Type</th>
																	<th>Department Name</th>
																	<th>Name Of The Employee</th>
																	<th>Employee Number</th>
																	<th>Employee PayScale</th>
																	<th>Social category</th>
																	<th>371J</th>
																	<th>PWD</th>	
																	<th>DOE Assistant Professor</th>	
																	<th>DOE Professor </th>
																	<th>Mode Of Entry</th>
																	<th>DOE Present Cadre</th>
																	<th>Mode Of Entry</th>												
																	<th>Date of Retirement</th>
																	<th>Remarks</th>
																	

																</tr>
															</thead>
															<tbody>
																<g:each in="${filledPostInstanceResults}"
																	status="i" var="filledPostInstance">
																	<tr>
																		<td style="font-size: 11px !important;">
																			${i+1}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance?.collagId, field: "username")}
																		</td>

																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "cadreType")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "staffType")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "positionType")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance?.deptId, field: "deptName")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "employeeName")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "employeeNumber")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "empPayScale")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "socialcategory")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "j371")}
																		</td>
																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "pwd")}
																		</td>
                                                                         <td style="text-align:center;"><g:formatDate
																				date="${filledPostInstance.doeAssistantProfessorKVAFSU}"
																				format="dd-MM-yyyy" /></td>

																	
																		<td style="text-align:center;"><g:formatDate
																				date="${filledPostInstance.doeProfessorCAS  }"
																				format="dd-MM-yyyy" /></td>
<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "professor")}
																		</td>
																		
																		<td style="text-align:center;"><g:formatDate
																				date="${filledPostInstance.doePresentCadre}"
																				format="dd-MM-yyyy" /></td>

																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "present")}
																		</td>
							

																		<td style="text-align:center;"><g:formatDate
																				date="${filledPostInstance.dateofRetirement}"
																				format="dd-MM-yyyy" /></td>

																		<td style="text-align:center;">
																			${fieldValue(bean: filledPostInstance, field: "remarks")}
																		</td>

																		
																	</tr>
																</g:each>
															</tbody>
														</table>
														<div class="text-center">
															<g:link action="filereporttrans"
																class="btn btn blue btn-primary" target="_blank">
																<i class="fa fa-print"></i>Take Print</g:link>

														</div>
													</div>
												</div>
											</div>







										</div>


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