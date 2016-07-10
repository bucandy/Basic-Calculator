import java.util.Scanner;

public class calcBasic {
	public static void main (String[] args){	

		// Define variables
		float ans = 0, firstNumber = 0, secondNumber = 0;
		boolean operatorCheck = false;
		String userOperator = null;
		
		// Introduction
		System.out.println("This is a Basic Calculator Program.");
		System.out.println("With this program you can add, subtract, multipy or divide two numbers.");
		System.out.println();
		
		// Input first number
		Scanner userInput1 = new Scanner (System.in);
		System.out.println("Please enter 1st Number");
		while (!userInput1.hasNextFloat()){
			System.out.println("Error: Please enter number.");
			userInput1.next();
		}
		firstNumber = userInput1.nextFloat();
		System.out.println();
		
		// Input operator
		System.out.println("Please type an operator:");
		System.out.println("'+' for addition");
		System.out.println("'-' for subtraction");
		System.out.println("'*' for multiplication");
		System.out.println("'/' for divison");
		Scanner userInput2 = new Scanner (System.in);	
		while (operatorCheck==false){
			userOperator = userInput2.nextLine();
			switch (userOperator){
				case "+": 
					System.out.println("You Chose " + userOperator);
					operatorCheck = true;
					break;
				case "-": operatorCheck = true;
				System.out.println("You Chose " + userOperator);
					break;
				case "/": operatorCheck = true;
				System.out.println("You Chose " + userOperator);
					break;
				case "*": operatorCheck = true;
				System.out.println("You Chose " + userOperator);
					break;
				default: System.out.println("ERROR: Please enter valid operator.");
					break;
			}
		}
		System.out.println();
		
		// Input second number
		System.out.println("Please enter 2nd Number");
		Scanner userInput3 = new Scanner (System.in);	
		while (!userInput3.hasNextFloat()){
			System.out.println("Error: Please enter number.");
			userInput3.next();
		}
		secondNumber = userInput3.nextFloat();
		System.out.println();
		
		// Perform and output calculation
		switch(userOperator) {
			case "+": ans = firstNumber+secondNumber;
				break;
			case "-": ans = firstNumber-secondNumber;
				break;
			case "*": ans = firstNumber*secondNumber;
				break;
			case "/": ans = firstNumber/secondNumber;
				break;
		}
		System.out.println(firstNumber + " " + userOperator + " " + secondNumber + " = " + ans);
		userInput1.close();
		userInput2.close();
		userInput3.close();
	
	}
}