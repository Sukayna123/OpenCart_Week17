package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        tags = "@Regression",
        features = {"src/test/java/FeatureFiles/TC_LG_004.feature"},
        glue = {"StepDefinitions"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RunnerWithExtentReport extends AbstractTestNGCucumberTests {
}
