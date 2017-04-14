package Chapter10;

public class 程序清单10_3UseBMIClass {
	public static void main(String[] args){
		程序清单10_4BMI bmi1 = new 程序清单10_4BMI("Kim Yang",18,145,70);
		System.out.println("The BMI for " + bmi1.getName() + " is "
			+ bmi1.getBMI() + " " + bmi1.getStatus());
	
		程序清单10_4BMI bmi2 = new 程序清单10_4BMI("Susan King",215,70);
		System.out.println("The BMI for " + bmi2.getName() + " is "
			+ bmi2.getBMI() + " " + bmi2.getStatus());
	}
}
