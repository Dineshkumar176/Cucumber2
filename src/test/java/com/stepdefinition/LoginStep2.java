package com.stepdefinition;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.utililty.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep2 {
	public static WebDriver driver;

//	@Given("user is on the facebook page")
//	public void user_is_on_the_facebook_page() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//
//	}
//
//	@When("user enters {string} and {string}")
//	public void user_enters_and(String string, String string2) {
//		WebElement txtEmailAddress = driver.findElement(By.id("email"));
//		txtEmailAddress.sendKeys(string);
//		WebElement txtPassWord = driver.findElement(By.id("pass"));
//		txtPassWord.sendKeys(string2);
//
//	}
//
//	@When("user click the login button")
//	public void user_click_the_login_button() {
//		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
//		btnLogin.click();
//
//	}
//
//	@Then("user should verify after login success message")
//	public void user_should_verify_after_login_success_message() {
//		Assert.assertTrue("verify after login success message", true);
//		// driver.quit();
//	}

	@Given("User is on the facebook page")
	public void userIsOnTheFacebookPage() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	@When("User enters {string} and {string}")
	public void userEntersAnd(String string, String string2) {
		WebElement txtEmailAddress = driver.findElement(By.id("email"));
		txtEmailAddress.sendKeys(string);
		WebElement txtPassWord = driver.findElement(By.id("pass"));
		txtPassWord.sendKeys(string2);
	}

	@When("User click the login button")
	public void userClickTheLoginButton() {
		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnLogin.click();
	}

	@Then("User should verify after login success message")
	public void userShouldVerifyAfterLoginSuccessMessage() {
		Assert.assertTrue("verify after login success message", true);
		// driver.quit();
	}

//	@Given("User is on the amazon page")
//	public void userIsOnTheAmazonPage() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("---remote-allow-orgins=*");
//		driver= new ChromeDriver(ops);
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//	}
//	@When("User search product")
//	public void userSearchProduct(io.cucumber.datatable.DataTable dataTable) {
//		List<String> emp = dataTable.asList();
//		String s = emp.get(1);
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s,Keys.ENTER);
//		
//		
//	}
//	@Then("User Should verify all product listed")
//	public void userShouldVerifyAllProductListed() {
//		//Assert.assertTrue("User Should verify all product listed", true);
//		
//		
//	}

//	@Given("User is on the amazon page")
//	public void userIsOnTheAmazonPage() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions ops = new ChromeOptions();
//		ops.addArguments("---remote-allow-orgins=*");
//		driver= new ChromeDriver(ops);
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		
//	}
//	@When("User search product")
//	public void userSearchProduct(io.cucumber.datatable.DataTable dataTable) {
//		
//		Map<String, String> m = dataTable.asMap();
//		String s1 = m.get("Tv");
//		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s1,Keys.ENTER);
//		
//		
//	}
//	@Then("User Should verify all product listed")
//	public void userShouldVerifyAllProductListed() {
//		Assert.assertTrue("User Should verify all product listed", true);
//		
//		
//		
//	}
//
//	@Given("User is on the facebook page")
//	public void userIsOnTheFacebookPage() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.get("https://facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//	}
//
//	@When("User login")
//	public void userLogin(io.cucumber.datatable.DataTable dataTable) {
//		List<List<String>> ll = dataTable.asLists();
//		List<String> l2 = ll.get(3);
//		String s1 = l2.get(0);
//		String s2 = l2.get(1);
//		
//		driver.findElement(By.id("email")).sendKeys(s1);
//		driver.findElement(By.id("pass")).sendKeys(s2);
//	}
//
//	@When("User login with two di")
//	public void userLoginWithTwoDi(io.cucumber.datatable.DataTable dataTable) {
//		
//		List<Map<String, String>> mm = dataTable.asMaps();
//		Map<String, String> m1 = mm.get(1);
//		String ss = m1.get("username");
//		String ss2 = m1.get("password");
//		
//		driver.findElement(By.id("email")).sendKeys(ss);
//		driver.findElement(By.id("pass")).sendKeys(ss2);
//		
//	}
//
//
//
//	
//	
//	@Then("User should verify after login success message")
//	public void userShouldVerifyAfterLoginSuccessMessage() {
//		Assert.assertTrue("verify after login success message", true);
//		
//		
//	}
//
//
//
//	@When("user login face book")
//	public void userLoginFaceBook() {
//
//	}
//
//	@Then("user verify facebook page")
//	public void userVerifyFacebookPage() {
//			Assert.assertTrue("verify after login success message", false);
//
//	}

}
