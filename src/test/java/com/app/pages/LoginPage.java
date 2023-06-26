package com.app.pages;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver = null;

	public LoginPage(WebDriver actualDriver) {
		driver = actualDriver;
	}

	public static By LoginLink = By.id("nav_login");
	public static By emailAddressField = By.id("email_input");
	public static By passwordField = By.id("password_input");
	public static By loginButton = By.id("login_button");

	public void loginIntoApp() throws InterruptedException, IOException {

		String rootFolder = System.getProperty("user.dir");

		FileReader myFile = new FileReader(rootFolder + "//src//test//java//com//resources//appData.properties");
		Properties props = new Properties();
		props.load(myFile);

		String userEmailAddress = props.getProperty("appUserEmailID");
		String userPassword = props.getProperty("apppassword");

		// Entering user email address and password
		driver.findElement(emailAddressField).sendKeys(userEmailAddress);
		driver.findElement(passwordField).sendKeys(userPassword);
		// Clicking on Login button
		driver.findElement(loginButton).click();
		Thread.sleep(5000);

	}

}
