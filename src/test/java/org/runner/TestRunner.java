package org.runner;

import org.step.JvmReport;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import io.cucumber.prettyformatter.MessagesToPrettyWriter.PrettyFeature;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\src\\test\\resources\\Feature",
glue = "org.step", dryRun =false, tags = "@login and @sanity or @regression", 
plugin ={"pretty", "html:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\htmlreport\\adcatin.html",
		 "junit:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\junitreport\\adcatin.xml",
		"json:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\jsonreport\\adcatin.json",
		"rerun:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\rerun\\rerun.txt"})

//@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\src\\test\\resources\\Feature",
//glue = "org.step", dryRun =false, tags = "@login and @sanity or @regression or @smoke", 
//plugin ={"pretty", "html:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\htmlreport\\adcatin.html",
//		 "junit:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\junitreport\\adcatin.xml",
//		"json:C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\jsonreport\\adcatin.json"})

//@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\src\\test\\resources\\Feature\\Firstlogins.feature", glue="org.stepslogins", dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
//	@AfterClass
//	public void runafter() {
//		JvmReport.generatejvmreport("C:\\Users\\Dell\\eclipse-workspace\\SathishMavenCucumber\\reports\\jsonreport\\adcatin.json");
//
//	}

}
