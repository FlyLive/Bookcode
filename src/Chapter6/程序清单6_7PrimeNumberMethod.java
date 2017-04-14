package Chapter6;

public class ≥Ã–Ú«Âµ•6_7PrimeNumberMethod {
	public static void main(String[] args){
		System.out.println("The first 50 prime numbers are\n");
		PrintPrimeNukmber(50);
	}
	public static void PrintPrimeNukmber(int NUMBER){
		int count = 0,number = 2;
		while(count < NUMBER){
			if(isPrime(number)){
				count++;
				if(count % 10 ==0){
					System.out.printf(" %-4d\n",number);
				}
			else
				System.out.printf(" %-4d",number);
			}
			number++;
		}
	}
	public static boolean isPrime(int number){
		for(int i = 2;i <= number / 2;i++)
			if(number % i == 0)
			return false;
		return true;
	}
}
