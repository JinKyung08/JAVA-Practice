package arrayExam;

public class StudentExam02 {

	public static void main(String[] args) {
		Student02 hong = new Student02 ("220301","홍길동",75);
		Student02 park = new Student02 ("220927","박자바",45);
		
		
		//학번과 이름확인 
		System.out.println(hong.studentNum);
		System.out.println(hong.name);
		
		// 정보
		hong.studentInfo();
		System.out.println();
		park.studentInfo();
		
	}

}
