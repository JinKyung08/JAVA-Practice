package algorithm;

public class BasicExam9 {

	public static void main(String[] args) {
		int [][] array = new int [5][5];
		int value=0,col=0;
		
		do {
			int row = 0;
			
			do {
				value++;
				array[row][col] = value;
				row++;
				
			}while(row<=4);
			col++;
			
		}while(col<=4);
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.println(array[i][j] + "  ");
			
		}
	System.out.println();
		}
	
	
	
	
	
	}

}
