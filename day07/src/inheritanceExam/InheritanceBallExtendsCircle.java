package inheritanceExam;

public class InheritanceBallExtendsCircle {

	public static void main(String[] args) {
		//객체 생성
		 Circle c = new Circle();

	      Ball b = new Ball("노랑색");  //객체를 만들어라 객체 생성자

	      // 부모 원을 멤버를 처리
	      System.out.println("여긴 원의 내용 입니다.");
	      c.findRadius();
	      c.findArea();

	      System.out.println();
	      System.out.println("===================");
	      System.out.println();
	      
	      System.out.println("자식인 Ball의 내용입니다.");
	      b.findArea(); // 자식꺼, 오버라이딩 되었으니
	      b.findColor();
	      b.volume();
	      b.findRadius(); // 부모것

	}

}
