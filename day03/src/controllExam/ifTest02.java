package controllExam;

import java.util.Scanner;

public class ifTest02 {

	public static void main(String[] args) {
		//문제1) 점수를 입력받아 60점 이상이면 "합격" 그렇지않으면 "불합격"
//		int score = 0;
//		
//		
//		//안내문구
//		System.out.println("점수를 입력하세요");
//		
//		//입력값 가져오기
//		score = scan.nextInt();
//		
//		//판단
//		if(score >=60) {System.out.println("합격");}
//		else { System.out.println("불합격");}
				
		//문제2) java와 html 점수를 입력받아 두 과목 모두 60점 이상이면 "통과"
		//그렇지 않으면 "재심험"으로 처리
		
//		int javascore = 0, htmlscore = 0;
//		
//		//안내문구 
//		System.out.println("java점수를 입력하세요");   //System.out,println("자바와 html 점수입력");
//		javascore = scan.nextInt();					   //java = Integer.parseInt(scan.next()); // 문자열, 스페이스, Enter
//		System.out.println("html점수를 입력하세요");   //html = Integer.parseInt(scan.next());
//		htmlscore = scan.nextInt();
//		
//		//판단
//		if(javascore >= 60 && htmlscore >= 60) {System.out.println("통과");}
//		else {System.out.println("재시험");}
		
		 
		//문제3) java와 html 점수를 입력받아 두 과목 한과목이라도 80점 이상이면 "통과"
		//그렇지 않으면 "재심험"으로 처리
		
//		int javascore = 0, htmlscore = 0;
//			
//		System.out.println("java점수를 입력하세요");
//		javascore = scan.nextInt();
//		System.out.println("html점수를 입력하세요");
//		htmlscore = scan.nextInt();
//		
//		if(javascore >= 80 || htmlscore >=80) {System.out.println("통과");}
//		else {System.out.println("재시험");}
		
		
		//문제 4) 두 수를 입력 받아 큰수와 작은 수를 구분해서 저장
		
		//변수 선언
//		int num1 =0,num2=0,bigNum=0, smallNum=0;
//		
//		//안내문구 + 입력
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("첫번째수를 입력하세요");
//		num1 = scan.nextInt();
//		System.out.println("두번째수를 입력하세요");
//		num2 = scan.nextInt();
//		
//		//판정
//		bigNum = (num1 > num2) ? num1 : num2;  //if(num>num2){System.out.println("큰수:"+num1);
//		smallNum = (num1 < num2)? num1 : num2; //System.out.print("작은수:"+num2);}
//	    									   //else{System.out.println("큰 수 : " +num2);
											   //System.out.println("작은 수 : " +num1);}
//		System.out.println("큰수 : " +bigNum);   //
//		System.out.println("작은수 : " + smallNum); //
		
//		if(num>num2) { 
//			bigNum = num1;
//			smallNum=num2:
//		}else {
//			bigNum = num2;
//			smallNum = num1:
//		}
		
		//문제5) su1=89, su2=70
		//su1과 su2의 값을 바꿔서 출력하시오.
		//	결과)변경 전 => su1 = 89, su2=70
		//		 변경 후 => su1 = 70, su2= 89
		
		//변수선언
//		int su1=89, su2=70, tmp=0;
//		System.out.println("변경전 => su1 = "+su1 + "su2 : " +su2);
//		
//		tmp = su1;
//		su1 = su2;
//		su2 = tmp;
//		
//		System.out.println("변경후 => su1 = "+su1 + "su2 : " +su2);
		
	
	
		//문제6) 정수를 입력받아 3의배수이면서 5의 배수이면 '사과당첨'
		//그렇지 않으면 '딸기당첨' 으로 출력

		//변수선언 
		int number1 = 0;
		String result2="";
		//안내문구 + 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		number1 = Integer.parseInt(scan.next());
		
	
		//판정
//		if (number1 % 3 == 0 && number1 % 5==0) { System.out.println("사과당첨");}
//		else {System.out.println("딸기당첨");}
		if (number1 % 3 == 0 && number1 % 5==0) { result2="사과당첨";}
		else {result2="딸기당첨";}
	
		System.out.println(result2);
	
	
	
	
	
	
	
	}

}
