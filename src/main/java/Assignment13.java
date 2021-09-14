/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 jeremiah pike
 */



import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter the state: ");
        String state = input1.nextLine();

        System.out.println("Enter the amount: ");
        double amount = input1.nextDouble();

        double tax = amount * 0.055;

        if (Objects.equals(state, "WI")) {
            System.out.printf("The tax is: " + (tax) + "\r\n");

            System.out.printf("The total is: " + (tax + amount) + "\r\n");
        } else {
            System.out.printf("The total is: " + (amount) + "\r\n");
        }
    }








}
