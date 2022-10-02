package printfExam;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 입력 받아서. 평균과 판정을 구해서 출력하기
// 판정은 평균이 60점 이상이면 "합격", 60점미만이면 "불합격"으로 처리
// 평균은 소수이하 둘째자리 까지 구하기
// name = "홍길동'

/*	홍길동님 중간 성적
 * =======================================
 * 이름   국어   영어   수학   평균   판정
 * =======================================
 * 홍길동 85     90     75     ??.?   합격
 */
// 식별자 - 길이 상관없이 어떤 것을 작업할 것인지 이름에 나타나게
public class PrintExam02 {

	public static void main(String[] args) {

		//변수선언
		String name = "홍길동";    //String name="홍길동", result=""; //result=nll;
		int kor = 0;			   // int kor=0, eng=0, math=0;
		int eng = 0;			   // double avg=0.0; //float avg==0.0f;	
		int math = 0;
		double average = 0.0;
		String result = "";				
		
		//입력준비
		Scanner scan = new Scanner(System.in);
		
		//안내문구
		System.out.println("국어 점수를 입력하세요");  
		kor = scan.nextInt();						   
		System.out.println("영어 점수를 입력하세요");
		eng = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		math = scan.nextInt();

		// 평균
		average = (kor + eng + math) / 3.0;
		// 평가
		result = (average >= 60) ? "합격" : "불합격";
		
		//출력
		System.out.println("홍길동님 중간 성적"); // System.out.println(name+"의 중간성적");
		System.out.println("==============================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t판정\t");
		System.out.println("==============================================");
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", name, kor, eng, math, average, result);


	}

}
