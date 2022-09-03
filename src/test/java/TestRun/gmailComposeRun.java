package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(features = "FeatureFiles/gmailCompose.feature",glue = "stepDefinition",dryRun = true)
public class gmailComposeRun 
{
	
	
}
