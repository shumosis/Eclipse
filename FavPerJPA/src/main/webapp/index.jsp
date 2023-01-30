<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Shumosis</title>
</head>
<body>
<h1>Enter your girl details here</h1>
<form action="dhoka" method ="post">
<pre>
<span style='color:red'>
FirstName <input type = "text" name = "firstName"/>
LastName <input type = "text" name ="lastName"/>
Reason <textarea rows = "5" cols = "25" name="reason"></textarea>
Address <textarea rows = "5" cols = "25" name="address"></textarea>
Gender Male<input type = "radio" name = "gender" value = "ma"/>
       Female<input type = "radio" name = "gender" value = "female"/>
       LGBTQ<input type = "radio" name = "gender" value = "lgbtq"/>
 
 <input type="submit" value ="send"/>      
</span>

</pre>

</form>

</body>
</html>