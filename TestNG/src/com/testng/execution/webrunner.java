package com.testng.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class webrunner {
	@Test
	public void Register() throws FileNotFoundException, IOException{
		Properties p =new Properties();
		p.load(new FileInputStream("Config.properties"));
		WebDriver driver;
		switch(p.getProperty("browser")){
		case "gc":
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver=new FirefoxDriver();
			break;	
		default:
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver();
			break;
		}
		
		Reporter.log("Initiaization");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		Assert.assertEquals("magento", driver.getTitle());
	}

}
