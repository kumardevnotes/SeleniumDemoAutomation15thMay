package com.testng.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

//Cross browser testing through automation
public class TestNgDemo1 {

	@Test(groups = { "RegressionTest" }, priority=1)
	public void verifyAppInEdge() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver", rootFolder + "//src//test//java//com//resources//msedgedriver.exe");

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);

		// Maximize browser
		driver.manage().window().maximize();

		driver.get("https://speaklanguages.com/");
		driver.quit();
	}

	@Test(groups = { "SmokeTest" }, priority=2)
	public void verifyAppInChrome() {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				rootFolder + "//src//test//java//com//resources//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		// Maximize browser
		driver.manage().window().maximize();

		driver.get("https://speaklanguages.com/");
		driver.quit();
	}

}
