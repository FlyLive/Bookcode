package Chapter11;

public class 程序清单11_3RectangleFromSimpleGeometricObject
		extends 程序清单11_1SimpleGeometricObject{
	private double width;
	private double height;
	
	public 程序清单11_3RectangleFromSimpleGeometricObject(){
	}
	
	public 程序清单11_3RectangleFromSimpleGeometricObject(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public 程序清单11_3RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled){
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}

}
