package repeatExam;

public class ForTest01 {

	public static void main(String[] args) {

		//1 ~ 5 까지 합
		// for(초기식 ; 조건식; 증감식) { }
		
		int sum=0; // 지역변수,main()메서드가 종료될 때 메모리에서 사라짐
		
		for(int i=1; i<=5 ; i++ ) {      // i = i + 1
			sum = sum + i ; //sum += i
			
//			System.out.println(" i :" + i);
//			System.out.println("합계 :" + sum);
		
		
		}
//			System.out.println(" i :" + i); //지역 변수,for문 안에서만 실행가능, for문을 벗어나면 메모리에서 사라짐 
			System.out.println("합계 :" + sum);
		
	}

}
