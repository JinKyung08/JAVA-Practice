package arrayExam;

import java.util.Iterator;

public class ArrayExam03 {

	public static void main(String[] args) {
//		문제) 홍길동반 학생들의 성적은 다음과 같다.
//				이것을 이용하여 총점과 평균을 구하시오.
//				{100, 85, 96, 75, 63}
		//변수선언
		int[] jumsu = new int[] {100,85,96,75,63};
		int sum=0; 
		double avg=0;
		
		//총점 계산
		for(int i=0; i<jumsu.length; i++) {
			sum += jumsu[i]; //sum = sum+sore[i];
		}
		//평균 계산
		avg = sum / (double)(jumsu.length);
		
		//출력
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);
		
				
//		문제2) 다음 자료의 최댓값과 최솟값을 구하는 프로그램
//				점수(score) { 73,83,96,20,15,64,72}
		
		//변수선언
		int[] score = new int[] {73,83,96,20,15,64,72};
		int max = score[0];  // max => 가장 작은 값을 담거나, 배열일 경우 0번째 인덱스의 값 담기
		int min = score[0];  // min => 구하려는 범위 값보다 월등히 큰 값을 담거나, 배열일 경우 0번째 인덱스의 값 담기
		
		//최대값,최솟값 구하기
		for(int i=0; i<score.length; i++) {  // max와 min에 0번째 인덱스 값이 이미 담겨 있으므로
			if (max<score[i]) {              // 1번째 인덱스 요소부터 비교하기 위해 i=1;로 해도됨
				max = score[i];
			}
			if (min>score[i]) {
				min=score[i];
			}
		} 
		//출력
		System.out.println(max);
		System.out.println(min);
		
		
		
	
		
		
	} //end of main

} // end of ArrayExam03
