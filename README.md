# 计G202 2020322088 李晨香

# Java10-26

## 一、实验目的
1.掌握面向对象的类设计方法（属性，方法）；

2.掌握类的继承用法，通过构造方法实例化对象；

3.学会使用super()，用于实例化子类；

4.掌握使用object根类的头toString()方法，应用在相关对象的信息输出中。

## 二、实验过程
1.创建Java项目ChooseCourse;

2.创建People类作为主类，创建Course类，Stuendt类以及Teacher类作为子类，创建test类作为主类进行测试和打印；

3.在People类中添加编号，姓名，性别，手机号码四种属性，分别对其添加set()和get()方法对相应参数进行赋值，使用toString()方法统一输出结果的格式；

4.在Course类中添加课程编号，课程名，上课地点，上课时间以及授课教师五种属性，分别添加set()和get()方法对相应参数赋值，使用toString()方法对输出结果统一格式;

5.在Student类中添加课程属性，其他方法继承父类People的方法；

6.在Teacher类中添加课程属性，其他方法继承父类People的方法；  

7.在主类test的main方法中实例化Student类，并赋予初始值：(2020322088,"Mary","女","17803260304")；
  实例化Teacher类，并赋予初始值：(1,"Jhone","男","18832619534")；
  实例化Course类，并赋予初始值：(2,"Java","综0921","每周一19:00","Jhone")；

8.在主类test的main方法中模拟学生退课操作，若课程编号为0则提示“该学生未选课或已退课”，否则打印学生信息，选课信息以及授课信息。

## 三、核心方法
1.方法一
```
//添加父类People有参构造方法
public People(int id,String name,String sex,String phoneN){
	this.id=id;
	this.name=name;
	this.sex=sex;
	this.phoneN=phoneN;		
}
```

2.方法二
```
public  String toString(){
	return "编号："+id+" "+"姓名："+name+" "+"性别："+sex+" "+"手机号："+phoneN;		
}
```

3.方法三
```
//添加Course有参构造方法
public Course(int cid,String cName,String add,String time,String teacher){
	super();
	this.cid=cid;
	this.cName=cName;
	this.add=add;
	this.time=time;
	this.teacher=teacher;
}
```

4.方法四
```
public String toString(){
	return "\n"+"学生选课信息："+"\n"+
	        "课程编号："+cid+" "+
	        "课程名："+cName+" "+
		"上课地点："+add+" "+
		"上课时间："+time+" "+
		"授课教师："+teacher;
	}
```

5.方法五
```
//调用父类People有参构造方法
public Student(int id, String name, String sex, String phonN) {
	super(id, name, sex, phonN);
}
```

6.方法六
```
public String toString(){
	return "学生信息："+"\n"+super.toString();
}
```

7.方法七
```
public void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU价钱"+cpu.getPrice());
		System.out.println("硬盘容量"+HD.getAmount());		
		System.out.println("硬盘厚度"+HD.getWeight());
	}
```

8.方法八
```
//判断学生是否选课或退课
if(s.getsCourse().cid==0){
	System.out.println("该学生未选课或已退课!");
	System.out.println("无学生选课信息！");
			
}else{
	System.out.println(s);
	System.out.println(t);		
	System.out.println(c);
}
```

## 四、实验结果
1.学生选课状态下打印出的结果
```
学生信息：
编号：2020322088 姓名：Mary 性别：女 手机号：17803260304

授课教师信息：
编号：1 姓名：Jhone 性别：男 手机号：18832619534

学生选课信息：
课程编号：2 课程名：Java 上课地点：综0921 上课时间：每周一19:00 授课教师：Jhone
```
2.学生退课或未选课状态下打印出的结果
```
该学生未选课或已退课!
无学生选课信息！
```


## 五、实验感想
通过本次实验，让我了解了构造方法的使用，掌握了方法调用时参数的传递，经过老师和同学的帮助顺利的完成了本次实验。

