package Chapter12;

public class �����嵥12_8TestCircleWithException {
	public static void main(String[] args){
		try{
			�����嵥12_7CircleWithException c1 =
					new �����嵥12_7CircleWithException(5);
			�����嵥12_7CircleWithException c2 =
					new �����嵥12_7CircleWithException(-5);
			�����嵥12_7CircleWithException c3 =
					new �����嵥12_7CircleWithException(0);
		}
		catch (IllegalArgumentException ex){
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " +
			�����嵥12_7CircleWithException.getNumberOfObjects());
	}
}
