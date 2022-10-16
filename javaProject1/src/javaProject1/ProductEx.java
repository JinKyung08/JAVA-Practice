package javaProject1;

public class ProductEx {
	//멤버변수
	public int prdNo;
	public String prdName; 
	public int prdPrice;
	public int prdYear;
	public String prdMaker;
	
	//기본생성자
	public ProductEx() { }

	//매개변수가 있는 생성자
	public ProductEx(int prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}

	//데이터 출력  

	@Override
	public String toString() {
		return String.format("%03d %8s %-7d %-5d %-1s", prdNo, prdName, prdPrice, prdYear, prdMaker) ;
	}
	

	
	
	
	
	
	
	
	
} // end of class
