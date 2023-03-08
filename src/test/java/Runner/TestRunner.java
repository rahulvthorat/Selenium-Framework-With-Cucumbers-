package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/pankaj/eclipse-workspace/Cucumber/src/test/resources/Features/Login.feature", glue = {
		"StepDefination" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:target/htmlReport.html" })
public class TestRunner {

}
