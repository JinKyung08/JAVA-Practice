package algorithm.factorial;

public class AlgorithmExam3 {

	public static void main(String[] args) {
		int [] test = {1,2,6,5,4,2};
		int [] sam = new int [10];
		
		
		for (int i = 0; i < test.length; i++) {
			sam[test[i]] = 1;
		}
		
		for (int i = 0; i < 10; i++) {
			if(sam[i]==0) {
				continue;
			}
				System.out.print(i);
			
		}
		
	}

}
