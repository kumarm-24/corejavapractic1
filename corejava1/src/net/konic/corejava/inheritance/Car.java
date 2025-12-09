package net.konic.corejava.inheritance;

public class Car extends Vehicle {

    int speed = 120;

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Brand: " + c.brand);
        System.out.println("Speed: " + c.speed);
    }
}
