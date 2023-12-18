package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features = "src//test//resources//taggedFeatures",
		  glue = {"stepDefs"},
		  monochrome = true,
		  plugin = {"html:target//Reports//HtmlReport.html"},
		  //tags="@Smoketest"
		  //tags="@Regressiontest"
		  //tags="@Smoketest or @Regressiontest"
		  //tags="@Smoketest and @Regressiontest"
		  //tags="@PhaseTwo"
		  //tags="@Smoketest"
		  //tags="@PhaseOne and @Smoketest"
		  //tags="@PhaseOne and not @Smoketest"
		  //tags="@PhaseOne and not( @Smoketest or  @Regressiontest)"
		  tags="@PhaseTwo and (@Smoketest or  @Regressiontest)" )
public class CRMRunner extends AbstractTestNGCucumberTests {

}
