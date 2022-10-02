package abstractExam;

public class StudentMain {

	public static void main(String[] args) {
//		Student std = new Student(); //추상 객체 생성 X
		HanStudent han = new HanStudent();
		han.showStudentInfo();
				//두개 같음 / 밑에는 한번쓰고자 할때
		new MultiStudent().showStudentInfo();
		
		//=========================
		//익명이너클래스
		Student std = new Student() {
			
			@Override
			public void showStudentInfo() {
				System.out.println("익명이너클래서에서 재정의한 부분");
			}
		};
		
		std.showStudentInfo();
		std.name="홍길동";
		System.out.println(std.name);
	}

}
