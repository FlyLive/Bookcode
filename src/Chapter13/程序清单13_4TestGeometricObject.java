package Chapter13;

public class 程序清单13_4TestGeometricObject {
	public static void main(String[] args){
		程序清单13_1GeometricObject geoObject1 = new 程序清单13_2Circle(5);
		程序清单13_1GeometricObject geoObject2 = new
			程序清单13_3Rectangle(5,3);
		
		System.out.println("The two objects have the same area? " +
			equalArea(geoObject1,geoObject2));
		
		displayGeometricObject(geoObject1);
		
		displayGeometricObject(geoObject2);
	}
	
	public static boolean equalArea(程序清单13_1GeometricObject object1,
			程序清单13_1GeometricObject object2){
		return object1.getArea() == object2.getArea();
	}
	public static void displayGeometricObject(程序清单13_1GeometricObject object){
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
