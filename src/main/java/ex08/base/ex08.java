package ex08.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many people? ");
        String str1 = input.nextLine();
        int numPeople = Integer.parseInt(str1);

        System.out.print("How many pizzas do you have? ");
        String str2 = input.nextLine();
        int numPizzas = Integer.parseInt(str2);

        System.out.print("How many slices per pizza? ");
        String str3 = input.nextLine();
        int numSlices = Integer.parseInt(str3);

        int totalSlices = numSlices * numPizzas;
        System.out.println(numPeople + " with " + numPizzas + " pizzas (" + totalSlices + " slices)");

        int slicesPer = totalSlices / numPeople;
        int leftOver = totalSlices % numPeople;

        System.out.println("Each person gets " + slicesPer + " slices of pizza.");
        System.out.println("There are " + leftOver + " left over pieces. ");

    }
}
