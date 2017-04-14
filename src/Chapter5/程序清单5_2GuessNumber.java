package Chapter5;

import java.util.Scanner;

public class ³ÌÐòÇåµ¥5_2GuessNumber {
	public static void main(String[] args){
		int num = (int)(Math.random() * 101);
		Scanner input = new Scanner(System.in);
		
		System.out.println("Guess a magic number between 0 and 100");
		int guess = -1;
		
		while(guess !=num){
		System.out.print("\nEnter your guess:");
		guess = input.nextInt();
		if(guess == num)
			System.out.println("Yes,the number is " + num);
		else if(guess > num)
			System.out.println("Your guess is too high");
		else
			System.out.println("your guess is too low");
		}
	}
}
