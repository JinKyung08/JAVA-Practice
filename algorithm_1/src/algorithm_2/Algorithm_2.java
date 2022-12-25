package algorithm_2;

import java.util.Scanner;

public class Algorithm_2 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 
		 
	      int N = in.nextInt();
	      long[] cardNum = new long[N];
	      
	      for (int i = 0; i < N; i++) {
	         cardNum[i] = in.nextLong();
	      }
	      
	      long A = in.nextLong();
	      long B = in.nextLong();
	      
	      in.close();
	      
	      long result = 0;
	      int cnt = 0;
	      
	      if(A<=result&&result<=B) {
	         cnt++;
	      }
	      
	      System.out.println(cnt);
	   }

	}
