package tryjunit4.parameterized;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	public static void main(String[] args) {
		JUnitCore.main(ParameterizedTest.class.getName());
	}

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 1 }, { -2, 2 }, { 3, 3 }, { -4, 4 } });
	}

	private int fInput;

	private int fExpected;

	public ParameterizedTest(int input, int expected) {
		System.out.printf("I am constructor.  input ->  %d ,expected ->  %d %n", input, expected);
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void testNantoka() {
		System.out.printf("I am testNantoka.  fInput ->  %d ,fExpected ->  %d %n%n", fInput, fExpected);
		assertEquals(fExpected, Math.abs(fInput));
	}

}
