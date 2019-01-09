package com.company;

class DisplayOverloding{
    public void display(int lenght, int width){
        int area = lenght * width;
        System.out.println("Area of the rectangle = " +area);
    }

    public void display(int side){
        int area = side * side;
        System.out.println("Area of the square = " + area);
    }
}

public class Main {

    public static void main(String[] args) {
        DisplayOverloding object = new DisplayOverloding();
        object.display(2, 3); //display the area of the rectangle
        object.display(5);  //display area of the square
    }
}

