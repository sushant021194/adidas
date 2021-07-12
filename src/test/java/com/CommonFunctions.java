package com;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonFunctions {
	public static WebDriver driver=null;

	// wait until it's Visible by id
	public static void waitVisibility(WebDriver driver, String strlocator) {
		WebDriverWait wait = new WebDriverWait(CommonFunctions.driver = driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(strlocator)));
	}
	// wait until it's Visible by xpath
	public static void waitVisibilityByXpath(WebDriver driver, String strlocator) {
		WebDriverWait wait = new WebDriverWait(CommonFunctions.driver = driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strlocator)));
	}
	// wait until its present in DOM Structure by ID
	public static void waitStaleness(WebDriver driver, String strElement) {
		WebDriverWait wait = new WebDriverWait(CommonFunctions.driver = driver, 80);
		wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.id(strElement))));
	}
	// click element by ID
	public static void clickById(String locator) {
		waitVisibility(driver, locator);
		driver.findElement(By.id(locator)).click();
	}

	// click element by Xpath
	public static void clickByXpath(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}
	// Enter text into text filed
	public static void enterText(String locator, String strText) {
		driver.findElement(By.id(locator)).sendKeys(strText);
	}

	///////////////////////
	// Enter text into text filed
	public static void enterTextByXpath(String locator, String strText) {
		driver.findElement(By.xpath(locator)).sendKeys(strText);
	}
	// get text from text filed
	public static String getText(String locator) {
		String strText = null;

		strText = driver.findElement(By.id(locator)).getText();
		return strText;
	}

	// get text from text filed by Xpath
	public static String getTextByXpath(String locator) {
		String strText = null;

		strText = driver.findElement(By.xpath(locator)).getText();
		return strText;
	}

	
	
	public static void scrollToElement(AndroidDriver<AndroidElement> driver, String visibleText) 
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))");
	}

}
