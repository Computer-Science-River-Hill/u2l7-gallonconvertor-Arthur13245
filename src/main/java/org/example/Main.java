package org.example; //DO NOT DELETE
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double gallons;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of gallons:");
        gallons = input.nextInt();
        System.out.println("In " + gallons + " gallons there are:");
        double quarts = gallons * 4;
        System.out.println(quarts + " quarts");
        double pints = quarts * 2;
        System.out.println(pints + " pints");
        double cups = pints * 2;
        System.out.println(cups + " cups");
        double tablespoon = cups * 16;
        System.out.println(tablespoon + " tablespoon");

    }
}