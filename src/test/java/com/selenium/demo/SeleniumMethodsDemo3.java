package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo3 {

	public static void main(String[] args) throws InterruptedException {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		
		WebElement myElement  = driver.findElement(By.xpath("//h1[.='Phrase guides']"));
		String myText = myElement.getText();
		
		System.out.println(myText);
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		String pageUrl = driver.getCurrentUrl();
		System.out.println(pageUrl);
		
		WebElement logInElement  = driver.findElement(By.xpath("//a[.='Log in']"));
		String attrValue  = logInElement.getAttribute("href");
		System.out.println(attrValue);
		
		driver.quit();
		
	}

}
