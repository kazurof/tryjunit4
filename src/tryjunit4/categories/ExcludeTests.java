package tryjunit4.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@ExcludeCategory(ColorCategory.class)
@SuiteClasses({ NantokaTest.class, KantokaTest.class })
public class ExcludeTests {
	public static void main(String[] args) {
		JUnitCore.main(ExcludeTests.class.getName());
	}
}
