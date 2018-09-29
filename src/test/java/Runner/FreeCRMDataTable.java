package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "C:/Users/INFOCOM/DebBDD/BDDAutomation2/src/test/java/Features/FreeCRMDataTable.feature",
                 glue = {"stepDefinition"},
                 plugin = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.junit"},
                 dryRun = false,
                 monochrome = true,
                 strict = true
		)

public class FreeCRMDataTable {

}
