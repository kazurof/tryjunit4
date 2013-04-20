package tryjunit4.suite.subpackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubTest {
	@Test
	public void testOne() {
		String str = "りんご";
		assertEquals(str.charAt(0), 'り');
		System.out.println("DousitaTestのtestOneメソッド");
	}
}
