package arrayExam;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {

		int[][] arr = new int [2][3];
		
//		arr[0][0] = 10;
		//입력
		for(int i=0; i<arr.length; i++) {   //행
				for(int j=0; j<arr[i].length; j++) {     //열
					arr[i][j] = (i+1)*(j+1)*10;
					
				}
		}
		//출력
		for(int i=0; i<arr.length; i++) {   //행
			for(int j=0; j<arr[i].length; j++) {     //열
				System.out.println(arr[i][j]);
			}
		}
		
		//Arrays.deepToString()
		System.out.println(Arrays.deepToString(arr));
		
		
	} // end of ArrayExam02

} //end of main
