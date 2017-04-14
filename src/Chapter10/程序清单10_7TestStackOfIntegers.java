package Chapter10;

public class 程序清单10_7TestStackOfIntegers{
	public static void main(String[] args){
		程序清单10_8StackOfIntegers stack = new 程序清单10_8StackOfIntegers();
		
		for(int i = 0;i < 32;i++)
			stack.push(i);
		while(!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
