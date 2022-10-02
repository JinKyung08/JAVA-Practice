package scoreExam;

public class EnglishScore implements Comparable <EnglishScore> {
	    //객체생성
		String name;
		int score;
		
		//생성자
		public EnglishScore (String name, int score) {
			this.name = name;
			this.score = score;
		}

		//toSting 재정의
		@Override
		public String toString() {
			return name + ", " +score;
		}
		
		//compareTo 재정의
		
		public int compareTo(EnglishScore o) {
			return this.score - o.score ;
		}
}
