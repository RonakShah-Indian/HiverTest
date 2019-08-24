package com.flipkartamazontest.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Amazon Screen locators
 */
public class AmazonScreen {

    public AmazonScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = Locators.AmazonScreen.PRICE_LABEL)
    public WebElement priceLabel;

    @FindBy(how = How.XPATH, using = Locators.AmazonScreen.SEARCH_TEXTFIELD)
    public WebElement searchTextField;

    @FindBy(how = How.XPATH, using = Locators.AmazonScreen.FIRST_OPTION_BUTTON)
    public WebElement firstOptionBtn;
}
