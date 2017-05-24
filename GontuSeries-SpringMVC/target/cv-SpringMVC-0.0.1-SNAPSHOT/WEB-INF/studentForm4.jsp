<!-- This to show how to select multiple values from form to controller -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Form</title>
</head>
<body>
<center>${headerMessage}</center><br><br>

<form action="submitForm4" method="post">
<p> Student Name : <input type="text" name="studentName"/> </p>

<p> Student Hobby : <input type="text" name="studentHobby"/> </p>

<table>
  <tr><td>Student Address</td></tr>
  <tr>
     <td>Street : <input type="text" name="myAddress.street"/></td>
     <td>City : <input type="text" name="myAddress.city"/></td>
     <td>Zipcode : <input type="text" name="myAddress.zipcode"/></td>

</table>

<input type="submit" value="Save"/>


</form>

</body>
</html>



