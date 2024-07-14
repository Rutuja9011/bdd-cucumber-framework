package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-reports.html" }, 
features = {"src/test/resources/features"}, glue = { "stepDefination" }

)

public class Runner {
	
	

}

