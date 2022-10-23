package algorithm.stackqueue;

import java.util.Stack;

public class StackExam02 {
	 public static Stack back = new Stack();
	 public static Stack forward = new Stack();
	 
	public static void main(String[] args) {
		goURL("1.네이트");	
		goURL("2.구글");	
		goURL("3.네이버");	
		goURL("4.다음");	
		
		//현재 스택들의 상태 확인
		printStatus();
		
		goBack();
		System.out.println("=='뒤로' 버튼을 누른 후 ==");
		printStatus();

		goForward();
		System.out.println("=='앞으로' 버튼을 누른 후 ==");
		printStatus();
		
		goURL("멀티캠퍼스");
		System.out.println("== 새로운 주소로 이동 ==");
		printStatus();
		
	}
//----------여기 먼저	
	public static void printStatus() {  //출력(확인) 앞으로 뒤로 눌렀을때 어떤게 보이는지 
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("현재 화면은 '" + back.peek()+ "' 입니다.");  //가장위쪽에 있는걸 보여주
		System.out.println();
	}
	
	public static void goURL(String url) {
		back.push(url);
		if(!forward.empty()) {
			forward.clear();  // 완전히 비우기 (clear - list에 있는거임)
		}	
	}
	
	public static void goForward() { // 앞으로 이동하면 forward의 맨위에 것이 back으로 이동
		if(!forward.empty()) {
			back.push(forward.pop()); 
		}
	}
	
	public static void goBack() {
		if(!back.empty()) {
			forward.push(back.pop());  //뒤로 이동하면 back의 맨위에 것이 forward로 이동 
		}
	}
	
	
	
	
	
	
	

}
