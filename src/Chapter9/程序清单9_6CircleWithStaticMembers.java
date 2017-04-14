package Chapter9;

public class �����嵥9_6CircleWithStaticMembers {
	double radius;
	static int numberOfObjects = 0;
	
	�����嵥9_6CircleWithStaticMembers(){
		radius = 1;
		numberOfObjects++;
	}
	
	�����嵥9_6CircleWithStaticMembers(double newRadius){
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
