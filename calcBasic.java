import java.util.Scanner;



public class calcBasic {

	public static void main (String[] args){
	System.out.println("Hello, this is a Basic Calculator Program.");
	System.out.println("Please enter 1st Number");
	Scanner userInput1 = new Scanner (System.in);
	int firstNumber = userInput1.nextInt();
	System.out.println("Please type an operator:");
	System.out.println("'+' for addition");
	System.out.println("'-' for subtraction");
	System.out.println("'*' for multiplication");
	System.out.println("'/' for divison");
	Scanner userInput2 = new Scanner (System.in);	
	String userOP = userInput2.nextLine();
	System.out.println("Please enter 2nd Number");
	Scanner userInput3 = new Scanner (System.in);	
	int secondNumber = userInput3.nextInt();
	
	switch(userOP) {
	case "+": System.out.println(firstNumber + secondNumber);
	break;
	case "-": System.out.println(firstNumber - secondNumber);
	break;
	case "*": System.out.println(firstNumber * secondNumber);
	break;
	case "/": System.out.println(firstNumber / secondNumber);
	break;
	}
}
}