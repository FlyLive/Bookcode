package Chapter3;

import java.util.Scanner;

public class 程序清单3_4ComputerAndInterpretBMI {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		System.out.print("Enter height in inches:");
		double height = input.nextDouble();
		
		final double KILOGRAMS_PER_POUND = 0.45359237;		//声明常量
		final double METERS_PER_INCH = 0.0254;
		
		double weightInkilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * METERS_PER_INCH;
		double bmi = weightInkilograms / (heightInMeters * heightInMeters);
		
		System.out.println("BMI is " + bmi);
		if(bmi < 18.5)
			System.out.println("Underweight");
		else if(bmi < 25)
			System.out.println("Normal");
		else if(bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
	}
}
