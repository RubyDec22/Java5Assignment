package Session5;

public class Palindrome {

	public static void main(String[] args) {
		
		String a = "hi";
		char[] myArray = a.toCharArray();
		String result = "";
		for (int i = myArray.length-1; i>=0; i--) {
			result = result + myArray[i];
			}
		if (a.equals(result)) {
			System.out.println("Palindrome");
			
		} else {
			System.out.println("Not Palindrome");
		}
	}
	

}
