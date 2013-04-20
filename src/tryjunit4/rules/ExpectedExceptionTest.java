package tryjunit4.rules;

import static org.hamcrest.CoreMatchers.startsWith;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.JUnitCore;

public class ExpectedExceptionTest {
	public static void main(String[] args) {
		JUnitCore.main(ExpectedExceptionTest.class.getName());
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test(expected = NullPointerException.class)
	public void ordinalExpectedException() {
		throw new NullPointerException();
	}

	@Test
	public void throwsNullPointerException() {
		thrown.expect(NullPointerException.class);
		throw new NullPointerException();
	}

	@Test
	public void throwsNullPointerExceptionWithMessage() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("happened?");
		thrown.expectMessage(startsWith("What"));
		throw new NullPointerException("What happened?");
	}

	@Test
	public void throwsNothing() {
		// no exception expected, none thrown: passes.
	}
}
