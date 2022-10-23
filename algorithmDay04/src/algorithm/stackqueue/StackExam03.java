package algorithm.stackqueue;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class StackExam03 {

	public static void main(String[] args) {
		Stack<String> st = new Stack();
		
		Scanner scan = new Scanner(System.in);
		String input = ""; //null
		String msg = "수식을 입력하세요>>";
		
		System.out.println(msg);
		input = scan.next();  // 공백 - input = scan.nextLine()
		
		
		//배열의 길이 : 배열의_참조변수명.length
		//문자열의 길이 : 문자열.length()
		//list의 길이 :list_참조변수.size()
		try {
			// 입력된 수식에서 문자하나하나를 검토 : '(' or ')' 
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i); // i번째 인덱스의 문자가져오기
				
				//문자가 : '(' or ')' 와 같은지 판단 : if
				if(ch=='(') {
					st.push(ch+""); // String으로 만들기 위해 (Stack이 String 타임)
				}else if(ch==')') {
					st.pop();
				}
			}
			
			if(st.empty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {  //)를 만나서(를 꺼내려할때 스택이 비어잇으면 
			System.out.println("괄호가 일치하지 않습니다.");
		
		
		}
	}

}
