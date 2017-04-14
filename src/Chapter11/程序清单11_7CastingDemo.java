package Chapter11;

public class 程序清单11_7CastingDemo {
	public static void main(String[] args){
		Object object1 = new
				程序清单11_2CircleFromSimpleGeometricObject(1);
		Object object2 = new
				程序清单11_3RectangleFromSimpleGeometricObject(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}
	
	public static void displayObject(Object o){
		if(o instanceof 程序清单11_2CircleFromSimpleGeometricObject){
			System.out.println("The circle area is " +
				((程序清单11_2CircleFromSimpleGeometricObject)
				o).getArea());
			System.out.println("The circle diameter is " +
				((程序清单11_2CircleFromSimpleGeometricObject)
				o).getDiameter());
		}
		else if(o instanceof
				程序清单11_3RectangleFromSimpleGeometricObject){
			
			System.out.println("The rectangle area is " +
				((程序清单11_3RectangleFromSimpleGeometricObject)
				o).getArea());
		}
	}
}
