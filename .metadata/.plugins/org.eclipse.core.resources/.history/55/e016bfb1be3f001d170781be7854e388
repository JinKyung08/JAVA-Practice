package interfaceExam;

public interface InterfaceTest1 {

	//접근제한자 interface 인터페이스명 {}
	
	//상수필드 : final, 한번 값을 선언하면 프로그램 중간에 값을 변경할 수 없음 
	public static final int MAX = 20;   //정식
	
	int MIN=0;  // 에러 안뜸/ public static final 생략하면 컴파일러가 컴파일시 자동으로 붙여준다.
	            //  public static final int MIN=0; 
	
	//추상메서드 : public abstract 반환타입 메서드명();  / {}가 없는 메서드, 미완성메서드
	public abstract void showInfo();   //원칙
	
	void contentShow(); //public abstract 생략하면 컴파일러가 컴파일시 자동으로 붙여준다.
						//public abstract void contentShow();
		
	//디폴트 메서드 , 자바 1.8 (8버전)부터 ,완성된 메서드
	public default void repair() {
		System.out.println("장비를 수리한다.");
	}
	
	//정적 메서드, 자바 1.8부터, 완성된 메서드
	public static void reset() {
		System.out.println("장비를 공장 초기화 합니다.");
	}
	
	//비공개메서드 : 자바9부터 선언 할 수 있다. 인터페이스 내부에서만 사용할 수 있는 일종의 도우미 메서드
	private void show() {
		System.out.println("도우미 메서드");
	}
	
	
}
