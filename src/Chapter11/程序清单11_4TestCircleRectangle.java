package Chapter11;

public class �����嵥11_4TestCircleRectangle {
	public static void main(String[] args){
		�����嵥11_2CircleFromSimpleGeometricObject circle =
			new �����嵥11_2CircleFromSimpleGeometricObject(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		�����嵥11_3RectangleFromSimpleGeometricObject rectangle =
			new �����嵥11_3RectangleFromSimpleGeometricObject(2,4);
		System.out.println("\nA rectangl " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " +
			rectangle.getPerimeter());
		
	}
}
