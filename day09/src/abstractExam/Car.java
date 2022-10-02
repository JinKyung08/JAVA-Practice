package abstractExam;

public abstract class Car {				//추상메서드가 포함된 클래스는 추상클래스
	String name;
	String model;
	
	public Car(String name, String model) {
		this.name=name;
		this.model=model;
	}
	
	public abstract void showInfo();  // {} 없음, 추사 메서드
	
	
	
	
	//패키지명. 클래스명 @16진수 hashCode
	@Override
	public String toString() {	//일반메서드
		
//		return name+","+model;  -> 가독성↓
		String result = name + ","+model;	//방식은 2가지
		return result;						//-> 가독성 ↑
		
	}




}//end of class
