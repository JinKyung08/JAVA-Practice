package inheritanceExam;
	
public class Circle {
	//필드
	final static double PI = 3.1415;  //상수
	double r = 10.0;
	
	//생성자
	public Circle() {
	}
	
	//메소드
	public void findRadius() {
		System.out.println("반지름은 10.0 cm");
	}
	public void findArea () {
		System.out.println("넓이 :  PI + 반지름 + 반지름 ");
	}
}
