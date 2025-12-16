package net.konic.corejava.encapsulation;

public class BankAccount {
	
	private int Balance;

	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		if (Balance <= 100) {
			this.Balance = balance;
		}
		else {
			
			System.out.println("Invalide Balance :");
		}
	}
public static void main(String[] args) {
	
	BankAccount bank = new BankAccount();

	bank.setBalance(25000);
	int balance = bank.getBalance();
	System.out.println("Balance : " + balance);
	
	
	
}

}

	