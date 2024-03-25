package com.filip.worklearning.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/filip/worklearning/utils",
                "com/filip/worklearning/stepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports.html"}

)
public class TestRunner extends AbstractTestNGCucumberTests {
}
