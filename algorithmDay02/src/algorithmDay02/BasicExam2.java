package algorithmDay02;

import java.util.Iterator;

public class BasicExam2 {

	public static void main(String[] args) {
//	문1) array ={21,17,4,51,24,75,40,27,48,72}
//		3의 배수 이면서 4배수인 수의 개수
		
//		int[] array = {21,17,4,51,24,75,40,27,48,72};
//		int count =0;
//		
//		for (int i = 0; i < array.length; i++) {
//			int value = array[i]%3;
//			int value2 = array[i]%4;
//			
//			if(value==0 && value2==0) { //if(array[i]%3==0 & array[i]%4==0)
//
//				count++; //개수
//			}
//				
//		}
//		System.out.println(count);
			
//문2) 4부터 500까지의 자연수 중에서 완전수를 찾아 출력하고 그 개수를 구하기
		//완전수 : 자연수 중에서 자기 자신을 뺀 약수들의 합이 자기 자신과 같아지는 수
		
//		ex) 45 => 1,3,5,9,15,45
//				  1+3+5+9+15≠45 => 완전수 아님
//		ex) 28 => 1,2,4,7,14,28
//				  1+2+4+7+14=28  => 완전수
		int count =0 ;
		
		for (int i = 4; i <= 500; i++) {
			int sum = 0; //약수 합계 i의 약수들의 합을 담기 위해
			
			//약수구하려는 범위 설정
			int k = i /2;
			
			//약수 찾기
			for (int j = 1; j <= k; j++) {
				
				//i의 약수인지 판별
				if((i%j)==0) {  //약수 구하기
					sum +=j;	//약수이면 합에 그 약수 더하기
				}
			}
			
			// 완전수 인지 판별
			if ( i==sum) {  // i값과 더한약수의 값이 같으면 완전수
				count++;	//완전수 개수 누적
				System.out.println("완전수 : "+ i);
				}
			
		}
		System.out.println("완전수 개수 :" + count);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
