package net.konic.corejava.switchbreackcontinue;

import java.util.Scanner;

public class ATMmenu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		
		System.out.println("/------ATM menu------/");
		System.out.println("1. check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Exit");
		System.out.println("5.Enter Option");
		int atm = sc.nextInt();
		
		switch(atm) {
		case 1:
			System.out.println("Balance Amount Rs.10,000");
			break;
			
		case 2:
			System.out.println("Deposite Successful");
			break;
		case 3:
			System.out.println(" WithDrawn Successful");
			break;
		case 4: 
			System.out.println("Exit ThankYou");
			break;
			
		default:
			System.out.println("Invalid Option");
			
		}
		
		if (atm == 1) {
			break;
		}
		
    }
  }
}
