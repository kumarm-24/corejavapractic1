package net.konic.miniproject;

	public class UserService {

	    public void registerUser(String name, int age, String email)
	            throws InvalidAgeException, InvalidEmailException {

	        if (age < 18) {
	            throw new InvalidAgeException("Age must be 18 or above");
	        }

	        if (!email.contains("@")) {
	            throw new InvalidEmailException("Email must contain @ symbol");
	        }

	        System.out.println("✅ User Registered Successfully");
	        System.out.println("Name  : " + name);
	        System.out.println("Age   : " + age);
	        System.out.println("Email : " + email);
	    }
	}

