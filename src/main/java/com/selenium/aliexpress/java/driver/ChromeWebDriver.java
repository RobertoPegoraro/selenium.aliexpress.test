package com.selenium.aliexpress.java.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name = "application.webdriver", havingValue = "chrome")
public class ChromeWebDriver extends AbstractDriverLoader {

    @Bean
    public WebDriver webDriver() {

        String path = "src/main/resources/drivers/chrome/" + resolveInternalSo() + "/chromedriver";

        System.setProperty("webdriver.chrome.driver", path);

         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();

         return driver;
    }
}
