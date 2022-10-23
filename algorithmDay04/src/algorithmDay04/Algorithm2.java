package algorithmDay04;

import java.util.Iterator;

public class Algorithm2 {

	public static void main(String[] args) {
		//달팽이
//		1  2  3  4  5  
//		16 17 18 19 6
//		15 24 25 20 7
//		14 23 22 21 8
//		13 12 11 10 9

			int[][] t = new int[5][5];
			int num = 1; // 배열의 첫번째 값
			int row = 0, col = -1; 
			int length = 5; // 이동범위
			int sw = 1; // 행 또는 열 이동. 1이면 증가. -1이면 감소

			while (length > 0) { // 숫자이동범위가 0이 되면
				for (int i = 0; i < length; i++) {
					col += sw;
					t[row][col] = num;
					num++;
				}

				length -= 1;
				
				for (int i = 0; i < length; i++) {
					row += sw;
					t[row][col] = num;
					num++;
				}
				
				sw *= -1; // 스위치 : 증가->감소 | 감소->증가
				
			}
			
			// 출력
			for (int i = 0; i < t.length; i++) {
				for (int j = 0; j < t[i].length; j++) {
					System.out.print(t[i][j] + "\t");
				}
				System.out.println();
			}
		} 

		
		
	

}
