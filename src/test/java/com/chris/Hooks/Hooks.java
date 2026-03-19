package com.chris.Hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.chris.DriverFactory.DriverConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public WebDriver driver;
	
	@Before
	public void setup() {
		
//		driver = new ChromeDriver();
//		driver.get("https://tutorialsninja.com/demo/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@After
	public void teardown() {
		driver = DriverConfig.getDriver();
		if (driver != null) {
			driver.quit();
		}
	}
}
