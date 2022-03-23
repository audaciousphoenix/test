<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
     <script src="https://kit.fontawesome.com/9ca98498b5.js" crossorigin="anonymous"></script>
<style type="text/css">
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
        body{
			background-image: url("");
			background-repeat: no-repeat;        
			padding: 200px;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg fixed-top">
       <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navigation-bar">
           <span class="navbar-toggler-icon">&#9776;</span>
       </button>
       &nbsp;&nbsp;&nbsp;<a class="navbar-brand" href="#" style="border-radius: 25px; margin-left: ">
       <img src="https://i.pinimg.com/564x/61/6f/90/616f900fb165b3a61464d56a87f4d824.jpg" height="100" width="200"  class="img-fluid" style="border-radius: 25px;"></a>
       <div class="collapse navbar-collapse" id="navigation-bar">
           <ul class="navbar-nav" style="margin-left: auto;">
           		<li class="nav-item"><a class="nav-link" href="taskpage" id="navigation"><i class="fa-solid fa-list-check"></i>&nbsp;&nbsp;Tasks</a></li>
           		<li class="nav-item" ><a class="nav-link" href="login" id="navigation" onclick="window.location.reload()" style="padding-left: 30px"><i class="fa-solid fa-arrow-right-from-bracket"></i>&nbsp;&nbsp;LogOut</a></li>
           </ul>
       </div>
   </nav>
   <section class="vh=100">
   <div class="container" style="color: black;padding-top: 200px;font-weight: bold;text-align: center;font-size: 20px">
   		Welcome Home Admin!
   </div>
   </section>
</body>
</html>

