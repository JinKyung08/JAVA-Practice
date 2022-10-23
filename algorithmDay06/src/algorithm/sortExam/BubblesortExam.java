package algorithm.sortExam;

public class BubblesortExam {

	public static void main(String[] args) {
//오름차순 정렬
		int [] arr = { 8,5,6,2,4};
		int tmp=0;
	
		for (int i = 0; i < 4; i++) { // arr.length-1 (5-1) 회전, 마지막X
			
			for (int j = 0; j < 4-i; j++) { //arr.length-1-i  
				
				if(arr[j]>arr[j+1]) { //값 비교
					tmp = arr[j];
					arr[j] = arr [j+1];
					arr[j+1]=tmp;
				}
			}
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		//do ~ while
		int[] arr1= {8,5,6,2,4};
		int i=0,temp=0;
		
		do {
			int j=0;
			do {
				if(arr1[j]>arr1[j+1]) {
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
					
				j++;
			}while(j<4-i);
			i++;
		}while(i<4);
		
		
		//출력
				for (int k = 0; k < arr1.length; k++) {
					System.out.print(arr1[k] + " ");
				}
		
		
		
	}

}
