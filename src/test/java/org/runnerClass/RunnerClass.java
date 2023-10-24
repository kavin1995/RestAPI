package org.runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\feature", glue = "org.stepDefinition", 
tags="@tags",
dryRun = false,   plugin = {"json:target/cucumber.json" })
public class RunnerClass {

}
