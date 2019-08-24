package com.flipkartamazontest.qa.pages;


/**
 * Contains elements locator
 */
public class Locators {

    /*  Flipkart Page Locators */
    public static final class FlipkartScreen {

        public static final String SEARCH_TEXTFIELD = "//input[@placeholder='Search for products, brands and more']";
        public static final String ELECTRONICS_BTN = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/span[1]";
        public static final String PIXEL_BUTTON = "Pixel 3a | 3a XL";
        public static final String FIRST_SELECTION = "//div[@data-id='MOBFFGFP7UHHJUZU']//div[@class='col col-7-12']";
        public static final String ADD_TO_CART_BTN = "_3oJBMI";
        public static final String INCREMENT_BTN="//button[text()='+']";
        public static final String ITEM_NUMBER_LABEL = "_2csFM9";
        public static final String CROSS_BTN="//button[@class='_2AkmmA _29YdH8']";
        public static final String PRICE_LABEL="//div[@class='_3xFQAD']//span";
        public static final String SEARCH_OPTION="/div[@data-tkid='ff0a0bd5-f315-4e7d-83dc-902f4bebbce5.iphone 7 32gb black']//a[@class='_2ja22P']";
        public static final String IPHONE_PRICE_LABEL="//div[@class='_1vC4OE _2rQ-NK']";
    }

    /* Amazon Page Locators */
    public static final class AmazonScreen {

        public static final String SEARCH_TEXTFIELD="//input[@id='twotabsearchtextbox']";
        public static final String FIRST_OPTION_BUTTON="//div[@id='issDiv0']";
        public static final String PRICE_LABEL="//span[@class='a-price-whole']";
    }
}
