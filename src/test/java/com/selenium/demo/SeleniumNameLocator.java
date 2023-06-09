package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumNameLocator {

	public static void main(String[] args) throws InterruptedException {
		//To get root folder in your computer
				String rootFolder = System.getProperty("user.dir");
				
				//to set the chrome driver property
				System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
				
				//Browser is launched
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				
				//Browser is maximized
				driver.manage().window().maximize();
				
				//Launching my page - speaklanguages
				driver.get("https://www.speaklanguages.com/");
				
				Thread.sleep(3000); // 3000ms = 3seconds
				
				//CLicking in Log in link on the screen
				driver.findElement(By.partialLinkText("Log in")).click();
				
				//Entering user email address and password
				driver.findElement(By.name("email")).sendKeys("johnnitesh2@gmail.com");
				driver.findElement(By.name("password")).sendKeys("Testing@123");
				
				//Clicking on Login button 
				driver.findElement(By.className("button")).click();
				
				Thread.sleep(4000); 
				
				driver.close();
				
	}

}
