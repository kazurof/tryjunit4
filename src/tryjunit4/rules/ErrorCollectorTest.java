package tryjunit4.rules;

import static org.hamcrest.CoreMatchers.is;

import java.util.concurrent.Callable;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.JUnitCore;

public class ErrorCollectorTest {

	public static void main(String[] args) {
		JUnitCore.main(ErrorCollectorTest.class.getName());
	}

	@Rule
	public ErrorCollector collector = new ErrorCollector();

	@Test
	public void testAddError() {
		collector.addError(new Throwable("first thing went wrong"));
		collector.addError(new Throwable("second thing went wrong"));
	}

	@Test
	public void testCheckThat() {
		collector.checkThat("apple", is("appleeeee"));
		System.out.println("test execution came to the last line of testCheckThat()!");
	}

	@Test
	public void testCallable() {
		collector.checkSucceeds(new Callable<Object>() {
			@Override
			public String call() throws Exception {
				throw new RuntimeException("FAIL!");
			}
		});
		System.out.println("test execution came to the last line of testCheckThat()!");
	}
}
