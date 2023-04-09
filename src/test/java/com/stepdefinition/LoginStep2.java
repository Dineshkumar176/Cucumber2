package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep2 {
	public static WebDriver driver;

	@Given("user is on the facebook page")
	public void user_is_on_the_facebook_page() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	   
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		WebElement txtEmailAddress = driver.findElement(By.id("email"));
		txtEmailAddress.sendKeys(string);
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys(string2);
		
	}
	@When("user click the login button")
	public void user_click_the_login_button() {
		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnLogin.click();
	   
		
	}
	@Then("user should verify after login success message")
	public void user_should_verify_after_login_success_message() {
		Assert.assertTrue("verify after login success message", true);
		//driver.quit();
		
	}




}
