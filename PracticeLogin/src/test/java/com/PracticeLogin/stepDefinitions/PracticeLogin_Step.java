package com.PracticeLogin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.PracticeLogin.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PracticeLogin_Step {
	
	WebDriver driver;
	public LoginPage loginPage = new LoginPage(driver);
	
	
	@Given("User is navigated to practice website sign in page")
	public void user_is_navigated_to_practice_website_sign_in_page() {
	    
		loginPage.browserLaunch();
		
	}

	@When("User enters valid username")
	public void user_enters_valid_username() throws InterruptedException {
		
		Thread.sleep(1000);
		loginPage.enterUsername();
	    
	}

	@And("User enters valid password")
	public void user_enters_valid_password() throws InterruptedException {
		
		Thread.sleep(1000);
		loginPage.enterPassword();
	    
	}

	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
		
		Thread.sleep(1000);
		loginPage.clickSignInButton();
	    
	}

	@Then("User should be navigated to welcome page successfully")
	public void user_should_be_navigated_to_welcome_page_successfully() throws InterruptedException {
		
		Thread.sleep(1000);
		String ActualTitle = loginPage.successMessage();
	    String ExpectedTitle = "You are successfully logged in.";
	    Assert.assertEquals(ExpectedTitle, ActualTitle);
	    
	}

	@And("User is on the welcome page")
	public void user_is_on_the_welcome_page() throws InterruptedException {
		
		Thread.sleep(1000);
	    
	}

	@When("User clicks on Logout button")
	public void user_clicks_on_logout_button() {
		
		loginPage.clickLogOutButton();
	    
	}


	
	@Then("User should be navigated back to Sign in page successfullly")
	public void user_should_be_navigated_back_to_sign_in_page_successfullly() throws InterruptedException {
		
		Thread.sleep(1000);
		String ActualSignInTitle = loginPage.signInMessage();
	    String ExpectedSignInTitle = "Sign in";
	    Assert.assertEquals(ExpectedSignInTitle, ActualSignInTitle);
	    Thread.sleep(1000);
	    loginPage.closeBrowser();
	}
	

}
