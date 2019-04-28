package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    
    glue = {"/home/hp/eclipse-workspace/BDD_Gherkin/src/main/java/StepDefinitioin"},
    features = "/home/hp/eclipse-workspace/BDD_Gherkin/Feature"
    
    )


public class TestRunner {

}
