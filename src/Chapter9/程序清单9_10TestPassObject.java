package Chapter9;

public class 程序清单9_10TestPassObject {
	public static void main(String[] args){
		程序清单9_8CircleWithPrivateDataFields myCircle =
			new 程序清单9_8CircleWithPrivateDataFields(1);
		
		int n = 5;
		printAreas(myCircle,n);
		
		System.out.println("\n" + "Radius is " + myCircle.getRadius());
		System.out.println("n is " + n);
	}
	
	public static void printAreas(
			程序清单9_8CircleWithPrivateDataFields c,int times){
		System.out.println("Radius \t\tArea");
		while(times >= 1){
			System.out.println(c.getRadius() + "\t\t" + c.getArea());
			c.setRadius(c.getRadius() + 1);
			times--;
		}
	}
}