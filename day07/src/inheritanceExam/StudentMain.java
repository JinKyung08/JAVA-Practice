package inheritanceExam;

public class StudentMain {

	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		
		hong.showInfo();
//		hong.ssn = "123";  // private이라서 에러
		hong.setSsn("220301"); //private으로 설정된 필드에 값을 넣기
		System.out.println(hong.getSsn());
								//private으로 설정된 필드의 값 읽어 오기
		
		
		System.out.println();
		kim.showInfo();
		System.out.println();
		
		Student lee = new Student("124","이자바",20,"소프트");
		lee.showInfo();
	
	}
}
