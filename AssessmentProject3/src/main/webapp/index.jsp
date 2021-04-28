
<%@ page isELIgnored = "false" %>>
<!DOCTYPE html>  
<html>  
<head>
 
 <jsp:include page="validation.jsp"></jsp:include>
 <script>
 function clickinner() {
	    window.location.href = 'login.jsp';
	    }
 function clickedit() {
	    window.location.href = 'edit.jsp';
	    }
 </script>

<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  

table.center {
  margin-left: auto; 
  margin-right: auto;
  margin-top: auto;
  
}
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
  // background-image: radial-gradient(pink, blue, purple);
  background-image:radial-gradient(rgba(0, 255, 260, 1.5),rgba(255, 0, 255, 0.5));
}  
.container {  
    padding: 50px;  
  background-color: Dodgerblue;  
}  

label { display: inline-block; width: 210px; text-align: center; font-family:  }
  
input[type=text],input[type=email], input[type=password],input[type=tel],input[type=date],input[type=number], textarea {  
  width: 50%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
  
}  
input[type=text]:focus, input[type=password]:focus, input[type=number]:focus, input[type=radio]:focus, input[type=date]:focus, input[type=email]:focus, input[type=tel]:focus {  
  background-color:LightSkyBlue;  
  outline: none;  
}  
 div {  
            padding: 2px 0;  
             font-family: "Times New Roman", Times, serif;
             font-size: 20px;
             color: brwon;
            
         }   
         
input
{
  width: 10%;
  }    
       
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: navy;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 49.52%;  
  opacity: 0.9;  
  font-size: 20px;
}  
/* article {
  background-color: #F1F1F1;
  align: center;
  padding: 20px;
  height: 15px;
  } */

header {
overflow: hidden;
  background-color: #333;
  align: center;
   height: 100px;
  }
  footer {
overflow: hidden;
  background-color: #333;
  align: center;
  padding: 3px 0;  
  color: white;
  text-align: center;
  font-size: 20px;
  position: fixed;
  left: 0;
  bottom: 10px;
 
  width: 100%;

  }
  .header-right
  { 
margin : 0;
margin-top:2px;
  float:right; }
  
.logoutbtn {  
background-color: navy;  
  color: white;  
  padding: 20px 5px;  
  margin: 15px 20px;  
  border: none;  
  cursor: pointer;  
  width: 9%;  
  opacity: 0.9;  
    text-align: center;  
  font-size: 20px;
  float:right;
 border-radius:8px;
}  

.registerbtn:hover {  
  opacity: 1;  
}  

h1
{
color:white;
float:left;
font-size: 40px;
margin-left : 20px;
margin-top:20px;

}
h2
{
color:yellow;
float:center;
font-size: 50px;
margin-top:0;
font-family: "cursive",	Brush Script MT;
}

button
{
border-radius:8px;
}
</style>  
</head>   
<body>  
 <article> <header>
<div class ="header">
<h1>Gift Store</h1>
<input type="submit" class = "logoutbtn" onClick="javascript:clickinner()" value="Login"></div></header>
<!-- <button type="submit" class="registerbtn" onClick="javascript:clickinner()">Edit</button></div></header> -->
</article>

 <form action="gifttab.do" method="post" name= "valForm" onsubmit="return validateForm()"> 

 <table class= "center">
 
    <tr>
        <td>
  <div class="container">  
<%--   <div><p style="font-size: 40px ; color:maroon "> ${msg}</p></div> --%>
  <center>  <h2> Registration page</h2> </center>  
  
  <hr>  
  <label> User Name </label>   
<input type="text" name="username" placeholder= "UserName"  pattern = "[a-zA-Z0-9]+" title = "Special characters are not allowed" required /> <br>
<label> Email ID </label>   
<input type="email" name="useremail" placeholder= "Email"  required /> <br>
<label>Contact Number </label>   
<input type="tel" name="contactno" placeholder= "Contact no"  pattern= "[0-9]{10}" title = "Enter 10 gitit contact number"  required /> <br>
<label> Date of birth </label>   
<input type="date" name="dob" placeholder= "DOB" title="Field must not be null"  required /> <br>
<label>Gender </label>   
<input type="radio" name="gender" value = "Male" required />Male 
<input type = "radio" name="gender" value = "Female">Female<br> <br>
<label> Password </label>   
<input type="password" name="upass" placeholder= "password" required /> <br>
<label> Confirm Password </label>   
<input type="password" name="conpass" placeholder= "Retype password"  required /> 
<button type="submit" class="registerbtn" >Register</button>  
<button type="submit" class="registerbtn">Cancel</button>  
   
</div>  
<td>
<tr>
</table>
 <article> <footer><p style=" float:center"> &#169;since 2021 </p> </footer> </article>
</form>  
</body>  
</html> 