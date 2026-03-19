package com.chris.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.chris.DriverFactory.DriverConfig;

public class OrderIphone_PageFactory {

//	WebDriver driver = DriverConfig.setupDriver();
	@FindBy(linkText = "iPhone") WebElement iPhoneBtn;
	@FindBy(id="button-cart") WebElement cartBtn;
	@FindBy(xpath="//div[@id='product-product']/div[@class='alert alert-success alert-dismissible']") WebElement successMsg;
	
	public OrderIphone_PageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void click_iPhone() {
		iPhoneBtn.click();
	}
	
	public void click_cart() {
		cartBtn.click();
	}
	
	public String getSuccessMsg() {
		String msg = successMsg.getText();
		return msg;
	}
}
