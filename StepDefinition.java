package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition  {
	public ChromeDriver driver;
	@Given("Open the chrome browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Given("Load the application url")
	public void loadApplicationUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@Given("Enter the username as DemosalesManager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	}
		
	@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage should be displayed")
	public void verifyHomePage() {
		
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		
		if(displayed) {
			System.out.println("Homepage is displayed");
		}else {
			System.out.println("Homepage is not displayed");
		}
	}
	
	
//	@But("Error message should be displayed")
//	public void verifyErrorMessage() {
//		System.out.println("Error message is displayed");
//
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}