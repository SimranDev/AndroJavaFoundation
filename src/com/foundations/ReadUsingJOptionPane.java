package com.foundations;

import javax.swing.*;

public class ReadUsingJOptionPane {
    public static void main(String[] args){

        //String using JOptionPane
        String fName;
        String lName;

        fName = JOptionPane.showInputDialog("Please enter your first name: ");
        lName = JOptionPane.showInputDialog("Please enter your last name: ");

        JOptionPane.showMessageDialog(null, fName+" "+lName);

        //Integer using JOptionPane need to convert into String
        int fNumber;
        int sNumber;
        String input;

        input = JOptionPane.showInputDialog("Enter first number");
        fNumber = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter second number");
        sNumber = Integer.parseInt(input);

        double average = (fNumber+sNumber)/2.0;
        JOptionPane.showMessageDialog(null, "Average is "+average);

        System.exit(0);

    }

}
