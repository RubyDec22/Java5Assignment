package Session5;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		
		System.out.println("Give me a int");
		Scanner ui = new Scanner(System.in);
		
		int x = ui.nextInt();
		if(x% 2== 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
	}
	

}
