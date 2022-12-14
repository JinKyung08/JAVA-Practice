package classGetterSetterExam;

import java.util.Scanner;

public class WeightControlMainUpdate {

	public static void main(String[] args) {
		double gr = 0.0;
		
		Scanner scan= new Scanner(System.in);
		
		//객체 생성 - 배열에 담기
		WeightControl[] wcArry = {
				new WeightControl("홍길동", 171.5, 59.5),
				new WeightControl("김자바", 168.3, 49.6),
				new WeightControl("박하늘", 160, 45)			
		};
		
		//확인-for문, 향상된 for문 // 기본정보 출력
		//for 문
		for(int i =0; i<wcArry.length; i++) {
			System.out.println("이름 : "+ wcArry[i].getName());
			System.out.println("키 : " + wcArry[i].getHeight());
			System.out.println("몸무게 : " + wcArry[i].getWeight());
			System.out.println();
		}
		System.out.println("==========================");
		//향상된 for문
		for(WeightControl wc : wcArry) {
			System.out.println("이름 : "+ wc.getName());
			System.out.println("키 : " + wc.getHeight());
			System.out.println("몸무게 : " + wc.getWeight());
			System.out.println();
		}
	//입력받기
		while(true) {
			String res= "";
			System.out.println("변화된 몸무게를 입력하시겠습니까?\n 입력:y,취소:q");
			res = scan.next();
			System.out.println();
			
			if(res.equalsIgnoreCase("y")) {
				System.out.println("변화된 몸무게를 입력해주세요");
				System.out.println("증가 : 양수 , 감소 :  음수 , 변화없음 : 0으로 입력해주세요");
				
				gr=scan.nextDouble();
				
//				System.out.println("변화된 몸무게는" + gr + "입니다.");
				wcArry[0].gainWeight(gr);
				System.out.println();
				
			}else if (res.equalsIgnoreCase("q")) {
				System.out.println("몸무게 입력 종료");
				break;
			}else {
				System.out.println("잘못 입력");
			}
				
		}
		
		
		
	}

}
