package tryjunit4.categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory(ColorCategory.class)
@SuiteClasses({ NantokaTest.class, KantokaTest.class })
public class IncludeTests {
	public static void main(String[] args) {
		JUnitCore.main(IncludeTests.class.getName());
	}
}
