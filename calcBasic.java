import java.util.Scanner;

public class calcBasic {
	static int ans, firstNumber, secondNumber;
	public static void main (String[] args){	
		System.out.println("This is a Basic Calculator Program. With this program you can add, subtract, multipy or divide two numbers.");
		System.out.println();
		System.out.println("Please enter 1st Number");
		Scanner userInput1 = new Scanner (System.in);
		firstNumber = userInput1.nextInt();
		System.out.println();
		System.out.println("Please type an operator:");
		System.out.println("'+' for addition");
		System.out.println("'-' for subtraction");
		System.out.println("'*' for multiplication");
		System.out.println("'/' for divison");
		Scanner userInput2 = new Scanner (System.in);	
		String userOP = userInput2.nextLine();
		System.out.println();
		System.out.println("Please enter 2nd Number");
		Scanner userInput3 = new Scanner (System.in);	
		secondNumber = userInput3.nextInt();
		switch(userOP) {
			case "+": ans = firstNumber+secondNumber;
				break;
			case "-": ans = firstNumber-secondNumber;
				break;
			case "*": ans = firstNumber*secondNumber;
				break;
			case "/": ans = firstNumber/secondNumber;
				break;
		}
		System.out.println();
		System.out.println("The answer is "+ans);
	}
}