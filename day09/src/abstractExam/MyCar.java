package abstractExam;

public class MyCar extends Car {
		
		int speed ;
		
		public MyCar(String name,String model,int speed) {
			super(name, model);  
			this.speed=speed;   //순서 중요  부모 먼저 
		}
		
		
		@Override
		public void showInfo() {
			System.out.println("부모의 showInfo를 재정의한 부분");
		}
		
		
		
		
}
