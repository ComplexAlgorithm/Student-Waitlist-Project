
public class Student extends Person {
	//instance variables
	//studentId which should be a whole number
	private int studentId;
	
	//4 constructors that have unique signatures or parameters
	public Student() {
		super();
		studentId = 0;
	}
	
	public Student(String newName) {
		super(newName);
		studentId = 0;
	}
	
	public Student(String newName, int newStudentId) {
		super(newName);
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	public Student(int newStudentId) {
		super();
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	//setStudentId (newStudentId > 0)
	public void setStudentId(int newStudentId) {
		if(newStudentId > 0) {
			studentId = newStudentId;
		}
	}
	
	
	//getStudentId
	public int getStudentId() {
		return studentId;
	}
	
	//override toString to return name and studentId
	public String toString() {
		return super.toString() + " Student Id: " + studentId;
	}
	
	//override equals to return true if name and studentId are the same for both objects
	//otherwise return false
	public boolean equals(Object otherObject) {
		boolean areTheyEqual = false;
		if(otherObject != null && otherObject instanceof Student) {
			Student otherStudent = (Student)otherObject;
			if(super.equals(otherObject) && 
					this.studentId == otherStudent.studentId) {
				areTheyEqual = true;
			}
		}
		return areTheyEqual;
	}
}
