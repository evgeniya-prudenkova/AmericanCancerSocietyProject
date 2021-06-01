package org.cancer.donate.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/donate.feature",
        glue = "org/cancer/donate/steps",
        dryRun = false,
        tags = {"@regression"},
        plugin = {"pretty",
                "html:target/cucumber-default-reports",
                "rerun:target/FailedTests.txt",
                "json:target/report.json"
        }
)

public class TestRunner {
}

