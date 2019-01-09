package com.company;

class DisplayOverloding3{

    public void display(String name, int age){
        System.out.println("Display 1");
        System.out.println("My name is: " + name);
    }

    public void display(int age, String name){
        System.out.println("Display 2");
        System.out.println("Age is: " + age + "\nName is: " + name );
    }
}

public class Main {

    public static void main(String[] args) {
	    DisplayOverloding3 object = new DisplayOverloding3();
	    object.display("Abebe", 20);
	    object.display(20, "Abebe");
    }
}
