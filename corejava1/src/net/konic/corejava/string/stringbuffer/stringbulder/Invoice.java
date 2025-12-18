package net.konic.corejava.string.stringbuffer.stringbulder;

public class Invoice {
	    public static void main(String[] args) {
	        StringBuilder msg = new StringBuilder("Invoice Generated");
	        msg.insert(8, "101 ");

	        System.out.println(msg);
	    }
	}


