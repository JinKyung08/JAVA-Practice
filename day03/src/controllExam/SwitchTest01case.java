package controllExam;

import java.util.Scanner;

public class SwitchTest01case {

	public static void main(String[] args) {
		// 주민등록번호를 입력을 받아서 (971013-1234567) 7번째(8번째)자리가 
		// 1-남,2-여,3-남,4-여
		// 주민등록번호를 입력을 받아서 (9710131234567) 6번째(7번째)자리가 
		// 1-남,2-여,3-남,4-여
		//
		
//		String ssn = "971013-1234567";
//		String ssn1="9710131234567";
//		
//		System.out.println(ssn.charAt(7));
//		System.out.println(ssn1.charAt((6)));
		
//me		//변수선언
//		String ssn = " ";
//		char ssn7 = ' ';
//		
//		//입력준비
//		Scanner scan = new Scanner(System.in);
//		
//		//안내문구
//		System.out.println("주민번호를 입력해주세요>>");
//		ssn=scan.next();
//		
//		
//		//7번째 수
//		ssn7 = ssn.charAt(7);
//
//		//출력
//		
//		switch(ssn7) {
//		case '1' : 
//				System.out.println("남");
//				break;
//		case '2' : 
//				System.out.println("여");
//				break;
//		case '3' : 
//				System.out.println("남");
//				break;
//		case '4' : 
//				System.out.println("여");
//				break;
//		default : 
//				System.out.println("");
//		}
		
		String ssn="971013-1234567";
		String ssn1="9710131234567";
		
		char ssnCode= ssn.charAt(7);
//		
//		switch(ssnCode) {
//		case '1' : 
//				System.out.println("남");
//				break;
//		case '2' : 
//				System.out.println("여");
//				break;
//		case '3' : 
//				System.out.println("남");
//				break;
//		case '4' : 
//				System.out.println("여");
//				break;
//		default : 
//				System.out.println("없는 주민등록 번호입니다.");
//				break;
//		}
	 //==================================
				
		switch(ssnCode) {
		case '1' : case '3' : //or, '1'or '3' 개념
			System.out.println("남");
			break;
		case '2' : 
		case '4' : 
			System.out.println("여");
			break;
		default : 
			System.out.println("없는 주민등록 번호입니다.");
			break;
		}
	}

}