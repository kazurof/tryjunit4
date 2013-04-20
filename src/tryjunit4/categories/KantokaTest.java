package tryjunit4.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class KantokaTest {
	@Test
	public void testDousita() {
		System.out.println("testDousita");
	}

	@Category(FruitsCategory.class)
	@Test
	public void testGrape() {
		System.out.println("testGrape");
	}
}
