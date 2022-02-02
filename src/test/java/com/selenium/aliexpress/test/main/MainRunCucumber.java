package com.selenium.aliexpress.test.main;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:/features/main",
        glue = {"com.selenium.aliexpress.test.hooks",
                "com.selenium.aliexpress.test.main"},
        plugin = {"pretty", "json:target/cucumber/aliexpress/main.json"})
public class MainRunCucumber {
}
