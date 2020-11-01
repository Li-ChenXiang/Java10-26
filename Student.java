package course;

public class Student extends People{
	Course sCourse;
	public Student(int id, String name, String sex, String phonN) {
		super(id, name, sex, phonN);
	}
		
	public Course getsCourse() {
		return sCourse;
	}


	public void setsCourse(Course sCourse) {
		this.sCourse = sCourse;
	}


	public String toString(){
		return "学生信息："+"\n"+super.toString();
	}
}
