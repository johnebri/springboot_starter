<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>

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
		
<%@ include file="common/footer.jspf" %>