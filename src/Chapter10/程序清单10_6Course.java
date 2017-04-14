package Chapter10;

public class 程序清单10_6Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public static final int DEFAULT = 100;
	
	public 程序清单10_6Course(){
		this(DEFAULT);
	}
	
	public 程序清单10_6Course(String courseName){
		this.courseName = courseName;
	}
	
	public 程序清单10_6Course(int capacity){
		students = new String [capacity];
	}
	
	public void addStudent(String student){
		students[numberOfStudents++] = student;
	}

	public String getCourseName() {
		return courseName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String[] getStudents() {
		return students;
	}
	
	public void dropStudent(String student){
		int i;
		for(i = 0;i < this.numberOfStudents;i++){
			if(this.students[i].equalsIgnoreCase(student)){
				this.students[i] = null;
				break;
			}
		}
		
		for(;i < this.numberOfStudents - 1;i++){
			this.students[i] = this.students[i + 1];
		}
		numberOfStudents--;
	}
	
	public void clear(){
		this.numberOfStudents = 0;
		this.students = null;
	}
}