package Session5;

import java.util.Scanner;

import Practiceclass5.Add;
import Practiceclass5.Div;
import Practiceclass5.Multi;
import Practiceclass5.Sub;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("welcome to my calculator");
		System.out.print(" Give me a number");

		Scanner ui = new Scanner (System.in);
		Scanner ui2 = new Scanner (System.in);
		
		double num1 = ui.nextDouble();
		System.out.println(" Give me another number:");
		double num2 = ui.nextDouble();

		System.out.println("select a operation: Add, Sub,Multi,Div");
		String Operation = ui2.nextLine();
		if (Operation.equalsIgnoreCase("add")){
		System.out.println("The result is: "+ Add.Add(num1, num2));
		}
		else if (Operation.equalsIgnoreCase ("sub")){
		System.out.println("the result is: " + Sub.Sub(num1, num2));
		}
		else if (Operation.equalsIgnoreCase("Multi")) {
			Multi mul = new Multi();
		System.out.println("The result is: " + mul.Multi(num1, num2));
		}
		else if (Operation.equalsIgnoreCase("div")) {
		Div div = new Div();
		System.out.println("The result is: " + div.Div(num1, num2));
		}
		else 
		System.out.println("your input should be one of these: add, Sub,Multi,Div");
		}
		
	
		
	
		private static void If(boolean equalsIgnoreCase) {
			
			
			
			
			
			
		
		}
		
		}
