package day02;

public class AreaExam2 {

	public static void main(String[] args) {
		// 변수를 사용하여
		//	1) 사각형의 넓이와 삼각형 넓이
		
//		double width = 10;	// 변수 - 다른 곳에서 값을 변경할 수 있다.
//		double height = 5;
		// 상수 : 한번 선언되면 다른 곳에서 수정할 수 없다.
		final double WIDTH =5.7, HEIGHT =5;
		double rectArea=0, triArea=0.0;
		
		
		rectArea = WIDTH * HEIGHT;
		
//		WIDTH = 5.0;
//		HEIGHT = 7.2;
		triArea = WIDTH * HEIGHT / 2;
		
		System.out.println("밑변 : " + WIDTH);
		System.out.println("높이 : " + HEIGHT);
		System.out.println("사각형의 넓이 : " + rectArea);
		System.out.println("삼각형의 넓이 : " + rectArea);
		
		//연산자 우선순위 : (), . , []
		// * , / 가 +, - 우선순위가 높음
		// *, / 우선순위 같음 => 왼쪽에서 부터 오른쪽으로 계산
		// +, - 우선순위 같음 => 왼쪽에서 부터 오른쪽으로 계산
				
				
		// 상수(대문자)를 사용하여
		// 	사각형의 넓이와 삼각형 넓이
		
	}

}
