package bankExam;

public class BankExam {
		//인스턴스필드
		private String accountNum ; // 계좌번호
		private String name;  //예금주
		private int saving;  //예금액
		
		//생성자
		public BankExam() { } // 기본 생성자

		public BankExam(String accountNum, String name, int saving) {
//			super();
			this.accountNum = accountNum;
			this.name = name;
			this.saving = saving;
		}

		//getter/ setter

		public String getAccountNum() {
			return accountNum;
		}

		public void setAccountNum(String accountNum) {
			
			this.accountNum = accountNum;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSaving() {
			return saving;
		}

		public void setSaving(int saving) {
			this.saving = saving;
		}
		
		//메서드
//		public void showInfo() {
//			System.out.println("계좌번호 : " + accountNum );
//			System.out.println("예금주 : " + name);
	
	
//		    }
	
}
