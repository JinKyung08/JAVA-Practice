package repeatExam;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		// 1 ~ 100까지의 합
		
//		int sum = 0;  // 합
//		
//		//반복
//		for(int i=1; i<=100; i++) {
//			sum = sum + i ;			
//		}
//		
//		System.out.println("합계 :" +sum);
				
		// 단을 입력, 구구단
		
		int dan = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단을 구할 단을 입력>>");
		dan = scan.nextInt();
//		dan=Integer.parseInt(scan.next());
		
		System.out.println("**"+ dan + "단 **");
		
		for( int j=1; j<=9; j++) {
			System.out.println(dan+"*"+j+"=" + (dan*j));
//			System.out.printf("%d * %d =%2d\n", dan, j, dan*j);
		}
		
		
	}

}
