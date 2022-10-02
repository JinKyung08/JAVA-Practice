package polymorphism.exam;

public abstract class Animal { // 추상클래스
//	void cry() {}   // 완성된 메서드
	abstract void cry(); // 미완성된 메소드 , 추상메서드
	//abstract : 미완성 메서드를 갖고 있는 것 
	
	//추상클래스는 완선이 안된 클래스라 객체를 생성할 수 없다.
	//상속을 통해 자식이 부모의 추상메서드를 완성시켜서 객체를 생성한다.
	
}
