package entities;

public class Application {

	public static void main(String[] args) {
		Sistema system = new Sistema();
		Usuario user  = new Usuario("Gilvane Amaro", "gilvane@mail.com","gilvaneamaro","123456");
		
		System.out.println(system.login(user, "gilvaneamar","123456"));
				

	}

}
