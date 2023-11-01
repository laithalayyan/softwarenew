package najah.edu.acceptance;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="use_cases",
		plugin= {"html:target/html/index.html"},
		monochrome=true,
		snippets = SnippetType.CAMELCASE,
		glue = "najah.edu.acceptance")

public class AcceptanceTest {

}
