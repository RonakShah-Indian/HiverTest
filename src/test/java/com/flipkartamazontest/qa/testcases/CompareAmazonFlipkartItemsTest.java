package com.flipkartamazontest.qa.testcases;

import com.flipkartamazontest.qa.base.TestBase;
import com.flipkartamazontest.qa.pages.AmazonScreen;
import com.flipkartamazontest.qa.pages.FlipkartScreen;
import com.flipkartamazontest.qa.util.TestUtil;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * This class is for testing flipkart add to cart functionality.
 */
public class CompareAmazonFlipkartItemsTest extends TestBase {
	FlipkartScreen flipkartScreen;
	AmazonScreen amazonScreen;
	TestUtil testUtil;
	String url = "https://amazon.in";
	String url2 = "https://flipkart.com";
	String search= "iPhone 7 32gb Black";

	public CompareAmazonFlipkartItemsTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization(url);
		testUtil = new TestUtil();
		flipkartScreen = new FlipkartScreen(driver);
		amazonScreen = new AmazonScreen(driver);
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {

		amazonScreen.searchTextField.click();
		amazonScreen.searchTextField.sendKeys(search);
		amazonScreen.searchTextField.sendKeys(Keys.ENTER);
		waitForAnElement();
		int priceOnAmazon = Integer.parseInt(amazonScreen.priceLabel.getText().replace(",",""));
		System.out.println(priceOnAmazon);
		getUrl(url2);
		waitForAnElement();
		if(isFound(flipkartScreen.crossBtn)){
			flipkartScreen.crossBtn.click();
		}
		flipkartScreen.searchTextField.click();
		flipkartScreen.searchTextField.sendKeys(search);
		flipkartScreen.searchTextField.sendKeys(Keys.ENTER);
		waitForAnElement();
		int priceOnFlipkart = Integer.parseInt(flipkartScreen.iphonePriceLabel.getText().substring(1).replace(",",""));
		System.out.println(priceOnFlipkart);
		if(priceOnAmazon<priceOnFlipkart){
			Assert.assertTrue(priceOnAmazon<priceOnFlipkart);
			System.out.println("Price on Amazon is less then at flipkart : "+priceOnAmazon);
		}else{
			Assert.assertTrue(priceOnAmazon>priceOnFlipkart);
			System.out.println("Price on Amazon is more then at flipkart : "+priceOnFlipkart);
		}

	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
