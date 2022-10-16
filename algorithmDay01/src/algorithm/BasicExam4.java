package algorithm;

public class BasicExam4 {

	public static void main(String[] args) {
// 다음 등비 수열에 대하여 10번째 항까지의 합을 구하시오.
// 2, 6, 18, 54, 162,...
// 등비 수열 : 각 항에 일정한 수를 곱하여 다음 항을 만드는 것
// 공비 : 곱하여지는 수
// 초항 : 2, 공비 : 3 
//		n : 항의순서  ,초항을 sum에 담아서 n=2임
		int a=2;  // 초항
		int r=3;	//공비
		int n=2;	// 합계, 합계에 초항값 담음
		int sum = a;  // 항의 순서, sum에 초항을 담았기에 2부터 시작
	
		
		while(n<=10) {
			a *= r; // a=a*r;
			sum += a; // sum = sum + a;
			n++;
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
