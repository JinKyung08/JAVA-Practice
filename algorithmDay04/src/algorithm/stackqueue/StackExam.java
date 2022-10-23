package algorithm.stackqueue;

import java.util.Stack;

public class StackExam {

	public static void main(String[] args) {

		//stack
		Stack<String> st = new Stack<String>();
		
		// 스택에 자료 저장하기
		st.push("H");
		st.push("e");
		st.push("l");
		st.push("l");
		st.push("o");
		
		// 가장 위에 있는 자료가 무엇인지 확인하기
		
		System.out.println(st.peek());
		
		//스택의 크기
		System.out.println(st.size()+"개");
		
		// 해당자료가 스택의 어디에 있는지 인덱스 찾아보기
		// 스택은 인덱스 번호 : 1, 2, 3, 4,...
		System.out.println(st.search("H")); //5
		System.out.println(st.search("e")); //4
		System.out.println(st.search("l")); //2
		System.out.println(st.search("l")); //2
		System.out.println(st.search("o")); //1
		System.out.println(st.search("t")); //-1 없는거는 -1
		
		// 스택에서 자료 꺼내기 
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println();
		
		
		Stack<Character> st1 = new Stack<Character>();
		String str = "java";
		// 문자열.toCharArray() - 문자열을 문자 배열로 변경 
		
		char[] arr = str.toCharArray();  // 스택에 넣고 빼기 
		
		
		//스택에 넣기  (향상된 for문) -push
		for ( char ch : arr) {
			st1.push(ch);
		}
		
		//확인 - 스택의 size
		System.out.println(st1.size() + "개");
		
		//스택의 맨위에 있는 값이 어떤 것인지 확인, peek, 확인만 가능 꺼내기 안됨
		System.out.println(st1.peek());
		
//		//빼기 -pop
//		for( char ch : arr ) {
//			System.out.println(st1.pop());
//		}
//		
		//while문 -empty pop
		while(!st1.empty()) {
			System.out.println(st1.pop());
		}
		System.out.println();
		
		
		String str1 = "Java\n is\n fun\n";
		
		char[] arr2 = str1.toCharArray();
		Stack<Character> st2 = new Stack<Character>();
		
		//스택에 넣기
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(st2.push(arr2[i]));
		}
		
		//빼기
		while(!st2.empty()) {
			System.out.println(st2.pop());
		}
		
		
		
		
		
		
	}

}
