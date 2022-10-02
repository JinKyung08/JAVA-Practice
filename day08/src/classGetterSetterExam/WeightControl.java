package classGetterSetterExam;

public class WeightControl {   // extends Object
	//인스턴스필드
	private String name ;
	private double height;
	private double weight;

	
	//생성자
	public WeightControl() { }   //기본생성자
	
	public WeightControl (String name, double height, double weight) {
		super();   // 부모 생성자 호출
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if(height<50 || height > 230) {System.out.println("입력 오류입니다.");
		}
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight <= 0 ) {System.out.println("입력 오류입니다.");
		}
		this.weight = weight;
	}
//to String()을 재정의	
	
	@Override
	public String toString() {
		return name + "," +height + ","+weight;
	}
	
	//메서드
	public void showInfo() {
		System.out.println("이름 : " +name);
		System.out.println("키 : " +height);
		System.out.println("몸무게 : " +weight);
	}
	//증가
	public void gainWeight(double gr) {
		String msg = null , ms = null;
		
		if(gr>0) {
			msg = "찌기"; ms = "증가";
		}else {
			msg = "빠지기"; ms= "감소";
		}
		
		
		System.out.println("살이" +msg+ "전에 몸무게는 " + this.weight +"kg 이었습니다."); // this 생략가능
		this.weight += gr;
		System.out.println("현재는 " + gr + " 만큼 "+ ms +"해서 " + this.weight + "kg입니다.");
		
		return; //->메서드 자체를 종료 빠져나가는 역할 /일반적으로 생략되어있음 break와 비슷 - 다른점은 break는 반복문만 빠져나옴
	}
	//감소
//	public void reduceWeight(double gr) {
//		System.out.println("살이 빠지기 전에 몸무게는 " + this.weight + "kg 이었습니다");
//		this.weight -= Math.abs(gr);
//		System.out.println("현재는 " + gr + "만큼 줄어 " + this.weight + "kg입니다." );
//		
//		return;
//	}
	
		
	
}
