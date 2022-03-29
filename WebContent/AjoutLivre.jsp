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
											<h3>Ajouter un livre</h3>
											<form action="AjoutLivre" method="post"
												enctype="multipart/form-data">
												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="name">ISBN</label> <input
															type="text" id="isbn" name="isbn" class="form-control"
															placeholder="ISBN">
													</div>

												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="email">Titre</label> <input
															type="text" id="titre" name="titre" class="form-control"
															placeholder="Titre">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="password">Auteur</label> <input
															type="text" id="auteur" name="auteur"
															class="form-control" placeholder="Auteur">
													</div>
												</div>
												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="password">Editeur</label> <input
															type="text" id="editeur" name="editeur"
															class="form-control" placeholder="Editeur">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="password">Annee</label> <input
															type="text" id="annee" name="annee" class="form-control"
															placeholder="Annee">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label for="activities">Kind</label> <select name="genre"
															id="genre" class="form-control">
															<option value=""></option>
															<option value="1">Informatic</option>
															<option value="2">mathematical</option>
														</select>
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label for="destination">Language</label> <select
															name="langue" id="langue" class="form-control">
															<option value=""></option>
															<option value="1">French</option>
															<option value="2">English</option>
														</select>
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="password">Prix</label> <input
															type="text" id="prix" name="prix" class="form-control"
															placeholder="Price">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="password">Description</label>
														<input type="text" id="description" name="description"
															class="form-control" placeholder="Description">
													</div>
												</div>

												<div class="row form-group">
													<div class="col-md-12">
														<label class="sr-only" for="url">Select Image</label> <input
															type="file" id="url" name="url" class="form-control"
															placeholder="Url_Image">
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