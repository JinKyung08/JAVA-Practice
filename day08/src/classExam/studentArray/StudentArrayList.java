package classExam.studentArray;

import java.util.ArrayList;

public class StudentArrayList {
	//인스턴스필드
	String name; //이름 
	String sn; //학번
	
	ArrayList<SubjectList> sublist;  //수강과목별 ArrayList

	
	//생성자 - 학번과 이름 받아와서 초기화
	
	public StudentArrayList(String name, String sn) {
		super();
		this.name = name;
		this.sn = sn;
		
		sublist = new ArrayList<SubjectList>();
	}
	
	//메소드 
	public void addSubject(String subjectName, int subScore) {
		//매개값(인수)로 넘겨 받은 값을 가지고 객체를 생성해서 배열 담기
		SubjectList subject = new SubjectList();
		
		subject.setSubjectName(subjectName);
		subject.setSubScore(subScore);
		
		//생성된 객체를 ArrayList 객체 배열에 추가하기
		//add() remove()
		
		sublist.add(subject);
				
	}
	
	//과목 총점과 평균 확인
	public void showInfo() {
		int scoreSum = 0;
		double avg = 0.0;
	
		//문자열.length(),  배열의참조변수명.length
		//ArrayList 참조변수.size()
		
		for(SubjectList sub : sublist) {
				scoreSum += sub.getSubScore();
		}
		avg = (double)scoreSum / sublist.size();
	
		System.out.println("***"+ name + " 님 성적 ***");
		System.out.println("학 번 : " + sn);
		System.out.println("총 점 : " + scoreSum);
		System.out.printf("평 균 : %.2f\n " , avg);
	
	}
	
	//과목별 점수
	public void individualScore() {
		System.out.println("***"+ name + " 님 수강과목과 점수확인 ***");
		
		for(SubjectList sub : sublist) {
			System.out.println(sub.getSubjectName()+ "," + sub.getSubScore());
	    }
	}
	
}
