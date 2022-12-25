package algorithmDay09;

public class SelectionSortExam {

	public static void main(String[] args) {
		int [] arr = {98,75,85,100,50};
		 
		//오름차순으로 정렬(선택정렬)
		for (int i = 0; i < arr.length-1; i++) {
			
				//비교
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i]=arr[j];
						arr[j]=tmp;
					}
				}			
		}
		//출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
