function signUp(){
	var xml = new XMLHttpRequest();
	    xml.open("POST", "http://localhost:8080/MovieNetwork/signup.html", true);
	    xml.setRequestHeader('mediatype','Application/json');
	    xml.send();
	    
	console.log("User sign up information")
}