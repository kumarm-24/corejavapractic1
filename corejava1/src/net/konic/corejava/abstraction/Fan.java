package net.konic.corejava.abstraction;

abstract class Fan {

    abstract void rotate();

    void switchon() {
        System.out.println("Fan Switch On");
    }
}

class CellingFan extends Fan {

    void rotate() {
        System.out.println("Fan is Rotating");
    }

}


	
		
	
	


