package com.company;

class DisplayOverloding2{

    public void display(int side){
        int area = side * side;
        System.out.println("Area of the square =  " + area);
    }

    public void display(double side){
        double area = side * side;
        System.out.println("Area of the square =  " + area);
    }
}
public class Main {

    public static void main(String[] args) {
        DisplayOverloding2 object = new DisplayOverloding2();
        object.display(2);
        object.display(2.5);
    }
}
