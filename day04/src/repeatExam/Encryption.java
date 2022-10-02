package repeatExam;

public class Encryption {

	public static void main(String[] args) {
		String password = "ghdrlfehd";
		String encryPass = ""; //암호코드
		String decryPass = ""; // 복호화코드 (암호를 풀어놓은 코드)
		final int KEY = 2;
		
		// 암호화 :(char)(문자열,charAt(i) * KEY)
		// 문자열의 길이 : 문자열.length() => 글자의 개수 
		
			for (int i=0; i<password.length(); i++) {    // 조건식에 이꼴이 안들거간 이유 > 0부터시작해서
				encryPass += (char)(password.charAt(i) * KEY);
//				encryPass = encryPass+ (char)(password.charAt(i) * KEY);
			}
			System.out.println(encryPass);
			
			
		//복호화 : (char)(암호화된 문자열.charAt(i) / KEY)
			for(int i=0; i<encryPass.length(); i++) {
				decryPass += (char)(encryPass.charAt(i)/KEY);
			}
			System.out.println(decryPass);
			
	}
			
}
