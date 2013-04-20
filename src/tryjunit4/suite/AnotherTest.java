package tryjunit4.suite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class AnotherTest {

	public static void main(String[] args) {
		JUnitCore.main(AnotherTest.class.getName());
	}

	@Test
	public void testOne() {
		String str = "りんご";
		assertEquals(str.charAt(0), 'り');
		System.out.println("AnotherTestのtestOneメソッド");
	}

}
