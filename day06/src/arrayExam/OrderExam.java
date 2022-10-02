package arrayExam;
//예제2 주문 번호를 입력받아 주문번호가 1~50사이의 값이면 '주문이 완료'
//		주문 번호가 1~50 이외읭 값이면 '주문 번호 오류' 작성하시오.

public class OrderExam {
	public static void orderNum(int num) {
		if(num<1|| num>50) {
			System.out.println(num + "번 주문 번호 오류");
			return;
		}
		System.out.println(num + "번 주문 번호 주문 가능");
	}

	public static void main(String[] args) {
		orderNum(2);
		orderNum(5);
		orderNum(93);

	}

}
