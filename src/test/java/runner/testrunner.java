package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty","json:target/"},
		features = "src/test/features",
		glue= {"seleniumgluecode"}

		)

public class testrunner {

}
