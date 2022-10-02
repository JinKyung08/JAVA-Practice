package interfaceExam;

public class CarInterfaceTest1 implements InterfaceTest1 {

	@Override
	public void showInfo() {
		System.out.println("자동차의 최대 속력 : " + MAX);
		System.out.println("자동차의 최대 속력 : " + InterfaceTest1.MAX); // 이게 원칙 but 자식이라서 맘대로 가져와서 쓸수 잇음 
		System.out.println();
	}

	@Override
	public void contentShow() {
		System.out.println("자동차의 최소 속력 : " + MIN);
	}

}
