package inheritanceExam;

public class AnimalExam {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		Cat cat = new Cat ();
		Dog dog = new Dog ();
		Bird bird = new Bird();
//		Bird bird2= new Bird("두눈", "부리", "독수리", "양날개");
		
		ani.cry();
		cat.cry();
		dog.cry();
		bird.cry();
		
		bird.fly();
		cat.jumping();
		dog.running();
		
		ani.name = "동물";
//		bird2.showBird();
	}

}
