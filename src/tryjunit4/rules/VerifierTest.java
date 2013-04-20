package tryjunit4.rules;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;
import org.junit.runner.JUnitCore;

public class VerifierTest {
	public static void main(String[] args) {
		JUnitCore.main(VerifierTest.class.getName());
	}

	private boolean success;

	@Rule
	public Verifier verifier = new Verifier() {
		@Override
		public void verify() {
			assertTrue(success);
		}
	};

	@Test
	public void testSuccessCase() {
		success = true;
		System.out.println("I am testSuccessCase() method.");
	}

	@Test
	public void testFailureCase() {
		success = false;
		System.out.println("I am testFailureCase() method.");
	}
}
