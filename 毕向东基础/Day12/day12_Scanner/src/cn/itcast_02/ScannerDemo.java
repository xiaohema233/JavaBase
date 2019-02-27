package cn.itcast_02;

import java.util.Scanner;

/*
 * 基本格式：
 * 		public boolean hasNextXxx():判断是否是某种类型的元素
 * 		public Xxx nextXxx():获取该元素
 * 
 * 举例：用int类型的方法举例
 * 		public boolean hasNextInt()  判断是否是某种类型的
 * 		public int nextInt()  用来接收，返回某种类型的元素
 * 
 * 注意：
 * 		InputMismatchException：输入的和你想要的不匹配
 */
public class ScannerDemo {
	public static void main(String[] args) {
		// 创建对象
		Scanner sc = new Scanner(System.in);

//		if (sc.hasNextLine()) {
//			String s = sc.nextLine();
//			System.out.println(s);
//		}
		// 获取数据
		if (sc.hasNextInt()) {
			int x = sc.nextInt();
			System.out.println("x:" + x);
		} else {
			System.out.println("你输入的数据有误");
		}
	}
}
