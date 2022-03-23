<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Page</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css" 
integrity="sha256-mmgLkCYLUQbXn0B1SRqzHar6dCnv9oZFPEC1g1cwlkk=" crossorigin="anonymous" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
#navigation{
     color: black;
     text-align: center;
     border-radius: 25px;
 }
 .navbar{
     background-color: rgb(215, 226, 235);
     font-family: 'Alegreya Sans',sans-serif;
     font-weight: bold;
     border-bottom-left-radius: 25px;
     border-bottom-right-radius: 25px;
 }
</style>
</head>
<body>
    <nav class="navbar navbar-expand-lg fixed-top">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation-bar">
            <span class="navbar-toggler-icon">&#9776;</span>
        </button>
        &nbsp;&nbsp;&nbsp;<a class="navbar-brand" href="#" style="border-radius: 25px; margin-left: ">
        <img src="https://i.pinimg.com/564x/61/6f/90/616f900fb165b3a61464d56a87f4d824.jpg" height="100" width="200" class="img-fluid" style="border-radius: 25px;"></a>
        <div class="collapse navbar-collapse" id="navigation-bar">
            <ul class="navbar-nav" style="margin-left: auto;margin-right:10px">
            	<li class="nav-item"><a class="nav-link" href="superuserhome" id="navigation">Home</a></li>
                 <li class="nav-item"><a class="nav-link" href="login" id="navigation" onclick="window.location.reload()">LogOut</a></li>
            </ul>
        </div>
    </nav>
<div class="container" style="padding-top: 170px;">
<div class="col-md-12 col-12 col-sm-12">
    <div class="card" >
      <div class="card-header">
        <h4>Task Details</h4>
      </div>
      <div class="card-body">
        <div class="table-responsive">
          <table class="table table-striped" style="width:1250px">
            <tbody><tr>
              <th>Admin Id</th>
              <th>Admin Name</th>
              <th>Status</th>
              <th>Action</th>
            </tr>
            <c:forEach var="adm" items="${alist }">
            <form name="frm" method="post" action="doaction">
            <tr>
         		<td style="height:55px" class="align-middle">${adm.adminId }</td>
              	<td style="height:55px" class="align-middle">${adm.firstName }&nbsp;${adm.lastName }</td>
              
	             <td class="align-middle" style="height:55px">
	                 <div class="appr">${adm.approval }</div>
	             </td>
              	<td style="height:55px">
              	<c:set var="appr" scope="session" value="${adm.approval }"/>  
				<c:if test="${appr=='Pending'}">  
  					 <input type="submit" class="btn btn-primary btn-action" name="approve" value="Approve"/>&nbsp;&nbsp;
                	 <input type="submit" class="btn btn-danger btn-action" name="reject"  value="Reject"/>
				</c:if>
              </td> 
            </tr>
            <input type="hidden" name="aid" value="${adm.adminId }"/>
            </form>
            </c:forEach>
          </tbody></table>
        </div>
      </div>
    </div>
  </div>
</div>
</body>
</html>