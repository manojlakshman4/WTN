package abstractionPackages.exceptionHandling;

class InvalidCountryException extends Exception {
	public InvalidCountryException() {
		super();
		System.out.println("InvalidCountryException occured");
		System.out.println("User Outside India  cannot be registered");
	}
}

public class UserRegistration {
	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India")) {
			throw new InvalidCountryException();
		}
		else {
			System.out.println("User registration done successfully");
		}
	}
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		try {
			registration.registerUser("Mini", "India");
			registration.registerUser("Mickey", "US");
		} 
		catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
}
