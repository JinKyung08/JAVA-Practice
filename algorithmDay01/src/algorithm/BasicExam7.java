package algorithm;

import java.util.Scanner;

public class BasicExam7 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int a=0, b=0,c=0;
		int med=0;
		
		System.out.println("세정수를 입력해주세요.");
		a=Scan.nextInt();
		b=Scan.nextInt();
		c=Scan.nextInt();
		
		if((b>=a && c<=a)||(b<=a && c>=a)) {
			med = a;
		}else if ((a>b && c<b)||(a<b && c>b)) {
			med = b;
		}else {
			med = c;
		}
			
		System.out.println(med);
	}

}
