/*
	写程序的执行结果。
	
	林青霞都60了，我很伤心
	我是main方法
	Student 静态代码块
	Student 构造代码块
	Student 构造方法
	Student 构造代码块
	Student 构造方法
*/

class Student_D8_03 {
	static {
		System.out.println("Student 静态代码块");
	}

	{
		System.out.println("Student 构造代码块");
	}

	public Student_D8_03() {
		System.out.println("Student 构造方法");
	}
}

class StudentDemo_D8_03 {
	static {
		System.out.println("林青霞都60了，我很伤心");
	}
	
	public static void main(String[] args) {
		System.out.println("我是main方法");

		Student_D8_03 s1 = new Student_D8_03();
		Student_D8_03 s2 = new Student_D8_03();
	}
}
