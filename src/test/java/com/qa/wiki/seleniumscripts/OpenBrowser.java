package com.qa.wiki.seleniumscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	// Open chrome browser
		
		WebDriver driver = new ChromeDriver();
		
		// Maximize browser window
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		
		String title = driver.getTitle();
		
	     System.out.println(title);
	     
	     System.out.println(driver.getCurrentUrl());
	     
	     driver.navigate().back();
	     
	     Thread.sleep(1500);
	     
	     driver.navigate().forward();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
	}

}
