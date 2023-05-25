package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.JVMReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, dryRun=false, snippets=io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,plugin= {"pretty","json:target\\index.json"}, tags="",features="src\\test\\resources",glue="com.stepdefinition")

public class TestRunnerClass2 {
	//name="Verifying facebook login with valid data one"
	@AfterClass
	public static void afterExecution() {
		JVMReports.generateJvmReports(System.getProperty("user.dir")+"\\target\\index.json");
			
	}

	
}
