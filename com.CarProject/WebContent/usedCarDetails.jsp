<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
      <!-- Imports JSTL library: -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vehicle Details</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<link rel ="stylesheet" type="text/css" href="styles.css"/>

</head>

<body>


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


<hr>


<br>

<div class="box2">
<div class="text-center">
<img style= "width:60%" src="<c:out value="${usedCar.imgUrl}" />">
</div>




<br>
 <div class="table-control1">
 <table class= "detail-table" style="width:60%;margin-left:auto;
	margin-right:auto;">
 
   <tr class="detail-table">
    <td class="detail-table"><h6>SALES ID</h6></td>
    <td class="detail-table"><c:out value="${usedCar.saleId}"/></td>
    
  </tr>
  <tr class="detail-table">
    <td class="detail-table"><h6>MAKE</h6></td>
    <td class="detail-table"><c:out value="${usedCar.make}"/></td>
    
  </tr>
  <tr class="detail-table">
    <td class="detail-table"><h6>MODEL</h6></td>
    <td class="detail-table"><c:out value="${usedCar.model}"/></td>

    
  </tr>
   <tr class="detail-table">
    <td class="detail-table"><h6>VEHICLE YEAR</h6></td>
    <td class="detail-table"><c:out value="${usedCar.year}"/></td>
    
  </tr>
   <tr class="detail-table">
    <td class="detail-table"><h6>CONDITION</h6></td>
    <td class="detail-table">PRE-OWNED</td>
    
      </tr>
   <tr class="detail-table">
    <td class="detail-table"><h6>MILEAGE</h6></td>
    <td class="detail-table"><c:out value="${usedCar.mileage}"/></td>
    
  </tr>
   <tr class="detail-table">
    <td class="detail-table"><h6>PRICE</h6></td>
    <td class="detail-table"><c:out value="${usedCar.price}"/></td>
    
    
  </tr>
  
</table> 
</div>
</div>

</body>
</html>