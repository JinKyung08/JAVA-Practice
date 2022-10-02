package abstractExam;

public class HanStudent extends Student {

	@Override
	public void showStudentInfo() {
		System.out.println("===============");
		System.out.println(ssn + "," +name);
		System.out.println("===============");
	}

	
}
