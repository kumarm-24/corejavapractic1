package net.konic.corejava.encapsulation;

//Q9. Email Validation
//
//Question:
//Create a UserProfile class with private email.
//Email must contain @.
//
//Input:
//
//Enter Email: usergmail.com
//
//Output:
//
//Invalid email

	public class UserProfile {

	    private String email;

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        if (email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("Invalid email");
	        }
	    }

	    public static void main(String[] args) {

	        UserProfile user = new UserProfile();

	        user.setEmail("usergmail.com");       
	        user.setEmail("kumar424.km@gmail.com"); 

	        System.out.println("User Email: " + user.getEmail());
	    }
	}


