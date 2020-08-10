package cn.kgc.BaozhuanAndJben;

import java.util.Collections;

import org.junit.Test;

public class BaoZAndJibenJuLi {
	//Byte ×Ö½Ú
	@Test
	public void show1() {
		//Integer num = Integer.valueOf(5);
		
		Short num1 = Short.valueOf((short) 100);
		Short num2 = Short.valueOf((short) 100);
		Short num3 = Short.valueOf((short) 20);
		Short num4 = Short.valueOf((short) 20);
		System.out.println(num1 == num2);
		System.out.println(num3 == num4);
	}
	
	//Integer
	@Test
	public void show2() {
		int num = (-(-128) + 127 + 1);
		System.out.println(num);//256
	}
	@Test
	public void show() {
		long test = 012;
		float f = -412;
		double d = 0x12345678;
		int[] a[] = new int[10][10];
	
		 
	}
	@Test
	public void show3() {
		String s1 = new String("amit");

		System.out.println(s1.replace('m','r'));

		System.out.println(s1);

		String s3 = "arit";

		String s4 = "arit";

		String s2 = s1.replace('m','r');

		System.out.println(s2 == s3);

		System.out.println(s3 == s4);

	}
}
