package tryjunit4.rules;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.internal.AssumptionViolatedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;

public class TestWatcherTest {
	public static void main(String[] args) {
		JUnitCore.main(TestWatcherTest.class.getName());
	}

	@Rule
	public TestWatcher watchman = new TestWatcher() {
		@Override
		protected void starting(Description d) {
			System.out.println("I am starting() method. name -> " + d.getMethodName());
		}

		@Override
		protected void skipped(AssumptionViolatedException e, Description d) {
			System.out.println("I am skipped() method. name -> " + d.getMethodName());
			System.out.println(e.toString());
		}

		@Override
		protected void succeeded(Description d) {
			System.out.println("I am succeeded() method. name -> " + d.getMethodName());
		}

		@Override
		protected void failed(Throwable th, Description d) {
			System.out.println("I am failed() method. name -> " + d.getMethodName());
			System.out.println(th.toString());

		}

		@Override
		protected void finished(Description d) {
			System.out.println("I am finished() method. name -> " + d.getMethodName());
		}

	};

	@Test
	public void testAndFail() {
		fail("this test is fail.");
	}

	@Test
	public void testAndSucceed() {
	}

	@Test
	public void testPreconditionViolation() {
		assumeTrue(false);
	}
}
