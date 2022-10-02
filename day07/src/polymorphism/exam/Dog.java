package polymorphism.exam;

public class Dog extends Animal{
	@Override
	void cry() {
		System.out.println("강아지는 멍멍");
	}
	void running() {
		System.out.println("강아지가 달린다.");
	}
}
