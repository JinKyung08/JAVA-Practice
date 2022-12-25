package algorithm.factorial;

import java.util.Scanner;

public class FactoryExam02 {
		static int factorial(int n) {
			if(n>0)	//종료시점을 만들기 위해서 조건을 사용
				return n * factorial (n-1);
			else 
				return 1;		//종료시점
		}
		
//		if(n<0) {
//			return 1;
//		} else {
//			return n * factorial (n-1);
//		}
		
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int x= s.nextInt();
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
	}

}
