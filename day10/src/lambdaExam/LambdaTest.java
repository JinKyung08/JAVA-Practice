package lambdaExam;

public class LambdaTest {

	public static void main(String[] args) {
//			LambdaInterface lam = new LambdaInterface(); // 인터페이스로 미완성메서드를 포함하고 있어서 객체를 생성 할 수 X
														//자식에 상속시켜서 객체 생성 해서 처리
														//익명구현객체를 만들어서 처리
			
			LambdaInterface lam = new LambdaInterface() {
				
				@Override
				public void show() {
					System.out.println("익명 구현 객체를 보고 있음");
				}
			};
			lam.show();
			
			//lamda식으로 구현
			LambdaInterface lam1 = () -> {
					System.out.println("익명 구현 객체를 보고 있음");
			};
			lam1.show();
			
			LambdaInterface lam2 = () -> System.out.println("익명 구현 객체를 보고 있음"); // 한줄만 적을때 더줄임
	
			lam2.show();
			
			//======================
			//익명 구현 객체
			LambdaInterface1 la = new LambdaInterface1() {
				@Override
				public void sum(int num) {
					System.out.println(num + 4);
				}
			};
			
			//익명 구현 객체 //축약해서 쓰자 ->람다
			LambdaInterface1 la1 =(int num) -> {
					System.out.println(num + 4);
			};
			la1.sum(5);
			
			//익명 구현 객체 //축약해서 쓰자 ->람다 // 한줄만 있을때 더 축약 매개 타입 생략가능 
			LambdaInterface1 la2 =num -> System.out.println(num + 4);
			la2.sum(5);
			
//			람다식
			
//			자바에서 함수적 프로그래밍을 지원하는 기법
//			코드의 간결화 및 병렬처리에 강함
//			자바에서 람다식은 함수적 인터페이스만 가능

//			함수적인 인터페이스

//			내부에 단 1개의 추상메서드만 존재하는 인터페이스
//			@FunctionalInterface 를 붙여주면 컴파일러가 추상메서드가 하나만 있는지 체크 
//			없거나 1개 이상이면 에러 발생 
	}

}
