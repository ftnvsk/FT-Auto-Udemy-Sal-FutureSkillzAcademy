package com.filip.worklearning.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com.filip.worklearning/features"},
        glue = {"com/filip/worklearning/stepDefinitions"},
        monochrome = true
)
public class TestRunner {
}
