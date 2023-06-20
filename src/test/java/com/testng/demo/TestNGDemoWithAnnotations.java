package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGDemoWithAnnotations {

  
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite passed");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest passed");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass passed");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod passed");
  }

  @Test
  public void samplTestCase1() {
	  System.out.println("samplTestCase1 passed");
  }
 
  @Test
  public void samplTestCase2() {
	  System.out.println("samplTestCase2 passed");
  }
 
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod passed");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest passed");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass passed");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite passed");
  }

}
