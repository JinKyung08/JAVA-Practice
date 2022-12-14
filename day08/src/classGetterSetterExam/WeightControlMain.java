package classGetterSetterExam;

import java.util.Scanner;

public class WeightControlMain {

	public static void main(String[] args) {
		
		
		//객체생성
		WeightControl hong = new WeightControl("홍길동", 171.5, 59.5);
		WeightControl kim = new WeightControl("김자바", 168.3, 49.6);
		WeightControl park = new WeightControl("박하늘", 160, 45);  
		//배열로 줄일수 있지만 공간이 고정되어있음.
		//컬렉션 프레임 워크 List(Array List) -> 공간 추가 제거 가능 
		
		
		//현재 정보 출력
		//홍길동
		System.out.println("이름 : "+ hong.getName());
		System.out.println("키 : " + hong.getHeight());
		System.out.println("몸무게 : " + hong.getWeight());
		System.out.println();
		
		//김자바
		System.out.println("이름 : "+ kim.getName());
		System.out.println("키 : " + kim.getHeight());
		System.out.println("몸무게 : " + kim.getWeight());
		System.out.println();

		//박하늘
		System.out.println("이름 : "+ park.getName());
		System.out.println("키 : " + park.getHeight());
		System.out.println("몸무게 : " + park.getWeight());
		System.out.println();

		//변화 몸무게 입력 
		double gr =0.0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("변화된 몸무게를 입력해주세요");
		System.out.println("증가 : 양수 , 감소 :  음수 , 변화없음 : 0으로 입력해주세요");
		gr=scan.nextDouble();
		
		
		//메서드 호출
		hong.gainWeight(gr);
		
//		if(gr > 0.0) {								내가한거
//			hong.gainWeight(gr);
//		}else if (gr<0.0) {
//			hong.reduceWeight(gr);
//		}else {
//			System.out.println("몸무게 변화가 없습니다.");
//			System.out.println("현재몸무게 : " + wc.getWeight()+"kg");
//		}
		
		//확인
		System.out.println(hong); // hong.toSring(); ->classGetterSetterExam.WeightControl@5315b42e 
									// 패키지명.클래스명@hashCode
									//toString()을 재정의 한 후 => 홍길동,171.5, 59.5
		System.out.println(kim);
		
	}

}
