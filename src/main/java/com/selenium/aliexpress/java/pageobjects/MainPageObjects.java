package com.selenium.aliexpress.java.pageobjects;

import com.selenium.aliexpress.java.elements.MainElements;
import com.selenium.aliexpress.java.utils.NavigationUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainPageObjects {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait driverWait;

    @Autowired
    private NavigationUtils navigationUtils;

    public void setSearchField(String textToSearch){

        driver.findElement(MainElements.searchTextField).sendKeys(textToSearch);
    }

    public void clickSearchButton(){
        driver.findElement(MainElements.searchButton).click();
    }

    public void navigateToPageNumber(int pageNumber){

        //Navigate to the end of the page to display the pagination button
        navigationUtils.scrollToBottom();

        //Format the string with find strategy
        String pageButtonFormattedName = String.format(MainElements.paginationNumbers, pageNumber, pageNumber);

        //Wait pagination button appear
        driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(pageButtonFormattedName)));

        WebElement button = driver.findElement(By.xpath(pageButtonFormattedName));

        navigationUtils.clickInElement(button);
    }

    public List<WebElement> getListOfProducts(){

        return driver.findElements(MainElements.gridProducts);
    }
}
