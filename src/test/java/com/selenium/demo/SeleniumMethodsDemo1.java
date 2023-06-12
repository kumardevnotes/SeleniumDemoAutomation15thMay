package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo1 {

	public static void main(String[] args) throws InterruptedException {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://speaklanguages.com/");
		//Thread.sleep(3000);
		
		driver.navigate().back();
		//Thread.sleep(3000);
		
		driver.navigate().forward();
		//Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
				
		/* get(String url) --> This method launches your application
		navigate().back() --> this method navigates back the browser
		navigate().forward() --> this method navigates forwards the browser
		navigate().refresh() --> this method refreshed the browser
		maximize() --> This method will maximize the browser 
		newWindow(WindowType.TAB) --> // Opens a new tab and switches to new tab*/
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		
		//close() will close the current tab or window
		driver.close();
		
		// quit() closes everything
		driver.quit();
		
	}

}
