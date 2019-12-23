/*
	ClassCastException:类型转换异常
	一般在多态的向下转型中容易出现
*/
class Animal_5 {
	public void eat(){}
}

class Dog_5 extends Animal_5 {
	public void eat() {}
	
	public void lookDoor() {
	
	}
}

class Cat_5 extends Animal_5 {
	public void eat() {
	
	}
	
	public void playGame() {
		
	}
}

class DuoTaiDemo5 {
	public static void main(String[] args) {
		//内存中的是狗
		Animal_5 a = new Dog_5();
		Dog_5 d = (Dog_5)a;
		
		//内存中是猫
		a = new Cat_5();
		Cat_5 c = (Cat_5)a;
		
		//内存中是猫
//		a = new Dog_5();
		Dog_5 dd = (Dog_5)a; //ClassCastException
	}
}
