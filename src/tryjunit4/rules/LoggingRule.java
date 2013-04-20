package tryjunit4.rules;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class LoggingRule extends TestWatcher {
	String message;
	LoggingRule(String message) {
		this.message = message;
	}
	@Override
	protected void starting(Description d) {
		System.out.printf("starting  %s %n", message);
	}

	@Override
	protected void finished(Description d) {
		System.out.printf("finished  %s %n", message);
	}
}
