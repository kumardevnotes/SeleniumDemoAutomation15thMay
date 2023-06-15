package com.selenium.demo;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMethodsDemo7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		String rootFolder = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", rootFolder + "//src//test//java//com//resources//chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		//Maximize browser
		driver.manage().window().maximize();
		
		driver.get("https://www.speaklanguages.com/");
		driver.findElement(By.xpath("//a[.='Sign up']")).click();
		
		WebElement genderDDELement  = driver.findElement(By.name("sex"));
		Select genderDD =  new Select(genderDDELement);
		Thread.sleep(3000);
		genderDD.selectByVisibleText("Male");
		
		Thread.sleep(3000);
		genderDD.selectByVisibleText("Female");
		Thread.sleep(3000);
		
		genderDD.selectByIndex(1); //Male
		Thread.sleep(3000);
		genderDD.selectByIndex(2); //Female
		Thread.sleep(3000);
		
		genderDD.selectByValue("Male");
		Thread.sleep(3000);
		genderDD.selectByValue("Female");
		Thread.sleep(3000);
		
		//Capturing screenshot in Selenium
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destination  =  new File(rootFolder+"//Screenshots//randomImage_"+ 0001+".png");
				FileHandler.copy(src, destination);
		
		driver.quit();
		
	}

}
