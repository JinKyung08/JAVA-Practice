package algorithm;

import java.util.Scanner;

public class BasicExam2 {

	public static void main(String[] args) {
		// 임의 두 수를 입력 받아서 두 수 사이의 합을 구하기
		// 단, 입력한 두 수를 포함한 합
		
		//변수 선언 / 초기화
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		//입력받기
		Scanner scan = new Scanner (System.in);
		System.out.println("숫자 두 개를 입력하세요");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		//두 수 의 대소 관계
		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}			
		}else {
			for (int i = num2; i <= num1; i++) {
				sum += i;
	      }
		}

//--------------------------------------------
	// 다른 방법
		
		if(num1 >= num2) {
			int temp=0;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}	
		
		//출력
		System.out.println("입력한 두 수 : " + num1 + ", " + num2);
		System.out.println("두 수를 포함한 합은 : " + sum);
		
		
		
		
		
		
		
		
		
		
	}

}
