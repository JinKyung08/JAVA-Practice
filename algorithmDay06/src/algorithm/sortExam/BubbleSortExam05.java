package algorithm.sortExam;

import java.util.Arrays;

public class BubbleSortExam05 {

	public static void main(String[] args) {
		// 석차 구하기
		
		int [] score = { 80, 73, 65, 95, 70};
		int [] rank = new int[5]; // 순위담을 배열
		
		
		for (int i = 0; i < score.length; i++) {
			rank[i] = 1; // 성적을 모두 1로 초기화
			
			// 두사람씩 비교
			for (int j = 0; j < score.length; j++) {
				
				if (score[i]<score[j]) {
					rank[i]++;
				}
				
			}
		}
		System.out.print("점수 : " );
		for (int i = 0; i < rank.length; i++) {
			System.out.print(score[i] + " ");			
		}
		System.out.println();
		
		System.out.print("석차 : ");
		for (int j = 0; j < rank.length; j++) {
			System.out.print(rank[j] + "  ");
			
		}
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
