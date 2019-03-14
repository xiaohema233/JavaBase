package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存操作流：用于处理临时存储信息的，程序结束，数据就从内存中消失。
 * 字节数组：
 * 		ByteArrayInputStream
 * 		ByteArrayOutputStream
 * 字符数组：
 * 		CharArrayReader
 * 		CharArrayWriter
 * 字符串：
 * 		StringReader
 * 		StringWriter
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) throws IOException {
		// 写数据
		// ByteArrayOutputStream()
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// 写数据
		for (int x = 0; x < 10; x++) {
			baos.write(("hello" + x).getBytes());
		}

		// 释放资源
		// 通过查看源码我们知道这里什么都没做，所以根本需要close()
		// baos.close();

		// public byte[] toByteArray()
		byte[] bys = baos.toByteArray();

		// 读数据
		// ByteArrayInputStream(byte[] buf)
		ByteArrayInputStream bais = new ByteArrayInputStream(bys);

		int by = 0;
		while ((by = bais.read()) != -1) {
			System.out.print((char) by);
		}

		// bais.close();
	}
}
package cn.itcast_01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 可以读写基本数据类型的数据
 * 数据输入流：DataInputStream
 * 			DataInputStream(InputStream in)
 * 数据输出流：DataOutputStream
 * 			DataOutputStream(OutputStream out) 
 */
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		// 写
		// write();

		// 读
		read();
	}

	private static void read() throws IOException {
		// DataInputStream(InputStream in)
		// 创建数据输入流对象
		DataInputStream dis = new DataInputStream(
				new FileInputStream("dos.txt"));

		// 读数据
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		char c = dis.readChar();
		boolean bb = dis.readBoolean();

		// 释放资源
		dis.close();

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bb);
	}

	private static void write() throws IOException {
		// DataOutputStream(OutputStream out)
		// 创建数据输出流对象
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(
				"dos.txt"));

		// 写数据了
		dos.writeByte(10);
		dos.writeShort(100);
		dos.writeInt(1000);
		dos.writeLong(10000);
		dos.writeFloat(12.34F);
		dos.writeDouble(12.56);
		dos.writeChar('a');
		dos.writeBoolean(true);

		// 释放资源
		dos.close();
	}
}
