package Chapter9;

public class 程序清单9_7TestCircleWithStaticMembers {
	public static void main(String[] args){
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is " +
			程序清单9_6CircleWithStaticMembers.numberOfObjects);
		
		程序清单9_6CircleWithStaticMembers c1
		= new 程序清单9_6CircleWithStaticMembers();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1:radius (" + c1.radius +
			") and number of Circle objects (" + c1.numberOfObjects);
		
		程序清单9_6CircleWithStaticMembers c2
		= new 程序清单9_6CircleWithStaticMembers(5);
		
		c1.radius = 9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius +
			") and number of Circle objects (" +
			c1.numberOfObjects + ")");
		System.out.println("c2: radius (" + c2.radius +
			") and number of Circle objects (" +
			c2.numberOfObjects + ")");
	}
}
