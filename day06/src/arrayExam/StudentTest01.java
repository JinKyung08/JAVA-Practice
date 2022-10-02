package arrayExam;

public class StudentTest01 {
	// 특성(속성) : 이름, 학번, 전공, 성적, 점수
		//필드(인스턴스필드)
		String name;
		int studentNo;
		String major;
		String grade;
		int score;
		
	// 생성자
	public StudentTest01() { }
	
	//메서드
	public void showInfo() {
		System.out.println(name + "학생의 학번은 " + studentNo );
	}
	
	
	
}
