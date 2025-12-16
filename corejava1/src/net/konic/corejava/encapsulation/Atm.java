package net.konic.corejava.encapsulation;

//Q6. ATM Withdraw Limit
//
//Question:
//Create an ATM class with private balance.
//Allow withdraw only if amount ≤ balance.
//
//Input:
//
//Balance: 5000
//Withdraw: 6000
//
//Output:
//
//Insufficient balance



public class Atm {
	private int Balance;
	
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
			this.Balance = balance;
		}
		
	public void Withdraw(int Withdraw) {
		if(Balance <=6000) {
			Balance = Withdraw - Balance;
			System.out.println("Withdrawal successful");
	        System.out.println("Remaining Balance: " + Balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}

	public static void main(String[] args) {
		
		Atm atm = new Atm();
		
		atm.setBalance(5000);
		atm.Withdraw(6000);	}
	

}
