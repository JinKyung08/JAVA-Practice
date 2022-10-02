package day02;

public class AreaExam {

	public static void main(String[] args) {
		// 변수를 사용하여
		//	1) 사각형의 넓이와 삼각형 넓이
		
//		double width = 10;
//		double height = 5;
		double width =10, height =5, rectArea=0.0, triArea=0.0;
		
		rectArea = width * height;
		
		width = 5.0;
		height = 7.2;
		triArea = width * height / 2;
		
		System.out.println("밑변 : " + width);
		System.out.println("높이 : " + height);
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
