// 5) How do you convert a string to a character array in Java.

class Q5 {
	public static void main(String[] args) {
		String name = "Vithusan";
		
		char[] nameArray = name.toCharArray();
		
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
	}
}