package org.runner.cl;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@FailedScenarios\\Failed.txt", glue = "org.stepdefinition",
plugin = {"rerun:C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\FailedScenarios\\Failed.txt"}
		)
public class RerunningFailedScenario {

}
