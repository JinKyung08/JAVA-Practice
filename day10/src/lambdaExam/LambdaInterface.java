package lambdaExam;

@FunctionalInterface   //함수적인 인터페이스
// 함수적 인터페이스는 내부에 추상메서드 단 1개만 가지는 인터페이스 
public interface LambdaInterface {
	void show();   //추상메서드
//	void info();  두개 적으면 에러뜸
}
