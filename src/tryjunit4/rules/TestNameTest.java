package tryjunit4.rules;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.JUnitCore;

public class TestNameTest {
	public static void main(String[] args) {
		JUnitCore.main(TestNameTest.class.getName());
	}

	@Rule
	public TestName name = new TestName();

	@Test
	public void testA() {
		assertEquals("testA", name.getMethodName());
		someMethod();
	}

	@Test
	public void testB() {
		assertEquals("testB", name.getMethodName());
		someMethod();
	}

	private void someMethod() {
		System.out.println(name.getMethodName());
	}
}
