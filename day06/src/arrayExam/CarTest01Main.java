package arrayExam;

public class CarTest01Main {

	public static void main(String[] args) {
		//객체생성
		CarTest01 myCar = new CarTest01();
		CarTest01 momCar = new CarTest01();
		
		//객체사용
		myCar.company = "현대";
		myCar.model = "아반떼";
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.speed);

		myCar.carInfo();		
		System.out.println();
		
		momCar.company = "기아";
		momCar.model = "K7";
		
		System.out.println(momCar.company);
		System.out.println(momCar.model);
		System.out.println(momCar.speed);

		momCar.carInfo();
		
		
		//static : 클래스명. 필드명
		//         클래스명. 메서드명 ()
		System.out.println(CarTest01.maxSpeed);
		CarTest01.carShow();
	}

}
