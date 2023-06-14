package com.selenium.demo;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumMethodsDemo5 {

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
		
		//WebElement element  = driver.findElement(By.id("nav_login"));
		//element.click();
		
		List<WebElement> languageElements  = driver.findElements(By.xpath("//p[@class='site_link']//a"));
		
		List<String> languageLinks = new ArrayList<String>();
		
		for(WebElement languageElement : languageElements) {
			String languageLink = languageElement.getAttribute("href");
			languageLinks.add(languageLink);
		}
		
		for(String languageLink : languageLinks) {
			System.out.println();
			driver.get(languageLink);
			Thread.sleep(2000);
		}
		
		
		driver.quit();
		
	}

}
