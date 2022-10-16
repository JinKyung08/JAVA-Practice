package multithreadexam;

public class SubtitleExam extends Thread{
	@Override
	public void run() {
		
	// 자막
	String[] subtitle = {"자막1", "자막2", "자막3", "자막4", "자막5"};
	
	try {
		Thread.sleep(10); //0.01초
 	}catch(InterruptedException e) {}
	
	// 자막 실행
	for (int i = 0; i < subtitle.length; i++) {
		System.out.println("자막 : " + subtitle[i] + "  ");
		
		try {
			Thread.sleep(2000); // 1000-1초 ,2초간 일시 정지 
		} catch (InterruptedException e) { } 
		
	   }
	}
}
