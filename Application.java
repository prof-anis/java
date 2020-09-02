import java.util.*;


class Application{

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String  userInput = obj.nextLine();

		Auth auth = new Auth();

		boolean can_login = auth.login(userInput);

		if (can_login == true) {
			System.out.println("logged in");
		}
		else{
			System.out.println("can not log in");
		}
	}
	
}

class Auth{
	public static void main(String[] args) {
		
	}
	public Boolean login(String username){
		String[] dbUsernames = this.fetch();
		boolean is_in_db = false;
		for (String name : dbUsernames ) {
			if (username.equals(name)) {
				is_in_db = true;
			}
		}

		return is_in_db;


	}

	private String[] fetch(){
		String[] db = {"tobi","john","james"};
		return db;
	}

	public void register(){

	}

	public void forgotPass(){
		
	}

}

