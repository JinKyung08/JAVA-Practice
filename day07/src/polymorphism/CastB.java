package polymorphism;

public class CastB extends CastA{
	int n=4;
	void showB() {  //default 메서드 같은 패키지에서만
		System.out.println("B클래스");
	}
}
