package Chapter6;

public class ≥Ã–Ú«Âµ•6_5TestPassByValue {
	public static void main(String[] args){
		int n1 = 1,n2 = 2;
		System.out.println("Before invoking the swap method ,num1 is " +
		n1 + " and num2 is " + n2);
		swap(n1,n2);
		System.out.println("After invoking the swap method ,num1 is " +
		n1 + " and num2 is " + n2);
	}
	public static void swap(int n1,int n2){
		System.out.println("\tInside the swap method");
		System.out.println("\t\tBefore swapping,n1 is " + n1
			+ " and n2 is " + n2);
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("\t\tAfter swapping,n1 is " + n1
			+ " and n2 is " + n2);
	}
}
