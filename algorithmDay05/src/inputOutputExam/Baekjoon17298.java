package inputOutputExam;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;


public class Baekjoon17298 {

	public static void main(String[] args) throws Exception {
		
		// 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		
		int[] arr = new int[n];  // 배열
		int[] nge = new int[n];	 // 오큰수 배열
		

		Stack<Integer> st = new Stack<>();

		String[] tmp = br.readLine().split(" "); //수열 읽어오기 (공백)

		//값을 정수 변환 및 저장 
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(tmp[i]);
		}

		st.push(0);

		
		for (int i = 0; i < n; i++) {
		while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
			nge[st.pop()] = arr[i];
		}
			st.push(i);
		}
		
		while (!st.isEmpty()) {
			nge[st.pop()] = -1;
		}

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int j = 0; j < n; j++) {
			bw.write(tmp[j] + " ");
		}
		bw.flush();
		

		
		
		
		
		
		
	}

	
}
