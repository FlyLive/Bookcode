package Chapter10;

public class 程序清单10_5TestCourse {
	public static void main(String[] args){
		程序清单10_6Course course1 = new 程序清单10_6Course("Data Structures");
		程序清单10_6Course course2 = new 程序清单10_6Course("Data Systems");
		
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		
		System.out.println("Number of studens in course1:" +
			course1.getNumberOfStudents());
		String[] students1 = course1.getStudents();
		for(int i = 0;i < course1.getNumberOfStudents();i++)
			System.out.print(students1[i] + ", ");
		
		System.out.println();
		System.out.println("Number of students in course2:" +
			course2.getNumberOfStudents());
		String[] students2 = course2.getStudents();
		for(int i = 0;i < course2.getNumberOfStudents();i++)
			System.out.print(students2[i] + ", ");
		
		course2.dropStudent("Peter Jones");
		//course2.clear();
		String[] students3 = course2.getStudents();
		System.out.println();
		System.out.println("Number of students in course2:" +
			course2.getNumberOfStudents());
		for(int i = 0;i < course2.getNumberOfStudents();i++)
			System.out.print(students3[i] + ", ");
	}
}
