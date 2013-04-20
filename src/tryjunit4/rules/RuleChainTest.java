package tryjunit4.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.JUnitCore;

public class RuleChainTest {
	public static void main(String[] args) {
		JUnitCore.main(RuleChainTest.class.getName());
	}

	@Rule
	public TestRule chain = RuleChain.outerRule(new LoggingRule("outer rule")).around(new LoggingRule("middle rule"))
			.around(new LoggingRule("inner rule"));

	@Rule
	public LoggingRule log1 = new LoggingRule("log1");
	@Rule
	public LoggingRule log2 = new LoggingRule("log2");
	@Rule
	public LoggingRule log3 = new LoggingRule("log3");

	@Test
	public void testNantoka() {
	}
}
