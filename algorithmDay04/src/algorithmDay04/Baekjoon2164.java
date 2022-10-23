package algorithmDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon2164 {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("수를 입력하세요");

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{ 	n = Integer.parseInt (br.readLine());
				
//		Scanner sc = new Scanner (System.in);
//		n = sc.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 1; i <=n; i++) { //n장 만큼 저장
			q.offer(i);	
		}
		
		while(q.size()>1) { //카드가 1개 남을때까지
			q.poll();  //맨 윗장 버리기
			
			q.offer(q.poll());// 앞값을 맨뒤에 저장 
			 			
		}
		System.out.println(q.peek()); // 맨윗장
		
	} catch (Exception e) {

	}
	
	
	
	
	}

}
