package interfaceExam;

public class Cat implements Animal{

	@Override
	public void cry() {
		System.out.println("고양이는 야옹~");
	}

	@Override
	public String toString() {
		return "고양이의 울음소리";
	}




}
