package Chapter12;

import java.util.Scanner;

public class ≥Ã–Ú«Âµ•12_4QuotientWithException {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two integers:");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		try{
			int result = quotient(n1,n2);
			System.out.println(n1 + " / " + n2 + " is " + result);
		}
		catch(ArithmeticException ex){
			System.out.println("Exception: an integer " + 
				"cannot be divided by zero ");
		}
		
		System.out.println("Execution continues ...");
	}
	
	public static int quotient(int n1,int n2){
		if(n1 == 0)
			throw new ArithmeticException("Dividor cannot be zero");
		
		return n1 / n2;
	}
}
