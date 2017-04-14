package Chapter2;

import java.util.Scanner;

public class ³ÌĞòÇåµ¥2_3Average {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double ave = (num1 + num2 + num3)/3;
			
		System.out.print("The average of " + num1 + " " + num2 + " " + num3 + " is " + ave);
	}

}
