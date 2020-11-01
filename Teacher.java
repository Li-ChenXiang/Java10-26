package course;


public class Teacher extends People{	
		Course tCourse;
		public Teacher(int id, String name, String sex, String phonN) {
			super(id, name, sex, phonN);
		}
				
		public Course gettCourse() {
			return tCourse;
		}

		public void settCourse(Course tCourse) {
			this.tCourse = tCourse;
		}

		public String toString(){
			return "\n"+"授课教师信息："+"\n"+super.toString();
		}
		
}
