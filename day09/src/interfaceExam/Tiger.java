package interfaceExam;

public class Tiger extends Cat implements Animal2, Animal3  {//고양이 상속 애니멀2 구현 원함

	@Override
	public void running() {
		System.out.println("동물들이 달린다.");
	}

	@Override
	public void eat() {
		System.out.println("동물들이 먹는다.");
	}    
}
