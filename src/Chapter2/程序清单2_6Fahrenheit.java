package Chapter2;

import java.util.Scanner;

public class �����嵥2_6Fahrenheit {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit:");
		double fahrenheit = input.nextDouble();
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
	}
}
