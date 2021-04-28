/*
 * <html> <head> <script> function validateForm() { var x =
 * document.forms["valForm"]["username"].value; if (x == "" ) {
 * alert("Name must be filled out"); return false;
 * valForm
 * 
 * 
 * } }</script></head> <body> <article> <header> <h1> Gift Store</h1> <h2><input
 * type="submit" value="Logout"/> </h2></header>
 * 
 * </article>
 * 
 * <form action="gifttab.do" name = "valForm" onsubmit="return validateForm()"
 * method="post"> User name<input type="text" name="username"><br/> Email ID
 * <input type="text" name="useremail"><br/> Contact Number <input type="number"
 * name="contactno"><br/> Date of birth <input type="date" name="dob" ><br>
 * Gender <input type = "radio" name="gender" value = "Male">Male <input type =
 * "radio" name="gender" value = "Female">Female<br> Password<input
 * type="password" name="upass"><br/> Confirm Password <input type="password"
 * name="conpass"><br/>
 * 
 * <input type="submit" value="Cancel"/> <input type="submit" value="Register"/>
 * </form> <article> <footer> Contact us since 2021 Help</footer> </article>
 * </body> </html>
 * <!DOCTYPE html>  
<html>  
<head>  
<meta name="viewport" content="width=device-width, initial-scale=1">  
<style>  
body{  
  font-family: Calibri, Helvetica, sans-serif;  
  background-color: pink;  
}  
.container {  
    padding: 50px;  
  background-color: gray;  
}  
  
input[type=text], input[type=password],input[type=date],input[type=number], textarea {  
  width: 50%;  
  padding: 15px;  
  margin: 5px 0 22px 0;  
  display: inline-block;  
  border: none;  
  background: #f1f1f1;  
}  
input[type=text]:focus, input[type=password]:focus, input[type=number]:focus, input[type=radio]:focus, input[type=date]:focus {  
  background-color: orange;  
  outline: none;  
}  
 div {  
            padding: 10px 0;  
         }  
hr {  
  border: 1px solid #f1f1f1;  
  margin-bottom: 25px;  
}  
.registerbtn {  
  background-color: #4CAF50;  
  color: white;  
  padding: 16px 20px;  
  margin: 8px 0;  
  border: none;  
  cursor: pointer;  
  width: 50%;  
  opacity: 0.9;  
}  
.registerbtn:hover {  
  opacity: 1;  
}  
</style>  
</head>   
<body>  
 <form action="gifttab.do" method="post"> 
  <div class="container">  
  <center>  <h1> Registration page</h1> </center>  
  <hr>  
  <label> User Name </label>   
<input type="text" name="username" placeholder= "UserName" size="15" required /> 
<label> Email ID </label>   
<input type="text" name="useremail" placeholder= "Email" size="15" required /> 
<label>Contact Number </label>   
<input type="number" name="contactno" placeholder= "Contact no" size="15" required /> 
<label> Date of birth </label>   
<input type="date" name="dob" placeholder= "DOB" size="15" required /> 
<label>Gender </label>   
<input type="radio" name="gender" value = "Male" required />Male 
<input type = "radio" name="gender" value = "Female">Female<br> 
<label> Password </label>   
<input type="password" name="upass" placeholder= "password" required /> 
<label> Confirm Password </label>   
<input type="password" name="conpass" placeholder= "Retype password"  required /> 
</div>  
<div>  
<button type="submit" class="registerbtn">Register</button>  
<button type="submit" class="registerbtn">Cancel</button>  
</div>  
</form>  
</body>  
</html> 
 */