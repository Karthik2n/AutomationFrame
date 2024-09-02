package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void hardAssertStrictLevelComparison() {
		String expectedData="raja";
		String actualData="Raja";
		Assert.assertEquals(actualData,expectedData);
		System.out.println("strict Comparison passsed!!");
	}
	@Test
	public void ContainsLevelComparison() {
		String expectedData="raja";
		String actualData="maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("Contains Comparison passsed!!");
	}
}
