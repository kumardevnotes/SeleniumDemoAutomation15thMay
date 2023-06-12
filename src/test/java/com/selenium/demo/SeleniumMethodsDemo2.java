package com.selenium.demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		Dimension dimension = new Dimension(600, 750);
		driver.manage().window().setSize(dimension);
		
		driver.get("https://speaklanguages.com/");
		Thread.sleep(3000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
