package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.*;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	static AppiumDriver<MobileElement> driver;
	@BeforeTest
	public void setup()
	{
		try {
		DesiredCapabilities caps=new DesiredCapabilities();
		//caps.setCapability("platformName", "ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 7T");
		caps.setCapability(MobileCapabilityType.UDID, "1c8defcf");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("appActivity", "com.example.challenge.MainActivity");
		caps.setCapability("appPackage", "com.example.challenge");
		
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		driver =new AppiumDriver<MobileElement>(url,caps);
		
		}catch(Exception e)
		{
			System.err.println("Cause is:"+e.getCause());
			System.out.println("Message is:"+e.getMessage());
			e.printStackTrace();
		}
	}
	@Test
	public void Test()
	{
		System.out.println("I am inside the test");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
}
