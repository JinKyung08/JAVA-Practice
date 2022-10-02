package day02;

import java.util.Scanner;

public class OpperatorExam02 {

	public static void main(String[] args) {
//		int a=3,b=2, c=5;
		
//		c = a++ + b--; 
//		System.out.println("a : "+a +","+"b : "+b+","+"c :"+c);
		
//		int a=3,b=2, c=5;
//		
//		c = a++ + --b; 
//		System.out.println("a : "+a +","+"b : "+b+","+"c :"+c);


	// 논리 연산자
//		boolean result = false
//		boolean result = (10>3) && (4>=5);
//		
//		
//		int kor=80, eng=70, mat=80;
//		result = (kor>=60) && (eng>=60);
//		result = (kor>=60) && (eng>=60) && (mat>=60);
//		
//		result = (kor>=60) || (eng>=60) || (mat>=60);
//		System.out.println(result);
//		System.out.println();
		
// 예제1) 두 수를 입력받아서 두 수 모두 60점 이상이면 "합격" 그렇지 않으면 "불합격"		
		 //구하려는것 : 합격, 불합격 => 중하나
		// 판단하는것이 필요 => 삼항 연산자
		//조건 : 두 수가 모두 60점 이상(&&)
		//입력받기 => Scanner => Scanner  준비-> 안내 문구 -> 입력한 값가져오기 ->활용
		
		//#1 변수 선언 -> 두 수, 결과
		int firstNum=0, secondNum = 0;
		String result = ""; //문자열의 기본값 "", null, 문자 : ' ', boolean : false
		
		//#2 입력 받을 준비 
		Scanner scan = new Scanner(System.in); 

		//#3 안내문구
		System.out.println("첫번째 숫자를 입력하세요>>");
		firstNum = scan.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요>>");
		secondNum = scan.nextInt();
		
		//#4 판단
		result = (firstNum >=60 && secondNum>=60) ? "합격" : "불합격";

		System.out.println("결과 : " + result);
// 예제2) 두 수를 입력 받아서 큰수와 작은 수를 출력하시오.
		
		
// 예제3) num=3
// 		숫자 하나를 입력받아서 숫자가 3ㅇ이면 "같은수", 그렇지 않으면 "다른수:
			
// 예제4)  name = "홍길동"
// 		이름을 입력받아서 "홍길동" 같으면 같은 사람, 다르면 다름 사
//	
	}

}
