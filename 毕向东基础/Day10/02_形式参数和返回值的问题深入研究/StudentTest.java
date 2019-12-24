/*
	形式参数：
		基本类型(太简单，不是我今天要讲解的)
		引用类型
			类名:(匿名对象的时候其实我们已经讲过了) 需要的是该类的对象
			抽象类:
			接口
*/
class Student_s {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo_s {
	public void method(Student_s s) { //ss; ss = new Student();  Student s = new Student();
		s.study();
	}
}

class StudentTest {
	public static void main(String[] args) {
		//需求：我要测试Student类的study()方法
		Student s = new Student();
		s.study();
		System.out.println("----------------");
		
		//需求2：我要测试StudentDemo类中的method()方法
		StudentDemo_s sd = new StudentDemo_s();
		Student_s ss = new Student_s();
		sd.method(ss);
		System.out.println("----------------");
		
		//匿名对象用法
		new StudentDemo_s().method(new Student_s());
	}
}
