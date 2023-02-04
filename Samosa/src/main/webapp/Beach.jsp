<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>


<!-- As a heading -->
<nav class="navbar bg-dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">
     <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Bootstrap" width="150" height="70"></span>
     <a class="navbar-brand" href="index.jsp">Home</a>
  </div>
</nav>
	<h2>This beach is only for forainers</h2>
	<form action="abc" method="post">
		<div class="mb-3">
			<label for="formFile" class="form-label">Beach name</label> <input
				type="text" class="form-control" name="beachName" id="formFile"
				placeholder="Enter beach name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Location</label> <input
				type="text" class="form-control" name="location" id="formFile"
				placeholder="Enter beach location" />
		</div>
	
		<div class="mb-3">
		<label for="formFile" class="form-label">Clean</label>
  <input class="form-check-input" type="checkbox" name ="clean" value="true" id="flexCheckDefault">
  <label class="form-check-label" for="flexCheckDefault">
    Yes
    </label>
      <input class="form-check-input" type="checkbox" name ="clean" value="false" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
   </div>
   
   <div class="mb-3">
		<label for="formFile" class="form-label">Select Games u Want to play</label>
  <input class="form-check-input" type="checkbox" name="games"value="Water games" id="flexCheckDefault">
  <label class="form-check-label" for="flexCheckDefault">
    Water Games
    </label>
      <input class="form-check-input" type="checkbox" name="games" value="Scuba Diving" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    scuba Diving
  </label>
  
      <input class="form-check-input" type="checkbox" name="games" value="Paragliding" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    ParaGliding
  </label>
    </div>
   
   
   
		<input type="submit" value="send" class="btn btn-dark">
	</form>

</body>
</html>