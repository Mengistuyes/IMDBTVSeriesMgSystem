<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Artist</title>
</head>
<body>
	<form action="../s/${actor.id}" method="post">
	<table>
		<tr>
			<td>Name:</td>
			<td><input type="text" name="make" value="${actor.Name}" /> </td>
		</tr>
		<tr>
			<td>PlaceOfBirth:</td>
			<td><input type="text" name="model" value="${actor.PlaceOfBirth}" /> </td>
		</tr>
		<tr>
			<td>Biography:</td>
			<td><input type="text" name="year" value="${actor.Biography}" /> </td>
		</tr>
		<tr>
			<td>pictures:</td>
			<td><input type="text" name="color" value="${actor.pictures}" /> </td>
		</tr>
	</table>
	<input type="submit" value="update"/>
	</form>
	<form action="delete?actorId=${actor.id}" method="post">
		<button type="submit">Delete</button>
	</form>
</body>
</html>