/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Tony Tang
 */

package org.example;
import java.util.Scanner;

public class assignment14 {

    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double order = scan.nextDouble();

        System.out.print("What is the state? ");
        String state = scan.next();

        double tax;

        if(state.equalsIgnoreCase("WI")) {

            System.out.printf("The subtotal is $%.2f\n", order);

            tax = (5.5/100) * order;
            System.out.printf("The tax is $%.2f\n", tax);

        } else {
            tax = 0;
        }

        double total = order + tax;

        System.out.printf("The total is $%.2f\n", total);

    }
}