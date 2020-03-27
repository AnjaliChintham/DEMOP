
package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Login_page 
{
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
		public void userclick()
		{
			driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
		}
		public void usernamepassword(int a) throws IOException, InterruptedException
		{
			Excel ex=new Excel();
			driver.findElement(By.id("loginusername")).sendKeys(ex.excel_username(a));
			driver.findElement(By.id("loginpassword")).sendKeys(ex.excel_password(a));
			WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
			d.click();
			}
		
}



