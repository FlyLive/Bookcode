package Chapter8;

import java.util.Scanner;

public class ≥Ã–Ú«Âµ•8_1PassTwoDimensiomalArray {
	public static void main(String[] args){
		int[][] m = getArray();
		System.out.println("\nSum of all elements is " + sum(m));
	}
	
	public static int[][] getArray(){
		Scanner input = new Scanner(System.in);
		
		int[][] a = new int [3][4];
		System.out.println("Enter " + a.length + " rows and "
			+ a[0].length + "colums:");
		for(int i = 0 ;i < a.length;i++)
			for(int j = 0 ;j < a[i].length;j++)
				a[i][j] = input.nextInt();
		return a;
	}
	public static int sum(int[][] a){
		int total = 0;
		for(int i = 0;i < a.length;i++){
			for(int j = 0;j < a[i].length;j++){
				total += a[i][j];
			}
		}
		return total;
	}
}
