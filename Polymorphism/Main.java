package com.company;


public class Main {

    public static void main(String[] args) {
        Shapes[] list = new Shapes[3];
     	// create an array of Shape reference variables
        list[0] = new Circle();		// attach a Circle to first array slot
        list[1] = new Rectangle();		// attach a Rectangle to second slot
        list[2] = new Triangle();


        for (int i = 0; i < list.length; i++) {
            System.out.println("List " + i);
            list[0].draw();

        }
    }
}
