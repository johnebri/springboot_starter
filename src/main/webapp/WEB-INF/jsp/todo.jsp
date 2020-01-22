<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
	<head>
		<title>First Web App</title>
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
			<h2>Add todo page for ${name}</h2>
			
			<form:form method="post" modelAttribute="todo">
				<form:hidden path="id" />
				
				<fieldset class="form-group">
					<form:label path="desc">Description</form:label>
					<form:input path="desc" type="text" name="desc" class="form-control" required="required" />
					<form:errors path="desc" cssClass="text-warning"></form:errors>
				</fieldset>	
				
				<fieldset class="form-group">
					<form:label path="targetDate">Description</form:label>
					<form:input path="targetDate" type="text" name="desc" class="form-control" required="required" />
					<form:errors path="targetDate" cssClass="text-warning"></form:errors>
				</fieldset>					
				
				<button type="submit" class="btn btn-success">Add Todo</button>
			</form:form>
		</div>
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	    <script	src="webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
		
		<script>
			$('#targetDate').datepicker({
				format : 'dd/mm/yyyy'
			});
		</script>
		
	</body>
</html>