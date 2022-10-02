package polymorphism.exam;

public class Cat extends Animal{
	@Override
	void cry() {
		System.out.println("고양이는 야옹~");
	}
	void jump() {
		System.out.println("고양이가 뛴다.");
	}
}
