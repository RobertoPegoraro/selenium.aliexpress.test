package com.selenium.aliexpress.test.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class GlobalHooks {

    @Autowired
    private WebDriver driver;

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenshot, "image/png");
        }
    }
}
