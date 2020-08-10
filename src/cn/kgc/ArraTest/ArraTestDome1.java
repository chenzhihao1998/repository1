package cn.kgc.ArraTest;

import java.util.Arrays;

import org.junit.Test;

public class ArraTestDome1 {
	/**
	 * 第一题：copyOfRange底层实现原理，用java代码实现

copyOfRange
          参数 
	original——一系列的数组复制 
	from -初始索引的范围被复制,包容性 
	to——最后的指数范围复制,排斥。(这个指数可能超出数组)。 
 
          异常 
	ArrayIndexOutOfBoundsException——如果 from < 0或 from > original.length 
	IllegalArgumentException——如果 from > to 
	NullPointerException——如果 original是null 
	 */
	//方法
	public static int[] copyOfArra(int[] original , int from , int to) {

		//判断初始长度是否小于零 或者 初始长度是否大于接受数组的最大长度
		 if(from < 0 ) {
			 try {
				 //ArrayIndexOutOfBoundsException: 抛出以表示使用非法索引访问数组。 索引为负数或大于或等于数组的大小。
				 throw new ArrayIndexOutOfBoundsException("初始长度不能小于0 或最大长度不能大于接受最大长度");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		 }
		 if(from > to) {//判断初始长度是否大于最大长度
			 try {
				 //抛出表示一种方法已经通过了非法或不正确的参数。
				throw new IllegalArgumentException("初始长度不能大于最大长度");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
		 if(original == null) {
			 try {
				throw new NullPointerException("数组不能为空");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
		//声明一个数组，进对传递数组的接受
			int[] arr = new int[to-from];
			int index = 0;
			//循环遍历 将其赋值
			for(int i = from ; i < to ; i++) {
				
				if(i  < original.length) {//判断数组最大长度是否大于 参数数据 
					//如果大于赋值0
					arr[index] = original[i];
				}else {
					arr[index] = 0;
				}
				index++ ;
				//arr[index] = original[i];
			}
		 
		return arr;
	}
	@Test
	public void show() {
		int[] arr = {4,5,6,8,2,9};
		int[] arrs =  copyOfArra(arr, 2,10);
		System.out.println(Arrays.toString(arrs));
		for (int object : arrs) {
			System.out.print(object+"\t");
		}
		System.out.println("------------------------");
		int[] arr1 = Arrays.copyOfRange(arr, 2, 9);
		for (int i : arr1) {
			System.out.print(i+"\t");
		}
	}
}
