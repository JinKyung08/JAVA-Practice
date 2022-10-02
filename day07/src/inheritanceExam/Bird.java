package inheritanceExam;

public class Bird extends Animal02 {
//	String eye;       //제거 해도됨
//	String mouth;
//	String name;
	String wings;
	//생성자
	public Bird() {}
//	public Bird(String eye, String mouth, String name, String wings) {
//		super(); //부모 생성자 호출 , 부모먼저 초기화
//		this.eye = eye;
//		this.mouth = mouth;
//		this.name = name;
//		this.wings = wings;
//	}
//	public void showBird() {
//		System.out.println("eye : " + eye);
//		System.out.println("mouth : " + mouth);
//		System.out.println("name : " + name);
//		System.out.println("wings : " + wings);
//	}

	public void fly() {
		System.out.println("새가 날아간다");
	}
	@Override   //재정의 / 내가 바꿔서 써본다
 		public void cry() {
				System.out.println("짹짹");
		}
//	@Override
//		public void eat() {
//			super.eat(); //부모의 eat메서드 호출
//		System.out.println("모이를 먹다.");
//	}
}
