package tryjunit4.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;


@Category(FruitsCategory.class)
public class NantokaTest {
	@Test
	public void testApple() {
		System.out.println("testApple");
	}

	@Category(ColorCategory.class)
	@Test
	public void testOrange() {
		System.out.println("testOrange");
	}
}