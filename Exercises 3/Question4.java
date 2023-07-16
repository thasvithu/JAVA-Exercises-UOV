/*
4. Create a class called "Traffig Light" with attributes color and duration, and methods to change the colour and chack if it is red or green.
*/

class TraffigLight {
		String color;
		int duration;
		
		// give initial values
		public TraffigLight(String color, int duration) {
			this.color = color;
			this.duration = duration;
		}
		
		// change color
		public void changeColor(String newColor) {
			color = newColor;
		}
		
		// check the color red or green
		public void checkColor() {
			if (color == "Red" || color == "red")
				System.out.println("\nYes it is Red");
			else
				System.out.println("\nYes it is Green");
		}
	public static void main(String[] args) {
		TraffigLight TL = new TraffigLight("Red", 5);
		
		TL.changeColor("Red");
		
		// after changing color
		TL.checkColor();
		
	}
}