package Chapter6;

public class �����嵥6_3TestReturnGradeMethod {
	public static void main(String[] args){
		System.out.println("The grade is " + getGrade(78.5));
		System.out.println("The grade is " + getGrade(59.5));
	}
	public static char getGrade(double score){
		if(score >= 90.0)
			return 'A';
		else if(score >= 80.0)
			return 'B';
		else if(score >= 70.0)
			return 'C';
		else if(score >= 90.0)
			return 'D';
		else
			return 'E';
	}
}
