/*
1) To create an abstract class Animal with an abstract method called Sound().
 create sub class Lion and Tiger that enxtend the animal Class and implement the Sound() method to make a spefic sound for each animal.
*/


abstract class Animal {
	abstract void Sound();
}

class Lion extends Animal {
	@Override
	void Sound() {
		System.out.println("This is Lion Sound...");
	}
}

class Tiger extends Animal {
	@Override
	void Sound() {
		System.out.println("This is Tiger Sound...");
	}
}

public class Q1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		lion.Sound();
		tiger.Sound();
	}
}