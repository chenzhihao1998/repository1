package cn.kgc.BaozhuanAndJben;

import org.junit.Test;

public class BaozAndJiben {
	//byte ����  Byte��װ��  �ֽ�
		@Test
		public void show1() {
			Byte num = 10;
			byte x = num;
			System.out.println(x+":"+num);
		}
		
		//short����  Short��װ   ������
		@Test
		public void show2() {
			Short num = 20;
			short x = num;
			System.out.println(x+":"+num);
		}
		
		//int����  Integer��װ  ����
		@Test
		public void show3() {
			Integer num = 100;
			int x = num;
			System.out.println(x+":"+num);
		}
		
		//long  Long ������
		@Test
		public void show4() {
			Long num = 1000L;
			long x  = num;
			System.out.println(x+":"+num);
		}
		
		//float   Float  ������С��
		@Test
		public void show5() {
			Float num = 1.1f;
			float x = num;
			System.out.println(x+":"+num);
		}
		
		//double����  Double��װ  ˫����С��
		@Test
		public void show6() {
			Double num = 10.0;
			double x = num;
			System.out.println(x+":"+num);
		}
		
		//char  Character  �ַ�
		@Test
		public void show7() {
			Character num = 'a';
			char x = num;
			System.out.println(x+":"+num);
		}
}
