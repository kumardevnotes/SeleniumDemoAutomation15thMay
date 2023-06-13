package com.selenium.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SeleniumMethodsDemo4 {

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
		
		//Scroll to element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement languageDD = driver.findElement(By.id("language_menu"));
		js.executeScript("arguments[0].scrollIntoView();", languageDD);
		Thread.sleep(3000);
		
		//Moving mouse to hover on the element
		Actions action = new Actions(driver);
		action.moveToElement(languageDD).build().perform();
		Thread.sleep(3000);
		
		/* How to drag and drop an element from left to right ?
		 *  WebElement srcElement = driver.findElement(By.id("language_menu"));
		WebElement targetElement = driver.findElement(By.id("language_menu"));
		action.dragAndDrop(srcElement, targetElement).build().perform();
		*/
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(3000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept(); //to click on OK button on the alert box
		//alert.dismiss(); // to click on Cancel button on the alert box
		Thread.sleep(3000);
		
		/*
		 * Scroll to element
		 * Actions class in Selenium
		mouseHover() --> 
		dragDrop() --> Drag from source and drop it in destination

		Alert.accept()-->
		Alert.dismiss()--> */
		
		driver.quit();
		
	}

}
