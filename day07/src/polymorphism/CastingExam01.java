package polymorphism;

public class CastingExam01 {

	public static void main(String[] args) {
		CastA ca = new CastA();
		System.out.println("CastA m : " + ca.m);
		ca.showA();
		System.out.println();
		
		CastB cb = new CastB();
		System.out.println("CastA m : " + cb.m);
		cb.showA();
		System.out.println("CastB n : " + cb.n);
		cb.showB();
		System.out.println();
		
		//upcasting (자식->부모로, 부모의 것만 사용가능, 자식꺼는 숨겨짐)
		CastA uca = new CastB();
		//부모 것
		System.out.println("CastA m : " + uca.m);
		uca.showA();
		//자식 것
//		System.out.println("CastB n : " + uca.n);
//		uca.showB();
		System.out.println();
		
		CastB dcb1 = (CastB)uca;
		System.out.println("CastA m : " + dcb1.m);
		System.out.println("CastB n : " + dcb1.n);
		dcb1.showA();
		dcb1.showB();
		
		
		
		
		//downCasting : 부모가 자식형으로 
//		CastB dcb = new CastA(); // 안됨
		
	//instanceof 키워드 : 캐스팅 가능여부로 확인 
		// 캐스팅이 가능하면 : true,
		// 캐스팅이 불가느하면 : false
		
		//참조변수 instanceof 타입
		//	참조변수가 해당 타입으로 캐스팅이 가능하면 true
		//	참조변수가 해당 타입으로 캐스팅이 불가능하면 false
		
		System.out.println("uca는 CastB로 캐스팅 가능 여부 : " + (uca instanceof CastB));
		System.out.println("uca는 CastA로 캐스팅 가능 여부 : " + (uca instanceof CastA));
		System.out.println("dcb1는 CastA로 캐스팅 가능 여부 : " + (dcb1 instanceof CastA));
		System.out.println("dcb1는 CastB로 캐스팅 가능 여부 : " + (dcb1 instanceof CastB));
		
		System.out.println();
		
		
		CastA ca1 = new CastA();
		CastB cb1 = new CastB();
		
		System.out.println("ca1는 CastB로 캐스팅 가능 여부 : " + (ca1 instanceof CastB));
		
	}

}
