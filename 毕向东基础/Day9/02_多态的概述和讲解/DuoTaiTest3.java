/*
	看程序写结果:先判断有没有问题，如果没有，写出结果
*/
class Fu_t3 {
	public void show() {
		System.out.println("fu show");
	}
}

class Zi_t3 extends Fu_t3 {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

class DuoTaiTest3 {
	public static void main(String[] args) {
		Fu_t3 f = new Zi_t3();
		Zi_t3 zi_t3 = (Zi_t3)f;
		//找不到符号
		//f.method();
		zi_t3.method();
		zi_t3.show();
		f.show();
	}
}
