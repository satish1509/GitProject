package inheritance;

public class User {

	public static void main(String[] args) {
		GuestUser guest = new GuestUser();
		guest.read();
		
		Developer dev = new Developer();
		dev.read();
		dev.write();
		
		Admin adm = new Admin();
		adm.read();
		adm.write();
		adm.manage();

	}

}
