package arrayExam;

public class Member {
	//public Member(){} // 기본생성자
	boolean login(String id, String password) {
		if (id.equals("hong")&& password.equals("12345")) {
			return true;
	} else {
		return false;
	  }
   }

	//인스턴스 메서드
	void logout(String id) {
		System.out.println(id+ "님 로그아웃 되었습니다.");
	}
	

}
