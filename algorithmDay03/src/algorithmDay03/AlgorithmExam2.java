package algorithmDay03;

import java.util.Scanner;

public class AlgorithmExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int a, b;
//		a = sc.nextInt();
//		b = sc.nextInt();
////		System.out.println(a + b);

		int t = sc.nextInt(); 
//		int numA = 0, numB = 0, sum = 0;
//
//		for (int i = 1; i <=t; i++) {
//			numA=sc.nextInt();
//			numB=sc.nextInt();
//			System.out.println(numA + numB);
//		}
		
		while(t-- >0) {
			int a=0,b=0;
			
			a= sc.nextInt();
			b= sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
	}

}
