<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
</head>
<body>

</body>
</html>