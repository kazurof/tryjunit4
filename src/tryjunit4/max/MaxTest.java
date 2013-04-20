package tryjunit4.max;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.max.MaxCore;
import org.junit.runner.notification.Failure;

public class MaxTest {
	public static class TwoUnEqualTests {
		@Test
		public void slow() throws InterruptedException {
			Thread.sleep(100);
			fail();
		}

		@Test
		public void fast() {
			fail();
		}
	}

	@Test
	public void rememberOldRuns() {
		File maxFile = new File("history.max");
		MaxCore firstMax = MaxCore.storedLocally(maxFile);
		firstMax.run(TwoUnEqualTests.class);

		MaxCore useHistory = MaxCore.storedLocally(maxFile);
		List<Failure> failures = useHistory.run(TwoUnEqualTests.class)
				.getFailures();
		assertEquals("faast", failures.get(0).getDescription().getMethodName());
		assertEquals("slow", failures.get(1).getDescription().getMethodName());
	}

}
