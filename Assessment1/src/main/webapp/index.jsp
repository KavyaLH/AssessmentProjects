<html>
<body>
<h2>Hello World!</h2>
	<form action="teamIPL.do">
	Enter the values to insert the record<br>
		Team ID<input type="number" name="teamId"> Team name<input
			type="text" name="teamName"> HomeGround<input type="text"
			name="homeGround"> Captain<input type="text" name="captain">
		<input type="submit" value="Register">
	</form>
	
	<form action="teamIPLdel.de">
	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------<br>
		Enetr Team ID to delete<input type="number" name="teamId">
			<input type="submit" value="Delete">
	</form>
	
	<form action="teamIPLupdate.up">
	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------<br>
	Enter values to update the record<br>
		Team ID<input type="number" name="teamId"> Team name<input
			type="text" name="teamName"> HomeGround<input type="text"
			name="homeGround"> Captain<input type="text" name="captain">
			<input type="submit" value="Update">
	</form>
	
	<form action="teamIPLget.get">
	------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------<br>
		Enter Team ID to view the record<br><input type="number" name="teamId"> 
			<input type="submit" value="View">
	</form>
	
	
</body>
</html>
