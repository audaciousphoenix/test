<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enroll Session</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css" 
integrity="sha256-mmgLkCYLUQbXn0B1SRqzHar6dCnv9oZFPEC1g1cwlkk=" crossorigin="anonymous" />
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
    caption
    {
    	caption-side:top;
    	font-weight:bold;
    	color:black;
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
            <li class="nav-item"><a class="nav-link" href="showAllSessions" id="navigation">Available Sessions</a></li>
                <li class="nav-item"><a class="nav-link" href="#AboutUs" id="navigation">AboutUs</a></li>
                <li class="nav-item"><a class="nav-link" href="#ContactUs" id="navigation">ContactUs</a></li>
            </ul>
        </div>
    </nav>
<div class="row">
        <div class=" col-lg-6 col-xl-6">
            <div class="table-responsive" style="padding: 40px;padding-top: 250px;">
                <table class="table table-striped">
                <caption>Choose Session</caption>
                  <tbody><tr>
                    <th>Session Id</th>
                    <th>Session Description</th>
                  </tr>
                  <c:forEach var="sess" items="${slist }">
                  <form name="frm" id="frm" method="post" action="showsessiondetails">
                  	<tr>
                  	   <input type="hidden" name="sid" value="${sess.sessionId }"/>
                       <td style="text-decoration: none;cursor: pointer;"><input type="submit" class="btn btn-white btn-sm" value="${sess.sessionId }"></td>
                        <td>${sess.sessionDes }</td>
                  	</tr>
                  </form>
                  </c:forEach>
                </tbody>
                </table>
                <p>Click Session Id to view Session details and to enroll
                <span style="float:right;display:inline-block">
                	<a class="btn btn-dark btn-sm" href="showAllSessions" role="button">Clear filters</a>
                </span>
                </p>
                <br>
                
                <div name="filterbyid">
                <form name="formsearch" method="post" action="searchsessionbyid">
                	<span>Search by&nbsp;&nbsp;</span>
                	<div style="width:250px;display:inline-block">
						<select class="form-control" name="selectId" id="selectId">
							<option Selected>Session Id</option>
							<c:forEach var="fls" items="${slist}">
								<option value="${fls.sessionId}">${fls.sessionId}</option>
							</c:forEach>
						</select>
					</div>
					&nbsp;&nbsp;
					<input type="submit" value="Search" class="btn btn-warning"/>
				</form>
				</div>
				<br>
				
				<div name="filterbyskill">
                <form name="formsearch" method="post" action="searchsessionbyskill">
                	<span>Search by&nbsp;&nbsp;</span>
                	<div style="width:250px;display:inline-block">
						<select class="form-control" name="selectSkill" id="selectSkill">
							<option Selected value="skilltype">Skill type</option>
							<c:forEach var="skl" items="${sklist}">
								<option value="${skl.skillType}">${skl.skillType}</option>
							</c:forEach>
						</select>
					</div>
					&nbsp;&nbsp;
					<input type="submit" value="Search" class="btn btn-warning"/>
				</form>
				</div>
              </div>
        </div>
        <div class=" col-lg-6 col-xl-6">
            <form name="enrollform" method="post" action="enrollaction">
            <div class="table-responsive" style="padding: 40px;padding-top: 250px;">
                <table class="table table-striped">
                <caption>Session Description</caption>
                  <tbody><tr>
                    <th>Session Id</th>
                    <th>Session Description</th>
                    <th>SkillSet</th>
                    <th>SessionDate</th>
                    <th>SessionTime</th>
                    <th>Available Slots</th>
                  </tr>
                  <c:forEach var="sObj" items="${dlist }">
                  <tr>
                      <td>${sObj.sessionId}</td>
                      <td>${sObj.sessionDes}</td>
                      <td>${sObj.skillSet}</td>
                      <td>${sObj.sessionDate}</td>
                      <td>${sObj.sessionTime}</td>
                      <td>${sObj.availSlots }</td>
                  </tr>
                  <input type="hidden" name="enrollid" value="${sObj.sessionId }"/>
                  </c:forEach>
                </tbody>
                </table>
             <div style="padding-left: 25px;padding-top: 10px;"><input type="submit" class="btn btn-primary" value="Enroll"></div>
        </div>
    </form>
    <h6 style="font-style:italic;color:red" class="">${msg}</h6>
    </div> 
</div>
</body>
</html>