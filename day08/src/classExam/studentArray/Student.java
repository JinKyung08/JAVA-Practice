package classExam.studentArray;

public class Student {
		//인스턴스필드
		String name; //이름 
		String sn; //학번
		Subject[] subject; // 수강과목별 점수  // Subject클래스에서 가져온것
		
		//생성자
		public Student() { } //기본생성자
	
		
		public Student(String name,String sn) {
//			super();
			this.name = name; // 이름 초기화
			this.sn=sn; // 학번 초기화
		}
		
		//메서드
		public void showInfo(Subject[] sub) {
			subject = sub;
			//	위랑같음	Subject[] subject = new Subject[] {new Subject("국어",70),
//					new Subject("영어",80), new Subject("수학",95)};
			int scoreSum = 0;
			double avg = 0.0;
			
			for(int i=0; i<subject.length; i++) {
				scoreSum += subject[i].subScore; //i번째 객체의 과목점수
				avg = (double)scoreSum / subject.length;
			}
			
			System.out.println("***"+ name + " 님 성적 ***");
			System.out.println("학 번 : " + sn);
			System.out.println("총 점 : " + scoreSum);
			System.out.printf("평 균 : %.2f\n " , avg);
		}	
			
			
		//과목별 점수 확인
			public void individualScore(Subject[] sub) {
			System.out.println("***"+ name + " 님 수강과목과 점수확인 ***");
			for(Subject arrSub : sub) {
				arrSub.subjectInfo();   //Subject 클래스의 subjectInfo()호출
			}
			
		}
				
				
}
