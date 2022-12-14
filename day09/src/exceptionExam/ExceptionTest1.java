package exceptionExam;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
//예외(Exception)
/*
 * Exception : 개발자가 해결 가능한 오류 ( 대체 방안을 만들어서 해결)
 * 			   연산오류, 포맷 오류,...
 * Error : jvm 자체의 오류로 개발자가 해결할 수 없음
 * 		   메모리부족, 스레드 문제,...
 * 
 * 1. Exception의 종류
 *   1) 일반예외 : 문법체크, 컴파일 자체가 불가능(빨간줄..) //  ex) System.out.println("가나);
 *   2) 실행예외 : 문법체크 X , 예외가 발생되면 프로그램이 종료. 예외메시지 출력  ex) System.out.println(7/0); /by zero
 * 
 * 2. 구문 
 *		try {
 *			 예외가 발생할 가능성이 있는 구문
 *		}catch (예외종류 참조변수){
 *			 예외가 발생할 때 실행할 문장
 * 		}catch (예외종류 참조변수){
 *			 예외가 발생할 때 실행할 문장
 *		}...{catch (예외종류 참조변수){
 *			 예외가 발생할 때 실행할 문장
 * 		}
 * 
 * 		try{
 * 			예외가 발생할 가능성이 있는 구문
 *		}catch (예외종류 참조변수){
 * 			예외가 발생할 때 실행할 문장
 *		}finally{
 *			 예외가 발생하든 발생하지 않든 실행할 문장
 *		}
 *
 *	3.리소스 자동해제 예외처리 (try with resource) : java에서 많이 사용
 *		try(리소스를 사용하는 코드){
 *				//리소스를 사용하지 않는 예외발생 가능 코드
 *		} catch(예외클래스명 참조병수명){
 *				//해당예외가 발생할 경우 처리 블록
 *		}finally{
 *				//예외와 상관없이 무조건 실행
 *		}
 *
 *	4.예외 전가(throws)
 *			예외처리를 자신이 호출된 지점으로 전가,
 *			이 경우 예외처리는 전가 받은 상위 위치에서 처리
 *			메서드명(매개변수... ) throws 예외클래스
 *			리턴타입 매서드명(매개변수...) throws 예외클래스 
 *
 */
		
		
		
//		System.out.println("가나);
//		System.out.println(7/0); /by zero
		
		int a=9,b=0;
		try {
			System.out.println(a/b);
			
		} catch(ArithmeticException e) {  // 예외가 발생할 수 있는 경우들을 catch문을 이용해 선언
//			System.out.println(e.toString());		//개발 끝나면 반드시 주석처리 또는 제거 
						//java.lang.ArithmeticException: / by zero
//			System.out.println(e.getMessage());	//개발 끝나면 반드시 주석처리 또는 제거 
						/// by zero
			e.printStackTrace(); // 계발단계에서 확인용으로만 사용하고
//								 개발이 끝난 후 반드시 주석처리하거나 제거한다.
								// 제거 안하면 보안 위험이 생김
						//java.lang.ArithmeticException: / by zero
//			              at day09/exceptionExam.ExceptionTest1.main(ExceptionTest1.java:44)
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) { // 이거은 가장 마지막에

	    }
	
	//=============예외 던지기(전가, throws)
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		
		try {
			
			square(scan.next());  // 문자열로 입력받기
		
		}catch (NumberFormatException e) {
			
			System.out.println("정수가 아님");
		
		}catch (Exception e) {
			
			System.out.println("예외발생");
		
		}//try 끝
	
	} //end of main
	
	public static void square(String s) throws NumberFormatException {
		
		int num = Integer.parseInt(s); // 문자열 정수를 숫자로 변환, 만약 정수로 변환할 수 없는 문자열이
									// 들어오면 예외가 발생하고 throws를 통해 square() 메서드를 호출한 곳으로 예외 처리 전가
		
		System.out.println(num * num);
	}
	
	
	
	
	
	
	
	
	
}
