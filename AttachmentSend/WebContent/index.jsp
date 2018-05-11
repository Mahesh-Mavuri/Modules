<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Email WEb</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<div style="border:1px solid red;width:100%;background-color:#b3b3ff">
<h1>Email Web Application</h1>
</div>
<div class="input-group">
<form style="margin:50px" action="">
<br>
<label for="uname" >Enter Your Outlook Mail Id</label><input class="form-control" type="email" name="uname" required><br>
<label for="upwd" >Enter Your Outlook Mail Password</label><input class="form-control" type="password" name="upwd" required><br>
<label for="to" >To</label><input class="form-control" type="email" name="to" required><br>
<label for="subject">Subject</label><input class="form-control" type="text" name="subject" required><br>
<textarea type="textarea" rows="5" cols="100" id="content" required></textarea><br>
<button id="attach" onclick="document.getElementById('att').click();" style="color : black;border : none;padding : 0;background : none;"><span class="glyphicon glyphicon-paperclip"></span></button>
<input type="file" id="att" style="display:none">
<br><br><input type="submit" value="Send">

</form>


</div>
</body>
</html>