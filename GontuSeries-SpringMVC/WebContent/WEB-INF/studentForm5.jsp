<!-- This to show how to select multiple values from form to controller -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Form</title>
</head>
<body>
<center>${headerMessage}</center><br><br>

<form:errors path="studentSubject.*"/>
<form action="submitForm5" method="post">
<p> Subject Name : <input type="text" name="subject"/> </p>

<p> Subject Marks : <input type="text" name="marks"/> </p>

<input type="submit" value="Save"/>


</form>

</body>
</html>



