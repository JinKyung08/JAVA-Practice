package repeatExam;

public class whileTest01 {

	public static void main(String[] args) {

		// 1 ~ 5까지 합
		int forTotal=0;// whileTotal=0;
		
//		for(초기식; 조건식(종결식); 증감식) {}
		
		for(int i=0; i<=5; i++) {
			forTotal +=i;    //forTotal = forTotal + i
		}
		System.out.println(forTotal);

		//=====================================
		int whileTotal=0; //합
		int i=1; // 시작값
		
//		while(조건식){ } // 조건식 => 종결식 
		while(i<=5) {
			whileTotal +=i;  //whileTotal = whileTotal + i;
			i++; //++i;
		}
		System.out.println("1. "+whileTotal);
		
		//================================
		
		int whileTotal1 = 0; //합
		int a = 0; // 시작값
		
//		while(조건식){ } // 조건식 => 종결식 
		while (a < 5) {
			a++; //++i;
			whileTotal1 += a;  //whileTotal1 = whileTotal1 + a;
		}
		
		System.out.println("2."+whileTotal1);
		
		
		
		
		
	}

}
