package collectionFrameworkExam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ListExam01 {

	public static void main(String[] args) {

		
//	  List<Integer> list1 = new ArrayList<Integer>();
	  List<Integer> list1 = new ArrayList<>();	  
	  ArrayList<Integer> List2 = new ArrayList<Integer>();
	
	
	  list1.add(89);
	  list1.add(2);
	  list1.add(95);
	  list1.add(83);
	
	
	  System.out.println(list1);
	  System.out.println(list1.size());
	  list1.remove(2);
	  System.out.println(list1);
	  System.out.println(list1.size());
	  list1.add(100);
	  System.out.println(list1);
	  System.out.println(list1.size());
	 
	  
	  list1.add(3,5);
	  System.out.println(list1);
	  System.out.println(list1.size());
	  
	  List<String> list3 = new ArrayList<String>();
	  list3.add("홍길동");
	  list3.add("김자바");
	  list3.add("박자바");
	  list3.add("이하늘");
	  System.out.println(list3);
	  
	  for (int i = 0; i < list3.size(); i++) {
		System.out.println(list3.get(i));
	}

	  for(String s : list3) {
		  System.out.println(s);
	  }
	  
	  System.out.println();
	  
	  List<String> link1 = new LinkedList<String>();
	  link1.add("사과");
	  link1.add("포도");
	  link1.add("바나나");
	  link1.add("복숭아");
	  
	  System.out.println(link1);
	  System.out.println(link1.size());
	  
	  for (int i = 0; i < link1.size(); i++) {
		  System.out.println(link1.get(i));

	  }	  
	  for(String ls : link1) {
		  System.out.println(ls);
	
	  }
	  
	  
	  
	  
	  
	  
	}

}
