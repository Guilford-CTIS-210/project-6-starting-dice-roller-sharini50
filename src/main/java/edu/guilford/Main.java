package edu.guilford;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner myScan = new Scanner(System.in);
        System.out.println("This program rolls a number of dice and totals the rolls.");
        System.out.print("How many sides should the dice have? ");
        int sides = myScan.nextInt(); // takes input about sides
        System.out.print("How many dice do you want to roll? ");
        // System.out.println("the sides is " + sides);
        int number = myScan.nextInt(); // takes input about number of dices

        int sum = 0;

        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) {
            int diceRoll;
            diceRoll = rand.nextInt(1, sides); // randomly generate a number between 1 and sides
            sum += diceRoll; // adds sum to diceRoll
            // System.out.println("sum of " + i + "d" + sides + " = " + sum);
        }
        System.out.println("Rolling " + number + "d" + sides + " = " + sum);
        myScan.close(); // closes the scanner
    }
}