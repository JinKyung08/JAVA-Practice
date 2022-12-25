package algorithm.factorial;

public class AlgorithmExam2 {
		static void test (int n) {
			if (n<0){
				return;
			}else {
				test (n-1);
				System.out.print(n);   // 0,1,2,3
			}
		}
	public static void main(String[] args) {
		test(3);
	}

}
