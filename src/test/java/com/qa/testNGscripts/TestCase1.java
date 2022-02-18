package com.qa.testNGscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@Test
	public void wikipagetest() throws InterruptedException
	{
		
        WebDriver driver = new ChromeDriver();
		
		// Maximize browser window
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.close();
		}
	
	@Test
	public void testcase2() throws InterruptedException
	{
WebDriver driver = new ChromeDriver();
		
		// Maximize browser window
		
		driver.manage().window().maximize();
         Thread.sleep(2000);
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		String title = driver.getTitle();
		
		
		driver.close();
	}

}
