package algorithmDay02;

import java.util.Iterator;

public class BasicExam3 {

	public static void main(String[] args) {
//		1   2   3   4   5
//		    6   7   8
//		        9
//		   10  11  12
//	   13  14  15  16  17
		//두개를 나눠서 처리 중간행을 기준으로 
		
		int [][] t = new int [5][5];
		int value=1;
		int m = 3; // 전체행수/2 => 소수이하는 올림 
		
		//배열에 값을 담기
		// 중간행을 기준으로 위쪽 설계
		for (int i = 0; i < m ; i++) {
			
			for (int j = i; j < (5-i); j++) {
				t[i][j]=value;
				value++;
				
			}
			
		}
		
		// 중간행을 기준으로 아래 설계
		for (int i = m; i < t.length; i++) {
			for (int j = (4-i); j <= i; j++) { 
				t[i][j] = value;
				value++;
			}
		}
		

		
		
		
		//배열에 담겨있는 값을 출력
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				if(t[i][j]==0) {
					System.out.print(" \t");
				}else {
				  System.out.print(t[i][j] + "\t");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
