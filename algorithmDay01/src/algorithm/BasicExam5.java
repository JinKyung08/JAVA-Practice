package algorithm;

import java.util.Iterator;

public class BasicExam5 {

	public static void main(String[] args) {
//		다음 피보나치 수열에 대하여  50번째 항까지의 합을 구하시오
//		1,1,2,3,5,8,13,....
//		어떤 항과 다음 항을 더하여 다음다음 항을 만든 것
//		처음 2개의 항은 1, 1
		
		
//   	1. 주어진 문제 이해와 분석 -> 무엇을 구할 것인가, 조건, ...
		
//		2. 문제 해결 방안 구상 -> 알고리즘(컴퓨터에게 풀이 방법을 알려주고 풀게 하는 것)
		
//		3. 컴퓨터 프로그램 작성 -> 코딩
		
//		4. 프로그램 실행 및 검증 -> 디버깅
		
		long sum = 0; // 합계누적
		long prevPrevNum =1 ; // n-2, 첫번째항
		long prevNum =1 ; // n-1, 두번째항
		long currentNum =0 ; // n-2 + n-1 -> c  ->첫번째항(전전항) + 두번째항(이전항) -> 다음항
		int n =2 ; // 항 순서

		sum = prevPrevNum + prevNum; //처음 시작: 첫번째항  + 두번째항
		
		while(n<50) {
			currentNum = prevPrevNum + prevNum;
				
				sum += currentNum;
				prevPrevNum=prevNum; //전전항을 이전항으로 처리
				prevNum=currentNum;
				
				n++;
			}
		System.out.println("while 의 sum : " + sum);
		
//		while(true) {
//			currentNum = prevPrevNum + prevNum;
//			sum += currentNum;
//			prevPrevNum=prevNum; //전전항을 이전항으로 처리
//			prevNum=currentNum;
//			n++;
//			
//			if(n==49) {
//				break;
//			}
//		}
		System.out.println("while 의 sum : " + sum);

//		----------포문방법
		
		for (int i = 2; i < 50; i++) {
			currentNum = prevPrevNum + prevNum;
			sum += currentNum;
			prevPrevNum=prevNum; //전전항을 이전항으로 처리
			prevNum=currentNum;
		}
	
		System.out.println("for 의 sum : " + sum);
		
		
		
		
		
		
		
		
		
		
	}

}
