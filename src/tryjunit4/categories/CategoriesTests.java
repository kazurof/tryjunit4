package tryjunit4.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Categories.class)
@SuiteClasses({ NantokaTest.class, KantokaTest.class })
public class CategoriesTests {
	public static void main(String[] args) {
		JUnitCore.main(CategoriesTests.class.getName());
	}

}
