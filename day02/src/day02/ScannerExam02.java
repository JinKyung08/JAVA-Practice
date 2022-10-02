package day02;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 60점 이상이면 "합격" 그렇지 않으면 "불합격"
 */
public class ScannerExam02 {

	public static void main(String[] args) {
		int jumsu = 0;
		String result = "";
//		String name="";
		
		//#1. 키보드로 부터 입력받겠다.
		Scanner scan = new Scanner(System.in);
		
		//#2.안내 문구
		System.out.println("점수를 입력하세요>>");
		
		//#3.입력 받은 점수 가져오기
		jumsu = scan.nextInt();
//		name = scan.next();
		result= jumsu >=60? "합격" : "불합격";
		
		//#4.결과 출력
		System.out.println("입력받은 점수 : " + jumsu);
//		System.out.println("입력받은 이름 : " + name);
		System.out.println("판정결과 : " + result);
		
		
		
	}

}
