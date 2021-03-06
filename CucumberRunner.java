package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(
		features="src/test/java/features/DeleteLead.feature",
		glue={"steps"},
		publish=true
		)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
