package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},

        glue = {"Steps"},
        //plugin = {"pretty", "html:reports.html"},
        plugin = {"pretty", "html:reports/reports.html"},

        //plugin = {"pretty", "json:reports/reports.json"}
        //plugin = {"pretty", "junit:reports/reports.junit"}
        dryRun = false,
        monochrome = false,
        tags = "@S8"

)
public class TestRunner {}
