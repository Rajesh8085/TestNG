package com.stepdefinition.files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition extends BaseClass{
	@Given("Open the Browser")
	public void open_the_browser() {
	   try {
		browserOpen("chrome");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

	@Given("Launch the Adactin URL")
	public void launch_the_adactin_url() {
	   try {
		loadUrl("https://adactinhotelapp.com/");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

	@When("User Enter the Username {string}")
	public void user_enter_the_username(String string) {
	   WebElement user = findElementById("username");
	   dataSend(user, string);
	}

	@When("User Enter the Password {string}")
	public void user_enter_the_password(String string) {
	  try {
		WebElement pwd = findElementById("password");
		  dataSend(pwd, string);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	try {
	  WebElement login = findElementById("login");
	  click(login);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	}

	@Then("User logged in successfully")
	public void user_logged_in_successfully() throws InterruptedException {
		Thread.sleep(3000);
		WebElement logOut = findElementById("username_show");
		 if(logOut.isDisplayed()) {
			 System.out.println("Logged in Successfully");
		 }else {
			 System.out.println("Invalid Credentials");
		 }
	}
	
	@When("User Enter the Username as {string}")
	public void user_enter_the_username_as(String string) {
	   WebElement user =  findElementById("username");
	   dataSend(user, string);
	}

	@When("User Enter the Password as {string}")
	public void user_enter_the_password_as(String string) {
		 WebElement pwd =  findElementById("password");
		 dataSend(pwd, string);
	}
}


