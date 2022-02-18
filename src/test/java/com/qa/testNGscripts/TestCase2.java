package com.qa.testNGscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {
	
	
	WebDriver driver;
	
	
	@BeforeClass
	public void OpenBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	
	@Test(priority='1')
	public void amazonTest()
	{
		driver.get("https://www.amazon.com/");
		
		WebElement e1=	driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
		Actions a = new Actions(driver);
		
		
		a.moveToElement(e1).perform();
		
	}
	
	
	@Test(priority='2')
	public void AlterTest()

	{
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
	
	Alert a = driver.switchTo().alert();	
		
	String alerttext=	a.getText();
		
	System.out.println(alerttext);
		
	a.accept();
	}
	
	
	@AfterClass
	public void closesession()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
