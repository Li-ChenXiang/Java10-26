package course;

public class People {
	int id;
	String name;
    String sex;
    String phoneN;
    
    //父类People有参构造方法
	public People(int id,String name,String sex,String phoneN){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.phoneN=phoneN;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhonN() {
		return phoneN;
	}
	public void setPhonN(String phonN) {
		this.phoneN = phonN;
	}
	
	public  String toString(){
		return "编号："+id+" "+"姓名："+name+" "+"性别："+sex+" "+"手机号："+phoneN;
		
	}
}