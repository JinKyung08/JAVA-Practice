package javaProject1;

public class ProductTest {

	public static void main(String[] args) {
		//객체 생성
		ProductEx product = new ProductEx(001, "노트북", 1200000, 2021, "삼성");
		ProductEx product1 = new ProductEx(002, "모니터", 300000, 2021, "LG");
		ProductEx product2 = new ProductEx(003, "마우스", 3000, 2020, "로지텍");
		
		
		System.out.printf("%s %s %2s %5s %4s","상품번호", "상품명", "가격", "연도" ,"제조사\n");
		System.out.println("---------------------------------------");
		System.out.println(product);
		System.out.println(product1);
		System.out.println(product2);
		
		
	}
}
