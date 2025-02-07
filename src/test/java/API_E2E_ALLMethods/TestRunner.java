package API_E2E_ALLMethods;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(

		features="src/test/java/Feature",
		glue="Step",
		dryRun=false,
		monochrome=true
		
)


public class TestRunner extends AbstractTestNGCucumberTests {

}
