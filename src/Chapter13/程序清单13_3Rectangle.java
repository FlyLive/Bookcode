package Chapter13;

public class �����嵥13_3Rectangle extends �����嵥13_1GeometricObject{
	private double width;
	private double height;
	
	public �����嵥13_3Rectangle(){
	}
	
	public �����嵥13_3Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}
	
	public �����嵥13_3Rectangle(double width, double height, String color, boolean filled){
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