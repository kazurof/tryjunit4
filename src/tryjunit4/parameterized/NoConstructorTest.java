package tryjunit4.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class NoConstructorTest {
	public static void main(String[] args) {
		JUnitCore.main(NoConstructorTest.class.getName());
	}

	@Rule
	public TestName name = new TestName();

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 1 }, { -2, 2 } });
	}

	@Parameter
	public int fInput;
	@Parameter(1) // need specify test data array index if it is not 0.
	public int fExpected;

	@Test
	public void testNantoka() {
		System.out.printf("MethodName --%s-- %n", name.getMethodName());
		assertEquals(fExpected, Math.abs(fInput));
	}
}

