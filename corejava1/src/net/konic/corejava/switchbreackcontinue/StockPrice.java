package net.konic.corejava.switchbreackcontinue;

public class StockPrice {
	public static void main(String[] args) {
		
		int[] prices = {120, 135, 98, -1};
		
		for (int price: prices) {
			if(price == -1) {
				System.out.println("stop reading at -1");
				
			}
			System.out.println("price:" + price);
		}
		
	}

}
