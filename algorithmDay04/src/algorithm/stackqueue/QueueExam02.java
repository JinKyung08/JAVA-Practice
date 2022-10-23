package algorithm.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExam02 {
	static Queue<String> q = new LinkedList<String>();
	static final int MAX_SIZE = 5; // queue에 최대 5개까지만 저장되도록
	
	public static void main(String[] args) {
		//안내 문구
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		//반복작업
		while(true) {
			String input = "";
			System.out.print(">>");
		  
		  try {
			Scanner s = new Scanner(System.in);
			input = s.nextLine().trim(); // 문자열을 입력 받아 앞/뒤 공백을 제거 
			
			if("".equals(input)) {
				continue;		// 입력이 없으면 while(true)로 올라가라(다시 시작)
			}
			
			// 입력받은 문자열에 맞게 처리 - help,q,history
			if(input.equalsIgnoreCase("q")) {  //equalsIgnoreCase - 대소문자 구분X, input의 내용이 q와 같으면
				System.exit(0); // 시스템종료(프로그램 종료)
				
			}else if(input.equalsIgnoreCase("help")) {
				System.out.println("help - 도움말을 보여줍니다.");
				System.out.println("q - 프로그램을 종료합니다.");
				System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
				
			}else if(input.equalsIgnoreCase("history")) {
				int i = 0;
				//입력받은 명령어를 저장
				save(input); // save() 메서드를 호출하면서 입력값(input)을 넘겨주기(매개값으로)
				
				LinkedList<String> tmp = (LinkedList<String>)q; //q가 부모타입이니까 자식타입으로 형변환
				
				//향상된 for문 내용
				for(String a : tmp) {
					System.out.println(++i + "." + a);
				}
				
				
			}else {
//				System.out.println(input); // 확인 , 나중에 제거 
				save(input); // q,help,history 글자가 아닌 글자가 들어오면 queue에 담기 
			}// end of if()
			
			
		} catch (Exception e) {
			System.out.println("입력오류입니다.");
		}
		
	} // end of while()
} // end of main()
	
	//queue에 저장 또는 제거하는 메서드
	public static void save(String input) {
		//queue에 저장
		
		if(!"".equals(input)) {
			q.offer(input); // offer() - 담기
			System.out.println("입력한 내용 : " + input + "이 queue에 저장되었음"); //나중에 제거
		}
		
		//queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제(FIFO)
		if(q.size() > MAX_SIZE) {
			System.out.println("현재 가장 앞의 내용 : " + q.peek()); // 확인 
			q.poll();
		}
	
	} // end of save()
	
	
	
	
	
	
	
	
	
	
	
	
	
	

} //end of QueueExam02()
