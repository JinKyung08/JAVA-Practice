package interfaceExam;

public class CarInterfaceMain {

	public static void main(String[] args) {
			CarInterfaceTest1 cit = new CarInterfaceTest1();
			
			cit.showInfo();
			cit.contentShow();
			cit.repair();
			InterfaceTest1.reset(); // static메서드는 클래스명으로 호출 / 클래스명.메서드명(),클래스명.필드명
			
			//익명 이너 구현 객체
			
			InterfaceTest1 inter = new InterfaceTest1() {
				
				@Override
				public void showInfo() {
					System.out.println("익명 구현 객체의 메서드1");
				}
				
				@Override
				public void contentShow() {
					System.out.println("익명 구현 객체의 메서드2");
				}
			};
			
			inter.contentShow();
			inter.showInfo();
	
	
	
	}
	
	

}
