package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\rerun\\rerun.txt",
glue = "org.step", dryRun =false,
plugin ={"pretty", "html:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\htmlreport\\adcatin.html",
		 "junit:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\junitreport\\adcatin.xml",
		"json:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\jsonreport\\adcatin.json",
		"rerun:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\rerun\\rerun.txt"})

public class Rerun extends AbstractTestNGCucumberTests{
	

}
