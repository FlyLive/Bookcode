package Chapter11;

public class �����嵥11_5PolymorphismDemo {
	public static void main(String[] args){
		displayObject(new �����嵥11_2CircleFromSimpleGeometricObject
				(1,"red",false));
		displayObject(new �����嵥11_3RectangleFromSimpleGeometricObject
				(1,1,"black",true));
	}
	
	public static void displayObject(�����嵥11_1SimpleGeometricObject o){
		System.out.println("Created on " + o.getDateCreated() +
			".Color is " + o.getColor());
	}
}
