package repeatExam02;

public class RandomExam {

	public static void main(String[] args) {

		//double ran = Math.random()*3;
//		int ran = (int)(Math.random()*6); // 0,1,2,3,4,5
//		int ran = (int)(Math.random()*6) + 1; // 1,2,3,4,5,6
		
		//변수 선언
		int lotto = 0;
		
		//번호6자리 =>6개
		for(int i=1; i<=6; i++) {
			//번호를 뽑기
			lotto =(int)(Math.random() * 45)+1;
			System.out.print(lotto+" ");
		}
		
	}

}
