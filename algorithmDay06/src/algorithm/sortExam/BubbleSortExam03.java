package algorithm.sortExam;

public class BubbleSortExam03 {

	public static void main(String[] args) {
		
		/*
		 * 버블정렬 - 좌우로 번갈아 가면서 정렬 한 번은 왼쪽에서 오른쪽으로 진행하면서 최댓값을 오른쪽으로 보내고, 또 한 번은 오른쪽에서 왼쪽으로
		 * 진행하면서 최솟값을 왼쪽으로 보내는 방법을 반복하면서 정렬하는 프로그램 작성
		 * 
		 * 초기 설정 값 : 5, 4, 3, 2, 1
		 */
		int i = 0; // 정렬 회전 수 지정
		int left = 0; // 왼쪽위치 지정
		int right = 4; // 오른쪽 위치 지정
		int shift = 0; // 시작 위치 설정
		int temp = 0; // 교환시 임시 자료 보관

		int[] arr = new int[] { 5, 4, 3, 2, 1 };

		while (left < right) {
			for (i = left; i <= right - 1; i++) { // 왼쪽 -> 오른쪽
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

					shift = i; // 다음에 시작할 인덱스 설정

				} // end of if()

			} // end of for(), left

			right = shift; // 오른쪽의 시작 인덱스 설정
			
			for (i = right; i >= left + 1; i--) { // 오른쪽 -> 왼쪽
				if (arr[i - 1] > arr[i]) {
					temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;

					shift = i; // 다음에 시작할 인덱스 설정

				} // end of if()

			} // end of for(), right

			left = shift; // 왼쪽 시작 인덱스 설정

		} // end of while()

		for (int k = 0; k < 5; k++) {
			System.out.print(arr[k] + " ");
		}

	}
}
