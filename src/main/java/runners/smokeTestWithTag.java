package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(


        plugin = {"pretty",
      "html:target/cucumber-report",
        "json:target/cucumber.json"},

        features = {"src/test/java/featureFiles"},
        glue = {"stepDefinition"},
        dryRun = false,
        tags = {"@SmokeTest"}
)


public class smokeTestWithTag extends AbstractTestNGCucumberTests {




}
