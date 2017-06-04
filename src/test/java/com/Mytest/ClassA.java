package com.Mytest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ClassA {
	
	public static WebDriver driver;
	
	@Test
	public static void startBrowser()
	{
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(" i am updating");
	}

}
