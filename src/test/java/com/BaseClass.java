package com;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseClass {
	protected static AndroidDriver<AndroidElement> driver;
	@BeforeTest
	public void setup()
	{
		try {
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		//caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		//caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
		//caps.setCapability(MobileCapabilityType.UDID, "1c8defcf");
		//caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("appActivity", "com.example.challenge.MainActivity");
		caps.setCapability("appPackage", "com.example.challenge");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AndroidDriver<>(url, caps);
		
		}catch(Exception e)
		{
			System.err.println("Cause is:"+e.getCause());
			System.out.println("Message is:"+e.getMessage());
			e.printStackTrace();
		}
	}
	@AfterTest
	public void teardown()
	{
		//driver.close();
		driver.quit();
	}
	
}
