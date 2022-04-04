package runner;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(tags = "", features = "src/test/resources/features/Login.feature", glue = "tests2")
 
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {
 
}