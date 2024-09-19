package com.techatpark.practices.oops;

public class Car { // created Car class 
    String color;
    String brand;
    int speed;

    public Car(String aColor, String aBrand) { // create constructor for Car
        this.color = aColor; // set the color (this - reference variable that refers to the current object)  
        this.brand = aBrand;
        this.speed = 0; // set the initial speed as 0
    }
    public void start() { // create a method
        this.speed = 20; // give a speed in starting
        System.out.println(brand + " Car with " + color + " color started with speed " + speed); // Display the car details in speed
    }

    public void applyAcc(int speed) {
        this.speed += speed; // increase the value for speed
        System.out.println("Speed: " + this.speed); // display the current speed
    }

    public void stop() {
        System.out.println("Car Stopped..."); 
    }
}
