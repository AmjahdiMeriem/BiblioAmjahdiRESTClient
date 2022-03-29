<!DOCTYPE HTML>
<%@page import="Model.GenreLivre"%>
<%@page import="Model.LangueLivre"%>
<%@page import="javax.servlet.http.Part"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="javax.ws.rs.client.Entity"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.GET"%>
<%@page import="java.util.List"%>
<%@page import="javax.ws.rs.core.GenericType"%>
<%@page import="javax.ws.rs.core.Response"%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="Model.Livre"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<!-- Facebook and Twitter integration -->
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
<!-- ----------------------------------------------------------------------------------------------------------- -->
<body>

	<div class="gtco-loader"></div>

	<div id="page">

		<!-- ----------------------------------------------------------------------------------------------------------- -->

		<%@ include file="/Include/Nav.jsp"%>

		<!-- ----------------------------------------------------------------------------------------------------------- -->
		<header id="gtco-header" class="gtco-cover gtco-cover-md"
			role="banner"
			style="background-image: url(Template/images/img_6.jpg)">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row row-mt-15em" style="margin-top: 15%">
					<div class="col-md-7 mt-text animate-box"
						data-animate-effect="fadeInUp"></div>
					<div class="col-md-4 col-md-push-1 animate-box"
						data-animate-effect="fadeInRight">
						<%-- <div class="form-wrap">
							<div class="tab">
								<%
									ILangueLivreService langueService = new LangueLivreServiceImpl();
									List<LangueLivre> langues = langueService.findLangueAll();
									IGenreLivreService genreService = new GenreLivreServiceImpl();
									List<GenreLivre> genres = genreService.findGenreLivre();
								%>

								<div class="tab-content">
									<div class="tab-content-inner active" data-content="signup">
										<h3>
											<%
												
											%>
											Search for a book
										</h3>
										<form action="Index.jsp">
											<div class="row form-group">
												<div class="col-md-12">
													<label for="Kind">Kind</label> <select name="Kind"
														id="Kind" class="form-control">
														<option value=""></option>
														<%
															for (int i = 0; i < genres.size(); i++) {
														%>
														<option
															value=<%=String.valueOf(genres.get(i).getIdGenreLivre())%>><%=genres.get(i).getNomGenreLivre()%></option>

														<%
															}
														%>
													</select>
												</div>
											</div>
											<div class="row form-group">
												<div class="col-md-12">
													<label for="Language">Language</label> <select
														name="Language" id="Language" class="form-control">
														<option value=""></option>
														<%
															for (int i = 0; i < langues.size(); i++) {
														%>
														<option
															value=<%=String.valueOf(langues.get(i).getIdLangueLivre())%>><%=langues.get(i).getNomLangueLivre()%></option>
														<%
															}
														%>

													</select>

												</div>
											</div>

											<div class="row form-group">
												<div class="col-md-12">
													<input type="submit" class="btn btn-primary btn-block"
														value="Search">
												</div>
											</div>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div> --%>
				</div>
			</div>
		</header>
		
	<%-- <% 
	List<Livre> livress= new ArrayList<Livre>();
		%>
	<c:if test="${ empty Kind and empty Language }">
		<% ILivreService livresService=new LivreServiceImpl();
		livress=livresService.findBookAll(); %>
	</c:if>
	
	<c:if test="${ !empty Kind and !empty Language }">
		<% ILivreService livresService=new LivreServiceImpl();
		livress=livresService.findBookByLangKind(Long.valueOf(Integer.parseInt(request.getParameter("Kind"))),Long.valueOf(Integer.parseInt(request.getParameter("Language")))); %>
	</c:if> --%>
		<!-- ----------------------------------------------------------------------------------------------------------- -->
		<%
			Client client = javax.ws.rs.client.ClientBuilder.newClient();
			WebTarget target = client.target("http://localhost:8080/Biblio3AmjahdiRESTServer/LivreDAOImpl/findBookAll");
			List<Livre> livres = target.request(MediaType.APPLICATION_JSON).get(Response.class).readEntity(new GenericType<List<Livre>>(){});
		%>

		<div class="gtco-section">
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2 text-center gtco-heading">
						<h2>Most Popular Book</h2>
					</div>
				</div>
				<div class="row">
					<%
						for (int i = 0; i < livres.size(); i++) {
					%>
					<div class="col-lg-4 col-md-4 col-sm-6">

						<figure>
							<img src=<%="Template/images/" + livres.get(i).getUrlImage()%>
								alt="Image" class="img-responsive">
						</figure>
						<div class="fh5co-text">
							<h3><%=livres.get(i).getTitre()%></h3>
							<p><%=livres.get(i).getDescription()%></p>
							<a href="InfoLivre.jsp?id=<%=livres.get(i).getISBN()%>"><p>
									<span class="btn btn-primary">See More</span>
								</p></a>
						</div>
					</div>
					<%
						}
					%>

				</div>

			</div>
		</div>
		<!-- -------------------------------------------------------------------------------------------------------------- -->
		<!-- </div> -->

	</div>

	<%@ include file="/Include/js.jsp"%>

</body>
</html>

