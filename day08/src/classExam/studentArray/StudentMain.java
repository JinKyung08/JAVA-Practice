package classExam.studentArray;

public class StudentMain {

	public static void main(String[] args) {
		Student hong = new Student("홍길동","220301");
		hong.subject = new Subject[] {
				new Subject("국어",70),
				new Subject("영어",80),
				new Subject("수학",95)
		};
		hong.showInfo(hong.subject);
		System.out.println();
		
		hong.individualScore(hong.subject);
	}


}
