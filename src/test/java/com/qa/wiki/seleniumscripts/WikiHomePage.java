package com.qa.wiki.seleniumscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		// selenium to locate an element on the webpage and perform an action
		
	//	driver.findElement(By.id("searchInput")).sendKeys("automation testing");
		
		driver.findElement(By.name("search")).sendKeys("automation testing");
		
		// Xpath :  //tagname[@attribute='value']
		
		// click on button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(1500);
		
		
		driver.findElement(By.linkText("Main page")).click();
		
		
		
		
		
		
		

	}

}
