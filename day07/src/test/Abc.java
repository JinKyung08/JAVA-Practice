package test;

public class Abc {
	public String name = "홍길동";
	int ssn = 123;
	private int age = 20;
	
	public void showPrivate() {
		System.out.println(age);
	}
//접근제한자/반환타입/메서드명(){}   //void 리턴안적어도 문제 X 
	public int getAge() {
		return age ; 
		
	}
	public void setAge(int age) {
		//유효성 검사
		
		if(age<0||age>120) {
			System.out.println("잘못된 나이 입니다.");
		}
		this.age = age ; // 필드에 매개값으로 넘겨받은 age를 담기
	}
	
	
}
