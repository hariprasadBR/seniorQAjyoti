package TestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = { "src/test/resources/FeatureFiles/CasePage.feature" }, 
				glue = { "Steps" },
				dryRun=false
				)

public class RunnerTestTest extends AbstractTestNGCucumberTests {

	
}
