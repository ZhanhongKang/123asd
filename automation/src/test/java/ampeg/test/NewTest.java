package ampeg.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import ampeg.pageObject.AmpeghomePage;
import ampeg.pageObject.classicPage;
import ampeg.pageObject.productPage;
import ampeg.pageObject.svt410hlf;
import framework.TestBase;

public class NewTest extends TestBase{


	@Test
	public void f() {

		String expect = "Handling Weight: 85 Pounds";

		new AmpeghomePage(driver,baseUrl)
		.clickProduct()
		.clickClassic()
		.clicksvt410();
		String actrual= new svt410hlf(driver, baseUrl).clickproduct410();
		
		assertEquals(actrual, expect);

	}
}
