package features;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(	features="src/main/java/features/ligine.feature", 
					glue= {"bddelead"},
					tags="@smoke",
					monochrome=true)
@RunWith(Cucumber.class)
public class RennerE {

	
	
}
