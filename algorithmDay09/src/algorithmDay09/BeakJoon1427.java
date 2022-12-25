package algorithmDay09;

import java.util.Scanner;

public class BeakJoon1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("수 입력");
		String n =sc.nextLine();
		
		int[] arr = new int [n.length()];
		
		//배열에 값 담기 (문자를 정수로)
		for (int i = 0; i < arr.length; i++) {
			arr[i] =n.charAt(i)-'0';
		}
		
		//내림 차순 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		
		}
		//출력
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
		
	}

}
