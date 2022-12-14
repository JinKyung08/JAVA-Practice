package interfaceExam;

public class AnimalMain {

	public static void main(String[] args) {
			
			Cat cat = new Cat();
			Dog dog = new Dog();
			Bird bird = new Bird();
//			Bird2 bird2 = new Bird2();  // 버드가 버드2를 상속 받았기 때문에 가능  // Animal2 extends Animal로 바꿔서 에러 됨 
			
//			cat.cry();
//			dog.cry();
//			bird.cry();
//			System.out.println();
//			
			Animal[] ani = {new Cat(), new Dog(), new Bird(),new Bird2()};
//			
//			for(Animal a : ani) {
//				System.out.println(a);   //a.toString()
//				a.cry();
//				System.out.println();
//			}
	
	
			makeCry(cat);   //메서드 호출
			makeCry(dog);
			makeCry(bird);
//			makeCry(bird2);  //  Animal2 extends Animal로 바꿔서 에러 됨 
			System.out.println();
	
	
			makeCryArray(ani);
	
	//===================================
			//익명클래스 : 한 번만 사용하는 클래스라면 굳이 이름을 붙일 필요가 없음
			//이렇게 이름이 없는 클래스를 익명클래스(anonymous class)라고함
			//중첩클래스(내부클래스)의 특수한 형태로 코드가 단순해지기 때문에
			//이벤트 처리나 스레드등에서 자주 활용
	
//		Animal2 ani2 = new Animal2(); // 인터페이스라 미완성(추상)메서드를 포함하고있어서 객체 생성 X
									  // 생성하기 위해 자식클래스에 구현 or 익명이너클래스에서 추상메서드를 완성 하고 객체 생성 (익명)
		
			//익명 구현 객체
		Animal2 ani2 = new Animal2() {
			
			@Override
			public void eat() {
				System.out.println("동물들은 음식을 먹는다.");
			}

			@Override
			public void cry() {
				System.out.println("동물들이 운다.");
			}
		};
	
	//실행
		ani2.eat();
	
	
	
	
	
	}  //end of main

//	public static void makeCry(Object obj) {     //문제 안생김 하지만 아무거나 다 들어올 수있음
		public static void makeCry(Animal animal) {
			animal.cry();
		}
	
		public static void makeCryArray(Animal[] aniArray) {  //배열로
			for(Animal ani : aniArray) {
				ani.cry();
				System.out.println();
			}
		}
		
		
		
}
