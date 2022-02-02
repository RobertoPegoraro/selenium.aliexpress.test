package com.selenium.aliexpress.test;

import com.selenium.aliexpress.java.Application;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Application.class)
public abstract class AbstractStepDefinitions {
}
