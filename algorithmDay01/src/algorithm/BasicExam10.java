package algorithm;

public class BasicExam10 {

	public static void main(String[] args) {
			int [][] table = new int [5][5];
			int value=1; //값누적
			//행을 기준
			for (int i = 0; i < table.length; i++) {

				//열의 기준
			for (int j = 0; j < table[i].length; j++) {
				if(j==0) {
					table[i][0] = i +1;
					value = table[i][0];
				
				}
				table [i][j] = value;
				value = value + 5;
//				value = value + 5;
//				table[i][j] = value +5;
					System.out.print(table[i][j] + " ");
				
				}
			System.out.println();
			}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
