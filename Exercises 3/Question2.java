/*
2. Create a class called "Dog" with a name and breed attributes. 
   create two instances of the "Dog" class. 
   Set their attributes Using the constructor and modify the attributes using the setter methods and print the updated values.
*/

class Dog {
	// create attributes
	String name;
	String breed;
	
	// create two constructors
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
		
		System.out.println("Dog Name  : " + name);
		System.out.println("Dog Breed : " + breed);
	}
	
	// modify values using setter method
	public void setName(String name, String breed) {
		this.name = name;
		this.breed = breed;
		
		System.out.println("\n---After values modifies---\n");
		System.out.println("New Dog Name  : " + name);
		System.out.println("New Dog Breed : " + breed);
	}
	
	// main method
	public static void main(String[] args) {
		// create two instances to Dog class
		Dog instanceOne = new Dog("Veera", "SL Dog");
		
		// call the setter method
		instanceOne.setName("New Veera", "New SL Dog");
	}
}