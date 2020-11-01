package course;

public class test {
	public static void main(String args[]){		
		Student s=new Student(2020322088,"Mary","女","17803260304");
		Teacher t=new Teacher(1,"Jhone","男","18832619534");
		Course c=new Course(2,"Java","综0921","每周一19:00","Jhone");
		
		t.settCourse(c);
		s.setsCourse(c);
		
		if(s.getsCourse().cid==0){
			System.out.println("该学生未选课或已退课!");
			System.out.println("无学生选课信息！");
			
		}else{
			System.out.println(s);
			System.out.println(t);		
			System.out.println(c);
		}
	}
}
