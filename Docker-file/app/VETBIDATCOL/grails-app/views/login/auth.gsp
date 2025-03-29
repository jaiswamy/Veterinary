<!DOCTYPE html>

<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->


<head>
<meta charset="utf-8" />
<title>URMS | Karnataka Veterinary Animal and Fisheries
	Sciences, University, Bidar</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta content="width=device-width, initial-scale=1" name="viewport" />
<meta
	content="Hi-Ideals developed School and College Software for managing various school and college activities"
	name="description" />
<meta content="Hi-Ideals Educare software" name="author" />

<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700&subset=all"
	rel="stylesheet" type="text/css" />
<link
	href="../assets1/global/plugins/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="../assets1/global/plugins/simple-line-icons/simple-line-icons.min.css"
	rel="stylesheet" type="text/css" />
<link href="../assets1/global/plugins/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />



<link href="../assets1/global/css/components.min.css" rel="stylesheet"
	id="style_components" type="text/css" />
<link href="../assets1/global/css/plugins.min.css" rel="stylesheet"
	type="text/css" />

<link href="../assets1/layouts/layout7/css/layout.min.css"
	rel="stylesheet" type="text/css" />
<link href="../assets1/layouts/layout7/css/custom.min.css"
	rel="stylesheet" type="text/css" />

<link rel="shortcut icon" href="../assets1/layouts/layout5/img/kvcbidra.png" />
<style>
.nav>li>a:focus, .nav>li>a:hover {
	background-color: #46c1f9;
	color: #000;
}
</style>
</head>


<body class="page-container-bg-solid">

	<div class="page-header navbar-fixed-top"
		style="background-image: url('../assets1/global/img/backgroung1.png') !important; background-repeat: no-repeat; background-attachment: fixed; background-position: center;">

		<div class="clearfix">



			<div class="page-logo">
				<g:link controller="login" action="auth">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					<img src="../assets1/layouts/layout5/img/logo.png" alt="logo"
						class="logo-default" />
				</g:link>
			</div>

			<div class="top-menu">
				<ul class="nav navbar-nav pull-right">


					<%--<li >
                            <a href="#requestdemo" class="btn btn-primary" style="margin-top:8px;">
                                Request for Demo
                            </a>
                            
                        </li>
                       
                    --%>
				</ul>
			</div>

		</div>

	</div>

	<div class="clearfix"></div>

	<div class="page-container page-content-inner page-container-bg-solid"
		style="background-image: url('../assets1/global/img/backgroung1.png') !important; background-repeat: no-repeat; background-attachment: fixed; background-position: center;">

		<div class="container-fluid container-lf-space "
			style="margin-top: 6px">

			<div class="row widget-row">

				<div class="col-md-9 col-sm-6 col-xs-12 margin-bottom-20">

					<div class="clearfix"></div>
					<div id="carousel-example-generic-v1"
						class="carousel slide widget-carousel" data-ride="carousel">

						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic-v1" data-slide-to="0"
								class="circle active"></li>
							<li data-target="#carousel-example-generic-v1" data-slide-to="1"
								class="circle"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="">
									<img src="../assets1/global/img/vet3.png"
										class="img-responsive" />
									<div class="widget-gradient-body">

										<!-- h3 class="widget-gradient-title">Hi-Educare</h3-->

									</div>
								</div>
							</div>
							<div class="item">
								<div class="">
									<img src="../assets1/global/img/vet1.png"
										class="img-responsive" />
									<div class="widget-gradient-body">
										<!--<h3 class="widget-gradient-title">Hi-Ideals Educare Software</h3-->

									</div>
								</div>
							</div>


							<div class="item">
								<div class="">
									<img src="../assets1/global/img/vet2.png"
										class="img-responsive" />
									<div class="widget-gradient-body">
										<!--<h3 class="widget-gradient-title">Hi-Ideals Educare Software</h3-->

									</div>
								</div>
							</div>

							<div class="item">
								<div class="">
									<img src="../assets1/global/img/vet4.png"
										class="img-responsive" />
									<div class="widget-gradient-body">
										<!--<h3 class="widget-gradient-title">Hi-Ideals Educare Software</h3-->

									</div>
								</div>
							</div>

						</div>
					</div>

				</div>


				<div class="col-md-3 col-sm-6 col-xs-12 margin-bottom-20">

					<div class="clearfix"></div>
					<div class="widget-wrap-img widget-bg-color-white">

						<div class="widget-subscribe widget-subscribe-border-top">
							<div id="login">

								<h2
									class="widget-subscribe-title widget-title-color-gray-dark text-uppercase"
									style="margin-left: 0px">
									<i class="fa fa-sign-in" style="color: #86cd92"></i> Login
								</h2>
								<g:if test='${flash.message}'>
									<div class='login_message' style="color: red">
										${flash.message}
									</div>
								</g:if>
								<form action='${postUrl}' method='POST' id='loginForm'
									autocomplete='off'>
									<label>Username</label> <input type="text" autocomplete="off"
										class="form-control" name='j_username' id='username' /> <label>Password</label>
									<input type="password" autocomplete="off" class="form-control"
										name='j_password' id='password' /> <br>
									<%--<div class="check">
						<label>				
							<input id="check" type="checkbox" class="checkbox">
								<svg xmlns="http://www.w3.org/2000/svg" width="26px" height="23px">
									<path class="path-back"  d="M1.5,6.021V2.451C1.5,2.009,1.646,1.5,2.3,1.5h18.4c0.442,0,0.8,0.358,0.8,0.801v18.398c0,0.442-0.357,0.801-0.8,0.801H2.3c-0.442,0-0.8-0.358-0.8-0.801V6"/>
									<path class="path-moving" d="M24.192,3.813L11.818,16.188L1.5,6.021V2.451C1.5,2.009,1.646,1.5,2.3,1.5h18.4c0.442,0,0.8,0.358,0.8,0.801v18.398c0,0.442-0.357,0.801-0.8,0.801H2.3c-0.442,0-0.8-0.358-0.8-0.801V6"/>
								</svg>
						</label>
						<p>Keep me signed in</p>
					</div>
				
				--%>
									<button type="submit" id="submit" class="btn btn-primary"
										style="background-color: #86cd92 !important; border-color: #86cd92 !important;"
										value='${message(code: "springSecurity.login.button")}'>
										Login</button>
								</form>
							</div>
						</div>


					</div>
				</div>

			</div>
			<div class="row widget-bg-color-white no-space margin-bottom-20">
				<div class="col-md-6 col-sm-6 no-space">
					<div
						class="widget-subscribe widget-subscribe-quote widget-bg-color-purple"
						style="background: #86cd92;">
						<h2
							class="widget-subscribe-title widget-title-color-purple-dark text-uppercase">Karnataka
							Veterinary, Animal and Fisheries Sciences University, Bidar</h2>
						<p class="widget-subscribe-subtitle widget-title-color-white">
							Details of Teaching and Non-Teaching Sanctioned, Filled and
							Vacant Posts.</p>
					</div>
				</div>

				<div class="col-md-3 col-sm-6 no-space">
					<div class="widget-subscribe">
						<span class="widget-subscribe-no" style="color: #86cd92;"><i
							class="fa fa-group"></i></span>
						<h2
							class="widget-subscribe-title widget-title-color-gray-dark text-uppercase">
							Teaching <br /> Post
						</h2>
						</span>
						
					</div>
				</div>

				<div class="col-md-3 col-sm-6 no-space">
					<div class="widget-subscribe widget-subscribe-border">
						<span class="widget-subscribe-no" style="color: #86cd92;"><i
							class="fa fa-group"></i></span>
						<h3 class="widget-title-color-gray-dark text-uppercase"  style="margin-top: 10px;">
							<b>Non-Teaching <br /> Post
							</b>
						</h3>
						
					</div>
				</div>




			</div>


			<!--  <div class="row widget-row">
                    <div class="col-md-3">
                        <div class="widget-thumb widget-bg-color-white text-uppercase margin-bottom-20 ">
                            <h4 class="widget-thumb-heading">Current Users</h4>
                            <div class="widget-thumb-wrap">
                                <i class="widget-thumb-icon bg-green icon-users"></i>
                                <div class="widget-thumb-body">
                                    
                                    <span class="widget-thumb-body-stat" data-value="25">25+ </span>
                                </div>
                            </div>
                        </div>
                      
                    </div>
                    <div class="col-md-3">
                        <!-- BEGIN WIDGET THUMB
                        <div class="widget-thumb widget-bg-color-white text-uppercase margin-bottom-20 ">
                            <h4 class="widget-thumb-heading">Number of students</h4>
                            <div class="widget-thumb-wrap">
                                <i class="widget-thumb-icon bg-red icon-layers"></i>
                                <div class="widget-thumb-body">
                                    
                                    <span class="widget-thumb-body-stat"  data-value="5000+">5000+</span>
                                </div>
                            </div>
                        </div>
                       
                    </div>
                    <div class="col-md-3">
                       
                        <div class="widget-thumb widget-bg-color-white text-uppercase margin-bottom-20 ">
                            <h4 class="widget-thumb-heading">Uptime</h4>
                            <div class="widget-thumb-wrap">
                                <i class="widget-thumb-icon bg-purple icon-screen-desktop"></i>
                                <div class="widget-thumb-body">
                                    
                                    <span class="widget-thumb-body-stat"  data-value="100%"> 100%</span>
                                </div>
                            </div>
                        </div>
                       
                    </div>
                    <div class="col-md-3">
                        
                        <div class="widget-thumb widget-bg-color-white text-uppercase margin-bottom-20 ">
                            <h4 class="widget-thumb-heading">Satisfied customers since</h4>
                            <div class="widget-thumb-wrap">
                                <i class="widget-thumb-icon bg-blue icon-bar-chart"></i>
                                <div class="widget-thumb-body">
                                    
                                    <span class="widget-thumb-body-stat"  data-value="0"> 4+ Years</span>
                                </div>
                            </div>
                        </div>
                       
                    </div>
                </div>-->






		</div>

	</div>

	<div class="page-footer">
		<div class="page-footer-inner container-fluid container-lf-space">
			<p class="page-footer-copyright">
				2022 &copy; Design & Developed By <a href="http://www.hiideals.com/"
					title="" target="_blank">Hi-Ideals Technologies Pvt. Ltd.</a>
			</p>
		</div>
		<div class="go2top">
			<i class="icon-arrow-up"></i>
		</div>
	</div>


	<!--[if lt IE 9]>
<script src="../assets1/global/plugins/respond.min.js"></script>
<script src="../assets1/global/plugins/excanvas.min.js"></script> 
<script src="../assets1/global/plugins/ie8.fix.min.js"></script> 
<![endif]-->

	<script src="../assets1/global/plugins/jquery.min.js"
		type="text/javascript"></script>
	<script src="../assets1/global/plugins/bootstrap/js/bootstrap.min.js"
		type="text/javascript"></script>




	<script
		src="../assets1/global/plugins/counterup/jquery.waypoints.min.js"
		type="text/javascript"></script>
	<script
		src="../assets1/global/plugins/counterup/jquery.counterup.min.js"
		type="text/javascript"></script>


	<script src="../assets1/global/scripts/app.min.js"
		type="text/javascript"></script>


	<script src="../assets1/layouts/layout7/scripts/layout.min.js"
		type="text/javascript"></script>

</body>

</html>