/*
5. Create a class called "Circle" with a radius attribute. you can access and modify this attribute calculate the area and curcumference of the circle.
*/

class Circle {
    double radius;
    
    public Circle(double radius) {
        this.radius = radius;
        printArea();
        printCircumference();
    }
    
    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }
    
    public void printCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle is: " + circumference);
    }
    
    public static void main(String[] args) {
        Circle myCircle = new Circle(7);
    }
}
