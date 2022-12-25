package com.multi.practice.chap02.loop;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int num = 0;

		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();

		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else{
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		}
	}

	public void practice2() {
		int num = 0;

		while (true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else{
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			}
		}

	}
	
	
	
	public void practice3(){
		int num = 0;
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
		
		if (num < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else{
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	

	public void practice4() {
		int num = 0;
		
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else{
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			}
		}
		
	}
	
	
	public void practice5() {
		int num = 0;
		int sum = 0;

		System.out.print("정수를 하나 입력하세요 : ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			sum += i;
			if(i<num) {
				System.out.print(i + " + ");				
			}else {
				System.out.print(i);
			}
		}
		System.out.print(" = " + sum);
	}
	
	public void practice6() {
		int num1 = 0;
		int num2 = 0;

		System.out.print("첫 번째 숫자 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			int smallNum = 0;
			int bigNum = 0;

			if (num1 > num2) {
				smallNum = num2;
				bigNum = num1;
			} else {
				smallNum = num1;
				bigNum = num2;
			}
			for (int i = smallNum; i <= bigNum; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice7() {
		int num1 = 0;
		int num2 = 0;

		while (true) {

			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				int smallNum = 0;
				int bigNum = 0;

				if (num1 > num2) {
					smallNum = num2;
					bigNum = num1;
				} else {
					smallNum = num1;
					bigNum = num2;
				}
				for (int i = smallNum; i <= bigNum; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void practice8(){
		int num = 0;
		
		System.out.print("숫자 : ");
		num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
		
	}
	
	
	public void practice9() {
		int num = 0;

		System.out.print("숫자 : ");
		num = sc.nextInt();

		if (num < 10) {

			for (int i = num; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");

				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
			}
		} else {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}

	}
	
	public void practice10() {
		int num = 0;

		while (true) {
			System.out.print("숫자 : ");
			num = sc.nextInt();

			if (num < 10) {

				for (int i = num; i <= 9; i++) {
					System.out.println("===== " + i + "단 =====");

					for (int j = 1; j <= 9; j++) {
						System.out.println(i + " * " + j + " = " + i * j);
					}
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}

		}

	}

	
	
	public void practice11() {
		int num = 0;
		int a = 0;

		System.out.print("시작 숫자 : ");
		num = sc.nextInt();
		System.out.print("공차 : ");
		a = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(num + " ");
			num += a;
		}
	}
	
	
	
	public void practice12() {
		int num1 = 0;
		int num2 = 0;
		String op = "";

		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			op = sc.next();

			if (op.equalsIgnoreCase("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("정수1 : ");
			num1 = sc.nextInt();
			System.out.print("정수2 : ");
			num2 = sc.nextInt();

			if (0 <= num1 && 0 <= num2) {
				if (op.equals("+")) {
					System.out.println(num1 + op + num2 + "=" + (num1 + num2));
				} else if (op.equals("-")) {
					System.out.println(num1 + op + num2 + "=" + (num1 - num2));
				} else if (op.equals("*")) {
					System.out.println(num1 + op + num2 + "=" + (num1 * num2));
				} else if (op.equals("/")) {
					if (0 == num2) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
					} else {
						System.out.println(num1 + op + num2 + "=" + (num1 / num2));
					}
				} else if (op.equals("%")) {
					System.out.println(num1 + op + num2 + "=" + (num1 % num2));
				} else {
					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				}
			}

		}

	}

	
	
	
	public void practice13() {
		int num = 0;

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice14(){
		int num = 0;

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
} // end of class
