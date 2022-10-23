package algorithm.sortExam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.StringTokenizer;

public class BaekJoon_11399 {

	public static void main(String[] args) throws Exception { //아직못품

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = IntegerParseInt(br.readLine());  // 사람의 수 입력받기
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int [] p = new int [n]; //시간 
		int sum = 0; // 대기시간 총합
		
		for (int i = 0; i < p.length; i++) {
			p[i] = IntegerParseInt(st.nextToken());
			
		}
		br.close();
		for (int i = 0; i < p.length; i++) {
			for (int j = i+1; j < p.length; j++) {
				if (p[i] > p[j]) {
					int tmp = p[i];
					p[i] = p[j];
					p[j] = tmp;
				}
			}
		}
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p.length+1; j++) {
				sum += p[j];
			}
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
	}

	private static int IntegerParseInt(String readLine) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static Reader InputStreamReader() {
		// TODO Auto-generated method stub
		return null;
	}

}
