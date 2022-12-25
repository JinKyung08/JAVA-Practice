package algorithmDFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon1697 {
	static final int MAX = 100001;
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList <Integer>();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("수빈이 위치");
		int n = scan.nextInt();
		System.out.println("동생의 위치");
		int m = scan.nextInt();
		
		boolean [] check = new boolean[MAX];
		int [] dist = new int [MAX];
		
		check[n] = true;
		dist[n]=0;
		
		q.offer(n);
		while(!q.isEmpty()) {
			int now = 0;
			if(check[m]) {break;}
			now = q.poll();
			if(now-1 >= 0) {
				if(check[now-1] == false) {
					q.offer(now-1);
					check[now-1]=true;
					dist[now-1] = dist[now] +1;
				}
			}
			
			if(now+1 < MAX) {
				if(check[now+1] == false) {
					q.offer(now+1);
					check[now+1]=true;
					dist[now+1] = dist[now] +1;
			}
			if(now * 2 < MAX) {
				if(check[now*2] == false) {
					q.offer(now*2);
					check[now*2]=true;
					dist[now*2] = dist[now] +1;
			}
		   }
		 }
	  }		
		System.out.println(dist[m]);
	}

}
