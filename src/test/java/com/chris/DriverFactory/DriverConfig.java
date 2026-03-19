package com.chris.DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConfig {
	
	static WebDriver driver;
	
	public static WebDriver setupDriver() {
	driver = new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
