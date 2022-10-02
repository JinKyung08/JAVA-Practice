package repeatExam02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		//문제1) 컴퓨터가 1 ~ 100사이 정수값을 만들고, 그 값을 알아내는 프로그램
		//사용자가 값을 입력하면 컴퓨터가 랜덤으로 작성한 숫자와 같으면 '정답입니다.'
		//사용자가 입력한 값이 컴퓨터가 랜덤으로 작성한 숫자보다 작으면 '더 큰수를 입력하시오.'
		//사용자가 입력한 값이 컴퓨터가 랜덤으로 작성한 숫자보다 크면 ' 더 작은 수를 입력하시오.'
		//라는 메시지를 출력하고 정답이면 '계임을 계속 진행하시겠습니까' Y/N'을 입력받아
		//y이면 계속 진행
		//n이면 게임 종료
		
		//변수선언
		int user = 0, answer=0; 
		boolean run=true;
		answer = (int)(Math.random() * 100)+1;
		
		//answer 값 확인용, 차후 주석처리
//		System.out.println("정답="+answer);
		
		Scanner scan = new Scanner(System.in);

//		do {
//			System.out.println("1과100사이의 값을 입력하세요>>"); 
//			user=scan.nextInt();
//			
//			if(user>answer) {
//				System.out.println("더 작은 수를 입력하시오.");
//			}else if (user<answer) {
//				System.out.println("더 큰수를 입력하시오.");
//				
//			}while(user != answer) 
//				System.out.println("정답입니다.");
				
	   
		while(true) {     //user != answer
			System.out.println("1과100사이의 값을 입력하세요>>"); 
			user=scan.nextInt();
			
			if(user>answer) {
				System.out.println("더 작은 수를 입력하시오.");
		    
			}else if (user<answer) {
				System.out.println("더 큰수를 입력하시오.");
			
			}else { // user==answer
				System.out.print("정답입니다.\n계속 진행하시겠습니까? Y/N");
				String yn = scan.next();   //Y,y,N,n
				//if(yn.equals("Y")||yn.equals"y"))         //"문자열1". equals("문자열2")
															// 문자열1과문자열2가 같으면 true, 다르면 false
				if(yn.equalsIgnoreCase("y")) {  // equalsIgnorCase() : 대소문자 구분 안함
					answer = (int)(Math.random() * 100)+1;
//					System.out.println("answer =" +answer);
					continue;
				}else {
					break;
				}
			}
		}
				
	} // end of WhileExam

}//end of main
