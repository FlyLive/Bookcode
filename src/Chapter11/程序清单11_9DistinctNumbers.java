package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class ≥Ã–Ú«Âµ•11_9DistinctNumbers {
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers (input eds with 0):");
		int value;
		do{
			value = input.nextInt();
			if(!list.contains(value) && value != 0)
				list.add(value);
		}while(value != 0);
		
		for(int i = 0;i < list.size();i++)
			System.out.print(list.get(i) + " ");
	}
}
