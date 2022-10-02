package day02;
/*
 * 작성일 : 22.09.20
 * 내용 : 변수 선언
*/
public class VariableTest {
	
	
	public static void main(String[] args) {
//		변수 : 하나의 값을 저장할 수 있는 저장 공간
//		타입 변수명;
//		타입 변수명=값;
		
/* 1. 반지름을 주고 원의 넓이 구하기 
 * 2. 사각형의 넓이 구하기 (가로, 세로)
 * 원의 넓이 : 반지름 * 반지름 * 원주율
 * 사각형의 넓이 : 밑변 * 높이
 */
		
		// 무엇을 구할까? - 원의 넓이
		// 필요한 것-> 구조는 어떻게 할까?
		// 변수는 어떻게 할 것인가? 원주율 => ? 계산식은 어떻게 처리 할까?
		int radius = 10; //반지름
			// int => 0, long => 0L
		final double PI = 3.1415;
			// 실수형 => 소수점이 있는 수 
			//	double => 0.0,		float => 0.0f
		double area = 0.0;
		area = radius * radius * PI; 
		
		System.out.println("반지름 : " + radius);
		System.out.println("원주율 : " + PI);
		System.out.println("원의 넓이 : " + area);
		

		int width = 10; // 밑변
		int height = 5;// 높이
		area = width * height;
		
		System.out.println("밑변 : " + width);
		System.out.println("높이 :" + height);
		System.out.println("사각형의 넓이 : " + area); 
		
		
		
	}// main 끝
}// VariableTest 클래스 끝
