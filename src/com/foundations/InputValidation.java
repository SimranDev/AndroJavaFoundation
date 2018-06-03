package com.foundations;

import javax.swing.*;

public class InputValidation {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Please enter a number between 1 to 100");
        int number = Integer.parseInt(input);

        while(number<1 || number>100){
            JOptionPane.showMessageDialog(null, "Number is invalid");
            input = JOptionPane.showInputDialog("Please enter a number between 1 to 100");
            number = Integer.parseInt(input);
        }

        JOptionPane.showMessageDialog(null, "It's a valid number");
    }
}

