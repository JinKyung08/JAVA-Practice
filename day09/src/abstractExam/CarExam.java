package abstractExam;

public class CarExam {

	public static void main(String[] args) {
		//객체생성
//		Car car = new Car("현대","쏘나타");  // 추상클래스라 객체생성X
		MyCar myCar = new MyCar ("삼성", "르노", 320);
//		new MyCar ("삼성", "르노", 320); 이렇게 쓸수 있으나 한번 사용가능
		myCar.showInfo();
		myCar.toString();
		
		System.out.println(myCar.model);
		System.out.println(myCar.name);
		System.out.println(myCar.speed);
	
		System.out.println(new MyCar ("삼성", "르노", 320).speed);//객체를 넘겨 주지않고 바로 이렇게 쓸수 있으나 한번 사용가능
		
//		Car car = new Car ("현대","소나타"); //추상클래스가 객체 생성 X
	}

} // end of class
