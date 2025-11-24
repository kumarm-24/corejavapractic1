package net.konic.corejava.switchbreackcontinue;

public class EmailExample {
	public static void main(String[] args) {
		
		String[] emails = {"a@gmail.com", "abc", "test@yahoo.com"}; 
		
		for (String email : emails) {
			if (!email.contains("@")) {
				continue;
				
			}
			System.out.println(email);
		}
	}

}
