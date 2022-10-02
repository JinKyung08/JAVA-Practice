package polymorphism.exam;

public class AnimalExam {

	public static void main(String[] args) {
//		Animal ani = new Animal(); //에러/ 추상메서드는 미완성이라 메모리에 올릴 수 없다.
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
//		ani.cry();
		dog.cry();
		dog.running();
		
		cat.cry();
		cat.jump();
		
		bird.cry();
		bird.fly();
		
		System.out.println();
		
		//모두 부모타입에 담기
		
		Animal aniDog = new Dog();
		Animal aniCat = new Cat();
		Animal aniBird = new Bird();
		// 자식객체는 부모타임 변수에 담을 수 있다. 즉 자식타입은 부모타입으로 형변환 가능 
		// 부모가 가진 부분만 사용가능
		
		aniDog.cry();
//		aniDog.running(); //자식에만 있어서 안됨
		
		aniCat.cry();
//		aniCat.jump(); // 자식에만 있는 메서드 
		
		aniBird.cry();
//		aniBird.fly(); // 자식에만 있는 메서드 
		
		System.out.println();
		
//		Dog ba = (Dog)aniDog; // 형변환  //내가 해본거 복습
//		ba.cry();
//		System.out.println();
		
		//배열로 처리
		Animal[] aniArray = new Animal[] {new Dog(),new Cat(), new Bird()};
		
		//향산된 for문 (for each 문)
		for(Animal animal : aniArray) {
			animal.cry();
		}
		System.out.println();
		// 부모 타입 => 다시 자식 타입으로
		// 형변환이 가능한지 확인 : instanceof 
//		aniArray[0] instanceof Dog
//		aniArray[1] instanceof Cat
//		aniArray[2] instanceof Bird
		
		for(int i=0; i<aniArray.length; i++) {
			
			if(aniArray[i] instanceof Dog) {
				
				Dog childDog = (Dog)aniArray[i]; // 강제형변환, downcasting
				
			}else if (aniArray[i] instanceof Cat) {
				
				Cat childCat = (Cat)aniArray[i];
				
			}else if (aniArray[i] instanceof Bird) {
				
				Bird childBird = (Bird)aniArray[i];
				
			}else {
				System.out.println("형변환 불가능한 타입입니다.");
			}
			
			
			
			
		}
				
		
	}

}
