public class calcBasic {

	public float calculate(String userOperator, float num1, float num2) {
		float answer = 0.0f;

		switch(userOperator) {
			case "+": 
				answer = num1 + num2;
				break;
			case "-": 
				answer = num1 - num2;
				break;
			case "*": 
				answer = num1 * num2;
				break;
			case "/": 
				answer = num1 / num2;
				break;
		}
		return answer;
	}

	public float addition(float num1, float num2) {
		return num1 + num2;
	}

	public float subtraction(float num1, float num2) {
		return num1 - num2;
	}

	public float multiplication(float num1, float num2) {
		return num1 * num2;
	}

	public float division(float num1, float num2) {
		return num1 / num2;
	}

}

