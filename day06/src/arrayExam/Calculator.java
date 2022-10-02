package arrayExam;

public class Calculator {
	//1. 전원 켜기
			public void powerOn() {  //void : 결과를 반환(리턴)하지 않고 여기서 실행하고 끝낸다.
				System.out.println("전원을 켭니다.");
			}
			//2. 전원 끄기
			public void powerOff() {
				System.out.println("전원을 끕니다.");
			}
			
			//3. 더하기: 정수 두 개
			public int add(int num1, int num2) {  // 지역변수
				int result = num1 + num2;
				return result;   // 결과값을 가지고 자신을 호출한 곳으로 되돌아가라,  여기서 메서드를 빠져나감
								// 리턴 뒤의 값은 실행하지 않아 의미 없음
//				System.out.println("안녕!!");
			}
			//4. 뺄셈 : 정수 두 개
			public int minus(int a, int b) {
				return a-b;
			}
			//5. 곱셈 : 정수 3개
			public int multiplication(int a, int b, int c) {
				return a*b*c;
			}
			
			//6. 나누기 : 정수 두 개
			public int division(int a, int b) {
				if(b==0) {
					System.out.println("0으로 나눌 수 없음");
					return 0;
				}
				return a/b;
			}
			
			//7. 평균 구하기
			public double avg(int x, int y) {  //지역변수
				double sum = add(x, y);
				double result = sum / 2;
				return result;
			}
	

}
