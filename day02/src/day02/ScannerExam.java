package day02;
/*예제3) 번호를 입력받아서
 * 번호가 짝수면 "한강, 홀수면"서울숲"
 * 
 */
import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  //키보드로부터 입력받을게
		int num=0; // 초기화
		String result=""; //문자열 초기화
//		String msg = "숫자를 입력하세요>>";
		
		//사용자에게 무엇을 입력할지 알려주는 안내 문구
		System.out.println("숫자를 입력하세요>>");
//		System.out.println(msg);
		num = scan.nextInt();
		result = (num %2==0) ? "한강" : "서울숲";
		
		System.out.println("입력받은 숫자 : " + num);
		System.out.println("나들이장소 : " + result);
		
	
	}

}
