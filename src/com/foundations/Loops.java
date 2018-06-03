package com.foundations;

public class Loops {
    public static void main(String[] args){

        //While loop
        int x=0; //loop control variable

        while(x<5){
            System.out.print(x);
            x++;
        }
        System.out.println("");

        //do-while loop
        int y=0;
        do{
            System.out.print(y);
            y++;
        }
        while(y<5);
        System.out.println("");

        //for loop
        for(int z=0; z<5; z++){
            System.out.print(z);
        }

    }
}
