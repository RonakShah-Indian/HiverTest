package com.flipkartamazontest.qa.testcases;

import com.flipkartamazontest.qa.base.TestBase;
import com.flipkartamazontest.qa.pages.FlipkartScreen;
import com.flipkartamazontest.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is for testing flipkart add to cart functionality.
 */
public class FlipkartTest extends TestBase {
	FlipkartScreen flipkartScreen;
	TestUtil testUtil;
	String url = "https://flipkart.com";

	public FlipkartTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization(url);
		testUtil = new TestUtil();
		flipkartScreen = new FlipkartScreen(driver);
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() throws InterruptedException {
		if(isFound(flipkartScreen.crossBtn)){
			flipkartScreen.crossBtn.click();
		}
		//hover on electronics option
		hover(flipkartScreen.electronicsBtn);
		Assert.assertTrue(flipkartScreen.pixelBtn.isDisplayed());

		//click on the mobile option
		flipkartScreen.pixelBtn.click();
		Assert.assertTrue(flipkartScreen.firstSelection.isDisplayed());

		//click on the first selection
		flipkartScreen.firstSelection.click();
		List<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(tabs2.size()-1));
		waitForLoading();
		isFound(flipkartScreen.addToCartBtn);
		Assert.assertTrue(flipkartScreen.addToCartBtn.isDisplayed());

		//add to cart
		flipkartScreen.addToCartBtn.click();
		waitForLoading();
		isFound(flipkartScreen.itemNumberLabel);
		Assert.assertTrue(flipkartScreen.itemNumberLabel.isDisplayed());

		int priceForOne= Integer.parseInt(flipkartScreen.priceLabel.getText().substring(1).replace(",",""));
		int numberOfItemAddedBefore= Integer.parseInt(flipkartScreen.itemNumberLabel.getAttribute("value"));

		//increment the item
		flipkartScreen.incrementBtn.click();
		waitForLoading();
		isFound(flipkartScreen.itemNumberLabel);

		//check the items with value
		int priceForTwo= Integer.parseInt(flipkartScreen.priceLabel.getText().substring(1).replace(",",""));
		int numberOfItemAddedAfter= Integer.parseInt(flipkartScreen.itemNumberLabel.getAttribute("value"));
		Assert.assertTrue(numberOfItemAddedBefore < numberOfItemAddedAfter,"incremented number of item into cart");
		Assert.assertTrue(priceForOne < priceForTwo,"Price for 2 is more then one");
		System.out.println("Price for 2 items: "+priceForTwo);
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
