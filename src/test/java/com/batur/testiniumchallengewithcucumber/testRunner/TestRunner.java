package com.batur.testiniumchallengewithcucumber.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

    @CucumberOptions(
            glue = {"/steps"},
            features = {"src/test/java/resources/features/loginTest.feature"},
            plugin = {"pretty",
                    "html:target/cucumber-reports/cucumber.html",
                    "json:target/cucumber-reports/cucumber.json"
            }

    )
    public class TestDevLabTestRunner extends AbstractTestNGCucumberTests {
    }

}
