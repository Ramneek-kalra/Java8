package functionalInterface.predefined.Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class UserAuthentication {
	
	private static List<User> userList = new ArrayList<>(Arrays.asList(new User[]{
			new User("Rahul", "Krishna"),
			new User("Balram", "Krishna"),
			new User("Madhu", "Krishna"),
			new User("Subala", "Krishna")
	}));
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Your Username");
		String username = scanner.nextLine();
		
		System.out.println("Your password");
		String password = scanner.nextLine();
		
		scanner.close();
		
		validateUser(username, password);
	}
	
	public static void validateUser(String username,String pwd){
		Predicate<User> userAuthenticator = (user)->user.username.equals(username) && user.pwd.equals(pwd);
		boolean isValid = false;
		for(User user:userList)
			if(userAuthenticator.test(user)){
				isValid = true;
				System.out.println("\nvalid user");
				break;
			}
		if(!isValid){
			System.out.println("\nInvalid username or password");
		}
	}
}

class User{
	String username;
	String pwd;
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
}
