package algorithmDay09;

public class Algorithm2 {
			
	static int count =0;
	static void test() {
		count -=1;
	}
	
	static void test2() {
		test();
		test();
		test();
		count++;
	}
	
	public static void main(String[] args) {

		count++;
		for (int i = 0; i < 3; i++) {
			test() ;
			count++;
			test2();
			count++;
			test2();
		}
		System.out.println(count);
		
		
		
		
		
		
		
	}

}
