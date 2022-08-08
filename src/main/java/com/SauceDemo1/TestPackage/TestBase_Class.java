package com.SauceDemo1.TestPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMPackage.HomePOMClass;
import com.SauceDemo.POMPackage.LoginPOMClass;
import com.SauceDemo.UtilityPackage.ScreenshotClass;

public class TestBase_Class 
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeClass
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
        System.setProperty("webdriver.chrome.driver","./DriverFolder/chromedriver.exe" );
		
		driver = new ChromeDriver();
		System.out.println("Browser is opened");
		}
		else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver","./DriverFolder/geckodriver.exe" );
			
		driver = new FirefoxDriver();
		System.out.println("Browser is opened");
		}
	    else 
	    {
		System.out.println("Throw error");
	    }
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	public void loginActivity() throws IOException
	{
        LoginPOMClass lp = new LoginPOMClass(driver);
		
		lp.sendUsername();
		System.out.println("Username is entered");
		
		lp.sendPassword();
		System.out.println("Password is entered");
		
		lp.clickLoginButton();
		System.out.println("Clicked on login button");
		
		ScreenshotClass.takeScreenshot(driver);
	}
	
	@AfterMethod
	public void logOutActivity()
	{
		HomePOMClass hp = new HomePOMClass(driver);
		hp.sideBar();
		System.out.println("Clicked on sidebar setting button");
		
		hp.logoutButton();
		System.out.println("Clicked on logout");
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
		System.out.println("Browser is closed");
	}
	

}
