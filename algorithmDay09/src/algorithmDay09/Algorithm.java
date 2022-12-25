package algorithmDay09;

public class Algorithm {

	public static void main(String[] args) {
		
		int [] test = {1,2,3,4,5,6,6,3};
		int [] test2 = {1,4,3,5,9,9,3};
		
		boolean c = false;
		
		for (int i = 0; i < test.length; i++) {
			if(test[i] != test2[i]) {
				c=true;
				break;
			}
		}
		
		if(c==false) {
			System.out.println("AAAA");
		}else {
			System.out.println("BBBB");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
