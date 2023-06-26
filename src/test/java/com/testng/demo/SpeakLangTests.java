package com.testng.demo;

import org.testng.annotations.Test;

import com.app.pages.LandingPage;
import com.app.pages.LoginPage;
import com.app.pages.SignUpPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SpeakLangTests {
	
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", rootFolder + "//src//test//java//com//resources//msedgedriver.exe");

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver  = new EdgeDriver(options);

		// Maximize browser
		driver.manage().window().maximize();

		driver.get("https://speaklanguages.com/");
	}

	@Test
	public void verifyLandingPage() throws IOException {
		LandingPage landingPage  = new LandingPage(driver);
		boolean isDisplayed   = landingPage.isLandingPageLoaded();
		Assert.assertEquals(isDisplayed, true);
		captureScreenshot("verifyLandingPage");
	}
	
	@Test
	public void verifyLogin() throws InterruptedException, IOException {
		LandingPage landingPage  = new LandingPage(driver);
		landingPage.navigateToLogInPage();
		
		LoginPage logInPage  = new LoginPage(driver);
		logInPage.loginIntoApp();
		captureScreenshot("verifyLogin");
	
	}

	
	@Test (invocationCount = 3)
	public void verifySignup() throws InterruptedException, IOException {
		LandingPage landingPage  = new LandingPage(driver);
		landingPage.navigateToSignupPage();
		
		SignUpPage signUpPage  = new SignUpPage(driver);
		signUpPage.completeSingup();
		captureScreenshot("verifySignup");
	}


	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
	public void captureScreenshot(String TestCaseName) throws IOException {
		String rootFolder = System.getProperty("user.dir");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination  =  new File(rootFolder+"//Screenshots//Image_"+ TestCaseName+".png");
		FileHandler.copy(src, destination);
	}

}
