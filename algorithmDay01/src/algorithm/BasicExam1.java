package algorithm;

public class BasicExam1 {

	public static void main(String[] args) {
	// 1 ~ 10 까지의 자연수의 합
		
		//변수 : 합 (sum), 더하는 값 : n
		//출력 : 1~10까지의 합 = 합

		
		int sum1 = 0, n=1;

		while(true) {
			sum1 += n;
			n++;
			if(n>10) {break;}
			}
// ---------------------------------		
		do {
			sum1 +=n;
			n++;
		}while (n<=10);
// ----------------------------		
		while (n<=10) {
			sum1 += n;
			n++;
		}

		System.out.println("1~10까지의 합은 : " + sum1);
		
		//내가 한거 
		
		int sum =0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		
		}
		System.out.println("1~10까지의 합은 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
