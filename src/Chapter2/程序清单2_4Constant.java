package Chapter2;

import java.util.Scanner;

public class �����嵥2_4Constant {
	public static void main(String[] args){
		final double PI = 3.14159;		//��������
		
		Scanner input = new Scanner(System.in);		//����һ������
		
		System.out.print("Enter a number for radius:");
		double radius = input.nextDouble();		//�Ӽ��̶�ȡ����
		
		double area = radius * radius * PI;		//����
		
		System.out.println("The are for the circle of radius " + radius + " is " + area);		//����
	}
}
