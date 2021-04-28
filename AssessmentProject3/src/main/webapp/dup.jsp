<!DOCTYPE html>  
<html>  
<head> 
  <script type = "text/javascript">
function validateForm() 
{ var x = document.forms["valForm"]["username"].value;
  if ((x.length <3) || (x.length > 18)) 
 {
 alert("Invalid UserName. Length must be between 3 and 18"); 
 return false;
 } 
  var password =document.forms["valForm"]["upass"].value;
  var conpassword =document.forms["valForm"]["conpass"].value;
  if(password !=conpassword)
  {
  alert ("Confirm password must be same");
  return false;
  }
if (!(password.match(/[a-z]/g) && password.match(/[A-Z]/g) && password.match(/[0-9]/g) && password.match(/[^a-zA-Z\d]/g) && password.length >= 8 && password.length <= 18))
{
	alert ("Invalid Password!! Password must contain Atleast 8 characters, 1 Uppercase letter, 1 lowercase letter, 1 digit, 1 special character and should not exceed 18 characters ");
	return false;

	//return true;
}
/* else
	{
	alert ("Invalid Password!! Password must contain Atleast 8 characters, 1 Uppercase letter, 1 lowercase letter, 1 digit, 1 special character and should not exceed 18 characters ");
	return false;
	}   */
}
</script>

<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  

table.center {
  margin-left: auto; 
  margin-right: auto;
  
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

label { display: inline-block; width: 210px; text-align: left; }
  
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
  
}  
article {
  background-color: #F1F1F1;
  align: center;
  padding: 20px;
  height: 15px;
  }

header {
overflow: hidden;
  background-color: #333;
  align: center;
  
  }
  .header-right
  
  
  { 
margin : 0;
margin-top:0;
  float:right; }
  
.logoutbtn {  
   background-color: navy;  
  color: white;  
  padding: 16px 60px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 10%; 
}  

.registerbtn:hover {  
  opacity: 1;  
}  
</style>  
</head>   
<body>  
 <article> <header>
 
<p style="font-size:50px; color:white; margin-left: 20px;"> Gift Store</p>
<div class ="header-right">

<h2><input type="submit" class= "logoutbtn" value="Logout"/></h2></div></div></header>
</article>
 <form action="gifttab.do" method="post" name= "valForm" onsubmit="return validateForm()"> 

 <table class= "center">
 
    <tr>
        <td>
  <div class="container">  
  <center>  <h1> Registration page</h1> </center>  
  
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
<button type="submit" class="registerbtn">Register</button>  
<button type="submit" class="registerbtn">Cancel</button>  

</div>  
<td>
<tr>
</table>
 <article> <footer> Contact Us since 2021 Help</footer> </article>
</form>  
</body>  
</html> 