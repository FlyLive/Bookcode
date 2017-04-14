package Chapter11;

public class 程序清单11_5PolymorphismDemo {
	public static void main(String[] args){
		displayObject(new 程序清单11_2CircleFromSimpleGeometricObject
				(1,"red",false));
		displayObject(new 程序清单11_3RectangleFromSimpleGeometricObject
				(1,1,"black",true));
	}
	
	public static void displayObject(程序清单11_1SimpleGeometricObject o){
		System.out.println("Created on " + o.getDateCreated() +
			".Color is " + o.getColor());
	}
}
