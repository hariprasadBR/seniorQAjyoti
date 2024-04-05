package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/resources/FeatureFiles/contactPage.feature"},
		glue= {"Steps"},
		dryRun=false
		)
public class RunTest extends AbstractTestNGCucumberTests{

}
