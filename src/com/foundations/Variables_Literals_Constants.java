package com.foundations;

public class Variables_Literals_Constants {
    public static void main(String[] args){
        System.out.println("I will conquer you!");

        int firstNumber = 5;
        final int secondNumber = 6;   //final keyword to make a constant (can't change)
        double average = (firstNumber+secondNumber)/2.0;  //need to use <(double)(firstNumber + secondNumber)>
        System.out.println("Average is "+average);        //or <2.0> to get proper double value i.e. 5.5

        String fName = "Simran";
        String lName = "Singh";
        System.out.println("My name is "+ fName +" "+ lName);

        boolean value = true;
        System.out.println("Boolean value is "+value);


        char letter1 = 'S';
        char letter2 = '3';
        System.out.println(letter1 + ", " + letter2);



    }
}
