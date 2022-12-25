package algorithm.binarysearch;

public class BinarySearchExam {
	static int binarySearch (int [] arr, int l, int r, int s) {
		int m =0 ; // 중앙 위치, l은 왼쪽 (시작), r은 오른쪽 (끈) s-찾는값
	
		while(true) {
			// 찾는 값이 없을 때
			if(l>r) {
				return -1;
			}
		
			//찾기, 중간위치 찾기 (시작 + 끝) /2
			m = (l+r)/2;
			if(arr[m] > s) {
				r = m-1;
				continue;
			}else if (arr[m]< s) {
				l = m+1;
				continue;
			}else {
				return m+1; 
			}
	
	
		}	
	}
	
	public static void main(String[] args) {

//		int arr [] = { 14,17,20,22,26,48,50,59,90,100 };
//		int s = 20 ; // 찾는값
//		int l = 0; // 중앙보다 아래 
//		int h = arr.length; // 중앙보다 위
//		int m = 0; // 중앙값
//		
//		
//		while(true) {  
//			m=(l+h)/2; // 중앙값 찾기
//
//			if (arr[m] == s) {
//				break;
//			}else if (s <arr[m]) { // 찾는값이 배열의 중앙값보다 작을 때 
//				h = m - 1/2;
//			} else if (s > arr[m]){
//				l = m + 1/2;
//			} else {
//				System.out.println("Not Found");
//			}
//			
//		}
//		
//		System.out.println("찾는값 " + m + "번째 인덱스");
	
		int [] arr = { 14,17,20,22,26,48,50,59,90,100 };
		int result = binarySearch (arr, 0, 9, 20);
		System.out.println(result);
		
		
	}

}
