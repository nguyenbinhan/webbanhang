<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>
	<form action="" method="post">
		ID <input type="text" value="" name="id"> <br /> 
		Password <input type="password" value="" name="pass"> <br />
		Special <input type="text" value="" name="special"> <br />
			<input type="submit" value="Submit">
	</form>
</body>
</html>
