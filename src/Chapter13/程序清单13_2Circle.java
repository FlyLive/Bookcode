package Chapter13;

public class 程序清单13_2Circle extends 程序清单13_1GeometricObject{
	private double radius;
	
	public 程序清单13_2Circle(){
	}
	
	public 程序清单13_2Circle(double radius){
		this.radius = radius;
	}
	
	public 程序清单13_2Circle(double radius,
		String color,boolean filled){
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public double getDiameter(){
		return 2 * radius;
	}
	
	public double getPerimeter(){
		return 2 * radius * Math.PI;
	}
	
	public void printCircle(){
		System.out.println("The circle is created " + getDateCreated()
			+ " and the radius is " + radius);
	}
}