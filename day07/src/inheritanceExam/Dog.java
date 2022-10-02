package inheritanceExam;

public class Dog extends Animal02 {
	
	@Override   
		public void cry() {
			System.out.println("멍멍");
	}
	public void running() {
		System.out.println("강아지는 달린다.");
	}
}
