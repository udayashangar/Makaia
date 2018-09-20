package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(features="src/test/java/feature/CreateLead.feature", glue= {"steps","leads.page"},monochrome=true, 
tags = "@Smoke or @Sanity",plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports" })

@RunWith(Cucumber.class)
public class RunTest {
	
}
