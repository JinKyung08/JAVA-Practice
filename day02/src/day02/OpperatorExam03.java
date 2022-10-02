package day02;

import java.util.Scanner;

//예제3) num=3
//	숫자 하나를 입력받아서 숫자가 3이면 "같은수", 그렇지 않으면 "다른수
public class OpperatorExam03 {

	public static void main(String[] args) {
//		int num = 3, su =0;
//		String result = "";
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력>>");
//		
//		su = scan.nextInt();
//		
//		result = (su == num) ? "같은수" : "다른수";
//		System.out.println("결과 : " + result);

		// 예제4)  name = "홍길동"
// 		이름을 입력받아서 "홍길동" 같으면 같은 사람, 다르면 다름 사람
		
		String name = "홍길동", otherName = "" ,result="", equalResult="";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요>>");
		
		otherName = scan.next();
		
		result = (name == otherName) ? "같은사람" : " 다른사람";
		//name== otherName : 스택에 담긴 주소값이 같은가
		// 주소가 가리키는 곳에 있는 값들이 같은 가? equals()
		//   	문자열 1.equals(문자열2)=> 문자열1과 문자열2의 글자가 같은가
		
		equalResult = name.equals(otherName) ? "같은 사람" : "다른사람";
		
		System.out.println("결과1 : " + result);
		System.out.println("결과2 : " + equalResult);
	}

}
