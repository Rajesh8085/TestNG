package com.feature.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\Oct(Selenium) & Dec(Project)\\CucumberDec\\src\\test\\java\\com\\feature\\files",
				 glue="com.stepdefinition.files",
				 //dryRun=true, //not execute the scripts, just return the missed snippets in Console
				 //strict=true //execute the scripts and then return the missed snippets in Console
				 monochrome=true,
				 plugin= {"html:reports/AdactinReport.html", "json:reports/AdactinJsonReport.json", //to get the report in html & json format
						  "rerun:target/failedtestcase.txt" //to get the failed testcases name
						 }
				 )
public class RunnerClass {

}
