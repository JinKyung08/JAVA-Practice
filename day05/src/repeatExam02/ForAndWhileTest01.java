package repeatExam02;

public class ForAndWhileTest01 {
//	int age;   // 필드, 인스턴스 변수, 멤버변수, 인스턴스 필드
//	String name; 
	
	public static void main(String[] args) {  // {}선언부분, main() jvm이 실행하는 진입점, 실행클래스

		for(int i=1; i<=3; i++) {
			System.out.println("여긴 밖 for문" + i);
			
			for(int j=10; j<=13; j++) {
				System.out.println("여긴 안쪽 for문"+i);
				System.out.println("i = " +i + " j = "+j);
			} // end of inside for
			
			System.out.println("여긴 다시 밖 for문");
			System.out.println();
			
			
		} // end of for
		
		
		
		
		
		
	} // end of main

} // end of ForAndWhileTest
