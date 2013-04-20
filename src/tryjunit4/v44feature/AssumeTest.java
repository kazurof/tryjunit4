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
		assumeThat("みかんりんごすいか".substring(3, 6), is("いちご"));
		System.err.println("testAssumeOne() の、assumeThatは成功しました。");
	}

	@Test
	public void testAssumeTwo() {
		assumeThat("みかんりんごすいか".substring(3, 6), is("りんご"));
		System.err.println("testAssumeTwo() assumeThat成功");
	}
}
