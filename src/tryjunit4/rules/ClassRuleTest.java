package tryjunit4.rules;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.JUnitCore;

public class ClassRuleTest {
	public static void main(String[] args) {
		JUnitCore.main(ClassRuleTest.class.getName());
	}

	@ClassRule
	public static ExternalResource externalResource = new ExternalResource() {
		@Override
		protected void before() {
			System.out.println("I am before() method.");
		};

		@Override
		protected void after() {
			System.out.println("I am after() method.");
		};
	};

	@Test
	public void testNantoka() {
		System.out.println("I am testNantoka() method.");
	}

	@Test
	public void testKantoka() {
		System.out.println("I am testKantoka() method.");

	}

	@Test
	public void testDousita() {
		System.out.println("I am testDousita() method.");
	}
}
