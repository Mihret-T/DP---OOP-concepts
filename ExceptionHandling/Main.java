package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            //int num=10/0;
            int array[] = {1, 2 ,3};
            array[3] = 100;
        }
        catch (ArithmeticException e) {
            System.out.println("Catch clause due to Exception :  " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch clause due to Exception : " + e);
        }
        finally{
            System.out.println("Inside the finally block");
        }
        System.out.println("End Of Main");

    }
}
