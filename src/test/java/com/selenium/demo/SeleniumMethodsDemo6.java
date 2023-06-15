package com.selenium.demo;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo6 {

	public static void main(String[] args) throws InterruptedException {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		Thread.sleep(3000);
		String windowID1  = driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String windowID2  = driver.getWindowHandle();
		Thread.sleep(3000);
		
		driver.switchTo().window(windowID1);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		driver.switchTo().window(windowID2);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		Set<String> allWindows  = driver.getWindowHandles();
		
		//This closes current window only
		driver.close();
		
		Thread.sleep(3000);
		//This closes all opened windows
		driver.quit();
		
	}

}
