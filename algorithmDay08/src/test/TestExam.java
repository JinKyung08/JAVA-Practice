package test;

public class TestExam {

	public static void main(String[] args) {
//dfs : 깊이 우선탐색, 스택, 재귀
//bfs : 너비 우선 탐색, 큐

		int [][] test = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			test[i][i] = i + 1;
			test[3-i][i] = i + 1;
			
		}
		
		int sum = 0;
		
		for (int y = 0; y < 4; y++) {
			for (int x = 0; x < 4; x++) {
				sum += test [y][x];
				
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
	}

}
