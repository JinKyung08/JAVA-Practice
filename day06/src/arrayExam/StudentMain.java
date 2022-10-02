package arrayExam;
// 1.설계도, 틀, 구조 => 2. 객체 생성 => 3.객체 사용
public class StudentMain {

	public static void main(String[] args) {
		// 2.객체 생성
		Student stud1 = new Student ();
		Student hong = new Student();
		
		// 3. 객체 사용
		stud1.name = "홍길동";
		
		System.out.println(stud1.name);
	}

}
