package net.konic.corejava.string.stringbuffer.stringbulder;

public class DeletOtp {
	    public static void main(String[] args) {
	        StringBuilder otp = new StringBuilder("12345");
	        otp.deleteCharAt(otp.length() - 1);

	        System.out.println("Updated OTP: " + otp);
	    }
	}


