package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n ********fileds an methods of the child class*****************");
        B b = new B(); //B reference and a B object
        System.out.println(b.j); //2
        System.out.println(b.className); // subclass
        System.out.println(b.display()); //display in B

        System.out.println("\n ************fileds an methods of the super class instatianted with the child class***********");
        A a = new B(); //A reference but a B object
        //default constructor of the subclass calls the constructor of A
        System.out.println(a.j); //1
        System.out.println(a.className); //super class
        System.out.println(a.display()); //display in B

        System.out.println("\n *******fileds an methods of the super class**********");
        A aa = new A(); //A reference and an A object
        //default constructor of the subclass calls the constructor of the base class
        System.out.println(aa.j); //1
        System.out.println(aa.className); //superclass
        System.out.println(aa.display()); //display in A

    }
}

class A {
    int j = 1;
    String className = "super class / parent class";

    String display() {
        return "Class Name " + className + "\nint vslue " + j;
    }
}


class B extends A{
    int j = 2;
    String className = "sub class/ child class";
    @Override
    String display() {
        return "Class Name " + className + "\nint vslue " + j;
    }
}