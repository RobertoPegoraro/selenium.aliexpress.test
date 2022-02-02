package com.selenium.aliexpress.test.main;

import com.selenium.aliexpress.java.Application;
import com.selenium.aliexpress.test.AbstractStepDefinitions;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;


public class MainStepDefinitions extends AbstractStepDefinitions {

    @Autowired
    private WebDriver driver;


}
