package c.spik3_sonic.masterrace;
import java.util.Scanner;
import java.util.Random;

/**
 * @author chloe.spilker
 * a number guessing game
 */

public class Sonic_Masterrace {

	public static void main(String[] args) {
		// import scanner
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("GUESS A NUMBER BETWEEN 1 & 1,000,000");
		
		// print introduction
		System.out.println("sonic is masterrace");
		System.out.println();
		
		// declare variables
		int actual_num = rand.nextInt(1000000) + 1;
		int guess;
		
		// player input
		System.out.println("Enter your guess: ");
		guess = input.nextInt();
		
		// the game (while the player hasn't guessed the right answer)
		while (guess != actual_num) {
			if (guess > actual_num) {
				System.out.println();
				System.out.println("-------------------");
				System.out.println("Guess was too high!");
				System.out.println("-------------------");
				System.out.println();
				System.out.println("Enter your new guess: ");
				guess = input.nextInt();
				
			}
			
			if (guess < actual_num) {
				System.out.println();
				System.out.println("------------------");
				System.out.println("Guess was too low!");
				System.out.println("------------------");
				System.out.println();
				System.out.println("Enter your new guess: ");
				guess = input.nextInt();
			}
				
		}
		
		// tells player they have won
		System.out.println();
		System.out.println("------------------");
		System.out.println("You've guessed it!");
		System.out.println("------------------");
		
		
		
		

	}

}
