package tryjunit4.suite;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SampleTest.class, AnotherTest.class,
		tryjunit4.suite.subpackage.AllTests.class })
public class AllTests {
	public static void main(String[] args) {
		JUnitCore.main(AllTests.class.getName());
	}
}