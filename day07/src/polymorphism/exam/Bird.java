package polymorphism.exam;

public class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("참새는 짹짹");
	}
	void fly() {
		System.out.println("참새가 난다.");
	}
}
