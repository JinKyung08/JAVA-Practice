package controllExam;

import java.util.Scanner;

public class ifTest03 {

	public static void main(String[] args) {
		// score = 83
		// score가 90점 이상이면 'A'
		// score가 90점미만 80점 이상이면 'B'
		// score가 80점미만 70점 이상이면 'C'
		// score가 70점미만 이면  'D'로 처리
		
	
//		int score = 83;
//		
//		
//		if(score>=90) {
//			System.out.println('A');
//		}else if(score>=80) {
//			System.out.println('B');
//		}else if(score>=70) {
//			System.out.println('C');
//		}else {
//			System.out.println('D');
//		}
		
// 문제1) 코드를 입력받아 
//		1 - 커피 주문하셨습니다.
//		2 - 홍차 주문하셨습니다
//		3 - 라떼를 주문하셨습니다
//		4 - 콜라를 주문하셨습니다.
//		0 - 주문 종료를 선택하셨습니다.
//		이 외의 숫자가 입력되면 "주문 번호가 맞지 않습니다. 다시 주문 하세요. . ."
		
		//변수선언
		int code = 0;   
		String codeString ="";
		//입력준비
		Scanner scan = new Scanner(System.in);
		
		//안내문구
		System.out.println("코드를 입력하세요.\n"+ "1:커피 2:홍차 3:라떼 4:콜라 0:주문종료");
		codeString = scan.next();  //문자열로 코드받기
//		code = scan.nextInt(); // 정수로 //
//		code = Integer.parseInt(codeString) ;  //정수로
//		
//		//출력
//		if(code==1) {
//			System.out.println("커피 주문하셨습니다");
//		}else if(code==2) {
//			System.out.println("홍차 주문하셨습니다");
//		}else if(code==3) {
//			System.out.println("라떼 주문하셨습니다");
//		}else if(code==4) { 
//			System.out.println("콜라 주문하셨습니다");
//		}else if(code==0) {
//			System.out.println("주문 종료를 선택하셨습니다");
//		}else {
//			System.out.println("주문 번호가 맞지 않습니다");
//		}
//		
		//============
		switch(codeString) {
		case "1" : 
				System.out.println("커피주문");
				break;
		case "2" : 
				System.out.println("홍차주문");
				break;
		case "3" : 
				System.out.println("라떼주문");
				break;
		case "4" : 
				System.out.println("콜라주문");
				break;
		case "0" : 
				System.out.println("주문종료");
				break;
		default : 
				System.out.println("잘못주문 다시 주문");
		}
		
		
		
	}

}
