//3) How do you convert a string to a byte array in Java

class Q3 {
	public static void main(String[] args) {
		String name = "Vithusan";
		
		byte[] nameArray = name.getBytes();
		
		for (int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i]);
		}
	}
}