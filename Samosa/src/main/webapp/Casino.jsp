<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home
				Page</a>
		</div>
	</nav>
	<h2>Welcome </h2>
<form action="def" method="post">
			<div class="mb-3">
			<label for="formFile" class="form-label">Casino Name</label> <input
				type="text" class="form-control" name="casinoName" id="formFile"
				placeholder="Enter casino name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Cruise Name</label> <input
				type="text" class="form-control" name="cruiseName" id="formFile"
				placeholder="Enter Cruise name" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="Casino">Entry Fee</label> <input
				class="form-control" name="entryFee" type="text" id="entryFee"
				placeholder="Enter your entryFee" name="entryFee">
		</div>
	
		<div class="mb-3">
		<label for="formFile" class="form-label">Free Food</label>
  <input class="form-check-input" type="checkbox" name="freeFood" value="true" id="flexCheckDefault">
  <label class="form-check-label" for="flexCheckDefault">
    Yes
    </label>
      <input class="form-check-input" type="checkbox" name="freeFood" value="false" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
  </div>
  	<div class="mb-3">
		<label for="formFile" class="form-label">Free Alcohol</label>
  <input class="form-check-input" type="checkbox" name="freeAlcohol" value="true" id="flexCheckDefault">
  <label class="form-check-label" for="flexCheckDefault">
    Yes
    </label>
      <input class="form-check-input" type="checkbox" name="freeAlcohol" value="false" id="flexCheckChecked" checked>
  <label class="form-check-label" for="flexCheckChecked">
    No
  </label>
  </div>
  <input type="submit" value="send" class="btn btn-dark">
	</form>
</body>
</html>