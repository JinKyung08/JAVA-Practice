package repeatExam;

import java.util.Scanner;

public class whileTest02 {

	public static void main(String[] args) {


//1.================================		
//		int a = 1;
//
//		while (true) { // a<5
//			System.out.println(a + "안녕!!");
//			System.out.println("음료를 주문하세요...");
//			System.out.println();
//
//			if (a == 5) {
//				break;
//			}
//			a++; // a = a + 1;
//		}// while 끝
//		System.out.println();
//		
//		
////2.===============================
//		int b = 1;
//
//		while (true) { // b<5
//			System.out.println(b + "안녕!!");
//			System.out.println("음료를 주문하세요...");
//			System.out.println();
//
//			if (b == 5) {
//				break;
//			}
//			b++; // b = b + 1;
//
//		}//while 끝

// 		문제1) 주문 코드를 입력받아 
//			1 - 커피 주문하셨습니다.
//			2 - 홍차 주문하셨습니다
//			3 - 라떼를 주문하셨습니다
//			4 - 콜라를 주문하셨습니다.
//			0 - 주문 종료를 선택하셨습니다.
//			이 외의 숫자가 입력되면 "주문 번호가 맞지 않습니다. 다시 주문 하세요. . ."

//		int orderCode = 0;
//		
//		while(true) {
//			System.out.println("주문 코드를 입력\n"+"1.커피 2.홍차 3.라떼 4.콜라 0.주문종료");
//			
//			orderCode = scan.nextInt();
//			
////			if(orderCode==0) {
////				System.out.println("주문종료");
////				break;
////			}
//			
//			if (orderCode==1) { 
//				System.out.println("커피를 주문하셨습니다.");
//			}else if(orderCode==2) {
//				System.out.println("홍차를 주문하셨습니다.");
//			}else if(orderCode==3) {
//				System.out.println("라떼를 주문하셨습니다.");
//			}else if(orderCode==4) {
//				System.out.println("콜라를 주문하셨습니다.");
//			}else if(orderCode==0) {
//				System.out.println("주문종료");
//				break;
//			}else {
//				System.out.println("주문 번호가 맞지 않습니다. 다시 주문하세요");
//				continue;
//			}
//			System.out.println();
//		 }
		
		String orderCodeString="";
		Scanner scan =new Scanner(System.in);
	
		while(true) {
	
		System.out.println("주문 코드를 입력\n"+"1.커피 2.홍차 3.라떼 4.콜라 0.주문종료");
		orderCodeString = scan.next();
			
		switch(orderCodeString) {
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
		
		System.out.println();
		
		}
		
		
	}

}
