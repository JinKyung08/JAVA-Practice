package multithreadexam;

public class MultiThreadTest {

	public static void main(String[] args) {
		//multiThread의 필요성
		// 영상
		String[] video = { "영상1", " 영상2", "영상3", "영상4", "영상5"};
		
		
//		// 자막
//		String[] subtitle = {"자막1", "자막2", "자막3", "자막4", "자막5"};
		
		// 영상 실행
		for (int i = 0; i < video.length; i++) {
			System.out.println("영상장면 : " + video[i]);
			// 영상장면이 빨리 지나가니까 잠깐 멈춤을 주면서 실행하기 위해
			
			try {
				Thread.sleep(3000); // 1000-1초, 3초간 일시 정지 
			} catch (InterruptedException e) { } 
		
		}
		
//		// 자막 실행
//		for (int i = 0; i < subtitle.length; i++) {
//			System.out.println("자막 : " + subtitle[i]);
//			
//			try {
//				Thread.sleep(3000); // 1000-1초 ,3초간 일시 정지 
//			} catch (InterruptedException e) { } 
//		
//		}
			
	
		
		
	
		
	}

}
