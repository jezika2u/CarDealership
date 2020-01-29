<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <!-- Imports JSTL library: -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EasyCar.com</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<link rel ="stylesheet" type="text/css" href="styles.css"/>

</head>

<body>
<div class="myContainer">
<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
    <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="images/banner4.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>You're Finally Here!</h5>
        <p>We've been expecting you and can't wait to show you what we have in store!</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="images/banner1.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>You Get To Choose!</h5>
        <p>Our no pressure sales team is standing by!</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="images/banner6.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h5>It's Time.</h5>
      </div>
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>



<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="index.jsp">EasyCar.com</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          ADD INVENTORY </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="AddNewInventory.jsp">New</a>
          <a class="dropdown-item" href="AddUsedInventory.jsp">Used</a>
        </div>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button type="button" class="btn btn-light">Search</button>
    </form>
  </div>
</nav>


<div>
<hr>


	<form class="welcome-form" action="welcomeServlet" method="post">
		<button type="submit" class="btn btn-link"><img style= "width:600px" src="images/click.jpg" /></button>			
	</form>


<c:if test="${newCars != null }">
			<!-- ******* -->
			<br>
			<h3>NEW CAR INVENTORY:</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col"> </th>
						<th scope="col">YEAR</th>
						<th scope="col">MAKE</th>
						<th scope="col">MODEL</th>
						<th scope="col">PRICE</th>
						<th scope="col"> </th>
						<th scope="col"> </th>
						
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="newCar" items="${newCars}">
						<!-- ^^^^^^^ -->
						
						<tr>
							<td><img style= "height:50px" src="<c:out value="${newCar.imgUrl}" />"></td>
							<td><c:out value="${newCar.year}"  /></td>
							<td><c:out value="${newCar.make}"  /></td>
							<td><c:out value="${newCar.model}"  /></td>
							<td><c:out value="${newCar.price}"  /></td>
							<td>
							<form action="CarDetailsServlet" method="post">
							<input type="hidden" name="condition" value="new">
							<input type="hidden" name="imgUrl" value="${newCar.imgUrl}">
							<input type="hidden" name="id" value="${newCar.id}">
							<input type="hidden" name="make" value="${newCar.make}">
							<input type="hidden" name="model" value="${newCar.model}">
							<input type="hidden" name="year" value="${newCar.year}">
							<input type="hidden" name="price" value="${newCar.price}">
							<button type="submit" class="btn btn-dark">DETAILS</button>
							</form>
							</td>
							<td>
							<form action="buyCarServlet" method="post">
							<input type="hidden" name="condition" value="new">
							<input type="hidden" name="imgUrl" value="${newCar.imgUrl}">
							<input type="hidden" name="id" value="${newCar.id}">
							<input type="hidden" name="make" value="${newCar.make}">
							<input type="hidden" name="model" value="${newCar.model}">
							<input type="hidden" name="year" value="${newCar.year}">
							<input type="hidden" name="price" value="${newCar.price}">
							<button type="submit" class="btn btn-light">PURCHASE</button>
							</form>
							</td>
						</tr>
						
					</c:forEach>
					
					<!-- ^^^^^^^ -->
				</tbody>
			</table>
		</c:if>
		
		<br>
		
		<c:if test="${usedCars != null }">
			<!-- ******* -->
			<br>
			<h3>USED CAR INVENTORY:</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">VEHICLE</th>
						<th scope="col">SALES ID</th>
						<th scope="col">MAKE</th>
						<th scope="col">MODEL</th>
						<th scope="col">YEAR</th>
						<th scope="col">PRICE</th>
						<th scope="col">DETAILS</th>
						
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="usedCar" items="${usedCars}">
						<!-- ^^^^^^^ -->
						<tr>
							<td><img style= "height:50px" src="<c:out value="${usedCar.imgUrl}" />"></td>
							<td><c:out value="${usedCar.saleId}" /></td>
							<td><c:out value="${usedCar.make}" /></td>
							<td><c:out value="${usedCar.model}" /></td>
							<td><c:out value="${usedCar.year}" /></td>
							<td><c:out value="${usedCar.price}" /></td>
						
							<td>
							<form action="CarDetailsServlet" method="post">
							<input type="hidden" name="condition" value="used">
							<input type="hidden" name="imgUrl" value="${usedCar.imgUrl}">
							<input type="hidden" name="saleId" value="${usedCar.saleId}">
							<input type="hidden" name="make" value="${usedCar.make}">
							<input type="hidden" name="model" value="${usedCar.model}">
							<input type="hidden" name="year" value="${usedCar.year}">
							<input type="hidden" name="mileage" value="${usedCar.mileage}">
							<input type="hidden" name="price" value="${usedCar.price}">
							<button type="submit" class="btn btn-dark">DETAILS</button>
							</form>
							
						</tr>
						

					</c:forEach>
					
					<!-- ^^^^^^^ -->
				</tbody>
			</table>
		</c:if>




</div>
<hr>
</body>
</html>