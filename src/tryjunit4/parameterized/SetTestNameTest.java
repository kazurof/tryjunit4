package tryjunit4.parameterized;

import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
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
		return Arrays.asList(new Object[][] { { 0, 1 }, { 2, 3 }});
	}

	private int fInput;

	private int fExpected;

	public SetTestNameTest(int input, int expected) {
		fInput = input;
		fExpected = expected;
		System.out.printf("I am constructor.  input ->  %d ,expected ->  %d %n", input, expected);
	}

	@Test
	public void testNantoka() {
		System.out.printf("MethodName %s %n", name.getMethodName());
	}

	@Test
	public void testKantoka() {
		System.out.printf("MethodName %s %n", name.getMethodName());
	}
}
