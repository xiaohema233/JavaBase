/*
	多态的弊端：
		不能使用子类的特有功能。
*/
class Fu_3 {
	public void show() {
		System.out.println("show fu");
	}
}

class Zi_3 extends Fu_3 {
	public void show() {
		System.out.println("show zi");
	}
	
	public void method() {
		System.out.println("method zi");
	}

}

class DuoTaiDemo3 {
	public static void main(String[] args) {
		//测试
		Fu_3 f = new Zi_3();
		f.show();
		//父类对象不能使用子类的特有功能。
		//f.method();
	}
}
