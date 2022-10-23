package algorithmDay03;

import java.util.Scanner;

public class AlgorithmExam5 {

	public static void main(String[] args) {
		//디버깅
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		int answer = 0;
		
		int[] a = new int[100001];
		int[] s = new int[100001];
		
		for (int i = 0; i < 10000; i++) {
			a[i] = (int)(Math.random()*Integer.MAX_VALUE);
			s[i] = s[i+1] + a[i];
		}
		
		for(int k = 1; k < t; k++) {
			int query = scan.nextInt();
			for (int i = 0; i < query; i++) {
				int start = scan.nextInt();
				int end = scan.nextInt();
				answer += s[end]-s[start-1];
				System.out.println(t+" "+ answer);
		 }
		}	
		
	
		
		
		
		
		
		
		
	
		

	
	
	
	
	}

}
