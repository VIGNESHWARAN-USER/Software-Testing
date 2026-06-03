package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	@Test
	public void f() {

		String str1 = new String("Vetri");
		String str2 = new String("Vetri");
		String str3 = new String("Vignesh");

		String str4 = "Vetri";
		String str5 = "Vetri";

		Assert.assertEquals(str1, str2);

		Assert.assertEquals(str1, str2, "Both are different strings.");

		Assert.assertSame(str4, str5);
	}
}
