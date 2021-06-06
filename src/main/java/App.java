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
        double principal = myApp.convertInputToDouble(principalString);
        double interestRatePercentage = myApp.convertInputToDouble(rateString);
        int years = myApp.convertInputToInt(yearsString);
        double compoundsPerYear = myApp.convertInputToDouble(compoundsPerYearString);
        double interestRateDecimal = myApp.computeInterestRateDecimal(interestRatePercentage);
        double totalSavings = myApp.computeTotalSavings(principal,years,interestRateDecimal,compoundsPerYear);
        String outputSring = myApp.generateOutputSring(principal,interestRatePercentage, years, totalSavings, compoundsPerYear);
        myApp.printOutputString(outputSring);
    }

    private void printOutputString(String outputSring) {
        System.out.println(outputSring);
    }

    private String generateOutputSring(double principal, double interestRatePercentage, int years, double totalSavings, double compoundsPerYear) {
        return "$" + principal + " invested at " + interestRatePercentage +"% for " + years + "years compounded " + compoundsPerYear + " times per year is $" + totalSavings;}

    private double computeTotalSavings(double principal, int years, double interestRateDecimal, double compoundsPerYear) {
        double totalSavings = principal * Math.pow((1 + (interestRateDecimal / compoundsPerYear)),(compoundsPerYear*years));
        totalSavings = (Math.floor(totalSavings*100)/100);
        return totalSavings;
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

    private double convertInputToDouble(String inputString) {
        double input = Double.parseDouble(inputString);
        return input;
    }

    private double computeInterestRateDecimal(double interestRatePercentage) {
        double interestRateDecimal =  interestRatePercentage / 100;
        return interestRateDecimal;
    }
}
