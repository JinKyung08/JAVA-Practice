package algorithmDFS;

import java.util.Scanner;

public class BaekJoon2023 {

	static int n; // 자릿수 입력받기
	
	// 숫자를 탐색하기 ( 첫째자리 2,3,5,7)
	static void dfs(int num, int digits) { //dfs(숫자, 자릿수)
		if(digits == n) {
			if(isPrime(num)) {
				System.out.println(num); // 소수 출력
			}
			return; // 탐색 종료
		}
		
		//1-10까지 짝수면 탐색할 필요 없음, 홀수이면 2~4 자릿수를 늘려가면서 소수 판별
		for (int i = 0; i < 10; i++) {
			//짝수이명 탐색 필요 X
			if( i%2==0) { continue;}
			
			if(isPrime(num * 10 + i)) {
				dfs(num * 10 + i, digits +1);
			}
			
		}
	}
	
	// 소수인지 판별
	static boolean isPrime(int num) {
		for (int i = 2; i <=num/2; i++) {
			if(num%i==0) { // 소수아님
				return false;
			}
			
		}
		return true;
	}	
	
	public static void main(String[] args) {
		// 신기한 소수
	
	Scanner scan = new Scanner(System.in);
	System.out.println("자릿수 입력");  // 백준 사용할때 제거
	n = scan.nextInt();
	
	//메서드 호출
	dfs(2,1); // 2, 1의 자리
	dfs(3,1);
	dfs(5,1);
	dfs(7,1);
	
	
	
	
	
	
	
	
	
	
	
	}

}
