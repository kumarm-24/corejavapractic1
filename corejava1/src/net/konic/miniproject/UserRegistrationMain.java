package net.konic.miniproject;

	import java.util.Scanner;

	public class UserRegistrationMain {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        UserService service = new UserService();

	        try {
	            System.out.print("Enter Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Age: ");
	            int age = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Enter Email: ");
	            String email = sc.nextLine();

	            service.registerUser(name, age, email);

	        } catch (InvalidAgeException e) {
	            System.out.println("❌ Age Error: " + e.getMessage());

	        } catch (InvalidEmailException e) {
	            System.out.println("❌ Email Error: " + e.getMessage());

	        } catch (Exception e) {
	            System.out.println("❌ General Error: " + e.getMessage());

	        } finally {
	            System.out.println("🔚 Registration Process Completed");
	            sc.close();
	        }
	    }
	}
