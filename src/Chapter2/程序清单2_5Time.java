package Chapter2;

import java.util.Scanner;

public class �����嵥2_5Time {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer for seconds:");
		int seconds = input.nextInt();
		
		int minutes = seconds / 60;			//����ʱ��ķ�����
		int remainingSeconds = seconds % 60;		//����ʱ��Ķ��������
		System.out.println(seconds + "seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
	}
}
