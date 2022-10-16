package algorithm;

import java.util.Scanner;

public class BasicExam6 {

	public static int max3 (int a, int b, int c) {
		
		int max= a;
		
		if(max<b) {
			max = b;
		}
		if(max<c) {
			max = c;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int fNum=0, sNum=0, lNum=0;
		int max =0; // 첫번째 인덱스의 값, 기준이 되는 값을 담고 
		
		System.out.println("정수 3개를 입력하세요.");
		fNum=Scan.nextInt();
		sNum=Scan.nextInt();
		lNum=Scan.nextInt();
		
		max = fNum;
		
		if(max<sNum) {
			max = sNum;
		}
		if(max<lNum) {
			max = lNum;
		}
		System.out.println("최댓값은 : " + max);
		
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
		System.out.println("max3(3,2,3) = " + max3(3,2,3));
		System.out.println("max3(3,3,3) = " + max3(3,3,3));
		System.out.println("max3(2,2,3) = " + max3(2,2,3));
		System.out.println("max3(2,3,1) = " + max3(2,3,1));
		System.out.println("max3(2,3,2) = " + max3(2,3,2));
		System.out.println("max3(1,3,2) = " + max3(1,3,2));
		System.out.println("max3(2,3,3) = " + max3(2,3,3));
		System.out.println("max3(1,2,3) = " + max3(1,2,3));
		
		
	}

}
