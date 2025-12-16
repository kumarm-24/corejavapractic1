package net.konic.corejava.encapsulation;

//Q4. Mobile PIN Security
//
//Question:
//Create a Mobile class with private pin.
//PIN must be exactly 4 digits.
//
//Input:
//
//Enter PIN: 123
//
//Output:
//
//Invalid PIN
//

public class MobilePin {
	private int MobilePin;

	public int getPin() {
		return MobilePin;
	}

	public void setPin(int pin) {
		if ( pin >=1000 && pin<=9999) {
			this.MobilePin = pin;
		}
		else {
			System.out.println("Invalide Pin");
		}
	}
	public static void main(String[] args) {
		
		MobilePin pin = new MobilePin();
		
		pin.setPin(1312);
        int MobilePin = pin.getPin();
	    System.out.println("Mobile Pin : " + MobilePin);
	}
	
	

}
