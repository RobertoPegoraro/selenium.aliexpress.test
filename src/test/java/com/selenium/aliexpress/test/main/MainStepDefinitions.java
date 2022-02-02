package com.selenium.aliexpress.test.main;

import com.selenium.aliexpress.java.pageobjects.MainPageObjects;
import com.selenium.aliexpress.test.AbstractStepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;


public class MainStepDefinitions extends AbstractStepDefinitions {

    @Autowired
    private WebDriver driver;

    @Autowired
    private MainPageObjects mainPageObjects;

    @Given("I am in the Aliexpress page")
    public void i_am_in_the_page() {
        driver.get("https://aliexpress.com");
    }

    @When("I search for {string}")
    public void i_search_for(String textToSearch) {
        mainPageObjects.setSearchField(textToSearch);
        mainPageObjects.clickSearchButton();
    }

    @When("I navigate to the second page")
    public void i_navigate_to_the_second_page() {
        mainPageObjects.navigateToPageNumber(2);
    }

    @Then("should present the second ad")
    public void should_present_the_second_ad() {
        Assert.assertTrue(mainPageObjects.getListOfProducts().get(1).isDisplayed());
    }
}
