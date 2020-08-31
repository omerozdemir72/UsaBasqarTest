package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

        features = {"src/test/java/featureFiles"},

        glue = {"stepDefinition"},
        dryRun = false

)



public class CucumberRunner extends AbstractTestNGCucumberTests {
}
