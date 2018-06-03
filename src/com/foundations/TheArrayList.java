package com.foundations;

import java.util.ArrayList;

public class TheArrayList {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<>();

        names.add("Prem");
        names.add("Luyen");
        names.add("Simran");
        names.add("Jishal");
        names.add(4,"Yash");      //adding or replacing element by index number
        names.remove(4);                  //remove element

        for (int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
    }
}
