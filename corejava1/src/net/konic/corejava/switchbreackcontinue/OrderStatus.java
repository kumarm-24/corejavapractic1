package net.konic.corejava.switchbreackcontinue;

public class OrderStatus {
	public static void main(String[] args) {
		
		String status = "SHIPPED";
		
		switch(status) {
		
		case "PLACED":
			System.out.println("Your Order has Been Placed");
			break;
			
		case "SHIPPED":
			System.out.println("Your Order Is On The Way");
			break;
			
		case "OUT FOR DELIVERY":
			System.out.println("Your Order Is Out Of Delivery ");
			break;
			
		case "DELIVERD":
			System.out.println("Your Order Is Deliverd");
			break;
			
		default:
			System.out.println("INVALID OPTION");
			break;
		}
	}
	
	}
	