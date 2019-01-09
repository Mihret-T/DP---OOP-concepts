package com.company;

class Person{
    private String name;
    protected char sex;
    public int age;

    Person(){
        name = null;
        sex = 'U';
        age = 0;
    }
    Person(String name, char sex, int age){
        this.name = name;
        this.sex =  sex;
        this.age = age;
    }
    String getName(){
        return name;
    }
    void Display(){
        System.out.println("name: " + name + " sex: " + sex + " age: " + age);
    }

}
class Student extends Person{
    private int rollNo;
    String branch;
    Student(String name, char sex, int age, int rollNo, String branch){
        super(name,sex,age);
        this.rollNo = rollNo;
        this.branch = branch;
    }
    @Override
    void Display(){
        System.out.println("name: " + getName()+ " sex: " + sex + " age: " + age + " rollNo: " + rollNo + " branch: " + branch);
    }
}

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Abebe", 'M', 20, 1, "computer science");
        Student  s2 = new Student("chaltu", 'F',  21, 2, "software enginnering");

        System.out.println("Student 1 details: ");
        s1.Display();

        Person p1 = new Person("kebede", 'M', 30);
        System.out.println("Person 1 details: ");

        p1.Display();
    }
}

