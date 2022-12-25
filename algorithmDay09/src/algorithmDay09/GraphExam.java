package algorithmDay09;

public class GraphExam {

	public static void main(String[] args) {
		//최소비용 그래프
		// 어떤 그래프가 7개의 정정(nod)과, 서로 다른 가중치(Weight)를 갖는 11개의
//		간선(Edge)으로 구성되어 있다. 주어진 간선을 따라 7개의 정점을 cycle없이 모두
//		연결할 때 포함된 간선의 가중치 총합이 가장 작은 경우를 찾는 
//		최소비용 그래프 알고리즘 작성
		
//		- 가중치 선택 정렬
//		- w(1)을 가중치를 갖는 간선(가장 작은 가중치를 갖는 간선)부터 차례로 최소비용 그래프의 경로에 간선을추가하고
//		- 간선을 추가할 때 사이클이 생기면 경로에서 제외하고 그 다음으로 큰 가중치를 갖는 간선을 고려
//		- cycle배열은 현재까지 만들어진 경로에 가중치 배열 w의 간선을 추가했을 때 경로상에 사이클이 만들어지면 1, 만들어지지 않으면 0으로 처리하여 사이클이 만들어지는 여부를 판단
//		- 경로에 추가된 간선의 개수가 전체 정점(node)-1 (즉 전체 정점개수보다 1작으면) 작업종료  최소비용그래프는 간선의 개수가 전체 노드수 -1
//		- 현재까지 경로에 추가된 간선의 개수를 보관하기 위하여 l을 사용
		
		int[] w= {4,2,10,7,12,15,18,20,9,13,1}; // 간선의 가중치
		int[] cycle= {0,0,0,0,0,1,0}; //사이클 발생 체크
		
		int n=7; // 노드수
		int e=11; //간선수
		
		int tmp =0;
		int l=1; // 최소비용그래프로 그려진 간선의 개수
		int total=0; // 최소비용그래프로 그려진 간선의 가중치 총합
		int k=0; // 반복을 위한 변수
		//현재 가중치 확인 
		for (int i = 0; i < 11; i++) {
			System.out.print(w[i]+ " ");
		}
		System.out.println();
		
		//가중치 오름차순 정렬
		for (int i = 0; i < w.length-1; i++) {
			
			//비교
			for (int j = i+1; j < w.length; j++) {
				if(w[i] > w[j]) {
					tmp = w[i];
					w[i]=w[j];
					w[j]=tmp;
				}
			}			
	}
		//가중치 오름차순 확인
		for (int i = 0; i < w.length; i++) {
			System.out.print(w[i] + " ");
		}
		System.out.println();
		
		//그려진 간선의 개수가 전체 노드수-1 보다 작거나 같을때까지
		while(l<=(n-1)) {
			// cycle[k]가 0이면 간선 추가하고 가중치 합 구하기
			// cycle이 만들어지지 않으면 간선을 추가
			if(cycle[k]==0) {
				total += w[k]; // 가중치의 합
				l++;
			}
			
			k++;  // 다음으로 큰 가중치를 갖는 간선에 대하여 반복여부를 체크하기 위해
			
			
		}
		System.out.println("가중치의 총합 : " + total);
		
		
		
		
		
		
		
	}

}
