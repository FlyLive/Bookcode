package Chapter13;

public class �����嵥13_4TestGeometricObject {
	public static void main(String[] args){
		�����嵥13_1GeometricObject geoObject1 = new �����嵥13_2Circle(5);
		�����嵥13_1GeometricObject geoObject2 = new
			�����嵥13_3Rectangle(5,3);
		
		System.out.println("The two objects have the same area? " +
			equalArea(geoObject1,geoObject2));
		
		displayGeometricObject(geoObject1);
		
		displayGeometricObject(geoObject2);
	}
	
	public static boolean equalArea(�����嵥13_1GeometricObject object1,
			�����嵥13_1GeometricObject object2){
		return object1.getArea() == object2.getArea();
	}
	public static void displayGeometricObject(�����嵥13_1GeometricObject object){
		System.out.println();
		System.out.println("The area is " + object.getArea());
		System.out.println("The perimeter is " + object.getPerimeter());
	}
}
