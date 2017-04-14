package Chapter10;

import java.util.Scanner;

public class 程序清单10_1TestLoanClass {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print(
			"Enter annual interest rate,for example,8.25:");
		double annualInterestRate = input.nextDouble();
		
		System.out.print("Enter number of years as an integer:");
		int numnerOfYears = input.nextInt();
		
		System.out.print("Enter loan amount,for example,120000.95:");
		double loanAmount = input.nextDouble();
		
		程序清单10_2Loan loan = new 程序清单10_2Loan(annualInterestRate,numnerOfYears,loanAmount);
		
		System.out.printf("The loan was created on %s\n" +
			"The monthly payment is %.2f\nThe total payment is %.2f",
			loan.getLoanDate().toString(),loan.getMonthlyPayment(),
			loan.getTotalPayment());
	}
}
