package repeatExam;

import java.util.Scanner;

public class whileTest04 {

	public static void main(String[] args) {

// 문제1) 반지름을 입력받아서 원의 넓이와 사각형의 넓이 구하기
		
		//변수선언
//		double radius=0, width=0, height=0;
//		final double PI = 3.14;
//		
//		//입력받기
//		Scanner scan = new Scanner(System.in);
//		System.out.println("반지름을 입력하세요");
//		radius = scan.nextInt();
//		System.out.println("밑변을 입력하세요");
//		width = scan.nextInt();
//		System.out.println("높이를 입력하세요");
//		height = scan.nextInt();
//		
//		//출력
//		System.out.println("원의 넓이 : "+(radius*radius*PI));
//		System.out.println("사각형의 넓이 : "+(width*height));
		
// 문제2) 두수를 입력받아서 두 수의 차이를 구하시오. 단, 차이는 양수가 되도록 프로그램 작성
		
//		//변수선언
//		int num1=0, num2=0;
//		
//		//입력받기
//		System.out.println("두 수를 입력하세요");
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		
//		//출력
//		
//		if ((num1-num2)>0) {
//			System.out.println("두 수의 차이는 :" + (num1-num2));
//		}else {
//			System.out.println("두 수의 차이는 :" + (num2-num1));
//		}
		
// 문제3) 1 ~ 100까지 홀수의 합을 구하시오.
		
		//변수선언
		int sum = 0;  //합

		// 반복문
		for (int i = 1; i <= 100; i++) {    // i 지역변수 (for 범위 안에서만), i++=>i+1
			
			//홀수인지 판단 (if)
			if (i % 2 == 1) {                     //= !(i%2==0)
				sum += i; // sum=sum+i;           
			}// end of if
			
			//짝수이면 증감식 부분으로 돌아가기
			//if(i%2==0){
			//continue;
			//} end of if
			// sum +=i;
			
		}//end of for
		//출력
		System.out.println("1~100까지 홀수의 합 : " + sum);
		
		
// 문제4) 100 ~ 1까지 짝수의 합을 구하시오.
		//변수선언
		int sum2=0;
		
		//반복문
		for (int i=100; i >= 1; i--) {
			if (i%2 ==0) {
				sum2 += i;
			}// end of if
		}// end of for
		//출력
		System.out.println("100~1까지 짝수의 합 : " + sum2);
		
		
	}
}
