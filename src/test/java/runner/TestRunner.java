package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = {"pretty", "html:target/default-cucumber-reports"},
        plugin = {"json:target/cucumber.json",
                "formatter.PrettyReports:target/cucumber-pretty-reports"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@now",
        dryRun = false
)
public class TestRunner {

}
