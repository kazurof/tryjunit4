package tryjunit4;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class BeforeAfterTest {

	static {
		System.out.println("static initializer called.");
	}

	public static void main(String[] args) {
		JUnitCore.main(BeforeAfterTest.class.getName());
	}

	{
		System.out.println("instance initializer called.");
	}

	public BeforeAfterTest() throws InterruptedException {
		System.out.println("Constructor called.");
	}

	@BeforeClass
	public static void doBeforeClass() {
		System.out.println("doBeforeClass ");
	}

	@Before
	public void doBefore() {
		System.out.println("doBefore");
	}

	@Test
	public void testOne() {
		String str = "Apple";
		assertEquals(str.charAt(1), 'p');
		System.out.println("testOne");
	}

	@Test
	public void testTwo() {
		String str = "Apple";
		assertEquals(str.charAt(2), 'p');
		System.out.println("testTwo");
	}

	@After
	public void doAfter() {
		System.out.println("doAfter");
	}

	@AfterClass
	public static void doAfterClass() {
		System.out.println("doAfterClass");
	}
}
