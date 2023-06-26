package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	WebDriver driver = null;
	
	public LandingPage(WebDriver actualDriver){
		driver = actualDriver;
	}

	public static By appLogo = By.id("logo");
	public static By searchField = By.xpath("//input[@placeholder='Search']");
	public static By logInLink = By.xpath("//a[.='Log in']");
	public static By signUpLink = By.xpath("//a[.='Sign up']");

	public boolean isLandingPageLoaded() {
		return driver.findElement(appLogo).isDisplayed() && driver.findElement(searchField).isDisplayed()
				&& driver.findElement(logInLink).isDisplayed() && driver.findElement(signUpLink).isDisplayed();
	}
	
	 // return true && true && true && true --> true

	public void navigateToLogInPage() {
		driver.findElement(logInLink).click();
	}

	public void navigateToSignupPage() {
		driver.findElement(signUpLink).click();
	}

}
