package com.selenium.aliexpress.java.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "application.webdriver", havingValue = "firefox")
public class FirefoxWebDriver extends AbstractDriverLoader {

    @Bean
    public WebDriver webDriver() {

        String path = "src/main/resources/drivers/gecko/" + resolveInternalSo() + "/geckodriver";

        System.setProperty("webdriver.gecko.driver", path);

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        return driver;
    }
}
