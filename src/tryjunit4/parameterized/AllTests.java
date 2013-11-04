package tryjunit4.parameterized;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({ ParameterizedTest.class, SetTestNameTest.class,
		NoConstuctor.class ,
		tryjunit4.suite.AllTests.class})
public class AllTests {
	public static void main(String[] args) {
		JUnitCore.main(AllTests.class.getName());
	}
}