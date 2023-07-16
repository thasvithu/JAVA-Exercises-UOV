/*
1. Create a class called "Person" with a name and age attribute. 
create two instances of the "person" set their attributes using the constructor, and print their name and age.
*/

class Person {
	// attributes
	String name;
	int age;
	
	// create first constructors
	public Person(String name) {
		this.name = name;
		System.out.println("Person name is : " + name);
	}
	
	// create second constructors
	public Person(int age) {
		this.age = age;
		System.out.println("Person age is : " + age);
	}
	
	public static void main(String[] args) {
		//crate two instances of person class
		Person instanceOne = new Person("Vithusan");
		Person instanceTwo = new Person(22);
	}
}