package algorithm.stackqueue;

import java.util.*;

public class QueueExam {

	public static void main(String[] args) {
		//Queue
		//예외 처리기능 미포함 메서드
		Queue<Integer> q = new LinkedList<Integer>();
//		System.out.println(q.element()); // NosuchElementException
		
		// 추가(add())
		q.add(3);
		q.add(4);
		q.add(5);
		
		//확인
		System.out.println(q.element()); //3
		System.out.println();
		
		//제거
		System.out.println(q.remove()); //3
		System.out.println(q.remove()); //4
		System.out.println(q.remove()); //5
//		System.out.println(q.remove()); //NoSuchElementException
		
		//예외 처리 기능 포함 메서드
		//화인
		System.out.println(q.peek()); //null
		
		//추가
		q.offer(3);
		q.offer(4);
		q.offer(5);
		
		//확인
		System.out.println(q.peek()); //3  //맨 처음 들어간게 나옴
		
		//제거
		System.out.println(q.poll()); //3
		System.out.println(q.poll()); //4
		System.out.println(q.poll()); //5
		System.out.println(q.poll()); //null
		
		
		
		
		
		
		
		
		
	}

}
