package Chapter5;

public class 程序清单5_15PrimeNumber {			//求前50个素数
	public static void main(String[] args){
		final int NUMBER_OF_PRIMES = 50;
		final int NUMBER_OF_PRIMES_PER_LINE = 10;
		int count = 0,num = 2;
		System.out.print("The first 50prime numbers are \n");
		while(count < NUMBER_OF_PRIMES){
			boolean isPrime =true;
			for(int i = 2;i <= num / 2;i++){
				if(num % i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				count++;
				if(count % NUMBER_OF_PRIMES_PER_LINE == 0){
					System.out.println(num);
				}
				else
					System.out.print(num + " ");
			}
			num++;
		}
	}
}
