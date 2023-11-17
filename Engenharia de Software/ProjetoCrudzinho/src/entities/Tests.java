package entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void testLogin() {
		Sistema system = new Sistema();
		Usuario user  = new Usuario("Gilvane Amaro", "gilvane@mail.com","gilvaneamaro","123456");
		
		assertEquals(system.login(user, "gilvaneamaro","123456"),"Sucess!");
		
	}
	@Test
	void testWrongUsername() {
		Sistema system = new Sistema();
		Usuario user  = new Usuario("Gilvane Amaro", "gilvane@mail.com","gilvaneamaro","123456");
		
		assertEquals(system.login(user, "gilvaneamar","123456"),"Invalid username");
		
	}
	@Test
	void testWrongPassword() {
		Sistema system = new Sistema();
		Usuario user  = new Usuario("Gilvane Amaro", "gilvane@mail.com","gilvaneamaro","123456");
		
		assertEquals(system.login(user, "gilvaneamaro","12345"),"Invalid password");
		
	}
	
	@Test
	void testWrongUsernamePassword() {
		Sistema system = new Sistema();
		Usuario user  = new Usuario("Gilvane Amaro", "gilvane@mail.com","gilvaneamaro","123456");
		
		assertEquals(system.login(user, "gilvaneamar","12345"),"Invalid password and username");
		
	}

}
