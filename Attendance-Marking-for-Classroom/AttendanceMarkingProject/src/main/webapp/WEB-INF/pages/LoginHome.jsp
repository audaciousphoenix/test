<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Welcome</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Alegreya+Sans:300,400,700" rel="stylesheet">
    <script src="https://kit.fontawesome.com/9ca98498b5.js" crossorigin="anonymous"></script>
    <script type="text/javascript">
    	$(document).ready(function(){
    		$("#btn1").mouseenter(function(){
    			$("#img1").hide();
    			$("#img3").hide();
    			$("#img4").hide();
    			$("#img5").hide();
    			$("#img2").fadeIn(300);
    		});
    		$("#btn3").mouseenter(function(){
    			$("#img1").hide();
    			$("#img2").hide();
    			$("#img3").hide();
    			$("#img5").hide();
    			$("#img4").fadeIn(300);
    		});
    		$("#btn2").mouseenter(function(){
    			$("#img1").hide();
    			$("#img2").hide();
    			$("#img4").hide();
    			$("#img5").hide();
    			$("#img3").fadeIn(300);
    		});
    		$("#btn4,#btn5").mouseenter(function(){
    			$("#img1").hide();
    			$("#img2").hide();
    			$("#img4").hide();
    			$("#img3").hide();
    			$("#img5").fadeIn(300);
    		});
    	});
    </script>
    <script src='main.js'></script>
    
    <style>
        .divider:after,
        .divider:before {
        content: "";
        flex: 1;
        height: 1px;
        background: #eee;
        }
        .h-custom {
        height: calc(100% - 63px);
        }
        @media (max-width: 450px) {
        .h-custom {
            height: 100%;
        }
        }
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
               <li class="nav-item"><a class="nav-link" href="#AboutUs" id="navigation"><i class="fa-solid fa-circle-info"></i>&nbsp;&nbsp;AboutUs</a></li>
               <li class="nav-item"><a class="nav-link" href="#ContactUs" id="navigation"><i class="fa-duotone fa-at"></i>&nbsp;&nbsp;ContactUs</a></li>
            </ul>
        </div>
    </nav>
    <section class="vh-100">
        <div class="container-fluid h-custom">
          <div class="row d-flex justify-content-center align-items-center h-100">
            <div class=" col-lg-6 col-xl-5">
              <img src="./images/superuser.gif" class="img-fluid"
                alt="Sample image" id="img1">
                <img src="./images/superuser.gif" class="img-fluid"
                alt="Sample image" style="display:none" id="img2">
                <img src="./images/admin.gif" class="img-fluid"
                alt="Sample image" style="display:none" id="img3">
                <img src="./images/user.gif" class="img-fluid"
                alt="Sample image" style="display:none" id="img4">
                <img src="./images/register.gif" class="img-fluid"
                alt="Sample image" style="display:none" id="img5">
            </div>
            <div class="col-lg-6 col-xl-4 offset-xl-1">
              <form>
                <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
                  <p class="lead fw-normal mb-0 me-3"><i class="fa-solid fa-door-open"></i>&nbsp;&nbsp;Sign in as</p>                 
                  <a class="btn btn-primary" href="Superlogin" role="button" id="btn1">Super User</a>
      				&nbsp;&nbsp;
      			  <a class="btn btn-primary" href="adminlogin" role="button" id="btn2">Admin</a>
      			  	&nbsp;&nbsp;
                  <a class="btn btn-primary" href="Userlogin" role="button" id="btn3">User</a>
                </div>
                <div class="divider d-flex align-items-center my-4">
                  <p class="text-center fw-bold mx-3 mb-0">Or</p>
                </div>
                <div class="d-flex flex-row align-items-center justify-content-center justify-content-lg-start">
                    <p class="lead fw-normal mb-0 me-3"><i class="fa-solid fa-user-pen"></i>&nbsp;&nbsp;Register for</p>
        			&nbsp;&nbsp;&nbsp;
        			<a class="btn btn-warning" href="adminreg" role="button" id="btn4">Admin</a>
        			&nbsp;&nbsp;
                    <a class="btn btn-warning" href="Userreg" role="button" id="btn5">User</a>
                  </div>
              </form>
          </div>
          </div>
        </div>
      </section>
          <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script> 
</body>
</html>