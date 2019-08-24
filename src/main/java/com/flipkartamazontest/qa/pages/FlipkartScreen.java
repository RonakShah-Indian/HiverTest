package com.flipkartamazontest.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Flipkart Screen locators
 */
public class FlipkartScreen {

    public FlipkartScreen(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CLASS_NAME, using = Locators.FlipkartScreen.ADD_TO_CART_BTN)
    public WebElement addToCartBtn;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.ELECTRONICS_BTN)
    public WebElement electronicsBtn;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.FIRST_SELECTION)
    public WebElement firstSelection;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.INCREMENT_BTN)
    public WebElement incrementBtn;

    @FindBy(how = How.CLASS_NAME, using = Locators.FlipkartScreen.ITEM_NUMBER_LABEL)
    public WebElement itemNumberLabel;

    @FindBy(how = How.LINK_TEXT, using = Locators.FlipkartScreen.PIXEL_BUTTON)
    public WebElement pixelBtn;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.SEARCH_TEXTFIELD)
    public WebElement searchTextField;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.CROSS_BTN)
    public WebElement crossBtn;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.PRICE_LABEL)
    public WebElement priceLabel;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.SEARCH_OPTION)
    public WebElement searchOption;

    @FindBy(how = How.XPATH, using = Locators.FlipkartScreen.IPHONE_PRICE_LABEL)
    public WebElement iphonePriceLabel;
}


