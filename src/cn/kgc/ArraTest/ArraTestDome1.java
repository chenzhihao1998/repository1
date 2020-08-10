package cn.kgc.ArraTest;

import java.util.Arrays;

import org.junit.Test;

public class ArraTestDome1 {
	/**
	 * ��һ�⣺copyOfRange�ײ�ʵ��ԭ����java����ʵ��

copyOfRange
          ���� 
	original����һϵ�е����鸴�� 
	from -��ʼ�����ķ�Χ������,������ 
	to��������ָ����Χ����,�ų⡣(���ָ�����ܳ�������)�� 
 
          �쳣 
	ArrayIndexOutOfBoundsException������� from < 0�� from > original.length 
	IllegalArgumentException������� from > to 
	NullPointerException������� original��null 
	 */
	//����
	public static int[] copyOfArra(int[] original , int from , int to) {

		//�жϳ�ʼ�����Ƿ�С���� ���� ��ʼ�����Ƿ���ڽ����������󳤶�
		 if(from < 0 ) {
			 try {
				 //ArrayIndexOutOfBoundsException: �׳��Ա�ʾʹ�÷Ƿ������������顣 ����Ϊ��������ڻ��������Ĵ�С��
				 throw new ArrayIndexOutOfBoundsException("��ʼ���Ȳ���С��0 ����󳤶Ȳ��ܴ��ڽ�����󳤶�");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		 }
		 if(from > to) {//�жϳ�ʼ�����Ƿ������󳤶�
			 try {
				 //�׳���ʾһ�ַ����Ѿ�ͨ���˷Ƿ�����ȷ�Ĳ�����
				throw new IllegalArgumentException("��ʼ���Ȳ��ܴ�����󳤶�");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
		 if(original == null) {
			 try {
				throw new NullPointerException("���鲻��Ϊ��");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		 }
		//����һ�����飬���Դ�������Ľ���
			int[] arr = new int[to-from];
			int index = 0;
			//ѭ������ ���丳ֵ
			for(int i = from ; i < to ; i++) {
				
				if(i  < original.length) {//�ж�������󳤶��Ƿ���� �������� 
					//������ڸ�ֵ0
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
