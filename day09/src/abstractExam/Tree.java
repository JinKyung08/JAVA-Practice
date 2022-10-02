package abstractExam;

public class Tree extends CountableParents{
		
		//생성자
		public Tree (String name, int num) {
			super(name,num);
		}
		
		//메소드
		public void beColored() {
			System.out.println(num+"그루"+name+"가 물들었습니다.");
		}

		@Override
		//추상메서드 오버라이딩
		public void showCount() {
			System.out.println(name+"가"+num+"그루가 있습니다.");
		}
		
		
		
}
