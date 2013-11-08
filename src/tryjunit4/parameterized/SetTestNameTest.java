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
public class SetTestNameTest {
	public static void main(String[] args) {
		JUnitCore.main(SetTestNameTest.class.getName());
	}

	@Rule
	public TestName name = new TestName();

	@Parameters(name = "添字{index}:  最初のパラメータ{0} ２個めのパラメータ {1}")
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 1, 1 }, { -2, 2 }, { 3, 3 } });
	}

	@Parameter
	public int fInput;
	@Parameter(1)
	// need specify test data array index if it is not 0.
	public int fExpected;

	@Test
	public void testNantoka() {
		System.out.printf("MethodName --%s-- %n", name.getMethodName());
		assertEquals(fExpected, Math.abs(fInput));
	}

	@Test
	public void testKantoka() {
		System.out.printf("MethodName --%s-- %n", name.getMethodName());
		assertEquals(fExpected, (int) Math.sqrt(fInput * fInput));
	}
}
