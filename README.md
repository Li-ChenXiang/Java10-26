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

5.在Student类中添加课程属性，其他方法继承父类People，添加setHardDisk(HardDisk h)方法将参数h的值赋值给HD；

6.添加show()方法能显示cpu的速度和字节及硬盘的容量和质量；  

7.在主类Test的main方法中创建一个CPU对象cpu，将cpu自己的speed设置为2200；创建一个HardDisk对象disk，将disk自己的amount设置为200；创建一个PC对象pc；

8.在主类Test的main方法中用pc调用setCPU(CPU c)方法，调用实参是cpu;调用setHardDisk(HardDisk h)方法，调用时实参是disk；调用show()方法。

## 三、核心方法
1.方法一
```
public void setSpeed(int m){
		this.speed=m;
	}
```

2.方法一
```
public void setPrice(float p){
		this.price=p;
	}
```

3.方法一
```
public void setAmount(int m){
		this.amount=m;
	}
```

4.方法一
```
public void setWeight(float w){
		this.weight=w;
	}
```

5.方法一
```
public void setCPU(CPU c){
		this.cpu=c;
	}
```

6.方法一
```
public void setHardDisk(HardDisk h){
		this.HD=h;
	}
```

7.方法一
```
public void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU价钱"+cpu.getPrice());
		System.out.println("硬盘容量"+HD.getAmount());		
		System.out.println("硬盘厚度"+HD.getWeight());
	}
```

## 四、实验结果
```
CPU速度2200
CPU价钱3000.0
硬盘容量200
硬盘厚度26.0
```

## 五、实验感想
通过本次实验，让我了解了构造方法的使用，掌握了方法调用时参数的传递，经过老师和同学的帮助顺利的完成了本次实验。

