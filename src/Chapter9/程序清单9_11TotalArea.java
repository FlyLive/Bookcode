package Chapter9;

public class �����嵥9_11TotalArea {
	public static void main(String[] args){
		�����嵥9_8CircleWithPrivateDataFields[] circleArray;
		
		circleArray = creatCircleArray();
		
		printCircleArray(circleArray);
	}
	
	public static �����嵥9_8CircleWithPrivateDataFields[] creatCircleArray(){
		�����嵥9_8CircleWithPrivateDataFields[] 	circleArray =
			new �����嵥9_8CircleWithPrivateDataFields[5];
		
		for(int i = 0;i < circleArray.length;i++){
			circleArray[i] =
			new �����嵥9_8CircleWithPrivateDataFields(Math.random() * 100);
		}
		
		return circleArray;
	}
	
	public static void printCircleArray(
		�����嵥9_8CircleWithPrivateDataFields[] circleArray){
		System.out.printf("%-30s%-15s\n","Radius","Area");
		
		for(int i = 0;i < circleArray.length;i++){
			System.out.printf("%-30f%-15f\n",circleArray[i].getRadius(),
				circleArray[i].getArea());
		}
		
		System.out.println("������������������������������������������������������������������������������������");
		System.out.printf("%-30s%-15f\n","The total area of circle is",
			sum(circleArray));
	}
	
	public static double sum(�����嵥9_8CircleWithPrivateDataFields[] circleArray){
		double sum = 0;
		for(int i =0;i < circleArray.length;i++)
			sum += circleArray[i].getArea();
		
		return sum;
	}
}
