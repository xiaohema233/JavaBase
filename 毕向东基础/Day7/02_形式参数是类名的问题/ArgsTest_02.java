/*
	形式参数的问题：
		基本类型：形式参数的改变不影响实际参数
		引用类型：形式参数的改变直接影响实际参数
*/
//形式参数是基本类型
class Demo_02 {
	public int sum(int a,int b) {
		return a + b;
	}
}

//形式参数是引用类型
class Student_02 {
	public void show() {
		System.out.println("我爱学习");
	}
}

class StudentDemo_02 {
	//如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
	public void method(Student_02 s) { //调用的时候，把main方法中的s的地址传递到了这里 Student s = new Student();
		s.show();
	}
}

class ArgsTest_02 {
	public static void main(String[] args) {
		//形式参数是基本类型的调用
		Demo_02 d = new Demo_02();
		int result = d.sum(10,20);
		System.out.println("result:"+result);
		System.out.println("--------------");
		
		//形式参数是引用类型的调用
		//需求：我要调用StudentDemo类中的method()方法
		StudentDemo_02 sd = new StudentDemo_02();
		//创建学生对象
		Student_02 s = new Student_02();
		sd.method(s); //把s的地址给到了这里
	}
}
