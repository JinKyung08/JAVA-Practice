package arrayExam;

import java.util.Arrays;

public class LottoExam {

	public static void main(String[] args) {
			// 초기값 설정 : 0 ~ 9, 0,1,2,3,4,5,6,7,8,9 
			// 섞기 -> random, 10
			// 자리바꿈 => 임시 변수 (temp)
		
		// 0~9까지 담고 있을 공간
//		int[] numArray = new int [10];
//		
//		for(int i=0; i<numArray.length; i++) {
//			numArray[i] = i; // 배열에 0~9 까지 순차적으로 담김
//		}
		
		//확인
//		for(int i=0; i<numArray.length; i++) {
//			System.out.println(numArray[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(numArray));
//		
//		for(int n : numArray) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
		
		// 배열의 요소값 섞기
//		for(int i=0; i<10; i++ ) {
//			int n = (int)(Math.random()*10);  // 0,1,2,3,4,5,6,7,8,9 중 임의의 값
//			int temp = 0;
//			
//			temp = numArray[i];
//			numArray[i] = numArray[n];
//			numArray[n] = temp;
//				
//		}
//		System.out.println(Arrays.toString(numArray));
//		
		
		//int n = (int)(Math.random()*45)+); 로또

		//Lotto번호
		int [] lotto = new int[45];
		
		for(int i=0; i < lotto.length; i++) {
			lotto[i]=i+1;
		}
		
		for(int i=0; i<lotto.length; i++) {
			int n = (int)(Math.random()*45)+1;
			int temp = 0;
			
			temp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = temp;
			
		}
		for (int i=0; i<6; i++) {
			System.out.printf(lotto[i]+" ");
		}
		
		
		
	} //end of main

} // end of class
