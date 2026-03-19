package com.chris.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.chris.DriverFactory.DriverConfig;
import com.chris.PageObject.OrderIphone_PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/***********Without using PageObject**************/

/*public class OrderIphone_Step {
	WebDriver driver  = DriverConfig.setupDriver();

	@Given("User is in Iphone page")
	public void user_is_in_iphone_page() {
		driver.findElement(By.linkText("iPhone")).click();
	}

	@When("User clicks Add to cart button")
	public void user_clicks_add_to_cart_button() {
		driver.findElement(By.id("button-cart")).click();
	}

	@Then("User verifies Iphone is added to cart")
	public void user_verifies_iphone_is_added_to_cart() {
		WebElement success = driver.findElement(By.xpath("//div[@id='product-product']/div[@class='alert alert-success alert-dismissible']"));
		String msg = success.getText();
		Assert.assertTrue(msg.contains("Success: You have added "));
	}
	
}*/

public class OrderIphone_Step {
	WebDriver driver  = DriverConfig.setupDriver();
	OrderIphone_PageFactory orderIphoneObj = new OrderIphone_PageFactory(driver);

	@Given("User is in Iphone page")
	public void user_is_in_iphone_page() {
		orderIphoneObj.click_iPhone();
	}

	@When("User clicks Add to cart button")
	public void user_clicks_add_to_cart_button() {
		orderIphoneObj.click_cart();
	}

	@Then("User verifies Iphone is added to cart")
	public void user_verifies_iphone_is_added_to_cart() {
		String successMsg = orderIphoneObj.getSuccessMsg();
		Assert.assertTrue(successMsg.contains("Success: You have added "));
	}
	
}
