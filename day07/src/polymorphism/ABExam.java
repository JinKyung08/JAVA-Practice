package polymorphism;

public class ABExam {

	public static void main(String[] args) {
		A a = new A();
		a.showA();
		System.out.println();
		
		B b = new B();
		b.bshow();
		b.showA();
		
		A ab = new B();
		B bb = (B)ab;

//		B ba = new A(); //부모는 자식꺼를 구현할 수 없음
		
		ab.showA();
		System.out.println(ab.age);
//		ab.bshow(); // 본인거를 메모리에 숨겨놓기 때문에 에러
	}

}
