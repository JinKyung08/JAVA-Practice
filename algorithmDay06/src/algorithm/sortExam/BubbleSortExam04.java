package algorithm.sortExam;

public class BubbleSortExam04 {

	public static void main(String[] args) {
		//삽입정렬
		
		int [] arr = {8,5,6,2,4};
		  int i=0, j=0, key=0;
		  
		  
		  for(i=1; i< 5; i++) { // key를 담기위해
			   key = arr[i]; //key 값 담기
			   
			   for(j=i-1; j>=0; j--) { // key와 요소들을 비교
				   if(arr[j]<=key) { break; } // break는 if를제외한 자기랑 가장 가까이 있는 { } 를 빠져나감
				   arr[j+1] = arr[j]; //키보다 크면 뒤로 이동
			   }
			   
			   arr[j+1] = key;   // 키 다시 설정
			   
		  }

				
				
			

		//출력
		for (int k= 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
