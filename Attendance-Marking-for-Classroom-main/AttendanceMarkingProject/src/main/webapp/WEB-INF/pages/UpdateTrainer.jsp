<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Trainer</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
     rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
            <ul class="navbar-nav" style="margin-left: auto;">
            <li class="nav-item"><a class="nav-link" href="adminhome" id="navigation">Admin Home</a></li>
                <li class="nav-item"><a class="nav-link" href="trainerreg" id="navigation">Add Trainer</a></li>
                <li class="nav-item"><a class="nav-link" href="sessionadd" id="navigation">Add Session</a></li>
                <li class="nav-item"><a class="nav-link" href="skilladd" id="navigation">Add Skill</a></li>
                <li class="nav-item"><a class="nav-link" href="updatetrainer" id="navigation">Update Trainer</a></li>
                <li class="nav-item"><a class="nav-link" href="deletetrainer" id="navigation">Delete Trainer</a></li>
                <li class="nav-item"><a class="nav-link" href="login" id="navigation" onclick="window.location.reload()">LogOut</a></li>
            </ul>
        </div>
    </nav>
<section class="vh-100">

        <div class="container h-100" style="padding-top: 70px">
          <div class="row d-flex justify-content-center align-items-center h-100" > 
            <div class="col-lg-12 col-xl-11" >
            
              <div class="card text-black" style="border-radius: 25px;box-shadow: inset 2px 2px 4px #d1d9e6,
              inset -2px -2px 4px #f9f9f9;">
              
              <div class="card-header h1 fw-bold mb-5 mx-1 mx-md-4 mt-4" style=" border-top-left-radius: 25px;border-top-right-radius: 25px;">Update Trainer</div>
              
                <div class="card-body p-md-7" >
                  <div class="row justify-content-center">
                    <div class="col-md-10 col-lg-4 col-xl-5 order-2 order-lg-1">
      
                      <form class="mx-1 mx-md-4" name="form1" method="post" action="trainerupdateprocess">
      
      					<!--Trainer id Field-->
                        <div class="d-flex flex-row align-items-center mb-4">	
                          <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                          <div class="form-outline flex-fill mb-0">
                            <label class="form-label" for="form3Example4c">Trainer Id</label>
                             <select class="form-control" name="trainerId" id="trainerId">
                      			<option selected value="0">Select Trainer Id...</option>
                      			<c:forEach var="fls" items="${tlist}">
                      			<option value="${fls.trainerId}">${fls.trainerId}</option>
                      			</c:forEach>
                      		</select>
                          </div>
                        </div>                  
      
      					<!--TrainerName Field-->
                        <div class="d-flex flex-row align-items-center mb-4">
                          <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
                          <div class="form-outline flex-fill mb-0">
                            <label class="form-label" for="form3Example4c">Trainer Name</label>
                            <input type="text" id="trainerName" name="trainerName" class="form-control" placeholder="Ex.Miller Jhon" required/>
                          </div>
                        </div>
      					
      					<!--Contact Number  Field-->
                        <div class="d-flex flex-row align-items-center mb-4">
                          <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                          <div class="form-outline flex-fill mb-0">
                            <label class="form-label" for="form3Example4cd">Contact Number</label>
                            <input type="text" id="contactNumber" name="contactNumber" class="form-control" 
                            placeholder="EG.999-999-9999" pattern="[7-9]{1}[0-9]{9}" title="Please enter valid phone number"
                            onKeyPress="if(this.value.length==10) return false;" 
                            oninput="this.value = this.value.replace(/[^0-9.]/g, '').replace(/(\..*)\./g, '$1');"  required/>
                          </div>
                        </div>
                        
                        <!-- Email Id Field-->
                        <div class="d-flex flex-row align-items-center mb-4">
                          <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                          <div class="form-outline flex-fill mb-0">
                            <label class="form-label" for="form3Example4cd">Email Id</label>&nbsp;&nbsp;&nbsp;
                            <input type="email" name="email" id="email" class="form-control" placeholder="EX.jhon@gmail.com">
                          </div>
                        </div>
                        
                        <!-- SkillSet Field-->
                        <div class="d-flex flex-row align-items-center mb-4">
                          <i class="fas fa-key fa-lg me-3 fa-fw"></i>
                          <div class="form-outline flex-fill mb-0">
                            <label class="form-label" for="form3Example4cd">Skill Set</label>
                         <!-- <input type="text" id="form3Example4cd" id="skillSet" name="skillSet" placeholder="SkillSet" class="form-control" />
                          --> 
                          
                          <select class="form-control" name="skillSet" id="skillSet">
                      <option Selected>Select Skill</option>
                      <c:forEach var="fls" items="${slist}">
                      	<option value="${fls.skillType}">${fls.skillType}</option>
                      </c:forEach>
                      
                      </select>
                            
                          </div>
                        </div>

                        <!--Register Button-->          
                        <div class="d-flex justify-co ntent-center mx-4 mb-3 mb-lg-4">
                           <input type="submit"  value="Update" class="btn btn-primary"/>
                        </div>
       						<h3 style="font-family: sans-serif;color: black;font-size: 20px" class="" >${msg}</h3>
                      </form>
                    </div>
                    <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
      
                      <img src="https://i.pinimg.com/564x/af/89/e2/af89e2a13c934ccf7715ef3506a66162.jpg" 
                      style="border-radius: 25px;" class="img-fluid" alt="Sample image">
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
</body>
</html>

