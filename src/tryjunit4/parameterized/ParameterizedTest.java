package tryjunit4.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	public static void main(String[] args) {
		JUnitCore.main(ParameterizedTest.class.getName());
	}
	@Rule
	public TestName name = new TestName();

	@Parameters(name = "{index}:abs{0} 日本語どうですか {1}")
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 0 }, { 1, 1 }, { -2, 2 },
				{ 3, 3 }, { 4, 4 }, { -5, 5 }, { 6, 6 } });
	}

	private int fInput;

	private int fExpected;

	public ParameterizedTest(int input, int expected) {
		fInput = input;
		fExpected = expected;
	}

	@Test
	public void testNormal() {
		System.out.println("this is normal test.にほんご");
	}

	@Test
	public void test() {
		assertEquals(fExpected, abs(fInput));
		System.out.println("name.getMethodName() "+name.getMethodName());
		System.out.println("name.getMethodName() "+name.getMethodName());
	}

	static int abs(int target) {
		System.out.println("ParameterizedTest#abs() called by " + target);
		return Math.abs(target);
	}

}
