package Chapter12;

public class �����嵥12_10InvalidRadiusException extends Exception{
	private double radius;
	
	public �����嵥12_10InvalidRadiusException(double radius){
		super("Invalid radius " + radius);
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
}
