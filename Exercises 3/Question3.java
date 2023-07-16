/*
3. Create a class called "Employee" with a name, job, title, and salary attributes and methods to calculate and update salary.
*/

class Employee {
	// attributes
	String name;
	String job;
	String title;
	double salary;
	
	// Constructor
    public Employee(String name, String job, String title, double salary) {
        this.name = name;
        this.job = job;
        this.title = title;
        this.salary = salary;
		
		System.out.println("Name   : " + name);
		System.out.println("Job    : " + job);
		System.out.println("Title  : " + title);
		System.out.println("Salary : " + salary);
    }
	
	// calculate and update the salary
    public void calculateSalary(double percentageIncrease) {
        double increaseAmount = salary * percentageIncrease / 100;
        salary += increaseAmount;
		
		System.out.println("\nSalary Update : " + salary);
    }
	
	// main method
	public static void main(String[] args) {
		// Create an instance of Employee class
        Employee employee = new Employee("Vithusan", "Software Engineer", "Associate", 50000.0);
	
		// updated salary
		employee.calculateSalary(10);
	}
}