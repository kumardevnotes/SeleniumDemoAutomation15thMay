package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static By LoginLink = By.id("nav_login");
	public static By emailAddressField = By.id("email_input");
	public static By passwordField = By.id("password_input");
	public static By loginButton = By.id("login_button");
	
	WebDriver driver =  null;
	
	public void loginIntoApp() throws InterruptedException {
		
		driver.findElement(LoginLink).click();
		//Entering user email address and password
		driver.findElement(emailAddressField).sendKeys("johnnitesh2@gmail.com");
		driver.findElement(passwordField).sendKeys("Testing@123");
		//Clicking on Login button 
		driver.findElement(loginButton).click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
