package interfaceExam;

public class Dog implements Animal{

	@Override
	public void cry() {
		System.out.println("강아지는 멍멍");
	}

	
	@Override
	public String toString() {
		return "강아지의 울음소리";
	}
}
