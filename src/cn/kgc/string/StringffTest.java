package cn.kgc.string;

import org.junit.Test;

public class StringffTest {

	//charAt(int index)
	@Test
	public void show1() {
		/**
		 * charAt(int index)方法 
		 * int index 给定的查询的索引值
		 * 
		 * 获取指定字符串 索引下的字符 
		 * 索引从0开始
		 * 返回 char 类型
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
		 * compareToIgnoreCase(String  str) 方法
		 * String str 要被比较的字符
		 * 
		 * 比较 两字符串的在字典中排序的位置 从第一个字符开始比较
		 * 如果第一个字符一样就比较下一个字符，以此类推
		 * 从字典排序第一个 比较 字符 返回负数（int）
		 * 如果是从字典顺序倒序比较 就是 正数
		 * 比较的是两个字符在字典的距离
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
		 * String str  要被比较的字符串
		 *将指定的字符串连接到被连接的字符串末尾
		 *返回一个连接之后的字符串
		 *
		 */
		String str = "呆！妖怪";
		String str2 = "别跑！";
		String str4 = "sssa";
		String concat = str.concat(str2);
		System.out.println(concat);//呆！妖怪别跑！
		String concat2 = str4.concat(str);
		System.out.println(concat2);//sssa呆！妖怪
	}
	//equals(Object anObject) 
	@Test
	public void show4() {
		/**
		 * equals(Object anObject)
		 * Object anObject  要被比较的对象值
		 * 
		 * 比较 两个字符串的值 (不会去看地址只看里面的值)
		 * 返回boolean值
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
		 * 将指定的字符串 里面每个字符转为 阿斯克码 存入新的字节数组中
		 * 获取到每个字符的阿斯克码
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
		 * int ch 阿斯克码
		 * 
		 * 使用字符的阿斯克码 查询该字符在这个字符串的位置
		 * 如果阿斯克码 能查到 该字符 返回该字符的索引位置
		 * 反之 返回-1
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
		 * 查询指定的字符串是否有值 
		 * 如何有返回false 反之返回true
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
		 * 查询指定的字符串 的字符长度
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
		 * char oldChar  即将要被替换的字符
		 * char newChar	 替换后的字符
		 * 
		 * 将字符串  指定的字符  替换上 指定替换后的值
		 * 返回替换后的值
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
		 * String regex 分隔的字符
		 * 将指定的字符串  按指定的字符进行分隔
		 * 返回分隔后的 字符串数组 
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
		 * int beginIndex  最开始的位置
		 * int endIndex	 结束位置 (取到该位置的前一个字符)
		 * 获取该字符串指定位置的字符串 
		 * 返回 截取之后的字符串
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
		 * 将 字符串两头的空格 去除 不管多少个
		 * 返回 去除空格的字符串
		 */
		String str = " ABUJN   ";
		String trim = str.trim();
		System.out.println(trim);
	}
}
