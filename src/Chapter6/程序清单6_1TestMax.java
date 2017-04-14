package Chapter6;

public class ³ÌĞòÇåµ¥6_1TestMax {
	public static void main(String[] args){
		int i = 5,j = 2,k = max(i,j);
		System.out.print("The maximum of " + i + " and " + j +
			" is " + k);
	}
	public static int max(int n1,int n2){
		int result;
		if(n1 > n2)
			result = n1;
		else
			result = n2;
		return result;
	}
}
