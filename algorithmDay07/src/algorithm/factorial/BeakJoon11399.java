package algorithm.factorial;

import java.util.Scanner;

public class BeakJoon11399 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n=0;  // 인원수
	      int j=0, i=0, key=0;
	      System.out.println("인원수를 입력>> ");  // 백준에 넣을 때는 생략
	      n = scan.nextInt();
	      
	      int[] a = new int[n];  // 각 사람이 인출하는데 걸리는 시간
	      int[] s = new int[n]; // 각 사람들이 기다리는 시간의 합
	         
	      // 각 사람이 돈을 인출하는데 걸리는 시간 입력 받아 배열에 저장하기
	      for(int k=0; k<n; k++) {
	          System.out.println( (k+1) + "사람이 돈을 인출하는데 걸리는 시간 입력 : >>");  //백준에 올릴때는 생략
	          a[k] = scan.nextInt();
	      }
	      
	      // 삽입정렬   
	      for(i=1; i<n; i++) {
	         key = a[i];  // 비교하고 삽입으로 자리바꿈 할 insert_value
	         for(j=i-1; j>=0; j--) {
	            if(a[j]<=key) { break; }
	            a[j+1] = a[j];
	         }
	         a[j+1] = key;
	      }

	      //  합(s) 배열 만들고 합 구하기
	      s[0] = a[0];  
	      int sum=s[0];
	      for(int k=1; k<n ; k++) {
	         s[k] = s[k-1] + a[k];
	         sum += s[k];
	      }
	   
	      // 합 결과 출력하기
	      
	      System.out.println(sum);

	}

}
