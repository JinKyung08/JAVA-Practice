package inheritanceExam;

public class Ball extends Circle {
	//필드
	private String color;
	double vol;
	
	//생성자
	public Ball(String color) {
//		super();
		this.color = color;
	}
	
	//메소드
	public void findColor() {
		System.out.println(color +"공이다.");
	}
	public void volume() {
		vol = 4/3 * (PI*r*r*r);
		System.out.println("구의 부피는" + vol );
	}
	
	@Override
	public void findArea() {
		super.findArea();
		double width = 4 * PI * r * r;
	      System.out.println("구의 넓이는 " + width );	   
	}
	
	
}
	
	
	
	


