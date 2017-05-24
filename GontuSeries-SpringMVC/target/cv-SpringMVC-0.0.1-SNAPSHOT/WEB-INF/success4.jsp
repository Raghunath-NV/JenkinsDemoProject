<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sucess Page</title>
</head>
<body>
<center>${headerMessage}</center>
<p> Name :  ${passedStudent.studentName}</p><br>
<p> Hobby :  ${passedStudent.studentHobby}</p>
<p> Street : ${passedStudent.myAddress.street}</p>
<p> City : ${passedStudent.myAddress.city}</p>
<p> Zipcode : ${passedStudent.myAddress.zipcode}</p>

</body>
</html>