package com.stepdefinition.files;

import io.cucumber.java.en.Given;

public class TagsStepDefinition {
	
	@Given("Launch browser with Client URL")
	public void launch_browser_with_client_url() {
	  System.out.println("Browser Launched with Adactin URL");
	}
	
	@Given("Sample Test One Method Execution")
	public void sample_test_one_method_execution() {
	 System.out.println("Method 1");
	}

	@Given("Sample Test Two Method Execution")
	public void sample_test_two_method_execution() {
		 System.out.println("Method 2");
	}

	@Given("Sample Test Three Method Execution")
	public void sample_test_three_method_execution() {
		 System.out.println("Method 3");
	}

	@Given("Sample Test Four Method Execution")
	public void sample_test_four_method_execution() {
		 System.out.println("Method 4");
	}

	@Given("Sample Test Five Method Execution")
	public void sample_test_five_method_execution() {
		 System.out.println("Method 5");
	}

}
