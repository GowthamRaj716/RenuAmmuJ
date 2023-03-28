package org.runner.cl;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFiles", glue = "org.stepdefinition", monochrome = true, dryRun = false, plugin = {
		"html:C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\Reports\\htmlReport.html",
		"json:C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\Reports\\jsonReport\\fb.json",
		"junit:C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\Reports\\junitReport\\face.xml",
		"rerun:C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\FailedScenarios\\Failed.txt" })

public class RunAll {

	@AfterClass
	public static void aftAllSce() {

		JvmReportGeneration.generateJvmReport(
				"C:\\Users\\Amirtha\\eclipse-workspace\\Cucumber12PmOff\\Reports\\jsonReport\\fb.json");
	}
}
