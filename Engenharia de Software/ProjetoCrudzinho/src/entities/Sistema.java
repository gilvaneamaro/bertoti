package entities;

public class Sistema {
	public String login(Usuario user, String username, String password) {
		if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return "Sucess!";
		}
		else if(user.getUsername().equals(username) && !user.getPassword().equals(password) ) {
			return "Invalid password";
		}
		else if(!user.getUsername().equals(username) && user.getPassword().equals(password)) {
			return "Invalid username";
		}
		return "Invalid password and username";
	}	
}

