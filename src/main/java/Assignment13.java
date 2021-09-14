/*
 *  UCF COP3330 Fall 2021 Assignment 13 Solution
 *  Copyright 2021 jeremiah pike
 */


import java.util.Calendar;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        int p = input1.nextInt();

        System.out.println("Enter the interest rate: ");
        double r = input1.nextDouble();

        System.out.println("Enter the years: ");
        int t = input1.nextInt();

        System.out.println("Enter how many times per year it is compounded: ");
        int n = input1.nextInt();

        int rate = (int) (r/100);
        int number = (p*(1+((rate/100)/n)));
        int power = (n*t);
        double interest = (number ^ power);

        System.out.printf("After " + t + " years, the investment will be worth: " + (p + interest) + "dollars");





    }
}
