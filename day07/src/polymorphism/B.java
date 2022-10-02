package polymorphism;

public class B extends A{
	
	String name = "홍";
	int score = 80;
	
	public B() {}
	
	public void bshow() {
		System.out.println("B 자식 객체의 메서드");
	}
	
	@Override
	public void showA() {
		System.out.println("자식이 재정의");
	   }

}
