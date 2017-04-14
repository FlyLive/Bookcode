package Chapter12;

public class 程序清单12_8TestCircleWithException {
	public static void main(String[] args){
		try{
			程序清单12_7CircleWithException c1 =
					new 程序清单12_7CircleWithException(5);
			程序清单12_7CircleWithException c2 =
					new 程序清单12_7CircleWithException(-5);
			程序清单12_7CircleWithException c3 =
					new 程序清单12_7CircleWithException(0);
		}
		catch (IllegalArgumentException ex){
			System.out.println(ex);
		}
		
		System.out.println("Number of objects created: " +
			程序清单12_7CircleWithException.getNumberOfObjects());
	}
}
