package com.chris.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.chris.DriverFactory.DriverConfig;

public class OrderIphone_PageObject {
	
	WebDriver driver = DriverConfig.setupDriver();

	By iPhone = By.linkText("iPhone");
	By cartBtn = By.id("button-cart");
	
	
	public void click_iPhone() {
		driver.findElement(iPhone).click();
	}
	
	public void click_cartBtn() {
		driver.findElement(cartBtn).click();
	}
}
