package tryjunit4.v44feature;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeThat;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoriesTest {

	public static void main(String[] args) {
		JUnitCore.main(TheoriesTest.class.getName());
	}

	@Theory
	public void multiplyIsInverseOfDivide(
			@TestedOn(ints = { 0, 5, 10 }) int amount, @TestedOn(ints = { 0, 1,
					2 }) int m) {
		System.err.println("amount->" + amount + "  m     ->" + m);
		assumeThat(m, not(0));
		System.err.println("m は、 " + m + "　です。テストをします。");
		assertThat((amount * m) / m, is(amount));
	}
}