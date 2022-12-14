package collectionFrameworkExam;

import java.util.ArrayList;
import java.util.List;

public class BoardArrayListMain {

	public static void main(String[] args) {
			
//		List<Board> list = new ArrayList<Board>();
		ArrayList<Board> list =new ArrayList<Board>();
		
		//자료추가
		list.add(new Board ("제목1","내용1","홍길동"));
		list.add(new Board ("제목2","내용2","이하늘"));
		list.add(new Board ("제목3","내용3","박자바"));
		list.add(new Board ("제목4","내용4","김산"));
		list.add(new Board ("제목5","내용5","한강산"));
		
		//게시판에 담긴 객체 확인
		// 1. 자료의 개수?  list.size()
		System.out.println("게시된 글의 개수 : " + list.size());
		
		//2. 게시판의 2번째자료(객체) 가져오기 list.get() / 가져오는 자료의 타입은 Board
		Board board = list.get(2);
		System.out.println("제목 : " + board.getTitle());
		System.out.println("내용 : " + board.getContent());
		System.out.println("작성자 : " + board.getWriter());
		System.out.println(board);
		System.out.println();
		
		//3. 전체내용 확인
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b);
			System.out.println();
		}
		for(Board bb : list) {
			System.out.println(bb);
		}
		System.out.println();
		
		//4. 0번  4번 인데스 자료 제거
		list.remove(0);
//		list.remove(4);
		list.remove(3);
		for(Board bb : list) {
		System.out.println(bb);
		System.out.println();
		}
		for(Board bb : list) {
		
		System.out.println("제목 : " + bb.getTitle());
		System.out.println("내용 : " + bb.getContent());
		System.out.println("작성자 : " + bb.getWriter());
		System.out.println();
		}
	
	
	
	
	
	
	
	}

}
