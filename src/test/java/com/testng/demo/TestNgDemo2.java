package com.testng.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo2 {
  @Test (groups = { "SmokeTest" })
  public void verifyAppLoginPage() {
	  String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		String pageTitleExpected  = "Log in to Speak Languages";
		String pageTitleActual = driver.getTitle();
		
		Assert.assertEquals(pageTitleActual, pageTitleExpected, "Page title is not matching. So failed the test case");
		
		driver.quit();
  }
}
