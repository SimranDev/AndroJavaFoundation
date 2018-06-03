package com.foundations;

import javax.swing.*;

public class UserControlledLoop {
    public static void main(String[] args) {

        int sqrNumber;

        String input = JOptionPane.showInputDialog("How many time you want number squared?");
        sqrNumber = Integer.parseInt(input);

        System.out.println("Number              Square");
        System.out.println("--------------------------");

        for (int i=1; i <= sqrNumber; i++){
            System.out.println(i +"\t\t\t\t\t" + i*i);
        }
    }

}
