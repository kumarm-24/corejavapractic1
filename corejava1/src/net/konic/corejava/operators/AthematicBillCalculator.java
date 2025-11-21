package net.konic.corejava.operators;

import java.util.Scanner;

public class AthematicBillCalculator {
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter item Price");
        float ItemPrice = sc.nextFloat();
        
        System.out.println("Enter ItemQuantity ");
        float ItemQuantity = sc.nextFloat();
        
        float totalPrice = ItemPrice * ItemQuantity;
        double  tax = totalPrice * 0.08d;
        double finalBill = totalPrice + tax ;
        
        System.out.println(" Item Price : " + totalPrice);
        System.out.println(" total tax(0.08) :  "+ tax);
        System.out.println(" fianlBill(ItemPrice * ItemQuantity): " + finalBill);
		
		
	}
}
