<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

         <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
     <script src="https://kit.fontawesome.com/9ca98498b5.js" crossorigin="anonymous"></script>
<title>Admin Home</title>
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
    .responsive{
    	width: 100%;
    	max-width: 400px;
    	height: auto;
    }
</style>
</head>
<body>
    <nav class="navbar navbar-expand-lg fixed-top">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation-bar">
            <span class="navbar-toggler-icon">&#9776;</span>
        </button>
        &nbsp;&nbsp;&nbsp;<a class="navbar-brand" href="#" style="border-radius: 25px; margin-left: "><img src="https://i.pinimg.com/564x/61/6f/90/616f900fb165b3a61464d56a87f4d824.jpg" height="100" width="200" class="img-fluid" style="border-radius: 25px;"></a>
        <div class="collapse navbar-collapse" id="navigation-bar">
            <ul class="navbar-nav" style="margin-left: auto;">
                <li class="nav-item" ><a class="nav-link" href="trainerreg" id="navigation"><i class="fa-solid fa-user-plus"></i>&nbsp;&nbsp;Add Trainer</a></li>
                <li class="nav-item" ><a class="nav-link" href="sessionadd" id="navigation"><i class="fa-solid fa-file-circle-plus"></i>&nbsp;&nbsp;Add Session</a></li>
                <li class="nav-item" ><a class="nav-link" href="skilladd" id="navigation"><i class="fa-solid fa-plus"></i>&nbsp;&nbsp;Add Skill</a></li>
                <li class="nav-item" ><a class="nav-link" href="updatetrainer" id="navigation"><i class="fa-solid fa-pen-to-square"></i>&nbsp;&nbsp;Update Trainer</a></li>
                <li class="nav-item" ><a class="nav-link" href="deletetrainer" id="navigation"><i class="fa-solid fa-trash"></i>&nbsp;&nbsp;Delete Trainer</a></li>
                <li class="nav-item" ><a class="nav-link" href="login" id="navigation" onclick="window.location.reload()" style="padding-left: 30px"><i class="fa-solid fa-arrow-right-from-bracket"></i>&nbsp;&nbsp;LogOut</a></li> 
            </ul>
        </div>
    </nav>
    <section class="vh-100">
    	<div class="container h-100">
    	<div class="row d-flex justify-content-center align-items-center h-100" >
    	<p style="font-weight: bold;">Home Page Under Developement <img alt="img" src="./images/aconst.gif" class="responsive" style="width:600;height: 400;"></p>
		</div>
	</div>
    </section>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" 
	integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
</body>
</html>