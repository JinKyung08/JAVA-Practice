package test;

public class AbcTest {

	public static void main(String[] args) {
		Abc aa = new Abc();
		
		System.out.println(aa.name);
		System.out.println(aa.ssn);
//		System.out.println(aa.age);   // private /정보은닉 - 같은 클래스에서만
		
		System.out.println(aa.getAge());
		aa.setAge(35);
		System.out.println("수정 나이 : " + aa.getAge());
		
	}
	

}
