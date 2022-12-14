package abstractExam;

public class Bird extends CountableParents {
	//필드
	public String name;
	public int num;
	
	//생성자
	public Bird (String name, int num) {
		super(name,num);
		this.name=name;
		this.num=num;
    }

	//메소드
	public void fly() {
		System.out.println(num+"마리"+name+"가 날아갔습니다.");
	}

	//추상메서드 오버라이딩
	@Override
	public void showCount() {
		System.out.println(name+"가"+num+"마리 있습니다.");
	}
	
	


}