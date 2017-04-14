package Chapter5;

public class 程序清单5_7MultiplicationgTable {		//九九乘法表	
	public static void main(String[] args){
		System.out.println("            Multiplication Table");
		System.out.print("    ");
		int i,j;
		for(j = 1;j <= 9;j++)
			System.out.print("   " + j);
		System.out.println("\n----------------------------------------");
		for(i = 1;i <= 9;i++){
			System.out.print(i + " | ");
			for(j = 1;j <= 9;j++){
				System.out.printf("%4d", i * j);
			}
		System.out.println();
		}
	}
}
