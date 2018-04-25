package features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(	features="src/main/java/features/login.feature", 
					glue= {"bdd"},
					tags="@smoke , @regression",
					monochrome=true)
@RunWith(Cucumber.class)
public class Runner {

	
	
}
