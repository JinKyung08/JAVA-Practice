package bankExam;

import java.util.Scanner;

public class BankExamMain {
//예금자(객체, 인스턴스)들의 목록을 관리할 수 있는 공간 => 배열
	//필드-static(모든 객체에서 공통으로 사용,클래스가 로드 될때 메모리에 로드
	//객체 생성
	private static BankExam [] bankArray = new BankExam[100];
	private static Scanner scan = new Scanner(System.in);
	
	//메서드
	public static void main(String[] args) {
		//예금의 종류선택, 선택한 작업에 따른 메서드 호출
		boolean run =true;
		int num = 0; //입력할번호
		
		 //입력받기
		while(run) {
			
			System.out.println("---------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("---------------------------------------------------");
			System.out.println("선택하세요>>");
			
			num = scan.nextInt();
			
			if(num == 1) {			//계좌생성
				createAcc();
			} else if (num == 2) {  //계좌목록
				accList();
			} else if (num == 3) { // 예금하기
				deposit();
			} else if (num == 4) {  //출금하기
				withdraw();
			} else if (num == 5) {   //종료
				System.out.println("종료되었습니다.");
				run = false; //break; -> 밖으로 빠져나감/ false를 만나면 if만 빠져나가서 "안녕히가세요" 실행
			}else {
				System.out.println("잘못 선택, 다시 입력하세요");
			}
		}//end of while
					System.out.println("은행을 방문해주셔서 감사합니다.\n 안녕히가세요");
    }//end of main
		
		//1. 계좌생성
		private static void createAcc() {
			String accountNum = null, name =null;
			int saving=0;
			
			System.out.println("----------");
			System.out.println(" 계좌생성 ");
			System.out.println("----------");
			
			//정보입력
			System.out.println("계좌번호 : ");
			accountNum = scan.next();
			System.out.println("예금주 :");
			name = scan.next();
			System.out.println("초기입금액 :");
			saving = scan.nextInt();
			
			//계좌가 생선될 수 있도록 / 입력 받은 값을을 이용해 객체를 생성 /BankExam 배열공간에 새로 생성된 객체의 힙영역 주
			BankExam newAcc = new BankExam(accountNum, name, saving);
			for(int i=0; i<bankArray.length; i++) {
				if(bankArray[i] == null) {
					bankArray[i] = newAcc;
					System.out.println("계좌가 생성되었습니다.");
					break;
				} //end of if
			} //end of for
		
		}//end of createAcc
		
		// 2. 계좌목록
		private static void accList() {
			
			System.out.println("----------");
			System.out.println("계좌목록");
			System.out.println("----------");
//			System.out.print("계좌번호\t예금주\t예금액\n ");
			
			//목록 가져오기
			for(int i=0; i<bankArray.length; i++) {
					BankExam acc = bankArray[i]; //계좌이기에 BankExam 형
					if(acc != null) {
						System.out.printf(acc.getAccountNum()+"\t"+acc.getName()+"\t"+acc.getSaving()+"\n");
					}
			  }
			
		}
		//findAcc 계좌목록찾기 
		private static BankExam findAcc (String accountNum) {
			BankExam acc =null;
			
				for(int i=0; i <bankArray.length; i++) {
					//비어 있지 않은 객체만 검색
					if(bankArray[i]!=null) {
						String dbAcc = bankArray[i].getAccountNum();
						if (dbAcc.equals(acc)) {
							acc =bankArray[i];
							break;
						}
					}
			}
				
				return acc;
		}
		
		
		
		//3. 예금
		private static void deposit() {
			String accountNum =null;
			int saving =0;
			int money =0;
			
			System.out.println("----------");
			System.out.println("예금");
			System.out.println("----------");
			System.out.println("계좌번호");
			accountNum = scan.next();
			System.out.println("예금액");
			money = scan.nextInt();
			
			
			//입력한 계좌가 있는지 찾기
			BankExam acc = findAcc(accountNum);
			
			//계좌가 없을 경우
			if(acc == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			//예금액 -> 기존예금액 + 현재 입금한 예금
//			int money = acc.getSaving()+balance;
//			acc.setSaving(money);
			acc.setSaving(acc.getSaving()+money);
			System.out.println("예금이 성공되었습니다.");
		}
		
		//4. 출금
		private static void withdraw() {
			
			String accountNum =null;
			int saving =0;
			int money =0;
			
			System.out.println("----------");
			System.out.println("출금");
			System.out.println("----------");
			System.out.println("계좌번호");
			accountNum = scan.next();
			System.out.println("출금액 ");
			money = scan.nextInt();
			
			BankExam acc = findAcc(accountNum);
			if(acc == null) {
				System.out.println("계좌가 없습니다.");
				return;
			}
			acc.setSaving(acc.getSaving()-money);
			System.out.println("출금이 성공되었습니다.");
		}
		
		
		
	
} // end of class
