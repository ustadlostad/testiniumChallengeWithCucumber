package com.batur.testiniumchallengewithcucumber.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"com.batur.testiniumchallengewithcucumber.steps",
                "com.batur.testiniumchallengewithcucumber.base"},
        features = {"src/test/java/resources/features"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        }

)
public class TestRunner extends AbstractTestNGCucumberTests {

}


