package algorithm.factorial;

import java.util.Scanner;

public class FactoryExam {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하시오>>");
		i =s.nextInt();
		recursive(i);
		s.close();
	}
		static int recursive(int n) {
			int i;
			if(n<1) {		// 종료시점
				return 2;	
			}else {			//메서드를 처리할 부분
				i = (2 * recursive(n-1)) + 1;
				System.out.println(i);
				return i;		
			}
	}

}
