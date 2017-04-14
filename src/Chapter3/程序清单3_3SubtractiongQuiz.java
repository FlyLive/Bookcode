package Chapter3;

import java.util.Scanner;

public class 程序清单3_3SubtractiongQuiz {
	public static void main(String[] args){
		int num1 = (int)(Math.random() * 10);		//产生随机数，0-10( * 10)
		int num2 = (int)(Math.random() * 10);
		
		if(num1 < num2){		//交换数值，使num1 > num2
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.print("What is " + num1 + " - " + num2 + "? ");
		
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		
		if(num1 - num2 == answer)
			System.out.println("You are correct!");
		else{
			System.out.println("Your answer is wrong.");
			System.out.println(num1 + " - " + num2 + " should be " + (num1 - num2));
		}
	}
}
