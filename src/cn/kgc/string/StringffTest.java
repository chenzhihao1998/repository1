package cn.kgc.string;

import org.junit.Test;

public class StringffTest {

	//charAt(int index)
	@Test
	public void show1() {
		/**
		 * charAt(int index)���� 
		 * int index �����Ĳ�ѯ������ֵ
		 * 
		 * ��ȡָ���ַ��� �����µ��ַ� 
		 * ������0��ʼ
		 * ���� char ����
		 */
		String str = "ASDFGHJ";
		char c = str.charAt(5);
		System.out.println(str);
		System.out.println(c);
		
	}
	
	//compareToIgnoreCase(String  str) 
	@Test
	public void show2() {
		/**
		 * compareToIgnoreCase(String  str) ����
		 * String str Ҫ���Ƚϵ��ַ�
		 * 
		 * �Ƚ� ���ַ��������ֵ��������λ�� �ӵ�һ���ַ���ʼ�Ƚ�
		 * �����һ���ַ�һ���ͱȽ���һ���ַ����Դ�����
		 * ���ֵ������һ�� �Ƚ� �ַ� ���ظ�����int��
		 * ����Ǵ��ֵ�˳����Ƚ� ���� ����
		 * �Ƚϵ��������ַ����ֵ�ľ���
		 */
		String str = "BB";
		String str2 = "AC";
		int ctic = str.compareToIgnoreCase(str2);
		System.out.println(ctic);
	}
	
	//concat(String str) 
	@Test
	public void show3() {
		/**
		 * concat(String str) 
		 * String str  Ҫ���Ƚϵ��ַ���
		 *��ָ�����ַ������ӵ������ӵ��ַ���ĩβ
		 *����һ������֮����ַ���
		 *
		 */
		String str = "��������";
		String str2 = "���ܣ�";
		String str4 = "sssa";
		String concat = str.concat(str2);
		System.out.println(concat);//�������ֱ��ܣ�
		String concat2 = str4.concat(str);
		System.out.println(concat2);//sssa��������
	}
	//equals(Object anObject) 
	@Test
	public void show4() {
		/**
		 * equals(Object anObject)
		 * Object anObject  Ҫ���ȽϵĶ���ֵ
		 * 
		 * �Ƚ� �����ַ�����ֵ (����ȥ����ַֻ�������ֵ)
		 * ����booleanֵ
		 */
//		String str = "123";
//		String str2 = "123";
		String str = new String("123");
		String str2 = new String("123");
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
	}
	//getBytes() 
	@Test
	public void show5() {
		/**
		 * getBytes()
		 * ��ָ�����ַ��� ����ÿ���ַ�תΪ ��˹���� �����µ��ֽ�������
		 * ��ȡ��ÿ���ַ��İ�˹����
		 * 
		 */
		String str = "ASDFG";
		String str1 = new String("QWERT");
		byte[] bytes = str.getBytes();
		for (byte b : bytes) {
			System.out.print(b+"\t");
		}
		System.out.println("-----------------");
		byte[] bytes2 = str1.getBytes();
		for(byte b : bytes2) {
			System.out.print(b+"\t");
		}
		
	}
	//indexOf(int ch)
	@Test
	public void show6() {
		/**
		 * indexOf(int ch)
		 * int ch ��˹����
		 * 
		 * ʹ���ַ��İ�˹���� ��ѯ���ַ�������ַ�����λ��
		 * �����˹���� �ܲ鵽 ���ַ� ���ظ��ַ�������λ��
		 * ��֮ ����-1
		 */
		String str = "ASDFG";
		String str1 = new String("ZXCV");
		int of3 = str.indexOf(65);//0
		System.out.println(of3);
		int of = str.indexOf(68);//2
		System.out.println(of);
		int of2 = str.indexOf(75);//-1
		System.out.println(of2);
		
		
	}
	
	//isEmpty() 
	@Test
	public void show7() {
		/**
		 * isEmpty() 
		 * ��ѯָ�����ַ����Ƿ���ֵ 
		 * ����з���false ��֮����true
		 */
		String str = "ASDFG";
		boolean empty = str.isEmpty();
		System.out.println(empty);
		String str1 = "";
		boolean empty2 = str1.isEmpty();
		System.out.println(empty2);
	}
	
	//length() 
	@Test
	public void show8() {
		/**
		 * length()
		 * ��ѯָ�����ַ��� ���ַ�����
		 */
		String str = "ASDFGHJ";
		int length = str.length();
		System.out.println(length);
		String str1 = "";
		int length2 = str1.length();
		System.out.println(length2);
	}
	
	//replace(char oldChar, char newChar)
	@Test 
	public void show9() {
		/**
		 * replace(char oldChar, char newChar)
		 * char oldChar  ����Ҫ���滻���ַ�
		 * char newChar	 �滻����ַ�
		 * 
		 * ���ַ���  ָ�����ַ�  �滻�� ָ���滻���ֵ
		 * �����滻���ֵ
		 * 
		 */
		String str = "ASDFGAFDA";
		String str2 = str.replace('A', 'a');
		System.out.println(str2);
	}
	
	//split(String regex) 
	@Test
	public void show10() {
		/**
		 * split(String regex) 
		 * String regex �ָ����ַ�
		 * ��ָ�����ַ���  ��ָ�����ַ����зָ�
		 * ���طָ���� �ַ������� 
		 * 
		 */
		String str = "A,SDF,G" ;
		String str2 = "JKL";
		String[] split = str.split("|");
		for (String string : split) {
			System.out.println(string);
		}
		System.out.println("------------");
		String[] split1 = str.split(",");
		for (String string : split1) {
			System.out.println(string);
		}
	}
	
	//substring(int beginIndex, int endIndex) 
	@Test
	public void show11() {
		/**
		 * substring(int beginIndex, int endIndex)
		 * int beginIndex  �ʼ��λ��
		 * int endIndex	 ����λ�� (ȡ����λ�õ�ǰһ���ַ�)
		 * ��ȡ���ַ���ָ��λ�õ��ַ��� 
		 * ���� ��ȡ֮����ַ���
		 */
		String str = "ZXCVB";
		String str2 = str.substring(2, 4);
		System.out.println(str2);//CV
	}
	 
	//trim() 
	@Test
	public void show12() {
		/**
		 * trim() 
		 * �� �ַ�����ͷ�Ŀո� ȥ�� ���ܶ��ٸ�
		 * ���� ȥ���ո���ַ���
		 */
		String str = " ABUJN   ";
		String trim = str.trim();
		System.out.println(trim);
	}
}
