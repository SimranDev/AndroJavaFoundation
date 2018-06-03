package com.foundations;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingToFiles {

    public static void main(String[] args) throws IOException {

        PrintWriter outputFile = new PrintWriter("OutputFile.txt");

        outputFile.println("This is line 1");
        outputFile.println("This is line 2");
        outputFile.println("This is line 3");

        outputFile.close();
    }
}
