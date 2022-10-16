package multithreadexam;

public class VideoExam extends Thread {
	@Override
	public void run() {
		// 영상
		String[] video = { "영상1", "영상2", "영상3", "영상4", "영상5"};
		
		try {
			Thread.sleep(10); //0.01초
	 	}catch(InterruptedException e) {}
		
		// 자막 실행
		for (int i = 0; i < video.length; i++) {
			System.out.println("자막 : " + video[i] + "  ");
			
			try {
				Thread.sleep(2000); // 1000-1초 ,2초간 일시 정지 
			} catch (InterruptedException e) { } 
			
		   }
		
	}
}
