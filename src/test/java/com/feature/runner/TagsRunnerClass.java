package com.feature.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberDec\\src\\test\\java\\com\\feature\\files",
				 glue="com.stepdefinition.files",
				 //tags= ("@smoke") //to trigger single tag testcase
				 //tags= ("@SampleTags") // to execute single feature file testcase
				 //tags= ("@smoke and @regression") //to execute the testcase which had these two tags(based on AND)
				 tags= ("@smoke or @regression") //based on OR 
				 // tags = ("not @sanity")
				 ) 
public class TagsRunnerClass {

}
