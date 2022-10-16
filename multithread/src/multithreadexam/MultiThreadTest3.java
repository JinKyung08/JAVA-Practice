package multithreadexam;

public class MultiThreadTest3 {

	public static void main(String[] args) {

//		Runnable subRun = new SubtitleRunableExam();
//		SubtitleRunableExam subRun = new SubtitleRunableExam();		//start 없음	
//		
//		Thread srt = new Thread(subRun);		
//		
//		srt.start();
		
//		Thread srt1 = new Thread(new SubtitleRunableExam()); // 위와같음
//		srt1.start();
		
		Thread srt = new Thread(new Runnable() {  // 익명 구현객체
			
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
			
		});
		srt.start();
		
		new Thread(new Runnable() {  // 이렇게도 가능 

			@Override
			public void run() {
				
		
			String[] video = { "영상1", "영상2", "영상3", "영상4", "영상5"};
			
			
			// 영상 실행
			for (int i = 0; i < video.length; i++) {
				System.out.println("영상장면 : " + video[i]);
				// 영상장면이 빨리 지나가니까 잠깐 멈춤을 주면서 실행하기 위해
				
				try {
					Thread.sleep(2000); // 1000-1초, 2초간 일시 정지 
				} catch (InterruptedException e) { } 
				
			  }
			}
		
		});.start();
		
		
		
   }
}