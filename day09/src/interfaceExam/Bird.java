package interfaceExam;

public class Bird implements Animal {
	public void show() {
		System.out.println("새가 나무위에서 놀고 있다.");
	}
	@Override
	public void cry() {
		System.out.println("새는 꾸우꾸우");
	}
	
	@Override
	public String toString() {
		return "새의 울음소리";
	}
	
	
	
}
