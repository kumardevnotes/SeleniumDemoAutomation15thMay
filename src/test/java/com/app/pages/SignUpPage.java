package com.app.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class SignUpPage {
	
	WebDriver driver = null;
	
	public static By signupLink = By.xpath("//a[.='Sign up']");
	public static By firstNameField = By.xpath("//input[@id='first_name']");
	public static By lastNameField = By.xpath("//input[@name='last_name']");
	public static By emailaddressField = By.xpath("//input[@name='email']");
	public static By passwordField = By.xpath("//input[@name='password']");
	
	public static By genderDDLocator = By.name("sex");
	public static By dayDDLocator = By.name("dob_day");
	public static By monthDDLocator = By.name("dob_month");
	public static By yearDDLocator = By.name("dob_year");
	public static By signUpButton = By.xpath("//input[@value='Sign up']");

	
	public void completeSingup() throws InterruptedException {
		
		Faker fakerObj = new Faker();
	
		driver.findElement(signupLink).click();
		driver.findElement(firstNameField).sendKeys(fakerObj.name().firstName());
		driver.findElement(lastNameField).sendKeys(fakerObj.name().lastName());
		driver.findElement(emailaddressField).sendKeys(fakerObj.internet().emailAddress());
		driver.findElement(passwordField).sendKeys("Stephen1");
		Thread.sleep(3000);
		// driver.findElement(By.expath("input[@value='Sign up']")).click;
		// Thread.sleep(2000);
		
		WebElement genderDDElement = driver.findElement(genderDDLocator);
		// Obj Class
		Select genderDD = new Select(genderDDElement);
		genderDD.selectByValue("Male");
		
		genderDD.selectByValue("Female");
	
		// DOB ???? Lists/Arrays List???
		WebElement dayDDElement = driver.findElement(dayDDLocator);
		// Obj Class
		Select dayDD = new Select(dayDDElement);
		dayDD.selectByValue("1");
	
		WebElement monthDDElement = driver.findElement(monthDDLocator);
		// Obj Class
		Select monthDD = new Select(monthDDElement);
		monthDD.selectByValue("2");

		WebElement yearDDElement = driver.findElement(yearDDLocator);
		// Obj Class
		Select yearDD = new Select(yearDDElement);
		yearDD.selectByValue("1988");
		Thread.sleep(3000);

		driver.findElement(signUpButton).click();
		Thread.sleep(10000);

		driver.quit();
	}

}
