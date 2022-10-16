package algorithm;

import java.util.Arrays;

public class BasicExam8 {

	public static void main(String[] args) {
		
		//구구단
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i+"단을 출력합니다.");
//			for (int j = 1; j <10; j++) {
//				System.out.println(i + "x" + j + "=" + i*j);
//			}
//		}
		
		//배열
		int [] array = new int[5];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;

		int[] array1 = new int[] {10,20,30,40,50};
		
		int[] array2;
		array2=new int[] {10,20,30,40,50};
		
		int[] array3 = {10,20,30,40,50};
		
		int[] array4= new int[5];
		
		for (int i = 0; i < array4.length; i++) {
			array4[i] = (i+1) *10;
		}
			for (int i = 0; i < array1.length; i++) {
				System.out.println(array1[i]);
			}
			
				System.out.println();
			
				System.out.println(Arrays.toString(array2));
		
			for(int a : array3) {
				System.out.println(a);
			}
		
		System.out.println();
		System.out.println(array4[0]);
		array4[1]=100;
		System.out.println(array4[1]);
		
		
		
	}

}
