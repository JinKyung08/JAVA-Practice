package packageAndimport;
import test.ImportTest;
import test.Abc;

public class ImportExam {

	public static void main(String[] args) {
		ImportTest it = new ImportTest();
		com.mulit.test.ImportTest cit = new com.mulit.test.ImportTest();
		
		
		Abc at = new Abc();
		System.out.println(at.name);
//		System.out.println(at.ssn);  // default  - 같은패키지에서만
//		System.out.println(at.age);  // private - 같은 클래스에서만 사용
		System.out.println("나이 : " + at.getAge());
		at.setAge(15);
		System.out.println("수정 나이 : " + at.getAge());
	}

}
