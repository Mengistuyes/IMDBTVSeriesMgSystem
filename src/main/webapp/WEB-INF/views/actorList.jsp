
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Artist</title>
</head>
<body>
	<h1>List of Actors</h1>
	<table>
	<c:forEach var="actor" items="${actors}">
	<tr>
		<td>${actor.Name}</td>
		<td>${actor.Name}</td>
		<td>${actor.Name}</td>
		<td>${actor.Name}</td>
		<td><a href="actors/${actor.id}">edit</a></td>
	</tr>
	</c:forEach>
	</table>
	
	<a href="addActor.html"> Add a Actor</a>
</body>
</html>