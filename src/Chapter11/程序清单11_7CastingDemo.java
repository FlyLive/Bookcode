package Chapter11;

public class �����嵥11_7CastingDemo {
	public static void main(String[] args){
		Object object1 = new
				�����嵥11_2CircleFromSimpleGeometricObject(1);
		Object object2 = new
				�����嵥11_3RectangleFromSimpleGeometricObject(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object o){
		if(o instanceof �����嵥11_2CircleFromSimpleGeometricObject){
			System.out.println("The circle area is " +
				((�����嵥11_2CircleFromSimpleGeometricObject)
				o).getArea());
			System.out.println("The circle diameter is " +
				((�����嵥11_2CircleFromSimpleGeometricObject)
				o).getDiameter());
		}
		else if(o instanceof
				�����嵥11_3RectangleFromSimpleGeometricObject){
			
			System.out.println("The rectangle area is " +
				((�����嵥11_3RectangleFromSimpleGeometricObject)
				o).getArea());
		}
	}
}
