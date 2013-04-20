package tryjunit4.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;
import org.junit.runner.JUnitCore;

public class ExternalResourceTest {
	public static void main(String[] args) {
		JUnitCore.main(ExternalResourceTest.class.getName());
	}

	@Rule
	public ExternalResource resource = new ExternalResource() {
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
}
