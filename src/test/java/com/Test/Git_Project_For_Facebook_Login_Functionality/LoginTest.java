package com.Test.Git_Project_For_Facebook_Login_Functionality;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void InitialStep()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAHESH\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Launching Browser");
	}
	
	@Test
	public void dologin()
	{
		System.out.println("Executing Login test");
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
		System.out.println("Entering Username");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kurhadeanjushree@gmail.com");
		
		System.out.println("Entering Password");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("abcd");
		
		System.out.println("Clicking on login butten");
		driver.findElement(By.name("login")).click();
		
		System.out.println("Loginning into facebook account");
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		if(driver!=null)
		driver.close();
	}
	

}
