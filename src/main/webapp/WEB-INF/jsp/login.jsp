<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

	<div class="container">
		<p style="color:red;">${errorMessage}</p>
		<form method="post">
			Name : <input type="text" name="name" />
			<br><br>
			Password : <input type="password" name="password" />
			<br><br>
			<input type="submit" />
		</form>
		<%-- <p>My First JSP! Welcome ${name}</p>
		<h3>I work at ${company}</h3> --%>
	</div>
	
<%@ include file="common/footer.jspf" %>