package repeatExam02;

import java.util.Scanner;

public class ForAndWhileTest02 {

	public static void main(String[] args) {
	//문제1) 주사위 두 개를 던져서 나오는 눈의 합이 5가는 경우를 모두 출력
	//(1,4), (2,3), (3,2), (4,1)

//	for (int i = 1; i <= 6; i++) {
//		for (int j = 1; j <= 6; j++) {
//			if (i + j == 5) {
//				System.out.print("(" + i + "," + j + ")\t");
//			}
//		}
//	}
		
	//문제2) 숫자를 입력받아
	//입력 받은 숫자
	/* 2
	 * 1 3
	 * 5 7
	 * 
	 * 3
	 * 1  4  7
	 * 10 13 16
	 * 19 22 24
	 */

	//변수선언
	 int num=0, addSu = 1; //시작값 addSu =1;
	
	 //입력
	 Scanner scan = new Scanner(System.in);	 
		System.out.println("구하려는 숫자를 입력>>");
		num = scan.nextInt();
		
		System.out.println("입력값 = " + num);
		
		//반복문
		for(int i=0; i<num; i++) {         //입력받은 숫자 만큼 반복
			
			for(int j=0; j<num; j++) {       // i는 초기화, 입력받은 숫자만큼 계산을 반복해서 출력
				System.out.print(addSu + "\t");   //System.out.printf("%5d\t",addSu);
												//처음에는 j의 초기값(1) 나와야 하기 때문에 순서가 중요하다!
				addSu += num ;					//1이 출력되고 난 뒤에 계산 시작
			}
			System.out.println();  
		}
		
		
		
	} // end of main

} // end of ForAndWhileTest02
