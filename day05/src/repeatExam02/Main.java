
package repeatExam02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//		
//		String re = "";
//		String star = "*";
//		
//		for (int i = 0; i < N; i++) {
//			re += star;
//			System.out.println(re);
//		}
		//구구단

		int[][] dan = new int [9][10];
		
		for(int i = 1; i <=dan.length ; i++) {
			for(int j = 2; j<=dan.length ; j++) {
				System.out.printf(j+"*"+i+"="+(j*i)+"\t");
			} 		
			System.out.println();
		}
		
	
	
	
	
	} //end 

} // end 
