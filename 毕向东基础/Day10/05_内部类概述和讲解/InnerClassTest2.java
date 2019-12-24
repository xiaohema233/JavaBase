/*
	匿名内部类在开发中的使用
*/
interface Person_t {
	public abstract void study();
}

class PersonDemo_t {
	//接口名作为形式参数
	//其实这里需要的不是接口，而是该接口的实现类的对象
	public void method(Person_t p) {
		p.study();
	}
}

//实现类
class Student_t implements Person_t {
	public void study() {
		System.out.println("好好学习,天天向上");
	}
}

class InnerClassTest2 {
	public static void main(String[] args) {
		//测试
		PersonDemo_t pd = new PersonDemo_t();
		Person_t p = new Student_t();
		pd.method(p);
		System.out.println("--------------------");
		
		//匿名内部类在开发中的使用
		//匿名内部类的本质是继承类或者实现了接口的子类匿名对象
		pd.method(new Person_t(){
			public void study() {
				System.out.println("好好学习,天天向上");
			}
		});
	}
}
