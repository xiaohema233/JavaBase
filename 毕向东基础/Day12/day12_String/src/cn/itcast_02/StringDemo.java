package cn.itcast_02;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "hello";
		//concat方法返回拼接后的字符串
		s=s.concat("233");
		s += "world";
		System.out.println("s:" + s); // helloworld
	}
}
