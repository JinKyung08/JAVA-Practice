package com.multi.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	 public void practice1(){
		 int num = 0;
						
		 System.out.println("1. 입력 \n2. 수정 \n3. 조회 \n4. 삭제 \n5. 종료 \n메뉴 번호를 입력하세요 :");
		 num = sc.nextInt();
			
		 if(num == 1) {
			System.out.println("입력 메뉴입니다.");
		 }else if(num == 2) {
			System.out.println("수정 메뉴입니다.");
		 }else if(num == 3) {
			System.out.println("조회 메뉴입니다.");
		 }else if(num == 4) {
			System.out.println("삭제 메뉴입니다.");
		 }else {
			System.out.println("프로그램이 종료됩니다. ");
		 }
	 }
	 
	 public void practice2(){
		 int num = 0;
			
		 System.out.println("수를 입력해주세요");
		 num = sc.nextInt();
			
		 if(num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		 }else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		 }else {
			System.out.println("양수만 입력해주세요");
		 }
	 }
	 public void practice3(){
		 int kor = 0;
		 int eng = 0;
		 int math = 0;
		 int sum = 0;
		 double avg = 0;
		 
		 System.out.print("국어점수 : ");
		 kor = sc.nextInt();
		 System.out.print("수학점수 : ");
		 eng = sc.nextInt();
		 System.out.print("영어점수 : ");
		 math = sc.nextInt();
		 
		 sum = kor + eng + math;
		 avg = (double)sum/3;
		 
		 if(kor >= 40 && eng >= 40 && math >= 40) {
			 System.out.println("국어 : "  + kor);
			 System.out.println("수학 : "  + math);
			 System.out.println("영어 : "  + eng);
			 System.out.println("합계 : "  + sum);
			 System.out.println("평균 : "  + avg);
			 System.out.println("축하합니다, 합격입니다!");
		 }else {
			 System.out.println("불합격입니다.");
		 }
			
	 }
	 
	 public void practice4(){
		 int month = 0;
		 
		 System.out.println("1~12 사이의 정수 입력 : ");
		 month = sc.nextInt(); 
		 
		 switch(month) {
		 	case 3: case 4: case 5:
		 		System.out.println(month + "월은 봄입니다.");
		 		break;
		 	case 6: case 7: case 8:
		 		System.out.println(month + "월은 여름입니다.");
		 		break;
		 	case 9: case 10: case 11:
		 		System.out.println(month + "월은 가을입니다.");
		 		break;
		 	case 12: case 1: case 2:
		 		System.out.println(month + "월은 겨울입니다.");
		 		break;
		 	default:
		 		System.out.println(month + "월은 잘못 입력된 달입니다.");
		 }
		 		 
	 }
	 
	 public void practice5(){
		 String id = "myId";
		 String pw = "myPassword12";
		 String ipId = "";
		 String ipPw = "";
		 
		 System.out.print("아이디 : ");
		 ipId = sc.next();
		 System.out.print("비밀번호 : ");
		 ipPw = sc.next();
		 
		 if(ipId.equals(id) && ipPw.equals(pw)) {
			 System.out.println("로그인 성공");
		 }else {
			 if(!(ipId.equals(id))) {
			 	System.out.println("아이디가 틀렸습니다.");
			 }
		 	 if(!(ipPw.equals(pw))) {
			 System.out.println("비밀번호가 틀렸습니다.");
		 	 }
		 }
		 
		 }
	 
	 public void practice6(){
		 String user = "";
		 
		 System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		 user = sc.next();
		 
		 if(user.equals("관리자")) {
			 System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		 }else if (user.equals("회원")) {
			 System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		 }else if (user.equals("비회원")) {
			 System.out.println("게시글 조회");
		 }else {
			 System.out.println("잘못입력");
		 }
		 
	 }
	 
	 public void practice7(){
		   double height = 0.0;
		   double weight = 0.0;
		   double bmi = 0.0;
		   
		   
		   System.out.print("키(m)를 입력해주세요 : ");
		   height=sc.nextDouble();
		   System.out.print("몸무게(kg)를 입력해주세요 : ");
		   weight=sc.nextDouble();
		   
		   bmi = weight / (height*height);

		   System.out.println("BMI 지수 : " + bmi);
		   
		   if(bmi<18.5) {
			   System.out.println("저체중");
		   }else if(bmi>=18.5 && bmi<23) {
			   System.out.println("정상체중");
		   }else if(bmi>=23 && bmi<25) {
			   System.out.println("과체중");
		   }else if(bmi>=25 && bmi<30) {
			   System.out.println("비만");
		   }else {
			   System.out.println("고도비만");
		   }
	 }
	 
	 public void practice8(){
		 int num1 = 0;
		 int num2 = 0;
		 String op = "";
		 
		 
		 System.out.print("피연산자1 입력 : ");
		 num1=sc.nextInt();
		 System.out.print("피연산자2 입력 : ");
		 num2=sc.nextInt();
		 System.out.print("연산자를 입력(+,-,*,/,%) : ");
		 op=sc.next();
		 
		 if(0<=num1 && 0<=num2) {
			 if(op.equals("+")){
				 System.out.println(num1 + op + num2 + "=" +(num1+num2));
			 }else if(op.equals("-")) {
				 System.out.println(num1 + op + num2 + "=" +(num1-num2));				 
			 }else if(op.equals("*")) {
				 System.out.println(num1 + op + num2 + "=" +(num1*num2));				 
			 }else if(op.equals("/")) {
				 System.out.println(num1 + op + num2 + "=" +((double)num1/(double)num2));				  
			 }else if(op.equals("%")) {
				 System.out.println(num1 + op + num2 + "=" +(num1%num2));				 				 
			 }else {
				 System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			 }
		 }
		 
	}
	 
	 public void practice9(){
		 int mid = 0;
		 int fin = 0;
		 int hw = 0;
		 int att = 0;
		 double total = 0.0;
		 double att2 = 0.0;
		 
		 System.out.print("중간 고사 점수 : ");
		 mid=sc.nextInt();
		 System.out.print("기말 고사 점수 : ");
		 fin=sc.nextInt();
		 System.out.print("과제 점수 : ");
		 hw=sc.nextInt();
		 System.out.print("출석 횟수 : ");
		 att=sc.nextInt();
		 
		 total=(mid*0.2)+(fin*0.3)+(hw*0.3)+(att*1.0);
		 att2=20*0.7;
		 
		 if(att>att2) {
			 System.out.println("================= 결과 =================");
			 System.out.println("중간 고사 점수(20) : " + (mid*0.2));
			 System.out.println("기말 고사 점수(30) : " + (fin*0.3));
			 System.out.println("과제 점수(30) : " + (hw*0.3));
			 System.out.println("출석 점수(20) : " + (att*1.0));
			 System.out.println("총점 : " + total);
			 
			 if(total<70) {
				 System.out.println("Fail [점수 미달]");
			 }else {
				 System.out.println("PASS");
			 }			 
		 }else {
			 System.out.println("Fail [출석 회수 부족 (" + att + "/20)");
		 }
	 }
	 
	 public void practice10(){
		 int num = 0 ;
		 
		 System.out.println("실행할 기능을 선택하세요.");
		 System.out.println("1. 메뉴 출력");
		 System.out.println("2. 짝수/홀수");
		 System.out.println("3. 합격/불합격");
		 System.out.println("4. 계절");
		 System.out.println("5. 로그인");
		 System.out.println("6. 권한 확인");
		 System.out.println("7. BMI");
		 System.out.println("8. 계산기");
		 System.out.println("9. P/F");
		 System.out.print("선택 : ");
		 num=sc.nextInt();
		 System.out.println("(실습문제" + num + " 실행)");
		 
		 if(num==1) {
			 practice1();
		 }else if(num==2) {
			 practice2();
		 }else if(num==3) {
			 practice3();
		 }else if(num==4) {
			 practice4();			 
		 }else if(num==5) {
			 practice5();			 
		 }else if(num==6) {
			 practice6();			 
		 }else if(num==7) {
			 practice7();			 
		 }else if(num==8) {
			 practice8();			 
		 }else if(num==9) {
			 practice9();			 
		 }else {
			 System.out.println("X");
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}// end of class
