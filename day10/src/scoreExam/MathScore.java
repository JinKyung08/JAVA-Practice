package scoreExam;

public class MathScore implements Comparable<MathScore> {
	//객체생성
	String name;
	int score;
	
	//생성자
	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	//toSting 재정의
	@Override
	public String toString() {
		return name + ", " +score;
	}
	
	//compareTo 재정의
	
	public int compareTo(MathScore o) {
		return this.score - o.score ;
	}
	
}
