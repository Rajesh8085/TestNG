package com.stepdefinition.files;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DataTableStepDefinition {
	@Given("Launch the browser with Adactin URL")
	public void launch_the_browser_with_adactin_url() {
	   System.out.println("Browser Launched with Adactin URL");
	}

	@When("User Enter the Username as List")
	public void user_enter_the_username_as_list(DataTable dataTable) {
	   List<String> data = dataTable.asList();
	   System.out.println(data.get(1));
	}

	@When("User Enter the Password as List")
	public void user_enter_the_password_as_list(DataTable dataTable) {
	   List<String> data = dataTable.asList();
	   System.out.println(data.get(0));
	}

	@When("Click the Login button")
	public void click_the_login_button() {
	    System.out.println("Logged in successfully");
	}
	
	@When("User Enter the Username and password as Lists")
	public void user_enter_the_username_and_password_as_lists(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(1).get(0));
		System.out.println(data.get(0).get(1));
		System.out.println(data.get(2).get(0));
	}
	@When("User Enter the Username as Map")
	public void user_enter_the_username_as_map(DataTable dataTable) {
	   Map<String, String> mp = dataTable.asMap(String.class, String.class);
	   System.out.println(mp.get("username"));
	}
	@When("User Enter the Password as Map")
	public void user_enter_the_password_as_map(DataTable dataTable) {
		Map<String, String> mp = dataTable.asMap(String.class, String.class);
		System.out.println(mp.get("password"));
	}
	@When("User Enter the Username password and mail as Maps")
	public void user_enter_the_username_password_and_mail_as_maps(DataTable dataTable) {
	   List<Map<String, String>> data = dataTable.asMaps();
	   System.out.println(data.get(0).get("username"));
	   System.out.println(data.get(1).get("password"));
	   System.out.println(data.get(2).get("mail"));
	}
}
