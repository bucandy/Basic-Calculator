import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;


public class calcBasicTest {

	@Test
	public void additionOfTwoSmallNumbersShouldCalculateCorrectly() {
		float additionResult = new calcBasic().addition(1.0f, 1.0f);
		assertThat(additionResult, is(2.0f));
	}

	@Test
	public void subtractionOfTwoSmallNumbersShouldCalculateCorrectly() {
		float additionResult = new calcBasic().subtraction(1.0f, 1.0f);
		assertThat(additionResult, is(0.0f));
	}

	@Test
	public void multiplicationOfTwoSmallNumbersShouldCalculateCorrectly() {
		float additionResult = new calcBasic().multiplication(1.0f, 1.0f);
		assertThat(additionResult, is(1.0f));
	}

	@Test
	public void divisionOfTwoSmallNumbersShouldCalculateCorrectly() {
		float additionResult = new calcBasic().multiplication(2.0f, 1.0f);
		assertThat(additionResult, is(2.0f));
	}

	@Test
	public void calculateFunctionShouldPerformCorrectOperation() {
		assertThat(new calcBasic().calculate("+", 1.0f, 1.0f), is(2.0f));
		assertThat(new calcBasic().calculate("-", 1.0f, 1.0f), is(0.0f));
		assertThat(new calcBasic().calculate("*", 1.0f, 1.0f), is(1.0f));
		assertThat(new calcBasic().calculate("/", 3.0f, 1.0f), is(3.0f));
	}
}
