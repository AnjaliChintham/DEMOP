package com.pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class NextPage_page {
	WebDriver driver;
		
		public void url(String browser) 
		{
			//To launch Chrome Browser
			if(browser.equalsIgnoreCase("Chrome"))
			{
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
			}
			//To launch Firefox Driver
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.firefox.driver", "D:\\java app\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//To launch InternetExplorerDriver
			else if(browser.equalsIgnoreCase("IEDriver"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\java app\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			//To Maximize the Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());

		}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	public void Scrollby() throws InterruptedException
	{
		WebElement a=driver.findElement(By.id("next2"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,8000)");
		driver.findElement(By.xpath("//html//body//div[5]//div//div[2]//form//ul//li[2]//button")).click();
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]//div[4]//div//div//h4//a")).click();
	}
	public void click() throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[4]/div/div/h4/a")).click();
		
		
	}
	

}


