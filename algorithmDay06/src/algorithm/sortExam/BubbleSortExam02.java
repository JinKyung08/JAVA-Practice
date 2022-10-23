package algorithm.sortExam;

public class BubbleSortExam02 {

	public static void main(String[] args) {

		int [] arr = {4,5,1,2,3};
		// sw : 스위치 변수는 두 작업이 번갈아 반복될 때 이용하면 편리
		// 여기는 교환이 일어나느 것과 일어나지 않는 것 둘 중 하나
		// 교환이 일어나지 않을 떄 : sw=0, 교환이 일어나면 : sw=1
		// 교환이 발생하지 않는 다는 것은 정렬이 완료되었다는 뜻
		// 완료된 시점에 반복문을 멈춤
		int tmp =0; // 자리 교환때 사용할 임시 변수
		int sw=0; // 교환발생 여부를 저장할 변수
		int count=0; // 교환횟수를 저장할 변수
		
		
		for(int i=0; i < 4 ; i++) {
			sw = 0 ; // 처음이니까 교환 발생 안됨
			
			for(int j=0; j< 4 - i; j++ ) {  // 교환 작업
			
				// 비교 후 자리교환 작업
			   if(arr[j] > arr[j+1]) {
				   //자리교환
				   tmp = arr[j];
				   arr[j] = arr[j+1];
				   arr[j+1] = tmp;
			
				   // count 증가 : 자리교환이 있으므로 
				   count++;
				   // sw=1로 변경 : 자리교환이 일어났으므로
				   sw=1;
			   }
			}
			//sw==0인지 판단 해서 0이면 break
			if(sw==0) { break; }
			
		}
		System.out.println("교환 횟수 : " + count);
		//출력
		for(int i=0; i<5; i++) {
			System.out.print(arr[i] + " ");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
