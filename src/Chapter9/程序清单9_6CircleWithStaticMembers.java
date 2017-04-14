package Chapter9;

public class 程序清单9_6CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;
	
	程序清单9_6CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	
	程序清单9_6CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}
}
