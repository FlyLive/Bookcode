package Chapter6;

import java.util.Scanner;

public class ≥Ã–Ú«Âµ•6_12PrintCalendar {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter full year (e.g.,2012): ");
		int year = input.nextInt();
		System.out.print("Enter month as a number between 1 and 12: ");
		int month = input.nextInt();
		printMonth(year,month);
	}
	public static void printMonth(int year,int month){
		System.out.println("         " + MonthName(month) + " " + year);
		System.out.println("©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§©§");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		printCalendar(year,month);
	}
	public static void printCalendar(int year,int month){
		int startday = getStartday(year,month);
		int numberOfDaysInMonth = getNumberOfMonth(year,month);
		int i = 0;
		for(i = 0;i < startday;i++)
			System.out.print("    ");
		for(i = 1;i <= numberOfDaysInMonth;i++){
			System.out.printf("%4d",i);
			if((i + startday) % 7 == 0)
				System.out.println();
		}
		System.out.println();
	}
	public static int getStartday(int year,int month){
		final int STARTDAY_DAY_FOR_JAN_1_1800 = 3;
		int totalNumberOfDays = getTotalNumberOfDays(year,month);
		return (totalNumberOfDays + STARTDAY_DAY_FOR_JAN_1_1800) % 7;
	}
	public static int getTotalNumberOfDays(int year,int month){
		int total = 0;
		for(int i = 1800;i < year;i++)
			if(isLeapYear(i))
				total +=366;
			else
				total +=365;
		for(int i = 1;i < month;i++)
			total += getNumberOfMonth(year,i);
		return total;
	}
	public static String MonthName(int month){
		String NAME = "";
		switch(month){
			case 1:NAME = "January";break;
			case 2:NAME = "February";break;
			case 3:NAME = "March";break;
			case 4:NAME = "April";break;
			case 5:NAME = "May";break;
			case 6:NAME = "June";break;
			case 7:NAME = "July";break;
			case 8:NAME = "August";break;
			case 9:NAME = "September";break;
			case 10:NAME = "October";break;
			case 11:NAME = "November";break;
			case 12:NAME = "December";break;
		}
		return NAME;
	}
	public static int getNumberOfMonth(int year,int month){
		if(month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12)
			return 31;
		if(month == 4||month == 6||month == 9||month == 11)
			return 30;
		if(month == 2)
			return isLeapYear(year) ? 29:28;
			return 0;
	}
	public static boolean isLeapYear(int year){
		if(year % 400 ==0 || year % 4 ==0 && year % 100 !=0)
			return true;
		return false;
	}
}
