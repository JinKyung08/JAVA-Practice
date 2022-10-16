package multithreadexam;

public class SubtitleRunableExam implements Runnable{

	@Override
	public void run() {
		// 자막
		String[] subtitle = {"자막11", "자막22", "자막33", "자막44", "자막55"};
		
		try {
			Thread.sleep(10); //0.01초
	 	}catch(InterruptedException e) {}
		
		// 자막 실행
		for (int i = 0; i < subtitle.length; i++) {
			System.out.print("자막 : " + subtitle[i] + "  ");
			
			try {
				Thread.sleep(2000); // 1000-1초 ,2초간 일시 정지 
			} catch (InterruptedException e) { } 
			
		}
	}

}
