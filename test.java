package course;

public class test {
	public static void main(String args[]){		
		Student s=new Student(2020322088,"Mary","Ů","17803260304");
		Teacher t=new Teacher(1,"Jhone","��","18832619534");
		Course c=new Course(2,"Java","��0921","ÿ��һ19:00","Jhone");
		
		t.settCourse(c);
		s.setsCourse(c);
		
		if(s.getsCourse().cid==0){
			System.out.println("��ѧ��δѡ�λ����˿�!");
			System.out.println("��ѧ��ѡ����Ϣ��");
			
		}else{
			System.out.println(s);
			System.out.println(t);		
			System.out.println(c);
		}
	}
}
