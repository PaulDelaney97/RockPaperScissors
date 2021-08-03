package com.pauldelaney.cumulativeexercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Delaney
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        // Create scanner and Random objects
        Scanner usrChoice = new Scanner(System.in);
        Random compChoice = new Random();
        
        // Initialise winning counters
        int winsUser = 0;
        int winsComp = 0;
        int winsTies = 0;
        
        while (true) {
            // 
            System.out.println("\nWelcome to Rock, Paper, Scissors!");
            System.out.println("How many rounds would you like to play? [1,10] ");
            int roundsCount = usrChoice.nextInt();
            // Check if user enters a number between 1 and 10
            if (roundsCount < 1 || roundsCount > 10) {
                System.out.println("You must enter 1 - 10.");
                break;  // exit while loop
            }
            
            // loop over each round and implement the game
            for (int i = 1; i <= roundsCount; i++) {
                System.out.println("\nRound" + i + ": " + " Type 1 for Rock, 2 for Paper, 3 for Scissors");
                // ask user to chose
                int numChoice = usrChoice.nextInt();
                switch (numChoice) {
                    case 1:
                        numChoice = 1;
                        System.out.println("\nYou Chose: Rock");
                        break;
                    case 2:
                        numChoice = 2;
                        System.out.println("\nYou Chose: Paper");
                        break;
                    case 3:
                        numChoice = 3;
                        System.out.println("\nYou Chose: Scissors");
                        break;
                }
                // ensure that user makes a valid move
                if (numChoice == 1 || numChoice == 2 || numChoice == 3) {
                } else {
                    System.out.println("YOU ENTERED INCORRECT VALUE");
                    break;
                }
                // random computer choices
                int numChoice2 = compChoice.nextInt(3) + 1;
                switch (numChoice2) {
                    case 1:
                        numChoice2 = 1;
                        System.out.println("Computer choice: Rock");
                        break;
                    case 2:
                        numChoice2 = 2;
                        System.out.println("Computer choice: Paper");
                        break;
                    case 3:
                        numChoice2 = 3;
                        System.out.println("Computer choice: Scissors");
                        break;
                }
                // Implement the rules of the game
                if (numChoice == 1 && numChoice2 == 1) {
                    System.out.println("Its a TIE!");
                    winsTies++;
                }
                if (numChoice == 2 && numChoice2 == 1) {
                    System.out.println("USER WINS!");
                    winsUser++;
                }
                if (numChoice == 3 && numChoice2 == 1) {
                    System.out.println("COMPUTER WINS!");
                    winsComp++;
                }
                if (numChoice == 1 && numChoice2 == 2) {
                    System.out.println("COMPUTER WINS!");
                    winsComp++;
                }
                if (numChoice == 2 && numChoice2 == 2) {
                    System.out.println("Its a TIE");
                    winsTies++;
                }
                if (numChoice == 3 && numChoice2 == 2) {
                    System.out.println("USER WINS!");
                    winsUser++;
                }
                if (numChoice == 1 && numChoice2 == 3) {
                    System.out.println("USER WINS!");
                    winsUser++;
                }
                if (numChoice == 2 && numChoice2 == 3) {
                    System.out.println("COMPUTER WINS!");
                    winsComp++;
                }
                if (numChoice == 3 && numChoice2 == 3) {
                    System.out.println("Its a TIE");
                    winsTies++;
                }
            }
            // print the results of the game 
            System.out.println("\nUser Wins: " + winsUser);
            System.out.println("Computer Wins: " + winsComp);
            System.out.println("Ties: " + winsTies);
            if (winsUser > winsComp) {
                System.out.println("Overall Winner: USER");
            }
            if (winsUser < winsComp) {
                System.out.println("Overall Winner: COMPUTER");
            }
            if (winsUser == winsComp) {
                System.out.println("NO OVERALL WINNER");
            }
            System.out.println("\nWould you like to play again? 'Y' or 'N'? ");
            usrChoice.nextLine();
            if (usrChoice.nextLine().toUpperCase().equals("N")) {
                System.out.println("Thanks For Playing!");
                break;
            }
        } // end of while(true) loop
    }
}
