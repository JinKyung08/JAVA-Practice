package repeatExam;

import java.util.Scanner;

public class whileTest03 {

	public static void main(String[] args) {
		// (1) square
		// (2) square root
		// (3) log
		// 원하는 메뉴(1~3)를 선택하세요.(종료:0)
		
		int menu = 0;
		String menuString = "";
		Scanner scan = new Scanner(System.in);
		
		while(true) {
//			System.out.println("원하는 메뉴를 선택하세요.(종료:)\n"+ "(1) Square \n(2) square root \n(3) log" );
			System.out.println("(1) squre");
			System.out.println("(2) squre root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>>");
			System.out.println();
		
			menuString =scan.next();
			menu = Integer.parseInt(menuString);
			
			if(menu==0) {
				System.out.println("프로그램 종료");
				break;
			}else if(!(menu>=1 && menu<=3)) {
				System.out.println("메뉴를 잘못 선택함");
				continue;
			}else {
				System.out.println("=> 선택한 메뉴는"+ menu + "번입니다");
				System.out.println();
			}
		}
		
	}

}
