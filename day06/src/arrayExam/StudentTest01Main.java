package arrayExam;
// 설계도, 틀, 구조 -> 객체(인스턴스) 생성 - > 객체를 사용
public class StudentTest01Main {

	public static void main(String[] args) {
		
		// 객체 생성
		StudentTest01 hong = new StudentTest01();
		StudentTest01 park = new StudentTest01();
		
		// 객체 사용
		hong.name = "홍길동";
		hong.studentNo = 123;
		hong.major = "컴퓨터공학";
		hong.grade = "A";
		hong.score= 70;
		
		System.out.println(hong.name);
		System.out.println(hong.studentNo);
		System.out.println(hong.major);
		System.out.println(hong.grade);
		System.out.println(hong.score);
		
		hong.showInfo();
		System.out.println();
		
		park.name = "박자바";
		park.major = "소프트웨어 공학";
		park.studentNo = 124;
		System.out.println(park.name);
		System.out.println(park.major);
		
		park.showInfo();
		
		
		
		
	}

}
