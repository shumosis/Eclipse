<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

<!-- As a heading -->
<nav class="navbar bg-dark">
  <div class="container-fluid">
    <span class="navbar-brand mb-0 h1">
     <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Bootstrap" width="150" height="70"></span>
     
     
  </div>
</nav>
<h1>Shumos is getting data from the shumosis</h1>

<form action="ab">
<h6>Gmail :${gmail}</h6>
<input type="submit" value="Gmail">
</form>
<form action="cd">
<h6>Mobile number :${MobileNUmber}</h6>
<input type="submit" value="MobileNUmber">
</form>
<form action="ef">
<h6>Aadhar :${Aadhar}</h6>
<input type="submit" value="Aadhar">
</form>
<form action="gh">
<h6>Age :${Age}</h6>
<input type="submit" value="Age">
</form>
<form action="ij">
<h6>DateOfBirth :${Dob}</h6>
<input type="submit" value="Dob">
</form>
<form action="ab">
<h6>Desired Salary :${Salary}</h6>
<input type="submit" value="Salary">
</form>

<form action="qr">
<h2>Dispaly Skills</h2>
<input type="submit" value="Skills">
<ul>
<c:forEach items="${skil}" var="ski">
<li>${ski}</li> 
</c:forEach>
</ul>
</form>

<form action="mn">
<h2>Dispaly Friends</h2>
<input type="submit" value="Friends">
<ul>
<c:forEach items="${fr}" var="fri">
<li>${fri}</li> 
</c:forEach>
</ul>
</form>

<form action="op">
<h2>Dispaly Places</h2>
<input type="submit" value="Places">
<ul>
<c:forEach items="${pla}" var="places">
<li>${places}</li> 
</c:forEach>
</ul>
</form>


<form action="st">
<h6>Education Dto </h6>
<input type="submit" value="eddto"/></br>
<label>DegreeField: ${eddto.getDegreeField() }</label></br>
<label> DegrMar: ${eddto.getDegrMar() }</label></br>
<label>Degrre : ${eddto.getDegrre() }</label></br>
<label> Happy: ${eddto.isHappy() }</label></br>
<label>HighMar : ${eddto.getHighMar() }</label></br>
<label> PriMar: ${eddto.getPriMar() }</label></br>
<label> HighShcool : ${eddto.getHighShcool() }</label></br>
<label> PrimShcool: ${eddto.getPrimShcool() }</label></br>
<label> Puc: ${eddto.getPuc() }</label></br>
<label>PucField  : ${eddto.getPucField() }</label></br>
<label>PucMar : ${eddto.getPucMar() }</label></br>
</form>

<form action="uv">
<h6>Family Dto :${fadto}</h6>
<input type="submit" value="fadto"/></br>
<label> surname: ${fadto.surname }</label></br>
<label>name : ${fadto.name }</label></br>
<label> father: ${fadto.father }</label></br>
<label>mother : ${fadto.mother }</label></br>
<label>sister : ${fadto.sister }</label></br>
<label>brother : ${fadto.brother }</label></br>
<label>grandFather : ${fadto.grandFather }</label></br>
<label>grandMother : ${fadto.grandMother }</label></br>
<label>grandFatherAge : ${fadto.grandFatherAge }</label></br>
<label>grandMotherAge : ${fadto.grandMotherAge }</label></br>
</form>

<form action="wx">
<h6>Mobile Dto </h6>
<input type="submit" value="Modto"/></br>
<label>name : ${Modto.name }</label></br>
<label>ownerName : ${Modto.ownerName }</label></br>
<label>companyName : ${Modto.companyName }</label></br>
<label>price : ${Modto.price }</label></br>
<label>ram : ${Modto.ram }</label></br>
</form>

<form action="yz">
<h6>Beverge Dto </h6>
<input type="submit" value="bedto"/></br>
<label> name: ${bedto.name }</label></br>
<label>company : ${bedto.company }</label></br>
<label>flavour : ${bedto.flavour }</label></br>
<label>shop : ${bedto.shop }</label></br>
<label>price : ${bedto.price }</label></br>
<label> quantity: ${bedto.quantity }</label></br>
<label> good: ${bedto.good }</label></br>
<label> useful: ${bedto.useful }</label></br>
</form>

<form action="abc">
<h6>Chats Dto </h6>
<input type="submit" value="chdto"/></br>
<label>name : ${chdto.name }</label></br>
<label>fromState : ${chdto.fromState }</label></br>
<label>cook : ${chdto.cook }</label></br>
<label> hotel: ${chdto.hotel }</label></br>
<label>area : ${chdto.area }</label></br>
<label> mainIngredient: ${chdto.mainIngredient }</label></br>
<label> typeOfChutney: ${chdto.typeOfChutney }</label></br>
<label> price: ${chdto.price }</label></br>
<label> taste: ${chdto.taste }</label></br>
<label> worthy: ${chdto.worthy }</label></br>
<label> ratings: ${chdto.ratings }</label></br>
<label>wantAgain : ${chdto.wantAgain }</label></br>


</form>






























</body>
</html>