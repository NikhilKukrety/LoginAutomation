package com.PracticeLogin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.PracticeLogin.base.BaseClass;

import junit.framework.Assert;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/*@FindBy(how = How.ID, using = "inputUsername")
	WebElement username;
	
	@FindBy(how = How.ID_OR_NAME, using = "inputPassword")
	WebElement password;
	
	@FindBy(how = How.CLASS_NAME, using = "submit signInBtn")
	WebElement signInButton;*/
	
	//Action methods for above page objects:
	
	WebDriver driver = new ChromeDriver();
	
	public void browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\java\\com\\PracticeLogin\\resources\\Drivers\\chromedriver.exe");
    	driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
	}
	
	public void enterUsername()
	{
		WebElement Username = driver.findElement(By.id("inputUsername"));
		Username.sendKeys("rahulshettyacademy");
		///waitForElement(username);
		//username.sendKeys("rahulshettyacademy");
	}
	
	public void enterPassword()
	{
		WebElement Password = driver.findElement(By.name("inputPassword"));
		Password.sendKeys("rahulshettyacademy");
		//waitForElement(password);
		//password.sendKeys("rahulshettyacademy");
	}
	
	public void clickSignInButton()
	{
		
		WebElement SignInButton = driver.findElement(By.xpath("//button[@class = 'submit signInBtn']"));
		SignInButton.click();
		//waitForElement(signInButton);
		//signInButton.sendKeys("rahulshettyacademy");
	}
	
	public String successMessage()
	{
		WebElement successMessage = driver.findElement(By.xpath("//*[text()='You are successfully logged in.']"));
		String successMessageString = successMessage.getText();
		System.out.println("Captured success message is: "+successMessageString);
		return successMessageString;
	}
	
	
	public void clickLogOutButton()
	{
		WebElement logoutButton = driver.findElement(By.xpath("//button[@class = 'logout-btn']"));
		logoutButton.click();
	}
	
	public String signInMessage()
	{
		WebElement signInMessage = driver.findElement(By.xpath("//*[text()='Sign in']"));
		String signInMessageString = signInMessage.getText();
		System.out.println("Captured Sign In message is: "+signInMessageString);
		return signInMessageString;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}

}
