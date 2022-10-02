package classExam.studentArray;

public class SubjectList {
	private String subjectName;  //과목명
	private int subScore; // 과목 점수
	
	public SubjectList() { }// 기본생성자

	public SubjectList(String subjectName, int subScore) {
		super();
		this.subjectName = subjectName;
		this.subScore = subScore;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubScore() {
		return subScore;
	}

	public void setSubScore(int subScore) {
		this.subScore = subScore;
	} 
	
	
	
}
