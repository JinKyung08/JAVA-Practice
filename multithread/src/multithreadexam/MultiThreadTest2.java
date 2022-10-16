package multithreadexam;

public class MultiThreadTest2 {

	public static void main(String[] args) {
		// Thread 객체 생성
		Thread sub = new SubtitleExam();  // 다형성
//		SubtitleExam sub1 = new SubtitleExam();  이것도 가능

		// 영상 쓰레드 객체 생성
		Thread vi = new VideoExam();
		
		//Thread 실행
		sub.start();
		
		
		// 쓰레드 실행
		vi.start();
		
		
		
//		Runnable subRun = new SubtitleRunableExam();
		SubtitleRunableExam subRun = new SubtitleRunableExam();		//start 없음
		
		Thread srt = new Thread(subRun);
		
		srt.start();
		
//		Thread srt1 = new Thread(new SubtitleRunableExam()); // 위와같음
//		srt1.start();
		
		
		
		
		//Main thread
		// 영상
//		String[] video = { "영상1", "영상2", "영상3", "영상4", "영상5"};
//		
//		
//		// 영상 실행
//		for (int i = 0; i < video.length; i++) {
//			System.out.println("영상장면 : " + video[i]);
//			// 영상장면이 빨리 지나가니까 잠깐 멈춤을 주면서 실행하기 위해
//			
//			try {
//				Thread.sleep(2000); // 1000-1초, 2초간 일시 정지 
//			} catch (InterruptedException e) { } 
//		
//		}
	
		
	}

}
