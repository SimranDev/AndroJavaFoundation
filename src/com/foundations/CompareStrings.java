package com.foundations;

import javax.swing.*;

public class CompareStrings {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter name 1");
        String name2 = JOptionPane.showInputDialog("Enter name 2");

        //if names are hardcoded we can use <name1 == name2> coz literals have same memory allocation in this case
        //<name.compareTo(name2) == 0>    *can use compareTo method also
        if(name1.equals(name2)){
            JOptionPane.showMessageDialog(null, "Both names are same");
        }
        else{
            JOptionPane.showMessageDialog(null, "Names are not same");
        }

        System.exit(0);
    }
}
