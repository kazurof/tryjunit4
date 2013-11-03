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
public class NoConstuctor {
	public static void main(String[] args) {
		JUnitCore.main(NoConstuctor.class.getName());
	}

	@Rule
	public TestName name = new TestName();

	@Parameters(name = "添字{index}:  最初のパラメータ{0} ２個めのパラメータ {1}")
	// @Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][] { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 6, 7 } });
	}

	@Parameter
	// first data value (0) is default
	public int fInput;
	@Parameter(value = 1)
	public int fExpected;

	@Test
	public void testNantoka() {
		System.out.printf("testMethodname ->%s<- %n", name.getMethodName());
	}

	@Test
	public void testKantoka() {
		assertEquals(fExpected , fInput + 1);
		System.out.printf("testMethodname  ->%s<-  input ->  %d ,expected ->  %d %n", name.getMethodName(), fInput, fExpected);
	}

}