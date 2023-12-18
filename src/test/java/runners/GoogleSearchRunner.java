package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src//test//resources//features//UserLogin.feature",
		  glue = {"stepDefs"},
		  monochrome = true,
		  plugin = {"pretty",
				    "html:target//Reports//HtmlReport.html",
//				    "json:target//Reports//JsonReport.json",
//				    "usage:target//Reports//UsageReport",
//				    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				    "rerun:target//failedScenarios.txt"
				    }
		  //dryRun=false
		)
public class GoogleSearchRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel = true)
	public Object[][] scenario()
	{
		return super.scenarios();
		
	}
}
