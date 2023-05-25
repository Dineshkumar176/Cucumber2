package com.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.utililty.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {
	@Before
	public void beforeExecute() {
		getDriver("chrome");
		searchUrl("https://facebook.com/");
	}

	@After
	public void aferExecution(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			s.attach(screenshotAs, ".png", s.getName());
			
		}
		

	}

}
