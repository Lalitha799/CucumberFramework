package stepDefs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {

	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().deleteAllCookies();
		
	}
	
//	@When("User enters credentials")
//	public void user_enters_credentials() {
//	   
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//	}
	
	
//	@When("User enters {string} and {string}")
//	public void user_enters_credentials(String strUser, String strPwd) {
//	   
//		driver.get("http://the-internet.herokuapp.com/login");
//		driver.findElement(By.id("username")).sendKeys(strUser);
//		driver.findElement(By.name("password")).sendKeys(strPwd);
//		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
//	}
	
	
	@When("User enters credentials")
	public void user_enters_credentials(DataTable userCred) {
	    
		driver.get("http://the-internet.herokuapp.com/login");
		List<List<String>> data = userCred.asLists();
		String strUser = data.get(0).get(0);
		String strPwd = data.get(0).get(1);
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
	}

	
	@Then("Should display Success Msg")
	public void should_display_success_msg() {
	    
		boolean isDisp = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isDisp);
	}
	
}
