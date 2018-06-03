package com.foundations;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        firstNumber = keyboard.nextInt();
        System.out.println("Enter your second number: ");
        secondNumber = keyboard.nextInt();
        double average = (firstNumber+secondNumber) / 2.0;
        System.out.println("Average is "+average);

        String fName;
        String lName;

        keyboard.nextLine();    //use this only if you are jumping from Primitive type(e.g. int, float, double, etc)to String
        System.out.println("Enter your first name: ");
        fName = keyboard.nextLine();
        System.out.println("Enter your last name: ");
        lName = keyboard.nextLine();

        System.out.println("Your name is "+ fName +" "+ lName + " and your average is " + average);

    }

}
