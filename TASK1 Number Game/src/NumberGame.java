package com.codsoft.numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Random r=new Random();
		int numAttempts = 8;
		int numRounds=3;
		int score=0;
		for(int round=1;round<=numRounds;round++) {
			int numToGuess =r.nextInt(100)+1;
			int attempts=0;
			System.out.println("\n**Round:"+round+"**");
			System.out.println("I'm thinking of a number between 1 and 100. ");
			while(attempts<numAttempts) {
				System.out.println("Enter your guess:");
				int guess=sc.nextInt();
				if(guess<numToGuess) {
					System.out.println("Too low!");
				}else if(guess>numToGuess)
					System.out.println("Too High!");
				else
				{
					System.out.println("Congratulations!You guessed the number in "+(attempts+1)+"attempts.");
					score+=10-attempts;
					break;
				}
				attempts++;
			}
			if(attempts==numAttempts) {
				System.out.println("Sorry,you didn't guess the number.The number was"+numToGuess);
			}
			
		}
		System.out.println("\nYour Final Score is: "+score);
		sc.close();
	}
}