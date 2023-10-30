package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = "org.stepDefinition", 
tags="@tags",monochrome = true,
dryRun = false,   plugin = {"html:target/cucumber-report/report.html",
		                    "json:target/cucumber-report/report.json",
		                    "junit:target/cucumber-report/report.xml"})
public class RunnerClass {

}

