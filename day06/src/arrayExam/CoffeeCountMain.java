package arrayExam;

class CoffeeCount {
	String name; //인스턴스 필드, 인스턴스 안에, 객체가 생성되어야지만 의미
	
	static int allCount = 0; //전체 주문 건수   
	// static 필드, 클래스가 메모리에 적재되는 순간 메모리에 올라옴
	static int coffeeCount = 0; // static 필드,  커피 주문 건수
	
	static {
		
		// static을 초기화 시키는 
	}
	
	public CoffeeCount() {} // 기본 생성자
//	public CoffeeCount(String n) {     //틀리지 않지만 권하진 않음
//		name = n;
//	}
	
//	public CoffeeCount(String name) {    //지역변수
//		this.name = name;  // this => 이 객체 
//	}
	//매개값이 있는 생성자 , alt + shift + s
	public CoffeeCount(String name) { 
//		super(); // 부모생성자
		this.name = name;  
		
		allCount++; // allCount = allcount + 1; 클래스 안에 있음
		boolean eq = name.equals("커피")|| name.equalsIgnoreCase("coffee");
		
		if(eq) {
			coffeeCount++; // coffeeCount = coffeeCount + 1; 클래스 안에 존재
		}
				
	}
	
	
	public static void getAllCount() {  // 클래스가 메모리에 로드 될때 함께 읽혀져서 실행
		System.out.println("오늘 주문한 총 음료 건수 : " + allCount);
	}
	
	public static void getCoffeeCount() {
		System.out.println("오늘 주문한 커피 총 건수 : " + coffeeCount);
	}
	
}	
public class CoffeeCountMain {
	public static void main(String[] args) {
//		CoffeeCount aa = new CoffeeCount();
		CoffeeCount coffee1 = new CoffeeCount("커피");
		CoffeeCount coke = new CoffeeCount("콜라");
		CoffeeCount latte = new CoffeeCount("라뗴");
		CoffeeCount coffee2 = new CoffeeCount("coffee");
		CoffeeCount tea = new CoffeeCount("홍차");
		CoffeeCount coffee3= new CoffeeCount("coffee");
		
		
		// static 멤버 : 클래스명.필드명,클래스명.메서드명()
		System.out.println("전체 음료 주문건 : " + CoffeeCount.allCount);
		
		CoffeeCount.getAllCount();
		
		System.out.println("커피 주문 건 : " + CoffeeCount.coffeeCount);
		
		CoffeeCount.getCoffeeCount();
		
		

	}

}
