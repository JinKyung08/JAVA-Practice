package arrayExam;

import java.util.Arrays;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		int[] num = new int[5];        //int num{} 가능
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
//		num[5] = 60; // ArrayIndexOutOfBoundsExcepthin 예외,멈춤
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);

		
		//================================
		//문자열.length() => 문자열의 길이(개수)
		//참조변수명,length = > 배열의 길이
		
	// === 아래 내용은 서로 비교하면서 보기	
		for(int i=0; i<num.length; i++) {
			System.out.println("num["+ i + "]" + num[i]);
			
		}
		
		//확인만 - 문자열형태로 확인 Arrays.toString()
		System.out.println(Arrays.toString(num));//[10, 20, 30, 40, 50]
		
		
		// 향상된 for문(for each문)
		for(int arr : num) {
			System.out.println(arr);
		}
		
		
			
		
		
		
		
		
		
	} // end of ArrayExam01
 
}//  end of main
