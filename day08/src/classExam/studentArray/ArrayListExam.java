package classExam.studentArray;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
//		int[] a =new int[3]; // <- 공간을 확보함
//		a[0] =3;
		
		ArrayList<String> aList = new ArrayList(); // 공간 확보 안함
		aList.add("홍길동");   //add() - 추가 
		aList.add("박자바");
		aList.add("이자바");
		aList.add("허자바");
		
		//확인
		for(String s : aList) {
			System.out.println(s);
		}
		
		aList.add("최자바");
		//aList.size() => 개수
		System.out.println(aList);
		System.out.println(aList.size());
		System.out.println();
		
		aList.remove(1); //=> 제거
		System.out.println(aList);
		System.out.println(aList.size());
		System.out.println();
		
		aList.add(1,"최하늘");
		System.out.println(aList);
		System.out.println(aList.size());
	
		
		
		
		
		
		
		
		
		
	
	}
}
