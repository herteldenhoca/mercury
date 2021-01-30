package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" },

        features="src/test/resources/features",
        glue="stepdefinitions",
        dryRun = false,
        tags="@wip"
)

public class Runner {
}
// hocam test gectı sukuurler olsun da neden logın e bbasmadı anlayamadım z