package classExam.studentArray;

public class StudentArrayListMain {

	public static void main(String[] args) {

		StudentArrayList hong = new StudentArrayList("홍길동","220301");
		hong.addSubject("국어", 70);
		hong.addSubject("영어", 80);
		hong.addSubject("수학", 95);
		
		hong.showInfo();
		System.out.println();
		hong.individualScore();
	}

}
