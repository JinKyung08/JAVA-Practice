package algorithmDay09;

import java.util.Scanner;

public class GcmLcmExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("두 수 입력");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int lcm =0;
		int small =0, big =0;
	
		//최대공약수 구하기 
		// 두 수 중에 큰 수 결정
		big = x;
		small =y;
		if(big< small) {
			int tmp =0;
			tmp = big;
			big = small;
			small = tmp;
		}
		// 나머지 구하기 
		while(true) { // == for(; ;){ } 
			int r=0;//나머지
			r=big % small;
			
			if(r==0) {break;}
			
			big=small;
			small=r;
		}
		
		//최소공배수
		lcm = (x*y) / small; // 최소공배수 = (x*y)/최대공약수;
		
		System.out.println("최대공약수 : " + small);
		System.out.println("최소공배수 :" + lcm);
		
		
		
		
		
		
		
		
		
		
	}

}
