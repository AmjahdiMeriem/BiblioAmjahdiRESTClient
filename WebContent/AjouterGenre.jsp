<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by FreeHTML5.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="FreeHTML5.co" />

<meta property="og:title" content="" />
<meta property="og:image" content="" />
<meta property="og:url" content="" />
<meta property="og:site_name" content="" />
<meta property="og:description" content="" />
<meta name="twitter:title" content="" />
<meta name="twitter:image" content="" />
<meta name="twitter:url" content="" />
<meta name="twitter:card" content="" />

<%@ include file="/Include/css.jsp"%>
</head>
<body>
	<div class="gtco-loader"></div>

	<div id="page">


		<%@ include file="/Include/Nav.jsp"%>
		<header id="gtco-header" class="gtco-cover gtco-cover-md"
			role="banner"
			style="background-image: url(Template/images/img_bg_2.jpg)">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-12 col-md-offset-0 text-left">

						<div class="gtco-section border-bottom" style="margin-top: 1%">
							<div class="gtco-container">
								<div class="row">

									<div class="col-md-12">
										<div class="col-md-6 animate-box">
											<h3>Add a Kind</h3>
											<form action="AjouterGenreServlet" method="post">
												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="nameKind">Name of Kind</label>
														<input type="text" id="nameKind" name="nameKind"
															class="form-control" placeholder="Name of Kind">
													</div>

												</div>

												<div class="form-group">
													<input type="submit" value="Register"
														class="btn btn-primary">
												</div>
											</form>
										</div>

									</div>
								</div>
							</div>
						</div>


					</div>
				</div>
			</div>
		</header>

	</div>

	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>

	<%@ include file="/Include/js.jsp"%>
</body>
</html>