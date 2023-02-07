package com.feature.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberDec\\src\\test\\java\\com\\feature\\files\\DataTable.feature", 
				 glue="com.stepdefinition.files")
public class DataTableRunner {

}
