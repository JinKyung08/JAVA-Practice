package algorithmDay03;

public class AlgorithmExam6 {

	public static void main(String[] args) {
//문제1) 1-2+3-4+5-6+....+99-100까지의 합계구하기
		
//		int sum=0;
//		
//		for (int i = 1; i <=100 ; i++) {
//			if(i%2==0) {  //i가 짝수
//				sum-=i;
//			}else {			//i가 홀수
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//		
		
//문제2) 1+2+4+7+11+16+22+...의 순서로 나열되는 수열의 20번째 항까지의 합계
		
		int sum1 = 0, count = 1;
		
		for(int i = 0; i < 20; i++) {
			count += i;
			sum1 += count;
		}
		
		System.out.println(sum1);

//문제3) -1+2-4+7-11+16-22+...의 순서로 나열되는 수열의 20번째 항까지의 합계		
		
		int sum2=0;
		int count1=-1;
		
		for(int i=0; i<20; i++) {  //20번째 항
			count1+=i;
			if(i%2 == 0) {
				count1 -= i;
			}else {
				count1 += i;
			}
			sum2=count1;
		}
		System.out.println(sum2);
		System.out.println();

		
	//a문제4) 
//		1  2  3  4  5 
//	    10 9  8  7  6
//		11 12 13 14 15
//		20 19 18 17 16
//		21 22 23 45 25
		
		int[][] a=new int[5][5];
		int c1=0, c2=4, v=1, d=1;
		
		for(int r=0; r<a.length;r++) {
			for(int c=c1; c!=c2+d; c=c+d) {
				a[r][c]=v;
				v=v+1;
			}
			
			int temp = c1;
			c1 = c2;
			c2 = temp;
			d=-d;
		}
	
	
	for(int i=0; i<5; i++) {
		for(int j=0; j<5; j++) {
			 System.out.print(a[i][j] + "\t");
		}
		System.out.println();
		System.out.println();
		
	}

		
		
		
		
	}

}
