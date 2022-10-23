package algorithmDay03;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AlgorithmExam4 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		String str = "Hello,java,is,fun";

		//StringTokenizer(문자열) ; //띄어쓰기(한칸 공백을)를 기준을 문자열 구분
		//new StringTokenizer(문자열,구분자); // 구분자를 기준으로 문자열 구분
		//new StringTokenizer(문자열,구분자, true/false); // 구분자를 기준으로 문자열 구분하되
//														     구분자도 문자열로 처리할 것인가
//															 true - 구분자(, ; (...)를 문자열로 처리
//															 false - 구분자는 제외
//		
//		hasMoreTokens() : 토큰(구분되어진 문자열)이 있느냐(true반환) 없느냐(false)
//		hasMoreElements() : hasMoreTokens()와 같음
//		nextToken() : 객체에서 다음 토큰(문자열)을 반환
//		countTokens() : 총 토큰의 개수를 반환
		
//		StringTokenizer st = new StringTokenizer(str,",");
//		while(st.hasMoreTokens()) { // 토큰이 있으면 true, 없으면 false
//			System.out.println(st.nextToken());
//			
//		}
//		System.out.println();
//		
//		StringTokenizer st1 = new StringTokenizer(str,",",true);
//		while(st1.hasMoreTokens()) { // 토큰이 있으면 true, 없으면 false
//			System.out.println(st1.nextToken());		
//		}

		
		String str1 = "Java, is,fun,and,algorithm";
		//문자열. split(구분자) : 배열로 반환
		String [] arr= str1.split(",");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println();
//		int t = scan.nextInt();
//		//문자열. split(구분자) : 배열로 반환
//		for (int i = 0; i < t; i++) {
//			String[] str1 = scan.next().split(","); //문자열
//			System.out.println(Integer.parseInt(str1[i]));
//		}
		
	}

}
