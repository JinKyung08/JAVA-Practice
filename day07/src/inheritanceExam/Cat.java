package inheritanceExam;

public class Cat extends Animal02 {
	
	@Override   
		public void cry() {
			System.out.println("야옹~");
	}

	public void jumping() {
		System.out.println("고양이는 띈다");
	}
}
