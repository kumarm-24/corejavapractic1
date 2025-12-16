package net.konic.corejava.encapsulation;

//Q5. Product Price Control
//
//Question:
//Create a Product class with private price.
//Price cannot be negative.
//
//Input:
//
//Enter Price: -500
//
//Output:
//
//Invalid price

public class Product {
	private int ProductPrice;

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		if(ProductPrice <= -500) {
			this.ProductPrice = productPrice;
		}
		else {
			System.out.println("Invalid Price");
		}
	}
	public static void main(String[] args) {
		
		Product product = new Product();
		
		product.setProductPrice(800);
		int ProductPrice  = product.getProductPrice();
		System.out.println("Product Price : " + ProductPrice);
	}
	

}
