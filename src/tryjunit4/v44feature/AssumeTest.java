package tryjunit4.v44feature;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class AssumeTest {

	public static void main(String[] args) {
		JUnitCore.main(AssumeTest.class.getName());
	}

	@Test
	public void testAssumeOne() {
		assumeThat("apple", is("orange"));
		System.err.println("testAssumeOne is success");
	}

	@Test
	public void testAssumeTwo() {
		assumeThat("apple", is("apple"));
		System.err.println("testAssumeTwo is success");
	}
}
