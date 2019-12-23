/*
	多态练习：猫狗案例
*/
class Animal_t {
	public void eat(){
		System.out.println("吃饭");
	}
}

class Dog_t extends Animal_t {
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	public void lookDoor() {
		System.out.println("狗看门");
	}
}

class Cat_t extends Animal_t {
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void playGame() {
		System.out.println("猫捉迷藏");
	}
}

class DuoTaiTest {
	public static void main(String[] args) {
		//定义为狗
		Animal_t a = new Dog_t();
		a.eat();
		System.out.println("--------------");
		//还原成狗
		Dog_t d = (Dog_t)a;
		d.eat();
		d.lookDoor();
		System.out.println("--------------");
		//变成猫
		a = new Cat_t();
		a.eat();
		System.out.println("--------------");
		//还原成猫
		Cat_t c = (Cat_t)a;
		c.eat();
		c.playGame();
		System.out.println("--------------");
		
		//演示错误的内容
		//Dog_t dd = new Animal_t();
		//Dog_t ddd = new Cat_t();
		//ClassCastException
		//Dog_t dd = (Dog_t)a;
	}
}	
