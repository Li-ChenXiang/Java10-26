package course;


public class Course{
	int cid;
	String cName;
	String add;
	String time;
	String teacher;
	
	//构造方法
	public Course(int cid,String cName,String add,String time,String teacher){
		super();
		this.cid=cid;
		this.cName=cName;
		this.add=add;
		this.time=time;
		this.teacher=teacher;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	
	public String toString(){
		return "\n"+"学生选课信息："+"\n"+
			   "课程编号："+cid+" "+
			   "课程名："+cName+" "+
			   "上课地点："+add+" "+
			   "上课时间："+time+" "+
			   "授课教师："+teacher;
	}
}
