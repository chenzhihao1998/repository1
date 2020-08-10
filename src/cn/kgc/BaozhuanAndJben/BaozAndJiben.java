package cn.kgc.BaozhuanAndJben;

import org.junit.Test;

public class BaozAndJiben {
	//byte 基本  Byte包装类  字节
		@Test
		public void show1() {
			Byte num = 10;
			byte x = num;
			System.out.println(x+":"+num);
		}
		
		//short基本  Short包装   短整数
		@Test
		public void show2() {
			Short num = 20;
			short x = num;
			System.out.println(x+":"+num);
		}
		
		//int基本  Integer包装  整数
		@Test
		public void show3() {
			Integer num = 100;
			int x = num;
			System.out.println(x+":"+num);
		}
		
		//long  Long 长整数
		@Test
		public void show4() {
			Long num = 1000L;
			long x  = num;
			System.out.println(x+":"+num);
		}
		
		//float   Float  单精度小数
		@Test
		public void show5() {
			Float num = 1.1f;
			float x = num;
			System.out.println(x+":"+num);
		}
		
		//double基本  Double包装  双精度小数
		@Test
		public void show6() {
			Double num = 10.0;
			double x = num;
			System.out.println(x+":"+num);
		}
		
		//char  Character  字符
		@Test
		public void show7() {
			Character num = 'a';
			char x = num;
			System.out.println(x+":"+num);
		}
}
