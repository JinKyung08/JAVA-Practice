package classExam.studentArray;
//과목 = 과목이 변동되니까
public class Subject {
	//필드
	String subjectName;  //과목명
	int subScore; // 과목 점수
	
	public Subject() {	
	}
	
	//생성자
	public Subject(String subjectName,int subScore) {
			this.subjectName = subjectName;
			this.subScore = subScore;
	}
	
	public void subjectInfo() {
		System.out.println(subjectName + "," + subScore);
	}
}
