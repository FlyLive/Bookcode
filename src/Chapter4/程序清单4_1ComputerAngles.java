package Chapter4;

import java.util.Scanner;

public class 程序清单4_1ComputerAngles {			//计算三角形的角度
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points:");
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));	//
		double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
		//Math.toDegrees表示用度来表示以弧度为单位的角度Math.toRadians则相反
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));
		System.out.println("The three angles are " +
			Math.round(A * 100) / 100.0 + " " +
			Math.round(B * 100) / 100.0 + " " +
			Math.round(C * 100) / 100.0);
		//Math.round(x)表示如果x为单精度返回(int)Math.floor(x+0.5)，为双精度返回(long)Math.floor(x+0.5)
		//Math.floor(x)表示向下(小于x的整数)取整为它最接近的整数并作为双精度返回
		//Math.ceil(x)则表示想上去(大于x的整数)取整为它最接近的整数并作为双精度返回
	}
}
