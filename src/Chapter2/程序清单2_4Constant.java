package Chapter2;

import java.util.Scanner;

public class 程序清单2_4Constant {
	public static void main(String[] args){
		final double PI = 3.14159;		//命名常量
		
		Scanner input = new Scanner(System.in);		//创建一个输入
		
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();		//从键盘读取输入
		
		double area = radius * radius * PI;		//计算
		
		System.out.println("The are for the circle of radius " + radius + " is " + area);		//计算
	}
}
