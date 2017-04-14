package Chapter12;

public class 程序清单12_7CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public 程序清单12_7CircleWithException(){
		this(1.0);
	}
	
	public 程序清单12_7CircleWithException(double radius){
		setRadius(radius);
		numberOfObjects++;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) throws IllegalArgumentException{
			if(radius >= 0)
				this.radius = radius;
			else
				throw new IllegalArgumentException("Radius cannot"
					+ " be negative");
		this.radius = radius;
	}

	public static int getNumberOfObjects(){
		
		return numberOfObjects;
	}
	
	public double findArea(){
		return radius * radius * 3.14159;
	}
}
