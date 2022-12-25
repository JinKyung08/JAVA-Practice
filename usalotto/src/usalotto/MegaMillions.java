package usalotto;

public class MegaMillions {

	public static void main(String[] args) {
		//변수 선언
		int whiteBall = 0;
		int megaBall = 0;
			
	//70개 중 번호5자리 =>5개
		for(int i=1; i<=5; i++) {
			//번호를 뽑기
			whiteBall =(int)(Math.random() * 70)+1;
			System.out.print(whiteBall+" ");
		}
		System.out.println();
	//25개 중 번호1자리
		megaBall=(int)(Math.random()*25)+1;
		System.out.println(megaBall);

	}

}
