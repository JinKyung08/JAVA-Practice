package algorithm;

public class BasicExam3 {

	public static void main(String[] args) {
// 다음 등차수열에 대하여 200번째 숫자까지의 합을 구하시오.
//		2, 8, 14, 20, 26, 32, 38,.... +6
		
		
//등차수열 : 각 항에 일정한 수를 더하여 다음 항을 만든 것
//공차 : 더해지는 일정한 수  // 공차 : 6 
		
		int sum = 0, d=6, f=2, n=1, fn=0;
		
		
		while(n<=200) {
			fn = f + (n-1) * d;
			sum += fn;
			n++;
			
		}
		System.out.println(sum);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
