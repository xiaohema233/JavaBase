/*
	final可以修饰类，方法，变量
	
	特点：
		final可以修饰类，该类不能被继承。
		final可以修饰方法，该方法不能被重写。(覆盖，复写)
		final可以修饰变量，该变量不能被重新赋值。因为这个变量其实常量。
		
	常量：
		A:字面值常量
			"hello",10,true
		B:自定义常量
			final int x = 10;
*/

//final class Fu //无法从最终Fu进行继承

class Fu_D9_01 {
	public int num = 10;
	public final int num2 = 20;

	/*
	public final void show() {

	}
	*/
}

class Zi_D9_01 extends Fu_D9_01 {
	// 如果Fu中的show()为final Zi中的show()无法覆盖Fu中的show()
	public void show() {
		num = 100;
		System.out.println(num);
		
		//无法为最终变量num2分配值
		//num2 = 200;
		System.out.println(num2);
	}
}

class FinalDemo {
	public static void main(String[] args) {
		Zi_D9_01 z = new Zi_D9_01();
		z.show();
	}
}
