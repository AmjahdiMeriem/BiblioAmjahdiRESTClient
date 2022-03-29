<!-- <div class="page-inner"> -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<nav class="gtco-nav" role="navigation">
	<div class="gtco-container">
		<div class="row">
			<div class="col-sm-4 col-xs-12">
				<div id="gtco-logo">
					<a href="Index.jsp">library<em>.</em></a>
				</div>
			</div>
			<div class="col-xs-8 text-right menu-1">
				<ul>
					<li><a href="Index.jsp">Home</a></li>
					<%-- <c:if test="${ empty sessionScope.name}"> --%>
					<li><a href="Inscription.jsp">Sign up</a></li>
					<%-- </c:if> --%>

					<%-- <c:if test="${sessionScope.role == 2}"> --%>
						<li class="has-dropdown"><a href="#">Book</a>
							<ul class="dropdown">
								<li><a href="AjoutLivre.jsp">Add a book</a></li>
								<li><a href="SupprimerLivre.jsp">Delete a book</a></li>
								<li>
							</ul></li>
						<li class="has-dropdown"><a href="#">Kind</a>
							<ul class="dropdown">
								<li><a href="AjouterGenre.jsp">add a Kind</a></li>
								<li><a href="SupprimerGenre.jsp">Delete a Kind</a></li>
							</ul></li>
						<li class="has-dropdown"><a href="#">Language</a>
							<ul class="dropdown">
								<li><a href="AjouterLangue.jsp">Add Language</a></li>
								<li><a href="SupprimerLangue.jsp">Delete Language</a></li>
							</ul></li>

					<%-- </c:if> --%>

					<%-- <c:if test="${ empty sessionScope.name}">
						<li><a
							href="Login.jsp?page=<%="AfficherLivrePannierServlet"%>">Login</a></li>
					</c:if>
					
					<c:if test="${ !empty sessionScope.name}">
						<li><a href="./AfficherLivrePannierServlet">My basket</a></li>
					</c:if>

					<c:if test="${ !empty sessionScope.name}">
						<li class="has-dropdown"><a href="#">${sessionScope.name}</a>
							<ul class="dropdown">
								<li><a href="./LogoutClientServlet">Logout</a></li>
							</ul></li>
					</c:if> --%>

				</ul>
			</div>
		</div>

	</div>
</nav>