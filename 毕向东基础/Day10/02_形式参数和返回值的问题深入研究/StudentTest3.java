/*
	链式编程。
		每次调用完毕方法后，返回的是一个对象。
*/
class Student_s3 {
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo_s3 {
	public Student_s3 getStudent() {
		return new Student_s3();
	}
}

class StudentTest3 {
	public static void main(String[] args) {
		//如何调用的呢?
		StudentDemo_s3 sd = new StudentDemo_s3();
		//Student s = sd.getStudent();
		//s.study();
		
		//大家注意了
		sd.getStudent().study();
	}
}
