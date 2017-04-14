package Chapter5;

public class ≥Ã–Ú«Âµ•5_13TestContinue {
	public static void main(String[] args){
		int sum = 0;
		int num = 0;
		while(num < 20){
			num++;
			if(num == 10 || num == 11)
				continue;
			sum += num;
		}
		System.out.println("The sum is " + sum);
	}
}
