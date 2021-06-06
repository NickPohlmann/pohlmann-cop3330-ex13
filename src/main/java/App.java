/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;
import java.lang.Math;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String principalString = myApp.readInput("What is the principal amount? ");
        String rateString = myApp.readInput("What is the rate? ");
        String yearsString = myApp.readInput("What is the number of years? ");
        String compoundsPerYearString = myApp.readInput("What is the number of times the interest is compounded per year? ");
        float principal = myApp.convertInputToFloat(principalString);
        float rate = myApp.convertInputToFloat(rateString);
        int years = myApp.convertInputToInt(yearsString);
        float compoundsPerYear = myApp.convertInputToFloat(compoundsPerYearString);
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }

    private int convertInputToInt(String inputString) {
        int input = Integer.parseInt(inputString);
        return input;
    }

    private float convertInputToFloat(String inputString) {
        float input = Float.parseFloat(inputString);
        return input;
    }
}
