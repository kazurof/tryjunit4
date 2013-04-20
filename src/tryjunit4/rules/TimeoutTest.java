package tryjunit4.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;

public class TimeoutTest {
	public static void main(String[] args) {
		JUnitCore.main(TimeoutTest.class.getName());
	}

	@Rule
	public TestRule globalTimeout = new Timeout(20);

	@Test
	public void testInfiniteLoop1() {
		for (;;) {
		}
	}

	@Test(timeout = 10)
	public void testInfiniteLoop2() {
		for (;;) {
		}
	}
	@Test(timeout = 30)
	public void testInfiniteLoop3() {
		for (;;) {
		}
	}
}
