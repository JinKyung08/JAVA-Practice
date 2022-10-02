package day02;
/* 예제1) 사과를 담는 바구니 수를 구하기
 * 		사과의 개수 : 325
 * 		바구니 당 사과를 담는 개수 : 13
 * 		사과가 담긴 바구니 수 ?
 * 		남은 사과 ?
 * 
 * 예제2) 운동장이 학생이 578명 있다.
 * 		학생들에게 콜라는 5캔씩 나누어 주려고 한다. 콜라의 개수는 3231개 있다.
 * 		학생들에게 나누어주고 남은 콜라의 개수?
 * 		남은 콜라의 개수가 짝수개 이면 "남은 개수 짝수",
 * 		홀수개이면 "남은 개수 홀수"로 처리하시오.
 */
public class OperatorExam01 {

	public static void main(String[] args) {
		//예제1
		int totalApple = 325;
		int appleInBasket = 13;
		int basketNum = 0;
		int apples = 0;
		
		 basketNum = totalApple / appleInBasket;
		 apples = totalApple - (basketNum * appleInBasket);
	 
		System.out.println("사과의 개수 :" + totalApple);
		System.out.println("바구니 당 사과를 담는 개수 :" + appleInBasket);
		System.out.println("사과가 담긴 바구니 수 :" + basketNum);
		System.out.println("남은사과 :" + apples);
		//예제2
		int student = 578;
		int cola = 3231;
		int percola = 5;
	    int colas = 0;
	    String result = "";
	    
	      colas = cola - (student*percola);
	      result=colas % 2 == 0? "짝수" : "홀수";
	      
	    System.out.println("학생 : " + student);
	    System.out.println("콜라 : " + cola);
	    System.out.println("나누어 줄 콜라 : " + percola);
	    System.out.println("남은콜라 : " + colas);
		System.out.println("홀짝 : " + result);
		
		//예제3
		int num = 5;
		String r = "";
		
		r = num % 2 ==0? "한강" : "서울숲";
		
		System.out.println("홀짝 : " + r);
		
		//예제4
		int money = 53483;
		int cnt500 = 0;
		cnt500 = money / 500;
		int cnt100 = 0;
		cnt100 = (money - cnt500*500) / 100;
		System.out.println("500원 개수 : "+ cnt500);
		
		
				}

}
