package scoreExam;

public class MainScore {

		public static <T extends Comparable> T findBest(T[] t) {
			T max = t[0];
			
			for (int i = 0; i < t.length; i++) {
				if(max.compareTo(t[i])<0) {
					max =t[i];
				}
				
			}
			return max;
		}
		
	public static void main(String[] args) {
		
		//객체생성
		EnglishScore[] engScore = { new EnglishScore("홍길동", 70), new EnglishScore("우영우", 95),
				new EnglishScore("정명석", 50), new EnglishScore("정우성", 70) };
		MathScore[] matScore = { new MathScore("홍길동", 90), new MathScore("우영우", 45), new MathScore("정명석", 70),
				new MathScore("정우성", 89) };
		
		
			System.out.println("영어 최고 점수 = " + findBest(engScore));
			System.out.println("수학 최고 점수 = " + findBest(matScore));
		
//		EnglishScore result = findMax(engScore); 
//		System.out.println("영어 최고 점수 : " + result);
			
	}//end of main

//	//최고점수를 찾기 위한 메서드 호출 //한사람거할때 //일반타입 
//	public static EnglishScore findMax(EnglishScore[] a ) { 
//		EnglishScore max = a[0]; //최고,최저 값을 구할 때 초기값으로 배열의 0번째 인덱스 값을 담거나 0을 담는다
//	
//		for (int i = 0; i < a.length; i++) {
//			if(max.compareTo(a[i]) < 0) {
//				max =a[i];
//			}
//		}
//		return max;
//	
//	}
//	
	
	
	
	
	
	
	
}// end of class
