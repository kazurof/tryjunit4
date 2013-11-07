package tryjunit4.parameterized;

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
public class NoConstuctorTest {
	public static void main(String[] args) {
		JUnitCore.main(NoConstuctorTest.class.getName());
	}

	@Rule
	public TestName name = new TestName();

	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 2, 3 } });
	}

	@Parameter
	// first data value (0) is default
	public int fInput;
	@Parameter(value = 1)
	public int fExpected;

	@Test
	public void testNantoka() {
		System.out.printf("MethodName %s %n", name.getMethodName());
	}

}
