package algorithm.sortExam;

import java.util.Scanner;


public class BaekJoon_11399 {

	public static void main(String[] args) throws Exception { //아직못품

		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();  // 사람의 수 입력받기		
		int [] p = new int [n]; //각 인출 시간 
		int [] sum = new int [n]; // 대기시간 총합
		
		//각 인출 시간 입력받기
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		//삽입정렬 ,키 (key)를 가지고 비교하면서 오름차순 정렬해 나가기
		for (int i = 1; i < n; i++) {
		    int insert_point = i;   // 삽입할 위치
		    int key = p[i]; // 삽입할 값
		    
		    // key값과 비교한 후 삽입위치 찾기
			for (int j = i-1; j < n; j--) {
				if (p[i] > p[j]) { // 자리를 교환하려는 값을 찾기 위한 비교
					insert_point = j+1;     
				}
				if(j==0) {  // 처음위치라 더이상 비교할 값이 없으므로 삽입위치가 0이됨 
				    insert_point = 0; //0번째 인덱스 위치
				}
			}
			
			for( int j=i; j>insert_point; j--) {
			    //삽입을 위해 삽입 위치에서 한칸씩 뒤로 밀기
			    p[j]=p[j-1];
			}
			//삽입 위치에 현재 데이터 삽입하기
			p[insert_point] = key;
		}
		
		//합 배열 만들기
		sum[0]=p[0];
		int s =0;
		for (int i = 1; i < n; i++) {
		    sum[i]= sum[i-1]+p[i];
		    s += sum[i];
		}
		//합 결과 출력하기
		System.out.println(s);
		
		
		
		
		
		
		
		
	}

}
