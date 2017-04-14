package Chapter2;

import java.util.Scanner;

public class 程序清单2_5Time {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds:");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;			//计算时间的分钟数
		int remainingSeconds = seconds % 60;		//计算时间的多余的秒数
		System.out.println(seconds + "seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
