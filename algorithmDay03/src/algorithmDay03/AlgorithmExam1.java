package algorithmDay03;

import java.util.Scanner;

public class AlgorithmExam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N;
		int sum=0;
		int count=0;
		
		N=scan.nextInt();
		
//		// 1
//		for (int i = 1; i <= N; i++) {
//			sum += i;
//			System.out.println("연산 횟수 : " + count++);
//		}	//O(N)
//		
//		// 2
//		for (int i = 1; i <= N; i++) {
//			sum += i;
//			System.out.println("연산 횟수 : " + count++);
//		}	//O(N)
//		
//		// 3
//		for (int i = 1; i <= N; i++) {
//			sum += i;
//			System.out.println("연산 횟수 : " + count++);
//		}  //O(N)
//		
//		// 4
//		for (int i = 1; i <= N; i++) {
//			for (int j = 1; j <= N; j++) {
//				sum+=i;
//				System.out.println("연산 횟수 : " + count++);
//			}	// O(N2)		
//		}
		
		// 5 
		sum = N *(N+1) /2;    // O(1)
		
		
		
		
		
		
		
		
		
	}

}
