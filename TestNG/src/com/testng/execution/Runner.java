package com.testng.execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Runner {

	@Test
	public void register() throws FileNotFoundException, IOException{
		Properties p =new Properties();
		p.load(new FileInputStream("Config.properties"));
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		DesiredCapabilities c= new DesiredCapabilities();
		c.setCapability(MobileCapabilityType.DEVICE_NAME, p.getProperty("devicename"));
		c.setCapability("platformName", Platform.ANDROID);
		c.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		c.setCapability("app", "C:\\Users\\User\\Downloads\\Med Helper Pill Reminder_v2.8.6_apkpure.com.apk");

		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL(p.getProperty("serverurl")+"/wd/hub"),c);	

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("android:id/button3")).click();
		//to launch menu bar.
		//driver.findElementById("com.google.android"),c;



	}

}
