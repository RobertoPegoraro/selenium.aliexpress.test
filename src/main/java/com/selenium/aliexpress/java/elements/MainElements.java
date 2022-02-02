package com.selenium.aliexpress.java.elements;

import org.openqa.selenium.By;

public class MainElements {

    public static By searchTextField = By.id("search-key");

    public static By searchButton = By.xpath("//input[@type='submit' and @class='search-button']");

    public static String paginationNumbers = "//button[starts-with(@aria-label,'Page %s') and contains(text(), %s)]";

    public static By gridProducts = By.xpath("//div[@class='product-container']/div[2]/a");
}
