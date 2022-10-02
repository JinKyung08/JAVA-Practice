package abstractExam;

public class MultiStudent extends Student {

	@Override
	public void showStudentInfo() {
		System.out.println("학생이름 : " + name);
		System.out.println("학생학번 : " + ssn);
		System.out.println("======================");
	}

}
