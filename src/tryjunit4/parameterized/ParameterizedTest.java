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
		return Arrays.asList(new Object[][] { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 } });
	}

	private int fInput;

	private int fExpected;

	public ParameterizedTest(int input, int expected) {
		fInput = input;
		fExpected = expected;
		System.out.printf("I am constructor.  input ->  %d ,expected ->  %d %n", input, expected);
	}

	@Test
	public void testNantoka() {
		System.out.printf("I am testNantoka.  fInput ->  %d ,fExpected ->  %d %n%n", fInput, fExpected);
		int actual = fInput + 1;
		assertEquals(fExpected, actual);
	}

}
