package com.PracticeLogin.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\PracticeLogin\\src\\test\\java\\com\\PracticeLogin\\features\\LoginFeature.feature",
glue={"com.PracticeLogin.stepDefinitions"},
monochrome=true,
plugin={"html:target/Cucumber-reports.html"}
//tags = "@Login"
)

public class TestRunner {

}
