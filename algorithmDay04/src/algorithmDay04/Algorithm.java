package algorithmDay04;

public class Algorithm {

	public static void main(String[] args) {
//		1  
//		2  3
//		4  5  6
//		7  8  9  10
//		10 11 12 13 14
		
	
		int [][] t = new int [5][5];
		int num = 0;
		//행
		for (int i = 0; i < t.length; i++) {
			//열 
			for (int j = 0; j <= i; j++) {
				num++;
				t[i][j]=num;				
			   }
			}
			
	

	//출력
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (t[i][j] != 0) { 
					System.out.print(t[i][j] + "\t");
				}
			}
			System.out.println();
		}
	
	
	
	
	
	
	} // end of main

} // end of algorithm
