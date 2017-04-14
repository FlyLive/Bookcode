package Chapter9;

public class 程序清单9_9TestCircleWithPrivateDataFields {
	public static void main(String[] args){
		程序清单9_8CircleWithPrivateDataFields myCircle =
			new 程序清单9_8CircleWithPrivateDataFields(5.0);
		System.out.println("The area of the circle of radius "
			+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		myCircle.setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "
			+ myCircle.getRadius() + " is " + myCircle.getArea());
		
		System.out.println("The number of objects created is "
			+ 程序清单9_8CircleWithPrivateDataFields.getNumberOfObjects());
	}
}
