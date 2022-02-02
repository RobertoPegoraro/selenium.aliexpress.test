package com.selenium.aliexpress.java.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DriverWaitConfiguration {

    private static final int DEFAULT_WAIT_TIMEOUT_SECONDS = 30;

    @Autowired
    private WebDriver webDriver;

    @Bean
    public WebDriverWait webDriverWait() {

        return new WebDriverWait(webDriver, DEFAULT_WAIT_TIMEOUT_SECONDS);
    }
}
