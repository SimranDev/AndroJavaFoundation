package com.foundations;

import javax.swing.*;

public class DecisionStructures {
    public static void main(String[] args) {

        int number;
        String myInput;

        myInput = JOptionPane.showInputDialog("Enter your scores");
        number = Integer.parseInt(myInput);

        if(number <= 50){
            if(number>=45){
                JOptionPane.showMessageDialog(null, "You can write re-assessment");
            }
            else{
                JOptionPane.showMessageDialog(null, "You failed!");
            }
        }
        else{
            if (number>=75){
                JOptionPane.showMessageDialog(null, "You have a distinction");
            }
            else{
                JOptionPane.showMessageDialog(null,"You passed!");
            }
        }


    }
}
