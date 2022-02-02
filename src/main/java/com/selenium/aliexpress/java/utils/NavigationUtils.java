package com.selenium.aliexpress.java.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NavigationUtils {

    @Autowired
    private WebDriver driver;

    public void scrollToBottom(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void clickInElement(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }
}
