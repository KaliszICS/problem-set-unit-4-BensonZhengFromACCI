/**

* File: Unit 4 Problem Set - 

* Author: Benson

* Date Created: March 29, 2026

* Date Last Modified: March 29, 2026

*/

import java.util.Scanner;

public class ProblemSet {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int roundsNum;
		int score = 0;
		int guess;
		do {
			System.out.println("\nWelcome to high or low guessing game! \n");
			System.out.print("How many round would you like to play?: ");
			roundsNum = input.nextInt();
		}
		/// validates positive # of rounds
		while (roundsNum < 1);
			for (int start = 0; start < roundsNum; start++) {
				int currentRound = start + 1;
				int ranNum = (int)(Math.random() * 21); 
				System.out.println("\nRound: " + currentRound + "\n");
				System.out.print("Please select high, even or low.\n 1. High (11 to 20)\n 2. Even (10)\n 3. Low (0 to 9)\n\n");
				
				guess = input.nextInt();
				/// validates inputs of 1 to 3
				while (guess < 1 || guess > 3) {
					System.out.println("Invalid input: \n");
					System.out.print("Please select high, even or low.\n 1. High (11 to 20)\n 2. Even (10)\n 3. Low (0 to 9)\n\n");
					guess = input.nextInt();
				}
					/// checks which option was selected
					if (guess == 1) {
						if (ranNum > 10 ) {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were correct.");
							score++;
						}
						else {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were incorrect.");
						}
					}
					else if (guess == 2) {
						if (ranNum == 10 ) {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were correct.");
							score++;
						}
						else {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were incorrect.");
						}
					}
					else if (guess == 3) {
						if (ranNum < 10 ) {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were correct.");
							score++;
						}
						else {
							System.out.print("\nThe number was: " + ranNum);
							System.out.println(", You were incorrect.");
						}
					}
				System.out.println("Current score: " + score);
			}
			/// prints final score if score is more or equal to half the number of rounds
			if (score >= (roundsNum / 2.0)) {
				System.out.println("Final score: " + score);
				System.out.println("You won!");
				System.out.println(score + "/" + roundsNum);
			}
			/// otherwise prints lose
			else {
				System.out.println("Final score: " + score);
				System.out.println("You lost! Better luck next time.");
				System.out.println(score + "/" + roundsNum);
			}		
	}
}