package controllExam;

import java.util.Scanner;

public class ifText01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 문제1)점수를 입력받아서 80점 이상이면 "통과"로 처리하시오.
//		
//		int score= 0;
//		
//		//안내문구
//		System.out.println("점수 입력>>");
//		
//		//입력값 가져오기
//		score = scan.nextInt();
//		
//		// 판단
//		if(score>=80) {
//			System.out.println("통과");
//		}
		
		// 문제2)숫자를 입력받아서 짝수이면 "청팀", 홀수이면 "백팀"으로 팀을 정하시오.
		
		int number=0;
		String result="";
		
		// 안내문구
		System.out.println("숫자를 입력하세요>>");
		
		number = scan.nextInt();
		
		// if 문
		if(number%2==0) {
			System.out.println("청팀");
		}else {System.out.println("백팀");}
		
		//삼함연산자
		result = number%2==0? "청팀":"백팀";
		System.out.println(result);
		
	}

}
