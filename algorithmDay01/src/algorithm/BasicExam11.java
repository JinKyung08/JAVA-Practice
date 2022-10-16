package algorithm;

import java.util.Iterator;

public class BasicExam11 {

	public static void main(String[] args) {
		int [][] t = new int [5][5];
		int value=0, col=0;
//-----------------------------------------------do while문		
//		do { // 열기준
//			int row =0;
//			
//			
//			do {  // 행
//				value++;
//				t[row][col]= value;
//
//				// 다음행으로 가기 위해 행을 증가
//				row++;
//			}while(row<5); // row<=4
//			//열을 증가, 한행이 끝나고 다음 열 처리
//			col++;
//		}while(col<5);
//		
//------------------------------------------------------while문		
		//열기준
		while(col<5) {
			int row = 0;
			//행기준
			while(row<5) {
				value++;
				t[row][col]=value;
				row++;
			}
			//다음 열로 이동
			col++;
		}

		

		
		
	//출력
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j]+ " ");
			}
			System.out.println();
		}
	
		
		
		
		
	}

}
